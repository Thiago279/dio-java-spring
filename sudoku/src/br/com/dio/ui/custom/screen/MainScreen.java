package br.com.dio.ui.custom.screen;

import br.com.dio.model.Square;
import br.com.dio.service.BoardService;
import br.com.dio.service.NotifierService;
import br.com.dio.ui.custom.button.CheckGamesStatusButton;
import br.com.dio.ui.custom.button.FinishGameButton;
import br.com.dio.ui.custom.button.ResetButton;
import br.com.dio.ui.custom.frame.MainFrame;
import br.com.dio.ui.custom.input.NumberText;
import br.com.dio.ui.custom.panel.MainPanel;
import br.com.dio.ui.custom.panel.SudokuSector;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static br.com.dio.service.EventEnum.CLEAR_SPACE;
import static javax.swing.JOptionPane.*;

public class MainScreen {

    private final static Dimension dimension = new Dimension (600,600);

    private final BoardService boardService;
    private final NotifierService notifierService;

    private JButton resetButton;

    private JButton checkGameStatusButton;
    private JButton finishGameButton;


    public MainScreen(final Map<String, String> gameConfig){
        this.boardService = new BoardService(gameConfig);
        this.notifierService = new NotifierService();
    }

    public void buildMainScreen(){
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        for (int r = 0; r < 9; r+=3 ){
            var endRow = r+2;
            for (int c = 0; c < 9; c+=3 ){
                var endCol = c+2;
                var squares = getSquaresFromsector(boardService.getSquares(), c, endCol, r, endRow);
                JPanel sector = generateSection(squares);
                mainPanel.add(sector);
            }
        }

        addResetButton(mainPanel);
        addCheckGameStatusButton(mainPanel);
        addFinishGameButton(mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private List<Square> getSquaresFromsector(final List<List<Square>> squares, final int initCol, final int endCol, final int initRow, final int endRow){
        List<Square> squareSector = new ArrayList<>();
        for (int r = initRow; r <= endRow;r++ ){
            for (int c = initCol; c <= endCol; c++){
                squareSector.add(squares.get(c).get(r));
            }
        }
        return squareSector;
    }
    private JPanel generateSection(final List<Square> squares){
        List<NumberText> fields = new ArrayList<>(squares.stream().map(NumberText::new).toList());
        fields.forEach(t -> notifierService.subscribe(CLEAR_SPACE, t));
        return new SudokuSector(fields);

    }

    private void addResetButton(JPanel mainPanel) {
         resetButton = new ResetButton(e-> {
            var dialogResult = showConfirmDialog(
                    null,
                    "Deseja realmente reiniciar o jogo?",
                    "Limpar o jogo",
                    YES_NO_OPTION,
                    QUESTION_MESSAGE
            );
            if(dialogResult==0){
                boardService.reset();
                notifierService.notify(CLEAR_SPACE);
            }
        });
        mainPanel.add(resetButton);

    }

    private void addCheckGameStatusButton(JPanel mainPanel) {
         checkGameStatusButton = new CheckGamesStatusButton(e->{
        var hasErrors = boardService.hasErrors();
        var gameStatus = boardService.getStatus();
        var message = switch (gameStatus){
            case NOT_STARTED ->"O jogo não foi iniciado";
            case INCOMPLETE -> "O jogo esta em andamento";
            case COMPLETE -> "O jogo esta completo";

        };
        message += hasErrors ? "e contém erros" : " e não contém erros";
        showMessageDialog(null, message);

    });

        mainPanel.add(checkGameStatusButton);

    }

    private void addFinishGameButton(JPanel mainPanel) {
         finishGameButton = new FinishGameButton(e -> {
            if (boardService.gameIsFinished()){
                showMessageDialog(null, "Parabéns , você concluiu o jogo!");
                resetButton.setEnabled(false);
                checkGameStatusButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            } else{
                showMessageDialog(null , "Seu jogo contém alguma inconsitência, ajuste e tente novamente");
            }

        });
        mainPanel.add(finishGameButton);

    }

}

package br.com.dio.ui.custom.screen;

import br.com.dio.service.BoardService;
import br.com.dio.ui.custom.button.CheckGamesStatusButton;
import br.com.dio.ui.custom.button.FinishGameButton;
import br.com.dio.ui.custom.button.ResetButton;
import br.com.dio.ui.custom.frame.MainFrame;
import br.com.dio.ui.custom.panel.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class MainScreen {

    private final static Dimension dimension = new Dimension (600,600);

    private final BoardService boardService;

    private JButton resetButton;

    private JButton checkGameStatusButton;
    private JButton finishGameButton;


    public MainScreen(final Map<String, String> gameConfig){
        this.boardService = new BoardService(gameConfig);
    }

    public void buildMainScreen(){
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        addResetButton(mainPanel);
        addCheckGameStatusButton(mainPanel);
        addFinishGameButton(mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private void addResetButton(JPanel mainPanel) {
         resetButton = new ResetButton(e-> {
            var dialogResult = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente reiniciar o jogo?",
                    "Limpar o jogo",
                    YES_NO_OPTION,
                    QUESTION_MESSAGE
            );
            if(dialogResult==0){
                boardService.reset();
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
            case COMPLETE -> "o Jogo esta completo";

        };
        message += hasErrors ? "e contém erros" : "e não contém erros";
        JOptionPane.showMessageDialog(null, message);

    });

        mainPanel.add(checkGameStatusButton);

    }

    private void addFinishGameButton(JPanel mainPanel) {
         finishGameButton = new FinishGameButton(e -> {
            if (boardService.gameIsFinished()){
                JOptionPane.showMessageDialog(null, "Parabens , você concluiu o jogo!");
                resetButton.setEnabled(false);
                checkGameStatusButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            } else{
                JOptionPane.showMessageDialog(null , "Seu jogo contém alguma inconsitência, ajuste e tente novamente");
            }

        });
        mainPanel.add(finishGameButton);

    }

}

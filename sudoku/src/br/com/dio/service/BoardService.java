package br.com.dio.service;

import br.com.dio.model.Board;
import br.com.dio.model.GameStatusEnum;
import br.com.dio.model.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BoardService {

    private final int BOARD_LIMIT =9;

    private final Board board;

    public BoardService(final Map<String, String> gameConfig){
        this.board = new Board (initBoard(gameConfig));
    }

    public List<List<Square>> getSquares(){
        return this.board.getSquares();
    }

    public void reset(){
        this.board.reset();
    }

    public boolean hasErrors(){
        return this.board.hasErrors();
    }

    public GameStatusEnum getStatus(){
        return board.getStatus();
    }

    public boolean gameIsFinished(){
        return board.gameIsFinished();
    }
    private List<List<Square>> initBoard(Map<String, String> gameConfig) {
        List<List<Square>> squares = new ArrayList<>();
        for(int i = 0; i< BOARD_LIMIT; i++){
            squares.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++){
                var positionConfig = gameConfig.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(";")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(";")[1]);
                var currentSquare = new Square(fixed,expected);
                squares.get(i).add(currentSquare);
            }
        }
        return squares;
    }


}

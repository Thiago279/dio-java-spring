package br.com.dio.model;

import java.util.Collection;
import java.util.List;

import static br.com.dio.model.GameStatusEnum.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Board {

    private final List<List<square>> squares;

    public Board(List<List<square>> squares) {
        this.squares = squares;
    }

    public List<List<square>> getSquares() {
        return squares;
    }

    public GameStatusEnum getStatus(){
        if (squares.stream().flatMap(Collection::stream).noneMatch(s-> !s.isFixed() && nonNull(s.getActual()))){
            return NOT_STARTED;
        }
        return squares.stream().flatMap(Collection::stream).anyMatch(s->isNull(s.getActual())) ? INCOMPLETE : COMPLETE;
    }

    public boolean hasErrors(){
        if (getStatus() == NOT_STARTED){
            return false;
        }
        return squares.stream().flatMap(Collection::stream)
                .anyMatch(s -> nonNull(s.getActual()) && !s.getActual().equals(s.getExpected()));
    }

    public boolean changeValue (final int col, final int row, final Integer value) {

        var square = squares.get(col).get(row);
        if (square.isFixed()){
            return false;
        }
        square.setActual(value);
        return true;
    }

    public boolean clearValue(final int col, final int row){
        var square = squares.get(col).get(row);
        if (square.isFixed()){
            return false;
        }
        square.clearSquare();
        return true;
    }

    public void reset(){
        squares.forEach(c -> c.forEach(square::clearSquare));
    }

    public boolean gameIsFinished(){
        return !hasErrors() && getStatus().equals(COMPLETE);
    }

}

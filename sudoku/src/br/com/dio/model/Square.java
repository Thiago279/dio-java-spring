package br.com.dio.model;

public class Square {


    private final boolean fixed;
    private Integer actual;

    private final int expected;

    public Square(boolean fixed, int expected) {
        this.fixed = fixed;
        this.expected = expected;
        if (fixed){
            actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed(){
        return fixed;
    }

    public void clearSquare(){
        setActual(null);
    }
}

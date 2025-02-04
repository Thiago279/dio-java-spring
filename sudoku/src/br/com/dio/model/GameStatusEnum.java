package br.com.dio.model;

public enum GameStatusEnum {

    NOT_STARTED( "não iniciado"),
    INCOMPLETE( "em andamanto"),
    COMPLETE( "completo");

    private String label;

     GameStatusEnum(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

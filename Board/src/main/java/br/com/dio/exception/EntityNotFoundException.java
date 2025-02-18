package br.com.dio.exception;

public class EntityNotFounException extends RuntimeException{
    public EntityNotFounException(final String message){
        super(message);
    }
}

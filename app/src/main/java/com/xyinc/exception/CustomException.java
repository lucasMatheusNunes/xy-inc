package com.xyinc.exception;

public class CustomException extends Exception{
    private static final long serialVersionUID = 1L;

    public CustomException(String mensagem){
        super(mensagem);
    }
}

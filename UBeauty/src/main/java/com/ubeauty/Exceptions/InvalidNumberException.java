package com.ubeauty.Exceptions;

public class InvalidNumberException extends NumberFormatException{

    public InvalidNumberException(String s) {
        super("Valores inseridos incorramente! Por favor, verifique");
    }
    
    
}

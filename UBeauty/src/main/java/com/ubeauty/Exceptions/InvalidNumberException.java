package com.ubeauty.Exceptions;

public class InvalidNumberException extends NumberFormatException{

    public InvalidNumberException(String s) {
        super("Campo DDD ou Telefone inválido.");
    }
    
    public InvalidNumberException() {
        super("Valores inseridos incorramente! Por favor, verifique");
    }
    
    
    
}

package com.ubeauty.Exceptions;

import java.text.ParseException;

public class ParseDateException extends ParseException{
     
    public ParseDateException(String s, int errorOffset) {
        super("Formato inserido é inválido", errorOffset);
    }
    
    public ParseDateException(){
        super("Formato inserido é inválido",0);
    }
    
}

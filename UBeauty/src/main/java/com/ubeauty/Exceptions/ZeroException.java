package com.ubeauty.Exceptions;

public class ZeroException extends ArithmeticException{
    public ZeroException() {
        super("Não é possível que este campo seja 0");
    }

    
    public ZeroException(String s) {
        super(s);
    }
    
}

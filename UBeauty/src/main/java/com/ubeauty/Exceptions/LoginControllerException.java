package com.ubeauty.Exceptions;

import javax.swing.JOptionPane;

public class LoginControllerException extends Exception {

    public LoginControllerException() {
        JOptionPane.showMessageDialog(null, "Falha na tentativa de Login");
    }

    public LoginControllerException(String mensagem) {
        super(mensagem);
    }
}

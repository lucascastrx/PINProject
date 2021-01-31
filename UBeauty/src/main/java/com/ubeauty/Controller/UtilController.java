package com.ubeauty.Controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UtilController {

    static ImageIcon icon;

    public static void configurarTela(JFrame view) {
        //centralizar janela
        view.setLocationRelativeTo(null);

        //definir icone pra janela
        icon = new ImageIcon(view.getClass().getResource("/icon.png"));
        view.setIconImage(icon.getImage());
    }
    
    public static Integer confirmacaoSimNao(String titulo, String mensagem){
        return JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);
    }
    
        public static Integer converterString(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

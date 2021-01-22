package com.ubeauty.Controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class UtilController {

    static ImageIcon icon;

    public static void configurarTela(JFrame view) {
        //centralizar janela
        view.setLocationRelativeTo(null);

        //definir icone pra janela
        icon = new ImageIcon(view.getClass().getResource("/icon.png"));
        view.setIconImage(icon.getImage());
    }
}

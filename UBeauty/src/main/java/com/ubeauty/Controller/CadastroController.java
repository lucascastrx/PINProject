package com.ubeauty.Controller;

import com.ubeauty.View.TelaCadastro;
import com.ubeauty.View.TelaLogin;

public class CadastroController {
    TelaCadastro view;

    public CadastroController(TelaCadastro view) {
        this.view = view;
    }

    public void cancelar(){
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        view.dispose();
    }
    
}

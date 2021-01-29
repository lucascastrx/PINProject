package com.ubeauty.Controller;

import com.ubeauty.View.PanelContaConvidado;
import com.ubeauty.View.TelaCadastro;
import com.ubeauty.View.TelaLogin;
import com.ubeauty.View.TelaPrincipal;

public class ConvidadoController {
    PanelContaConvidado view;
    TelaPrincipal tp;

    public ConvidadoController(PanelContaConvidado view, TelaPrincipal tp) {
        this.view = view;
        this.tp = tp;
    }
    
    public void criarConta(){
        tp.dispose();
        new TelaCadastro().setVisible(true);
    }
    
    public void login(){
        tp.dispose();
        new TelaLogin().setVisible(true);
    }
}

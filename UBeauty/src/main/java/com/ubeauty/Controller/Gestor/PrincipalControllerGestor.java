package com.ubeauty.Controller.Gestor;

import com.ubeauty.Controller.*;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.View.Gestor.*;
import com.ubeauty.View.TelaLogin;
import com.ubeauty.View.Vendedor.*;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrincipalControllerGestor {

    private TelaPrincipalGestor view;
    private PanelPrincipalGestor viewPanelPrincipal;
    private JPanel viewPanel;
    private static CardLayout cl;
    private JPanel jpPrincipal;
    private JPanel jpRelatorio;
    private JPanel jpUsuarios;
    private JPanel jpTermos;

    public PrincipalControllerGestor(TelaPrincipalGestor view) {
        this.view = view;
        UtilController.configurarTela(view);
        cl = new CardLayout();
        view.setPainelConteudoLayout(cl);
        this.addPaineis();
        
    }

    public PrincipalControllerGestor(JPanel viewPanel) {
        this.viewPanel = viewPanel;
    }

    public void mostrarTela(String x) {
        cl.show(view.getPainelConteudo(), x);
    }

    private void addPaineis() {

        jpPrincipal = new PanelPrincipalGestor(view, this);
        jpRelatorio = new PanelRelatorioGestor(view, this);
        jpUsuarios = new PanelUsuariosGestor(view, this);
        jpTermos = new PanelTermosGestor(view, this);

        view.addPainel(jpPrincipal, "principal");         
        view.addPainel(jpRelatorio, "relatorio");         
        view.addPainel(jpUsuarios, "usuarios");         
        view.addPainel(jpTermos, "termos");         
    }
    
    public void logout() {
        view.dispose();
        LoginAuthentication.cliente = null;
        new TelaLogin().setVisible(true);
    }
    
    public void carregarTelaPrincipal(){
        viewPanelPrincipal.getTxtUsuario().setText(LoginAuthentication.gestor.getNome());
    }

    public void setViewPanelPrincipal(PanelPrincipalGestor viewPanelPrincipal) {
        this.viewPanelPrincipal = viewPanelPrincipal;
    }
    
   
}

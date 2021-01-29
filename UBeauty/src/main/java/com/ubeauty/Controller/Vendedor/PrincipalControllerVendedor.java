package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.*;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.View.Vendedor.*;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrincipalControllerVendedor {

    private TelaPrincipalVendedor view;
    private JPanel viewPanel;
    private CardLayout cl;
    private JPanel jpPrincipal;

    public PrincipalControllerVendedor(TelaPrincipalVendedor view) {
        this.view = view;
        UtilController.configurarTela(view);
        cl = new CardLayout();
        view.setPainelConteudoLayout(cl);
        this.addPaineis();
        
    }

    public PrincipalControllerVendedor(JPanel viewPanel) {
        this.viewPanel = viewPanel;
    }

    public void mostrarTela(String x) {
        cl.show(view.getPainelConteudo(), x);
    }

    private void addPaineis() {

        jpPrincipal = new PanelPrincipalVendedor(view, this);

        view.addPainel(jpPrincipal, "principal");         
    }
   
}

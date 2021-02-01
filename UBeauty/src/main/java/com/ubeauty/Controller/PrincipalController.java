package com.ubeauty.Controller;

import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.View.*;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrincipalController {

    private TelaPrincipal view;
    private JPanel viewPanel;
    private CardLayout cl;
    private JPanel jpPrincipal;
    private JPanel jpNotif;
    private JPanel jpPagSalao;
    private JPanel jpAgendamento;
    private JPanel jpConta;
    private JPanel jpContaConvidado;
    private JPanel jpSaloes;
    private JPanel jpAutonomos;
    private JPanel jpMensagens;
    private JFrame PopUpAgendar;
    private JFrame PopUpReclamacoes;
    
    private Vendedor tempVendedor;

    public PrincipalController(TelaPrincipal view) {
        this.view = view;

        UtilController.configurarTela(view);

        cl = new CardLayout();
        view.setPainelConteudoLayout(cl);

        this.addPaineis();
        
        tempVendedor = new Vendedor();
        
    }

    public PrincipalController(JPanel viewPanel) {
        this.viewPanel = viewPanel;
    }
    
    public void mostrarTelaUsuario(){
        if (LoginAuthentication.cliente != null) {
            cl.show(view.getPainelConteudo(), "conta");
        } else cl.show(view.getPainelConteudo(), "contaConvidado");
    }

    public void mostrarTela(String x) {
        cl.show(view.getPainelConteudo(), x);
    }

    private void addPaineis() {

        jpPrincipal = new PanelPrincipal(view, this);
        jpNotif = new PanelNotificacoes();
        jpPagSalao = new PanelPaginaSalao(this);
        jpAgendamento = new PanelAgendamento();
        jpConta = new PanelConta(this);
        jpSaloes = new PanelSaloes(this);
        jpAutonomos = new PanelAutonomos(this);
        jpMensagens = new PanelMensagens();
        jpContaConvidado = new PanelContaConvidado(view, this);

        view.addPainel(jpPrincipal, "principal"); 
        view.addPainel(jpNotif, "notificacoes"); 
        view.addPainel(jpPagSalao, "paginaSalao");
        view.addPainel(jpAgendamento, "agendamento");
        view.addPainel(jpConta, "conta");
        view.addPainel(jpContaConvidado, "contaConvidado");
        view.addPainel(jpSaloes, "saloes");
        view.addPainel(jpAutonomos, "autonomos");
        view.addPainel(jpMensagens, "mensagens");
        
    }

    public TelaPrincipal getView() {
        return view;
    }
    
    public void tempVendedor(Vendedor v){
            PanelPaginaSalao p = (PanelPaginaSalao) jpPagSalao;
            p.setVendedor(v);       
    }
   
}

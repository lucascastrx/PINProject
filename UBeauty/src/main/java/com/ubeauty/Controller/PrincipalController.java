package com.ubeauty.Controller;

import com.ubeauty.View.*;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
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
    private JPanel jpSaloes;
    private JPanel jpAutonomos;
    private JPanel jpMensagens;
    private JFrame PopUpAgendar;
    private JFrame PopUpReclamacoes;

    public PrincipalController(TelaPrincipal view) {
        this.view = view;
        UtilController.configurarTela(view);

        cl = new CardLayout();
        view.setPainelConteudoLayout(cl);

        this.addPaineis();

    }
    
    public PrincipalController(JPanel viewPanel){
        this.viewPanel = viewPanel;
    }

    public void mostrarTela(String x) {
        cl.show(view.getPainelConteudo(), x);
    }

    private void addPaineis() {

        jpPrincipal = new PanelPrincipal(view, this);
        jpNotif = new PanelNotificacoes();
        jpPagSalao = new PanelPaginaSalao();
        jpAgendamento = new PanelAgendamento();
        jpConta = new PanelConta();
        jpSaloes = new PanelSaloes();
        jpAutonomos = new PanelAutonomos();
        jpMensagens = new PanelMensagens();

        view.addPainel(jpPrincipal, "principal");
        view.addPainel(jpNotif, "notificacoes");
        view.addPainel(jpPagSalao, "paginaSalao");
        view.addPainel(jpAgendamento, "agendamento");
        view.addPainel(jpConta, "conta");
        view.addPainel(jpSaloes, "saloes");
        view.addPainel(jpAutonomos, "autonomos");
        view.addPainel(jpMensagens, "mensagens");
    }
    
    

}

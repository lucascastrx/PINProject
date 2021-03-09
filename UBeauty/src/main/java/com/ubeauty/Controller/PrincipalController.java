package com.ubeauty.Controller;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Carrinho;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.OrdemItem;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.TableModel.TableModelClienteAgendados;
import com.ubeauty.TableModel.TableModelServicos;
import com.ubeauty.View.*;
import com.ubeauty.View.Gestor.PanelTermosGestor;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
    private JPanel jpTermosDeUso;
    private JFrame PopUpAgendar;
    private JFrame PopUpReclamacoes;
    
    private TableModelClienteAgendados modelAgendados;
 

    public PrincipalController(TelaPrincipal view) {
        this.view = view;

        UtilController.configurarTela(view);

        cl = new CardLayout();
        view.setPainelConteudoLayout(cl);

        this.addPaineis();
        
    }

    public PrincipalController() {
        this.view = new TelaPrincipal();
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
        jpNotif = new PanelNotificacoes(view);
        jpPagSalao = new PanelPaginaSalao(this);
        jpAgendamento = new PanelAgendamento();
        jpConta = new PanelConta(this);
        jpSaloes = new PanelSaloes(this);
        jpAutonomos = new PanelAutonomos(this);
        jpMensagens = new PanelMensagens();
        jpContaConvidado = new PanelContaConvidado(view, this);
        jpTermosDeUso = new PanelTermosGestor(this);

        view.addPainel(jpPrincipal, "principal"); 
        view.addPainel(jpNotif, "notificacoes"); 
        view.addPainel(jpPagSalao, "paginaSalao");
        view.addPainel(jpAgendamento, "agendamento");
        view.addPainel(jpConta, "conta");
        view.addPainel(jpContaConvidado, "contaConvidado");
        view.addPainel(jpSaloes, "saloes");
        view.addPainel(jpAutonomos, "autonomos");
        view.addPainel(jpMensagens, "mensagens");
        view.addPainel(jpTermosDeUso, "termosUso");
        
    }

    public TelaPrincipal getView() {
        return view;
    }
    
    public void tempVendedor(Vendedor v){
            PanelPaginaSalao p = (PanelPaginaSalao) jpPagSalao;
            p.setVendedor(v);       
    }
    
   
    public JPanel getJpPrincipal() {
        return jpPrincipal;
    }
    
    
   
}

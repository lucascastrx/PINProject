package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.*;
import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Exceptions.ParseDateException;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.TableModel.TableModelClienteAgendados;
import com.ubeauty.View.Gestor.PanelTermosGestor;
import com.ubeauty.View.Vendedor.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;

public class PrincipalControllerVendedor {

    private TelaPrincipalVendedor view;
    private JPanel viewPanel;
    private static CardLayout cl;
    private JPanel jpPrincipal;
    private JPanel jpNotificacoes;
    private JPanel jpServicos;
    private JPanel jpConta;
    private JPanel jpTermosDeUso;
    private PopUpDisponibilizarHorario popUp;

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
    
    public void mostrarTelaConta(){
        jpConta = new PanelContaVendedor(view);
        view.addPainel(jpConta, "conta"); 
        mostrarTela("conta");
    }

    public void mostrarTela(String x) {
        cl.show(view.getPainelConteudo(), x);
    }

    private void addPaineis() {

        jpPrincipal = new PanelPrincipalVendedor(view, this);
        jpNotificacoes = new PanelNotificacoesVendedor(view);
        jpServicos = new PanelServicosVendedor(view);
        jpConta = new PanelContaVendedor(view);
        jpTermosDeUso = new PanelTermosGestor(this);

        view.addPainel(jpPrincipal, "principal");         
        view.addPainel(jpNotificacoes, "notificacoes");         
        view.addPainel(jpServicos, "servicos");         
        view.addPainel(jpConta, "conta");
        view.addPainel(jpTermosDeUso, "termosUso");
    }
   
}

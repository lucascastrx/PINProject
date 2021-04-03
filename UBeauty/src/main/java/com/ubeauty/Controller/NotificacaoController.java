package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.TableModel.TableModelNotificacoes;
import com.ubeauty.View.PanelNotificacoes;
import com.ubeauty.View.TelaPrincipal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NotificacaoController {
    private TelaPrincipal viewPrincipal;
    private PanelNotificacoes view;
    private TableModelNotificacoes modelNotificacoes;
    private Cliente cliente;

    public NotificacaoController(PanelNotificacoes view, TelaPrincipal viewPrincipal) {
        this.viewPrincipal = viewPrincipal;
        this.view = view;
        cliente = LoginAuthentication.cliente;
    }

    public void setDadosTabela() {
        modelNotificacoes = new TableModelNotificacoes(this.buscarNotificacoes());
        view.setTableModel(modelNotificacoes);
        view.getTableNotificacoes().repaint();
    }

    private Map<Integer, Notificacao> buscarNotificacoes() {
        
        //Map<Integer,Notificacao> mapCN = new HashMap<>(new ClienteNotificacaoDAO().buscarNotificacaoPorIdCliente(cliente.getId()));
        Map<Integer,Notificacao> mapCN = new HashMap<>();
        try {
            Set<Notificacao> setNotif = cliente.getNotificacoes();
            
            setNotif.forEach( n ->{
            mapCN.putIfAbsent(n.getId(), n);
        });
        } catch (Exception e) {
        }
        
        //System.out.println("TAMANHO DO VETOR DE NOTIFICACOES"+mapCN.size());
       
        
        return mapCN;
    }
    
    public void voltar(){
        viewPrincipal.getController().mostrarTela("principal");
    }

    public void limparNotificacoes() {
        cliente.removeNotificacoes();
        setDadosTabela();
        ClienteDAO repository = new ClienteDAO();
        repository.atualizar(cliente);
    }
}

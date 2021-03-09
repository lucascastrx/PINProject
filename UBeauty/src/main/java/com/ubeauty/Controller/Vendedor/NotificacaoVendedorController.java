package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.NotificacaoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelNotificacoes;
import com.ubeauty.View.Vendedor.PanelNotificacoesVendedor;
import com.ubeauty.View.Vendedor.PopUpCriarNotificacao;
import com.ubeauty.View.Vendedor.TelaPrincipalVendedor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificacaoVendedorController {

    private TelaPrincipalVendedor viewPrincipal;
    private PanelNotificacoesVendedor view;
    private PopUpCriarNotificacao popUp;
    private Vendedor vendedor;
    private TableModelNotificacoes modelNotificacoes;

    public NotificacaoVendedorController(PanelNotificacoesVendedor view, TelaPrincipalVendedor viewPrincipal) {
        this.viewPrincipal = viewPrincipal;
        this.view = view;
        vendedor = (Vendedor) LoginAuthentication.cliente;
    }
    
    public NotificacaoVendedorController(){
        
    }

    public void abrirTelaCriarNotificacao() {
        new PopUpCriarNotificacao(this).setVisible(true);
    }

    public void setPopUp(PopUpCriarNotificacao popUp) {
        this.popUp = popUp;
    }

    public void setDadosTabela() {
        modelNotificacoes = new TableModelNotificacoes(this.buscarNotificacoes());
        view.setTableModel(modelNotificacoes);
        view.getTableNotificacoes().repaint();
    }

    public void criarNotificacao() {     
        String texto = popUp.getTaDescricao().getText();

        if (!texto.isBlank()) {
            Notificacao n = new Notificacao(texto, new Date(), new Date());
            n.setVendedorN(vendedor);
            vendedor.addNotificacao(n);

            VendedorDAO persistencia = new VendedorDAO();
            persistencia.atualizar(vendedor);
            
            enviarNotificacao(n);
            
            new NotificacaoDAO().gravar(n);
            
            setDadosTabela();

            popUp.dispose();
        } else {
            viewPrincipal.exibirMensagem("Deve inserir conteúdo na notificação.");
        }
    }
    
    public void enviarNotificacao(Notificacao n) {
        String [] endereco = vendedor.getEndereco().split(", ");
        String cidade = endereco[0];
        Map<Integer, Cliente> mapClientes =  new ClienteDAO().buscarTodosClientes();
        List<Cliente> listClientes = new ArrayList<>();
        
        for (Map.Entry<Integer, Cliente> c : mapClientes.entrySet()) {
            if(!(c.getValue() instanceof Vendedor)){
                Cliente cliente =  c.getValue();
                listClientes.add(cliente);
             }
        }
      
        for (Cliente c : listClientes) {
                String [] address = c.getEndereco().split(", ");
                String city = address[0];
                if(city.equalsIgnoreCase(cidade)){
                    System.out.println("Gravei!");
                    c.addNotificacao(n);
                    n.addClientes(c);
                    ClienteDAO cd2 = new ClienteDAO();
                    cd2.atualizar(c);
                    
                }
            
        }
        
    }

    private Map<Integer, Notificacao> buscarNotificacoes() {
        Map<Integer, Notificacao> mapNotificacoes = new HashMap<>();
        List<Notificacao> listNotificacoes = vendedor.getNotificacoesEnviadas();
        for (Notificacao n : listNotificacoes) {
            mapNotificacoes.putIfAbsent(n.getId(), n);
        }
        return mapNotificacoes;
    }
    
    public void voltar(){
        viewPrincipal.getController().mostrarTela("principal");
    }
}

package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.NotificacaoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.View.Vendedor.PanelNotificacoesVendedor;
import com.ubeauty.View.Vendedor.PopUpCriarNotificacao;
import com.ubeauty.View.Vendedor.TelaPrincipalVendedor;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class NotificacaoVendedorController {
    private TelaPrincipalVendedor viewPrincipal;
    private PanelNotificacoesVendedor view;
    private PopUpCriarNotificacao popUp;
    private Vendedor vendedor;

    public NotificacaoVendedorController(PanelNotificacoesVendedor view, TelaPrincipalVendedor viewPrincipal) {
        this.viewPrincipal = viewPrincipal;
        this.view = view;
        vendedor = (Vendedor)LoginAuthentication.cliente;
    }

    public void abrirTelaCriarNotificacao() {
        new PopUpCriarNotificacao(this).setVisible(true);
    }

    public void setPopUp(PopUpCriarNotificacao popUp) {
        this.popUp = popUp;
    }

    public void criarNotificacao() {
        String texto = popUp.getTaDescricao().getText();
        
        if (!texto.equals("")) {
            Notificacao n = new Notificacao(texto, new Date(), new Date());
            n.setVendedorN(vendedor);
            
            vendedor.addNotificacao(n);
            
            VendedorDAO persistencia = new VendedorDAO();
            persistencia.atualizar(vendedor);
            
            persistencia.closeConnection();
            
            NotificacaoDAO nd = new NotificacaoDAO();
            nd.gravar(n);
            
            enviarNotificacao(n);
            
            popUp.dispose();
        } else viewPrincipal.exibirMensagem("Deve inserir um texto.");
    }
    
    public void enviarNotificacao(Notificacao n){
        String cidade = vendedor.getEndereco().split(" ,")[0];
        ClienteDAO cd = new ClienteDAO();
        List<Cliente> clientes = cd.buscarClientesPorCidade(cidade);
        for (Cliente cliente : clientes) {
            cliente.addNotificacao(n);
            ClienteDAO cd2 = new ClienteDAO();
            cd2.atualizar(cliente);
            cd2.closeConnection();
        }
        
    }
    
    
    
    
}

package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Reclamacao;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ReclamacaoDAO;
import com.ubeauty.View.PopUpReclamacoes;
import java.util.Date;

public class ReclamacaoController {
    private Vendedor vendedor;
    private PopUpReclamacoes panelReclamacoes;

    public ReclamacaoController(Vendedor vendedor, PopUpReclamacoes panelReclamacoes) {
        this.vendedor = vendedor;
        this.panelReclamacoes = panelReclamacoes;
    }
    
    public void salvarReclamacao(){
        try {
            Cliente cliente = LoginAuthentication.cliente;
            Reclamacao reclamacao = new Reclamacao(panelReclamacoes.getTxtMeuComentario().getText(), cliente.getNome(), new Date(), new Date());
            reclamacao.setCliente(cliente);
            reclamacao.setVendedor(vendedor);
            
            ReclamacaoDAO repository = new ReclamacaoDAO();
            repository.gravar(reclamacao);
            
            panelReclamacoes.exibirMensagem("Reclamação gerada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
}

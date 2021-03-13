package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Reclamacao;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ReclamacaoDAO;
import com.ubeauty.View.PopUpReclamacoes;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ReclamacaoController {
    private Vendedor vendedor;
    private PopUpReclamacoes popUpReclamacoes;

    public ReclamacaoController(Vendedor vendedor, PopUpReclamacoes popUpReclamacoes) {
        this.vendedor = vendedor;
        this.popUpReclamacoes = popUpReclamacoes;
    }
    
    public void carregarReclamacoes(){
        String comentarios = "";
        
        ReclamacaoDAO repository = new ReclamacaoDAO();
        List lista = repository.buscarReclamacoesPorIdVendedor(vendedor.getId());

        for (Object umaReclamacao : lista) {
            comentarios += umaReclamacao.toString();
        }
        
        popUpReclamacoes.getTxtComentarios().setText(comentarios);
    }
    
    public void salvarReclamacao(){
        try {
            Cliente cliente = LoginAuthentication.cliente;
            Reclamacao reclamacao = new Reclamacao(popUpReclamacoes.getTxtMeuComentario().getText(), cliente.getNome(), new Date(), new Date());
            reclamacao.setCliente(cliente);
            reclamacao.setVendedor(vendedor);
            
            ReclamacaoDAO repository = new ReclamacaoDAO();
            repository.gravar(reclamacao);
            
            popUpReclamacoes.exibirMensagem("Reclamação enviada!");
            carregarReclamacoes();
            popUpReclamacoes.getTxtMeuComentario().setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
}

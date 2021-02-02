package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.View.Vendedor.PanelServicosVendedor;
import com.ubeauty.View.Vendedor.PopUpCriarServico;

public class ServicoVendedorController {
    PanelServicosVendedor view;
    PopUpCriarServico popUpCriarServico;
    Vendedor vendedor;

    public ServicoVendedorController(PanelServicosVendedor view) {
        this.view = view;
        vendedor = (Vendedor) LoginAuthentication.cliente;
    }
    
    public void abrirPopUpCriarServico(){
        new PopUpCriarServico(this).setVisible(true);
    }
    
    public void salvarNovoServico(){
        String categoria = popUpCriarServico.getTfCategoria().getText();
        String descricao = popUpCriarServico.getTfDescricao().getText();
        String preco = popUpCriarServico.getTfPreco().getText();
        String nome = popUpCriarServico.getTfNome().getText();
        double valor = UtilController.converterParaDouble(preco);
        
        if (valor != -1.0) {
            //As ligações entre as entidades deve ser feitas com a conexão do DB aberta. Tentei explicar um pouco no App
            VendedorDAO persistencia = new VendedorDAO();
            Servico servico = new Servico(nome,descricao,categoria,valor);
            Vendedor v = persistencia.buscar(vendedor.getId());
            v.addServico(servico); 
            persistencia.closeConnection();
            
            ServicoDAO sPersist = new ServicoDAO();
            sPersist.gravar(servico);
            
            VendedorDAO vPersist = new VendedorDAO();
            vPersist.atualizar(v);
            popUpCriarServico.dispose();
            
        } else view.exibirMensagem("Preço inválido.");
        
    }

    public void setPopUp(PopUpCriarServico popUp) {
        this.popUpCriarServico = popUp;
    }
    
    
    
    
}

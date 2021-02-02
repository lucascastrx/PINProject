package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.View.PanelConta;
import com.ubeauty.View.TelaCadastro;
import javax.swing.JOptionPane;

public class ContaController {
    PrincipalController controller;
    PanelConta panelConta;
    public ContaController(PrincipalController controller, PanelConta p) {
        this.controller = controller;
        this.panelConta = p;
        carregarDados();
        }
    
    private void carregarDados(){
        if(LoginAuthentication.cliente != null){
            Cliente tempCliente = LoginAuthentication.cliente;
            String telefone = "(" + tempCliente.getDdd() + ") " + tempCliente.getTelefone();
            String nome = tempCliente.getNome()+ " " + tempCliente.getSobrenome();
            panelConta.getTxtNome().setText(nome);
            panelConta.getTxtTelefone().setText(telefone);
            panelConta.getTxtEmail().setText(tempCliente.getEmail());
            panelConta.getTxtEndereco().setText(tempCliente.getEndereco());
        }
        
    }
    
    public void alterarDados(){
        TelaCadastro view = new TelaCadastro();
        view.getBtnCadastrar().setText("Confirmar");
        view.getHeader().setText("Altere seus dados");
        view.carregarDadosConta();
        view.setVisible(true);
        controller.getView().dispose();
        
    }
    
    public void delete(){ 
        String mensagem = "Deseja realmente excluir a sua conta?";
        String titulo = "Excluir conta";
        
        if (UtilController.confirmacaoSimNao(titulo, mensagem) == JOptionPane.YES_OPTION) {
            try {
                Cliente tempCliente = LoginAuthentication.cliente;
                ClienteDAO repository = new ClienteDAO();
                repository.remover(tempCliente.getId());
                logout();
            } catch (Exception ex) {
                panelConta.exibirMensagem("Erro! Não foi possível excluir.");
            }
        }
    }
    
    public void logout(){
        LoginAuthentication.cliente = null;
        voltarTela();
    }
    
    public void voltarTela(){
        controller.mostrarTela("principal");
    }
    
    
}

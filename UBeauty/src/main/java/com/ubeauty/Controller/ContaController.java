package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.View.PanelConta;
import com.ubeauty.View.PopUpEditarConta;
import com.ubeauty.View.TelaLogin;
import javax.swing.JOptionPane;

public class ContaController {

    PrincipalController controller;
    PanelConta panelConta;
    PopUpEditarConta popUpEditarConta;
    
    private Cliente cl;

    public ContaController(PrincipalController controller, PanelConta p) {
        this.controller = controller;
        this.panelConta = p;
        carregarDados();
    }
    
    public ContaController(Cliente c, PopUpEditarConta pop){
        this.cl = c;
        this.setPopUpEditarConta(pop);
        this.carregarPopUpGestor();
        
    }
    
    

    private void carregarDados() {
        if (LoginAuthentication.cliente != null) {
            Cliente tempCliente = LoginAuthentication.cliente;
            String telefone = "(" + tempCliente.getDdd() + ") " + tempCliente.getTelefone();
            String nome = tempCliente.getNome() + " " + tempCliente.getSobrenome();
            panelConta.getTxtNome().setText(nome);
            panelConta.getTxtTelefone().setText(telefone);
            panelConta.getTxtEmail().setText(tempCliente.getEmail());
            panelConta.getTxtEndereco().setText(tempCliente.getEndereco());
        }

    }

    public void salvarDados() {
        
        Cliente c = LoginAuthentication.cliente;
        
        c.setDdd(UtilController.converterString(popUpEditarConta.getTfDDD().getText()));
        c.setTelefone(UtilController.converterString(popUpEditarConta.getTfTelefone().getText()));

        String rua = popUpEditarConta.getTfRua().getText();
        String numero = popUpEditarConta.getTfNumero().getText();
        String cidade = popUpEditarConta.getTfCidade().getText();
        String estado = popUpEditarConta.getTfEstado().getText();
        String endereco = cidade + ", " + rua + ", " + numero + ", " + estado;
        c.setEndereco(endereco);
        c.setSenha(popUpEditarConta.getTfSenha().getText());

        if (c.getDdd() != -1 && c.getTelefone() != -1) {
            ClienteDAO persistencia = new ClienteDAO();
            persistencia.atualizar(c);
            LoginAuthentication.cliente = c;
            carregarDados();
            popUpEditarConta.dispose();
           
        } else {
            panelConta.exibirMensagem("Campos DDD ou Telefone inválidos.");
        }
    }

    public void abrirPopUpEditarConta() {
      popUpEditarConta = new PopUpEditarConta(this);
      this.carregarPopUp();
      popUpEditarConta.setVisible(true);
    }

    public void carregarPopUp() {

        Cliente c = LoginAuthentication.cliente;

        String endereco = c.getEndereco();
        String valores[] = endereco.split(", ");

        popUpEditarConta.getTfDDD().setText(String.valueOf(c.getDdd()));
        popUpEditarConta.getTfTelefone().setText(String.valueOf(c.getTelefone()));
        popUpEditarConta.getTfRua().setText(valores[1]);
        popUpEditarConta.getTfNumero().setText(valores[2]);
        popUpEditarConta.getTfCidade().setText(valores[0]);
        popUpEditarConta.getTfEstado().setText(valores[3]);
        popUpEditarConta.getTfSenha().setText(c.getSenha());
    }

    public void delete() {
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

    public void logout() {
        controller.getView().dispose();
        LoginAuthentication.cliente = null;
        new TelaLogin().setVisible(true);
    }

    public void voltarTela() {
        controller.mostrarTela("principal");
    }

    public void setPopUpEditarConta(PopUpEditarConta popUpEditarConta) {
        this.popUpEditarConta = popUpEditarConta;
    }
    
    public void carregarPopUpGestor() {

        String endereco = cl.getEndereco();
        String valores[] = endereco.split(", ");

        popUpEditarConta.getTfDDD().setText(String.valueOf(cl.getDdd()));
        popUpEditarConta.getTfTelefone().setText(String.valueOf(cl.getTelefone()));
        popUpEditarConta.getTfRua().setText(valores[1]);
        popUpEditarConta.getTfNumero().setText(valores[2]);
        popUpEditarConta.getTfCidade().setText(valores[0]);
        popUpEditarConta.getTfEstado().setText(valores[3]);
        popUpEditarConta.getTfSenha().setText(cl.getSenha());
    }

    
   public void salvarDadosGestor() {
        
        
        
        cl.setDdd(UtilController.converterString(popUpEditarConta.getTfDDD().getText()));
        cl.setTelefone(UtilController.converterString(popUpEditarConta.getTfTelefone().getText()));

        String rua = popUpEditarConta.getTfRua().getText();
        String numero = popUpEditarConta.getTfNumero().getText();
        String cidade = popUpEditarConta.getTfCidade().getText();
        String estado = popUpEditarConta.getTfEstado().getText();
        String endereco = cidade + ", " + rua + ", " + numero + ", " + estado;
        cl.setEndereco(endereco);
        cl.setSenha(popUpEditarConta.getTfSenha().getText());

        if (cl.getDdd() != -1 && cl.getTelefone() != -1) {
            ClienteDAO persistencia = new ClienteDAO();
            persistencia.atualizar(cl);
            popUpEditarConta.dispose();
           
        } else {
            panelConta.exibirMensagem("Campos DDD ou Telefone inválidos.");
        }
    }
}

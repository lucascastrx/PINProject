/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.View.TelaLogin;
import com.ubeauty.View.Vendedor.PanelContaVendedor;
import com.ubeauty.View.Vendedor.PopUpEditarConta;
import com.ubeauty.View.Vendedor.TelaPrincipalVendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Buzzi 
 */
public class ContaVendedorController {

    private TelaPrincipalVendedor viewPrincipal;
    private PanelContaVendedor view;
    PopUpEditarConta popUp;
    private VendedorDAO persistencia;
    private Vendedor vendedor;

    public ContaVendedorController(PanelContaVendedor view, TelaPrincipalVendedor viewPrincipal) {
        this.view = view;
        this.viewPrincipal = viewPrincipal;
        persistencia = new VendedorDAO();
        vendedor = (Vendedor) LoginAuthentication.cliente;
    }

    public void carregarTela() {
        try {
            view.getTxtNome().setText(vendedor.getNomeProfissao());
            view.getTxtEmail().setText(vendedor.getEmail());
            view.getTxtEndereco().setText(vendedor.getEndereco());
            view.getTxtTelefone().setText("(" +String.valueOf(vendedor.getDdd())+ ") " + String.valueOf(vendedor.getTelefone()));
            view.getTaDescricao().setText(vendedor.getDescricao());
            view.getLabelDescricaoSalva().setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
            viewPrincipal.exibirMensagem("Não foi possível carregar informações.");
        }
    }

    public void carregarPopUp() {

        
        String endereco = vendedor.getEndereco();
        String valores[] = endereco.split(", ");

        popUp.getTfDDD().setText(String.valueOf(vendedor.getDdd()));
        popUp.getTfTelefone().setText(String.valueOf(vendedor.getTelefone()));
        popUp.getTfRua().setText(valores[1]);
        popUp.getTfNumero().setText(valores[2]);
        popUp.getTfCidade().setText(valores[0]);
        popUp.getTfEstado().setText(valores[3]);
        popUp.getTfNomeProfissao1().setText(vendedor.getNomeProfissao());
        popUp.getTfSenha().setText(vendedor.getSenha());
        
        if (vendedor.getHoraFunc() != null) {
            String horarioFunc[] = vendedor.getHoraFunc().split(";");
            popUp.getCbDia1().setSelectedIndex(Integer.parseInt(horarioFunc[0]));
            popUp.getCbDia2().setSelectedIndex(Integer.parseInt(horarioFunc[1]));
            popUp.getTfHorario().setText(horarioFunc[2]);
            popUp.getTfHorarioEspecial().setText(horarioFunc[3]);
        } else {
            popUp.getCbDia1().setSelectedIndex(0);
            popUp.getCbDia2().setSelectedIndex(0);
        }

    }

    public void salvarDescricao() {
        vendedor.setDescricao(view.getTaDescricao().getText());
        persistencia = new VendedorDAO();
        persistencia.atualizar(vendedor);
        view.getLabelDescricaoSalva().setVisible(true);
    }

    public void salvarDados() {
        
        vendedor.setDdd(UtilController.converterString(popUp.getTfDDD().getText()));
        vendedor.setTelefone(UtilController.converterString(popUp.getTfTelefone().getText()));
        
        String rua = popUp.getTfRua().getText();
        String numero = popUp.getTfNumero().getText();
        String cidade = popUp.getTfCidade().getText();
        String estado = popUp.getTfEstado().getText();
        String endereco = cidade + ", " + rua + ", " + numero + ", " + estado;
        vendedor.setEndereco(endereco);
        
        vendedor.setNomeProfissao(popUp.getTfNomeProfissao1().getText());
        vendedor.setSenha(popUp.getTfSenha().getText());
        
        String dia1 = String.valueOf(popUp.getCbDia1().getSelectedIndex());
        String dia2 = String.valueOf(popUp.getCbDia2().getSelectedIndex());
        String horario = popUp.getTfHorario().getText();
        String horarioEspecial = popUp.getTfHorarioEspecial().getText();
        String horarioFunc = dia1 + ";" + dia2 + ";" + horario + ";" + horarioEspecial;
        vendedor.setHoraFunc(horarioFunc);
        
        if (vendedor.getDdd() != -1 || vendedor.getTelefone() != -1) {
            persistencia = new VendedorDAO();
            persistencia.atualizar(vendedor);
            popUp.dispose();
        } else viewPrincipal.exibirMensagem("Campos DDD ou Telefone inválidos.");
        
    }

    public void abrirPopUpEditarConta() {
        new PopUpEditarConta(this).setVisible(true);
    }

    public void logout() {
        viewPrincipal.dispose();
        LoginAuthentication.cliente = null;
        new TelaLogin().setVisible(true);
    }

    public void excluirConta() {

        String mensagem = "Deseja realmente excluir a sua conta?";
        String titulo = "Excluir conta";

        if (UtilController.confirmacaoSimNao(titulo, mensagem) == JOptionPane.YES_OPTION) {
            try {
                persistencia.remover(vendedor.getId());
                LoginAuthentication.cliente = null;
                viewPrincipal.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro! Não foi possível excluir.");
            }
        }

    }

    public void setPopUp(PopUpEditarConta popUp) {
        this.popUp = popUp;
    }
    
    public void voltar(){
        viewPrincipal.getController().mostrarTela("principal");
    }
    
    
}

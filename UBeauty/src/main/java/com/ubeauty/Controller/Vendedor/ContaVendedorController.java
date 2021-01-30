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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Buzzi
 */
public class ContaVendedorController {

    TelaPrincipalVendedor viewPrincipal;
    PanelContaVendedor view;
    VendedorDAO persistencia;
    Vendedor vendedor = (Vendedor) LoginAuthentication.cliente;

    public ContaVendedorController(PanelContaVendedor view, TelaPrincipalVendedor viewPrincipal) {
        this.view = view;
        this.viewPrincipal = viewPrincipal;
        persistencia = new VendedorDAO();
    }

    public void carregarTela() {
        view.getTxtNome().setText(vendedor.getNomeProfissao());
        view.getTxtEmail().setText(vendedor.getEmail());
        view.getTxtEndereco().setText(vendedor.getEndereco());
        view.getTxtTelefone().setText(String.valueOf(vendedor.getTelefone()));
        view.getTaDescricao().setText(vendedor.getDescricao());
        view.getLabelDescricaoSalva().setVisible(false);
    }

    public void salvarDescricao() {
        vendedor.setDescricao(view.getTaDescricao().getText());
        persistencia.atualizar(vendedor);
        view.getLabelDescricaoSalva().setVisible(true);
    }

    public void salvarDados() {
        
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
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro! Não foi possível excluir.");
            }
        }

    }
}

package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Exceptions.BlankException;
import com.ubeauty.Exceptions.InvalidNumberException;
import com.ubeauty.View.TelaCadastro;
import com.ubeauty.View.TelaConfirmacaoCadastro;
import com.ubeauty.View.TelaLogin;
import javax.swing.JOptionPane;

public class CadastroController {

    TelaCadastro view;
    TelaConfirmacaoCadastro viewFinal;

    String nome;
    String sobrenome;
    String email;
    String telefone;
    String ddd;
    int dddInt;
    int telefoneInt;
    String senha;

    public CadastroController(TelaCadastro view) {
        this.view = view;
    }

    public void cadastrar() {

        nome = view.getTfNome().getText();
        sobrenome = view.getTfSobrenome().getText();
        email = view.getTfEmail().getText();
        telefone = view.getTfTelefone().getText();
        ddd = view.getTfDDD().getText();
        dddInt = converterString(telefone);
        telefoneInt = converterString(ddd);
        senha = view.getTfSenha().getText();

        try{
            if ((nome.isBlank() || nome.equalsIgnoreCase("nome")) || (sobrenome.isBlank()|| sobrenome.equalsIgnoreCase("sobrenome")) ||
                (email.isBlank() || email.equalsIgnoreCase("e-mail")) || (telefone.isBlank() || telefone.equalsIgnoreCase("telefone")) ||
                (senha.isBlank() || senha.equalsIgnoreCase("jPasswordfield1")) || (ddd.isBlank() || ddd.equalsIgnoreCase("ddd")) ) {
                
                throw new BlankException();    
            }
            if (dddInt == -1 || telefoneInt == -1) {
                throw new InvalidNumberException(" ");
            } else {
                this.abrirTelaFinalizarCadastro();
            }
        }catch(InvalidNumberException | BlankException e){
            view.exibirMensagem(e.getMessage());
        }
    }

    public void abrirTelaFinalizarCadastro() {
        viewFinal = new TelaConfirmacaoCadastro(this);
        viewFinal.setVisible(true);
    }

    public void cancelar() {
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        view.dispose();
    }

    public Integer converterString(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}

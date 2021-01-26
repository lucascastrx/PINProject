package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.View.TelaCadastro;
import com.ubeauty.View.TelaConfirmacaoCadastro;
import com.ubeauty.View.TelaLogin;

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

        if (nome != null || sobrenome != null || email != null || telefone != null || senha != null || ddd != null) {
            if (dddInt != -1 || telefoneInt != -1) {
                this.abrirTelaFinalizarCadastro();
            } else {
                view.exibirMensagem("Campo DDD ou Telefone inválido.");
            }
        } else {
            view.exibirMensagem("Todos os campos são obrigatórios.");
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

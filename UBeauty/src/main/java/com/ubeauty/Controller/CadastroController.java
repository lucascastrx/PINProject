package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Exceptions.BlankException;
import com.ubeauty.Exceptions.InvalidNumberException;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.VendedorDAO;
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
    String rua;
    String numero;
    String cidade;
    String estado;
    String cnpj;
    String endereco;
    String nomeProfissao;
    boolean sucesso;
    
    private final boolean CONFIG_PARAM  = false;

    public CadastroController(TelaCadastro view) {
        this.view = view;
    }

    public void cadastrar() {

        nome = view.getTfNome().getText();
        sobrenome = view.getTfSobrenome().getText();
        email = view.getTfEmail().getText();
        telefone = view.getTfTelefone().getText();
        ddd = view.getTfDDD().getText();
        dddInt = converterString(ddd);
        telefoneInt = converterString(telefone);
        senha = view.getTfSenha().getText();

        try {
            if ((nome.isBlank() || nome.equalsIgnoreCase("nome")) || (sobrenome.isBlank() || sobrenome.equalsIgnoreCase("sobrenome"))
                    || (email.isBlank() || email.equalsIgnoreCase("e-mail")) || (telefone.isBlank() || telefone.equalsIgnoreCase("telefone"))
                    || (senha.isBlank() || senha.equalsIgnoreCase("jPasswordfield1")) || (ddd.isBlank() || ddd.equalsIgnoreCase("ddd"))) {

                throw new BlankException();
            }
            if (dddInt == -1 || telefoneInt == -1) {
                throw new InvalidNumberException(" ");
            } else {
                this.abrirTelaFinalizarCadastro();
            }
        } catch (InvalidNumberException | BlankException e) {
            view.exibirMensagem(e.getMessage());
        }
    }

    public void abrirTelaFinalizarCadastro() {
        viewFinal = new TelaConfirmacaoCadastro(this);
        this.configurar();
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

    public void escolherTipo() {
        if (viewFinal.getCbTipo().getSelectedIndex() == 0) {
            viewFinal.getRbAutonomo().setVisible(false);
            viewFinal.getRbSalao().setVisible(false);
            viewFinal.getTfNomeProfissao().setVisible(false);
            viewFinal.getTfCnpj().setVisible(false);
            viewFinal.getImgCnpj().setVisible(false);
            viewFinal.getImgNomeProf().setVisible(false);
        } else {
            viewFinal.getRbAutonomo().setVisible(true);
            viewFinal.getRbSalao().setVisible(true);
            viewFinal.getTfNomeProfissao().setVisible(true);
            viewFinal.getTfCnpj().setVisible(true);
            viewFinal.getImgCnpj().setVisible(true);
            viewFinal.getImgNomeProf().setVisible(true);
            viewFinal.getRbSalao().setSelected(true);
        }
    }

    public void segmentoAutonomo() {
        viewFinal.getTfNomeProfissao().setText("Nome Profissional");
        viewFinal.getTfCnpj().setVisible(false);
        viewFinal.getImgCnpj().setVisible(false);
    }

    public void segmentoSalao() {
        viewFinal.getTfNomeProfissao().setText("Nome do Salão");
        viewFinal.getTfCnpj().setVisible(true);
        viewFinal.getImgCnpj().setVisible(true);
    }

    public void finalizarCadastro() {

        rua = viewFinal.getTfRua().getText();
        numero = viewFinal.getTfNumero().getText();
        cidade = viewFinal.getTfCidade().getText();
        estado = viewFinal.getTfEstado().getText();
        endereco = cidade + ", " + rua + ", número " + numero + ", " + estado;

        if (viewFinal.getCbTipo().getSelectedIndex() == 0) {

            criarCliente();

        } else {

            nomeProfissao = viewFinal.getTfNomeProfissao().getText();

            if (viewFinal.getRbAutonomo().isSelected()) {

                criarAutonomo();

            } else {

                cnpj = viewFinal.getTfCnpj().getText();

                criarSalao();
            }
        }
        
        if (sucesso) {
            view.exibirMensagem("Sucesso no cadastro. Por favor, faça o login.");
            viewFinal.dispose();
            view.dispose();
            new TelaLogin().setVisible(true);
        }

    }

    private void criarCliente() {
        try {
            if ((rua.isBlank() || rua.equalsIgnoreCase("rua"))
                    || (numero.isBlank() || numero.equalsIgnoreCase("numero"))
                    || (cidade.isBlank() || cidade.equalsIgnoreCase("cidade"))
                    || (estado.isBlank() || estado.equalsIgnoreCase("estado"))) {
                
                throw new BlankException();
            }
            Cliente cliente = new Cliente(false, nome, sobrenome, email, endereco, dddInt, telefoneInt, senha);
            ClienteDAO persistencia = new ClienteDAO();
            persistencia.gravar(cliente);
            
            sucesso = true;
            
        } catch (BlankException e) {
            view.exibirMensagem(e.getMessage());
        }
    }

    private void criarAutonomo() {
        try {
            if ((rua.isBlank() || rua.equalsIgnoreCase("rua"))
                    || (numero.isBlank() || numero.equalsIgnoreCase("numero"))
                    || (cidade.isBlank() || cidade.equalsIgnoreCase("cidade"))
                    || (estado.isBlank() || estado.equalsIgnoreCase("estado"))
                    || (nomeProfissao.isBlank() || nomeProfissao.equalsIgnoreCase("Nome Profissional"))) {
                
                throw new BlankException();
            }
            Vendedor vendedor = new Vendedor(cnpj, true, nome, sobrenome, email, endereco, dddInt, telefoneInt, senha);
            VendedorDAO persistencia = new VendedorDAO();
            persistencia.gravar(vendedor);
            
            sucesso = true;
            
        } catch (BlankException e) {
            view.exibirMensagem(e.getMessage());
        }
        
    }

    private void criarSalao() {
        try {
            if ((rua.isBlank() || rua.equalsIgnoreCase("rua"))
                    || (numero.isBlank() || numero.equalsIgnoreCase("numero"))
                    || (cidade.isBlank() || cidade.equalsIgnoreCase("cidade"))
                    || (estado.isBlank() || estado.equalsIgnoreCase("estado"))
                    || (nomeProfissao.isBlank() || nomeProfissao.equalsIgnoreCase("Nome do Salão"))
                    || (cnpj.isBlank() || cnpj.equalsIgnoreCase("cnpj"))) {
                
                throw new BlankException();
            }
            Vendedor vendedor = new Vendedor(cnpj, false, nome, sobrenome, email, endereco, dddInt, telefoneInt, senha);
            VendedorDAO persistencia = new VendedorDAO();
            persistencia.gravar(vendedor);
            
            sucesso = true;
            
        } catch (BlankException e) {
            view.exibirMensagem(e.getMessage());
        }
    }
    
    private void configurar() {
        /**
         * Da pra passar os valores diretos tbm, mas acho q desse jeito fica melhor de entender 
         * (e mais seguro tbm)
         */
  
        viewFinal.getRbAutonomo().setVisible(CONFIG_PARAM);
        viewFinal.getRbSalao().setVisible(CONFIG_PARAM);
        viewFinal.getTfNomeProfissao().setVisible(CONFIG_PARAM);
        viewFinal.getTfCnpj().setVisible(CONFIG_PARAM);
        viewFinal.getImgCnpj().setVisible(CONFIG_PARAM);
        viewFinal.getImgNomeProf().setVisible(CONFIG_PARAM);
    }

}

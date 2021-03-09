package com.ubeauty.Controller;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Gestor;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Exceptions.LoginControllerException;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.GestorDAO;
import com.ubeauty.View.Gestor.TelaPrincipalGestor;
import com.ubeauty.View.TelaCadastro;
import com.ubeauty.View.TelaLogin;
import com.ubeauty.View.TelaPrincipal;
import com.ubeauty.View.Vendedor.TelaPrincipalVendedor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Map;

public class LoginController {

    private final TelaLogin telaLogin;
    private Map<Integer, Cliente> usuarios;
    private Map<Integer, Gestor> gestores;
    private Cliente clienteTemp;
    private Gestor gestorTemp;

    public LoginController(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
        adicionarAcoes();
    }

    public void adicionarAcoes() {

        telaLogin.getTfSenha().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login();
                }
            }
        });

    }

    public void entrarSistema() throws LoginControllerException {
        String usuario = telaLogin.getTfUsuario().getText();
        String senha = telaLogin.getTfSenha().getText();
        if (this.autenticaLogin(usuario, senha)) {
            LoginAuthentication.cliente = clienteTemp;

            if (clienteTemp instanceof Vendedor) {
                new TelaPrincipalVendedor().setVisible(true);
            } else {
                new TelaPrincipal().setVisible(true);
            }

            telaLogin.dispose();
        } else if (this.autenticaLoginGestor(usuario, senha)) {
            LoginAuthentication.gestor = gestorTemp;
            new TelaPrincipalGestor().setVisible(true);
            telaLogin.dispose();
        } else {
            throw new LoginControllerException();
        }
    }

    public void login() {
        try {
            this.entrarSistema();
        } catch (LoginControllerException ex) {
            telaLogin.exibirMensagem("Usuário ou Senha Incorretos");
        }
    }

    public void pularLogin() {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        telaLogin.dispose();
    }

    public Cliente selectPorNomeESenha(Cliente usuario) {

        ClienteDAO persistencia = new ClienteDAO();
        usuarios = persistencia.buscarTodosClientes();

        for (Map.Entry<Integer, Cliente> bClientes : usuarios.entrySet()) {
            Cliente clienteDaLista = bClientes.getValue();
            if (buscarUser(clienteDaLista, usuario)) {
                return clienteDaLista;
            }
        }
        return null;
    }

    private boolean buscarUser(Cliente usuario, Cliente usuarioAPesquisar) {
        return usuario.getEmail().equals(usuarioAPesquisar.getEmail()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    public boolean autenticaLogin(String usuario, String senha) {
        Cliente usuarioCapturado = new Cliente("x", "x", usuario, "x", 0, 0, senha);
        Cliente usuarioAutenticado = this.selectPorNomeESenha(usuarioCapturado);
        clienteTemp = usuarioAutenticado;
        return usuarioAutenticado != null;
    }

    public void novoCadastro() {
        TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);
        telaLogin.dispose();
    }

    public boolean autenticaLoginGestor(String usuario, String senha) {
        Gestor usuarioCapturado = new Gestor("x", "x", usuario, "x", 0, 0, senha);
        Gestor usuarioAutenticado = this.selectPorNomeESenhaGestor(usuarioCapturado);
        gestorTemp = usuarioAutenticado;
        return usuarioAutenticado != null;
    }

    public Gestor selectPorNomeESenhaGestor(Gestor usuario) {

        GestorDAO persistencia = new GestorDAO();
        gestores = persistencia.buscarTodosGestores();

        for (Map.Entry<Integer, Gestor> bGestor : gestores.entrySet()) {
            Gestor gestorDaLista = bGestor.getValue();
            if (buscarGestor(gestorDaLista, usuario)) {
                return gestorDaLista;
            }
        }
        return null;
    }

    private boolean buscarGestor(Gestor usuario, Gestor usuarioAPesquisar) {
        return usuario.getEmail().equals(usuarioAPesquisar.getEmail()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

}

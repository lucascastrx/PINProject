package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private String sobrenome;
    private String email;
    private String endereco;
    private int ddd;
    private int telefone;
    private String senha;
    

    @OneToMany(mappedBy = "clientes", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Carrinho> carrinhos = new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<Reclamacao> reclamacoes = new ArrayList<>();

    @OneToMany(mappedBy = "c")
    private List<Mensagem> mensagens = new ArrayList<>();

    @ManyToMany(mappedBy = "clientes", fetch = FetchType.EAGER)
    private Set<Notificacao> notificacoes = new HashSet<>();
    
    

    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String email, String endereco, int ddd, int telefone, String senha) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.email = email;
        this.ddd = ddd;
        this.telefone = telefone;
        this.senha = senha;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void addCarrinho(Carrinho carrinho) {
        carrinhos.add(carrinho);
        carrinho.setClientes(this);

    }

    public void removeCarrinho(Carrinho carrinho) {
        carrinhos.remove(carrinho);
        carrinho.setClientes(null);
    }

    public List<Carrinho> getCarrinhos() {
        return carrinhos;
    }
    
    

    public void addReclamacoes(Reclamacao r) {
        reclamacoes.add(r);
        r.setCliente(this);

    }

    public void addNotificacao(Notificacao n) {
        notificacoes.add(n);
    }
    
    public void removeNotificacoes(){
        notificacoes.clear();
    }

    public void removeReclamacoes(Reclamacao r) {
        reclamacoes.remove(r);
        r.setCliente(null);
    }

    public void addMensagem(Mensagem m) {
        mensagens.add(m);
        m.setCliente(this);
    }

    public void removeMensagem(Mensagem m) {
        mensagens.remove(m);
        m.setCliente(null);
    }

    public Set<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome + ", " + email + ", (" + ddd + ") " + telefone;
    }

}

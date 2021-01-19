package com.ubeauty.Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity 
public class Vendedor extends Cliente{
    private String cnpj;
    
    @OneToMany(mappedBy = "vendedorServico")
    private Set<Servico> servicos = new HashSet<>();
    
    @OneToMany(mappedBy = "vendedor")
    private List<Reclamacao> reclamacoes = new ArrayList<>();

    @OneToMany(mappedBy = "v")
    private List<Mensagem> mensagens = new ArrayList<>();
    
    

    public Vendedor() {
    }

    public Vendedor(String nome, String sobrenome, String email, String endereco, int ddd, int telefone, String cnpj, String senha) {
        super( nome, sobrenome, email, endereco, ddd, telefone, senha);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void addServico(Servico v){
        servicos.add(v);
        v.setVendedorServico(this);
    }
    
    public void removeServico(Servico v){
        servicos.remove(v);
        v.setVendedorServico(null);
    }
    
    
    public void addReclamacao(Reclamacao r){
        reclamacoes.add(r);
        r.setVendedor(this);
    }
    
    public void removeReclamacao(Reclamacao r){
        reclamacoes.remove(r);
        r.setVendedor(null);
    }
    

    public void addMensagem(Mensagem m){
        mensagens.add(m);
        m.setVendedor(this);
    }
    
    public void removeMensagem(Mensagem m){
        mensagens.remove(m);
        m.setVendedor(null);
    }

    @Override
    public String toString() {
        return super.toString()+ "Vendedor{" + "cnpj=" + cnpj + '}';
    }

    
    
    
    
    
}

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
    private String nomeProfissao;
    private String descricao;
    private String horaFunc; //horario de funcionamento
    
    @OneToMany(mappedBy = "vendedorServico")
    private Set<Servico> servicos = new HashSet<>();
    
    @OneToMany(mappedBy = "vendedor")
    private List<Reclamacao> reclamacoes = new ArrayList<>();

    @OneToMany(mappedBy = "v")
    private List<Mensagem> mensagens = new ArrayList<>();
    
 
    public Vendedor() {
    }

    /**
     *
     * @param cnpj
     * @param autonomo
     * @param nomeProfissao
     * @param descricao
     * @param horaFunc
     * @param nome
     * @param sobrenome
     * @param email
     * @param endereco
     * @param ddd
     * @param telefone
     * @param senha
     */
    public Vendedor(String cnpj, boolean autonomo,String nomeProfissao, String descricao, String horaFunc, String nome, String sobrenome, String email,
                    String endereco, int ddd, int telefone, String senha) {
        super(autonomo, nome, sobrenome, email, endereco, ddd, telefone, senha);
        this.cnpj = cnpj;
        this.nomeProfissao = nomeProfissao;
        this.descricao = descricao;
        this.horaFunc = horaFunc;
    }
    
    public Vendedor(String cnpj, boolean autonomo,String nomeProfissao, String nome, String sobrenome, String email,
                    String endereco, int ddd, int telefone, String senha) {
        super(autonomo, nome, sobrenome, email, endereco, ddd, telefone, senha);
        this.cnpj = cnpj;
        this.nomeProfissao = nomeProfissao;
    }

   

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHoraFunc() {
        return horaFunc;
    }

    public void setHoraFunc(String horaFunc) {
        this.horaFunc = horaFunc;
    }
    
    
    
    public void addServico(Servico v){
        servicos.add(v);
        v.setVendedorServico(this);
    }
    
    public void removeServico(Servico v){
        servicos.remove(v);
        v.setVendedorServico(null);
    }

    public Set<Servico> getServicos() {
        return servicos;
    }
    
    
    public void addReclamacao(Reclamacao r){
        reclamacoes.add(r);
        r.setVendedor(this);
    }
    
    public void removeReclamacao(Reclamacao r){
        reclamacoes.remove(r);
        r.setVendedor(null);
    }
    

    @Override
    public void addMensagem(Mensagem m){
        mensagens.add(m);
        m.setVendedor(this);
    }
    
    @Override
    public void removeMensagem(Mensagem m){
        mensagens.remove(m);
        m.setVendedor(null);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

    

    

    
    
    
    
    
}

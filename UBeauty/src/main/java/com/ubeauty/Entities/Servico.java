package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Servico implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nome;
    private String descricao;
    private String categoria;
    private double valor;
    
    @ManyToOne
    private Vendedor vendedorServico;
    
    @OneToMany(mappedBy = "servico", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Agendamento> agendamentos = new HashSet<>();
            

    public Servico() {
    }

    public Servico( String nome, String descricao, String categoria, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedorServico() {
        return vendedorServico;
    }

    public void setVendedorServico(Vendedor vendedorServico) {
        this.vendedorServico = vendedorServico;
    }
    
    
    
    
    public void addAgendamento(Agendamento agendamentos) {
        this.agendamentos.add(agendamentos);
        agendamentos.setServico(this);
        
    }

    public void removeAgendamento(Agendamento agendamentos) {
        this.agendamentos.remove(agendamentos);
        agendamentos.setServico(null);
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Servico other = (Servico) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return   nome + ", " + descricao + ", " + categoria + ", " + valor;
    }
    
    
    
}

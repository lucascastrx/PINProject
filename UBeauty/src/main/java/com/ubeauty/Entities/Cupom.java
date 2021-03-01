/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Eduardo Buzzi
 */
@Entity
public class Cupom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nome;
    private int desconto;
    
    @ManyToOne
    private Vendedor vendedorCupom;

    public Cupom(String nome, int desconto, Vendedor vendedorCupom) {
        this.nome = nome;
        this.desconto = desconto;
        this.vendedorCupom = vendedorCupom;
    }
    
    public Cupom(){
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

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Vendedor getVendedorCupom() {
        return vendedorCupom;
    }

    public void setVendedorCupom(Vendedor vendedorCupom) {
        this.vendedorCupom = vendedorCupom;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + this.desconto;
        hash = 11 * hash + Objects.hashCode(this.vendedorCupom);
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
        final Cupom other = (Cupom) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.vendedorCupom, other.vendedorCupom)) {
            return false;
        }
        return true;
    }
    
    
    
}

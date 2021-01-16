package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Carrinho implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private List<Servico> listServicos = new ArrayList <> (); 

    public Carrinho() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public List<Servico> getListServicos() {
        return listServicos;
    }

    public void setListServicos(List<Servico> listServicos) {
        this.listServicos = listServicos;
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
        final Carrinho other = (Carrinho) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "Id=" + id + ", listServicos=" + listServicos + '}';
    }
    
    
}

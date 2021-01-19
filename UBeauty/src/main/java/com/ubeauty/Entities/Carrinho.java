package com.ubeauty.Entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Carrinho implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    private Instant moment;
    
    @ManyToOne
    private Cliente clientes;
    
    @OneToMany(mappedBy = "id.carrinho")
    private Set<OrdemItem> items = new HashSet<>();
    
    public Carrinho() {
    }
    
    public Carrinho(Instant moment , Cliente cliente){
        this.moment = moment;
        this.clientes = cliente;
    }
 
    
    
    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes = cliente;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Set<OrdemItem> getItems(){
        return items;
    }
    
    public void addItems(OrdemItem oi){
        items.add(oi);
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
        return "Carrinho{" + "Id=" + id + '}';
    }
    
    
}

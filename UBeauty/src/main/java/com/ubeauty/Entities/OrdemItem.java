
package com.ubeauty.Entities;

import com.ubeauty.Entities.PK.OrdemItemPK;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


public class OrdemItem implements Serializable{
    
    private OrdemItemPK id = new OrdemItemPK();
    
    private double preco;

    public OrdemItem() {
    }

    public OrdemItem(Carrinho c, Agendamento a, double preco) {
        this.id.setCarrinho(c);
        this.id.setAgendamento(a);
        this.preco = preco;
    }
    
    public Carrinho getCarrinho(){
        return id.getCarrinho();
    }
    
    public void setCarrinho(Carrinho c){
        id.setCarrinho(c);
    }
    
    public Agendamento getAgendamento(){
        return id.getAgendamento();
    }
    
    public void setAgendamento(Agendamento a){
        id.setAgendamento(a);
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final OrdemItem other = (OrdemItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}

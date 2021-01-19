
package com.ubeauty.Entities.PK;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Carrinho;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class OrdemItemPK implements Serializable{
    @ManyToOne
    private Carrinho carrinho;
    
    @ManyToOne
    private Agendamento agendamento;

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.carrinho);
        hash = 97 * hash + Objects.hashCode(this.agendamento);
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
        final OrdemItemPK other = (OrdemItemPK) obj;
        if (!Objects.equals(this.carrinho, other.carrinho)) {
            return false;
        }
        if (!Objects.equals(this.agendamento, other.agendamento)) {
            return false;
        }
        return true;
    }
    
    
}

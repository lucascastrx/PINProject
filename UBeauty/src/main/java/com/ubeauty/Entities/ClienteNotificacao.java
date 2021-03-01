package com.ubeauty.Entities;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Entities.PK.ClienteNotificacaoPK;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 *
 * @author Lucas Teixeira
 */

public class ClienteNotificacao implements Serializable{
   @EmbeddedId
   private ClienteNotificacaoPK id = new ClienteNotificacaoPK();

    public ClienteNotificacao() {
    }
    
    public ClienteNotificacao(Cliente c, Notificacao n) {
        id.setCliente(c);
        id.setNotificacao(n);
        
    }
    
    public Cliente getCliente(){
        return id.getCliente();
    }
    
    public void setCliente(Cliente c){
        id.setCliente(c);
    } 
    
    public Notificacao getNotificacao(){
        return id.getNotificacao();
    }
    
    public void setNotificacao(Notificacao n){
        id.setNotificacao(n);
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final ClienteNotificacao other = (ClienteNotificacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
   
    
}

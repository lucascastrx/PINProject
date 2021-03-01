
package com.ubeauty.Entities.PK;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Notificacao;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucas Teixeira
 */


public class ClienteNotificacaoPK implements Serializable {
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Notificacao notificacao;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.cliente);
        hash = 79 * hash + Objects.hashCode(this.notificacao);
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
        final ClienteNotificacaoPK other = (ClienteNotificacaoPK) obj;
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.notificacao, other.notificacao)) {
            return false;
        }
        return true;
    }
    
    
    
}

package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Mensagem extends Reclamacao implements Serializable{
    private String idReceber;
    
    @ManyToOne
    Cliente c;
    
    @ManyToOne
    Vendedor v;

    public Mensagem() {
        
    }

    public Mensagem(String texto, String nomeEnviar, String idReceber, Date data, Date hora) {
        super(texto, nomeEnviar, data, hora);
        this.idReceber = idReceber;
    }

    public String getIdReceber() {
        return idReceber;
    }

    public void setIdReceber(String nomeReceber) {
        this.idReceber = nomeReceber;
    }

    public Cliente getCliente() {
        return this.c;
    }

    public void setCliente(Cliente c) {
        this.c = c;
    }

    public Vendedor getVendedor() {
        return this.v;
    }

    public void setVendedor(Vendedor v) {
        this.v = v;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+ "Mensagem{" + "idReceber=" + idReceber + '}';
    }
    
    
    
}

package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Reclamacao extends Notificacao implements Serializable{
    private String nomeEnviar;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Vendedor vendedor;

    public Reclamacao() {
    }

    public Reclamacao( String texto, String nomeEnviar, Date data, Date hora) {
        super(texto, data, hora);
        this.nomeEnviar = nomeEnviar;
        
    }

    public String getNomeEnviar() {
        return nomeEnviar;
    }

    public void setNomeEnviar(String nomeEnviar) {
        this.nomeEnviar = nomeEnviar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    

    @Override
    public String toString() {
        return super.toString()+"Reclamacao{" + "nomeEnviar=" + nomeEnviar + '}';
    }
    
    
    
    
}

package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Reclamacao extends Notificacao implements Serializable{
    private String nomeEnviar;

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

    @Override
    public String toString() {
        return super.toString()+"Reclamacao{" + "nomeEnviar=" + nomeEnviar + '}';
    }
    
    
    
    
}

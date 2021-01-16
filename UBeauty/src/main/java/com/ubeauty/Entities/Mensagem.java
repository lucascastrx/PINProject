package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Mensagem extends Reclamacao implements Serializable{
    private String nomeReceber;

    public Mensagem() {
        
    }

    public Mensagem(String texto, String nomeEnviar, String nomeReceber, Date data, Date hora) {
        super(texto, nomeEnviar, data, hora);
        this.nomeReceber = nomeReceber;
    }

    public String getNomeReceber() {
        return nomeReceber;
    }

    public void setNomeReceber(String nomeReceber) {
        this.nomeReceber = nomeReceber;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mensagem{" + "nomeReceber=" + nomeReceber + '}';
    }
    
    
    
}

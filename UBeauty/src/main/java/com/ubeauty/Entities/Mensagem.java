package com.ubeauty.Entities;

import java.util.Date;

public class Mensagem extends Reclamacao{
    private String nomeReceber;

    public Mensagem() {
        
    }

    public Mensagem(int id, String texto, String nomeEnviar, String nomeReceber, Date data, Date hora) {
        super(id, texto, nomeEnviar, data, hora);
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

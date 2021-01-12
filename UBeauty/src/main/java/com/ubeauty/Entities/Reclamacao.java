package com.ubeauty.Entities;

import java.util.Date;

public class Reclamacao extends Notificacao{
    private String nomeEnviar;

    public Reclamacao() {
    }

    public Reclamacao( int id, String texto, String nomeEnviar, Date data, Date hora) {
        super(id, texto, data, hora);
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

package com.ubeauty.Entities;

import java.util.Date;

public class Recibo {
    private int id;
    
    private String descricao;
    private Date data;

    public Recibo() {
    }

    public Recibo(int id, String descricao, Date data) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
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
        final Recibo other = (Recibo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recibo{" + "id=" + id + ", descricao=" + descricao + ", data=" + data + '}';
    }
    
    
}

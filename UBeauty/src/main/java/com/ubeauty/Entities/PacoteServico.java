package com.ubeauty.Entities;

import java.util.ArrayList;
import java.util.List;

public class PacoteServico {
    private int id;
    
    private List<Servico> listServicos = new ArrayList<> ();

    public PacoteServico() {
    }

    public PacoteServico(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Servico> getListServicos() {
        return listServicos;
    }

    public void setListServicos(List<Servico> listServicos) {
        this.listServicos = listServicos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
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
        final PacoteServico other = (PacoteServico) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacoteServico{" + "id=" + id + ", listServicos=" + listServicos + '}';
    }
    
    
}

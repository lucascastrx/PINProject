package com.ubeauty.Entities;

public class Pagamento {
    private int id;
    
    private double valor;
    private String devedor;
    private String prestador;

    public Pagamento() {
    }

    public Pagamento(int id, double valor, String devedor, String prestador) {
        this.id = id;
        this.valor = valor;
        this.devedor = devedor;
        this.prestador = prestador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDevedor() {
        return devedor;
    }

    public void setDevedor(String devedor) {
        this.devedor = devedor;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.id;
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
        final Pagamento other = (Pagamento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", valor=" + valor + ", devedor=" + devedor + ", prestador=" + prestador + '}';
    }
    
    
}

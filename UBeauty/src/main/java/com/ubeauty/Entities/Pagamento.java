package com.ubeauty.Entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Pagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private double valor;
    private String devedor;
    private String prestador;
    
    @OneToOne
    @MapsId
    private Carrinho carrinho;
    
    @OneToOne(mappedBy = "pagamento",
              cascade = CascadeType.ALL,
              orphanRemoval = true,
              fetch = FetchType.EAGER)
    private Recibo recibo;

    public Pagamento() {
    }

    public Pagamento(double valor, String devedor, String prestador, Carrinho carrinho) {
        this.valor = valor;
        this.devedor = devedor;
        this.prestador = prestador;
        this.carrinho = carrinho;
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
    
    public void setRecibo(Recibo r){
        r.setPagamento(this);
        this.recibo = r;
    }
    
    public Recibo getRecibo(){
        if(recibo != null){
            return recibo;
        }
        return null;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
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

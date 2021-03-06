package com.ubeauty.Entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Carrinho implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    private Date momento;
    
    @ManyToOne
    private Cliente clientes;
    
    @ManyToMany(mappedBy = "carrinhos", fetch = FetchType.EAGER)
    private Set<Agendamento> agendamentos = new HashSet<>();
    
    @OneToOne(mappedBy = "carrinho" , cascade = CascadeType.ALL, orphanRemoval = true)
    private Pagamento pagamento;
    
    @Transient
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy-hh:mm:ss");
    
    
    public Carrinho() {
    }
    
    public Carrinho(Date momento , Cliente cliente){
        this.momento = momento;
        this.clientes = cliente;
    }
 
    
    
    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes = cliente;
    }

    public String getMoment() {
        return DATE_FORMAT.format(momento);
    }

    public void setMoment(Date moment) {
        this.momento = moment;
    }

    public Set<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void addAgendamentos(Agendamento a) {
        this.agendamentos.add(a);
    }

    
    
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
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
        final Carrinho other = (Carrinho) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "Id=" + id + '}';
    }
    
    
}

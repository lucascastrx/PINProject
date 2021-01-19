package com.ubeauty.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date dia;
    @Temporal(TemporalType.DATE)
    private Date hora;
    
    @ManyToOne
    private Servico servico;
    
    @OneToMany(mappedBy = "id.agendamento")
    private Set<OrdemItem> items = new HashSet<>();

    public Agendamento() {
    }

    public Agendamento(Date data, Date hora) {
        this.dia = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return dia;
    }

    public void setData(Date data) {
        this.dia = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    public Set<Carrinho> getCarrinhos(){
        Set<Carrinho> set = new HashSet<>();
        for(OrdemItem oi : items){
            set.add(oi.getCarrinho());
        }
        return set;
    }
    
    public void addItems(OrdemItem oi){
        items.add(oi);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final Agendamento other = (Agendamento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", data=" + dia + ", hora=" + hora + '}';
    }
    
    
}

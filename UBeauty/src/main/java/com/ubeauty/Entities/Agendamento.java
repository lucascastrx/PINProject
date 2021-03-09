package com.ubeauty.Entities;

import com.ubeauty.Exceptions.ParseDateException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Agendamento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private boolean agendado;
    
    @Temporal(TemporalType.DATE)
    private Date dia;
    @Temporal(TemporalType.DATE)
    private Date hora;
    
    @ManyToOne
    private Servico servico;
    
   @ManyToMany
    @JoinTable(name = "AgendamentoCarrinho",joinColumns = @JoinColumn(name = "agendamento_id"), 
                                           inverseJoinColumns = @JoinColumn(name = "carrinho_id"))
    private Set<Carrinho> carrinhos = new HashSet<>();
     
    @Transient
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm");
    @Transient
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM");

    public Agendamento() {
    }

    public Agendamento(String data, String hora) {
        
        try {
            this.dia = DATE_FORMAT.parse(data);
            this.agendado = false;
            this.hora = TIME_FORMAT.parse(hora);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return DATE_FORMAT.format(dia);
    }

    public void setData(String data) throws ParseDateException {
        try {
            this.dia = DATE_FORMAT.parse(data);
        } catch (ParseException ex) {
            throw new ParseDateException();
        }
    }

    public String getHora() {
        return TIME_FORMAT.format(hora);
    }

    public void setHora(String hora) throws ParseDateException {
        try {
            this.hora = TIME_FORMAT.parse(hora);
        } catch (ParseException ex) {
            throw new ParseDateException();
        }
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Set<Carrinho> getCarrinhos() {
        return carrinhos;
    }

    public void addCarrinhos(Carrinho c) {
        this.carrinhos.add(c);
    }
    
    
    
    public boolean isAgendado() {
        return agendado;
    }

    public void setAgendado(boolean agendado) {
        this.agendado = agendado;
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
        String horario = this.getHora() + " - " + this.getData();
        return horario;
    }
    
    
}

package com.ubeauty.Entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Notificacao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String texto;
    private Date data;
    private Date hora;
    
    @ManyToOne
    private Vendedor vendedorN;
    
    @ManyToOne
    private Gestor gestor;
    
    @ManyToMany
    @JoinTable(name = "ClienteNotificacao",joinColumns = @JoinColumn(name = "notificacao_id"), 
                                           inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    private Set<Cliente> clientes = new HashSet<>();
    
    @Transient
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm");
    @Transient
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public Notificacao() {
    }

    public Notificacao( String texto, Date data, Date hora) {
        this.texto = texto;
        this.data = data;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getData() {
        return DATE_FORMAT.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return TIME_FORMAT.format(hora);
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public void setVendedorN(Vendedor vendedorN) {
        this.vendedorN = vendedorN;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }
    
    public void addClientes(Cliente c){
        clientes.add(c);
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
        final Notificacao other = (Notificacao) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Notificacao{" + "id=" + id + ", texto=" + texto + ", data=" + data + ", hora=" + hora + '}';
    }
    
    
    
}

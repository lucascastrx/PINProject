package com.ubeauty.Entities;

import javax.persistence.Entity;


@Entity 
public class Vendedor extends Cliente{
    private String cnpj;

    public Vendedor() {
    }

    public Vendedor(String nome, String sobrenome, String email, String endereco, int ddd, int telefone, String cnpj, String senha) {
        super( nome, sobrenome, email, endereco, ddd, telefone, senha);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString()+ "Vendedor{" + "cnpj=" + cnpj + '}';
    }

    
    
    
    
    
}

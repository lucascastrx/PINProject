package com.ubeauty.Entities;



public class Vendedor extends Cliente{
    private String cnpj;

    public Vendedor() {
    }

    public Vendedor(int id, String nome, String sobrenome, String email, String endereco, int ddd, int telefone, String cnpj, String senha) {
        super(id, nome, sobrenome, email, endereco, ddd, telefone, senha);
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

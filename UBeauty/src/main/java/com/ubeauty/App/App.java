package com.ubeauty.App;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.VendedorDAO;

public class App {
    public static void main(String[] args) {
        Cliente test = new Cliente("Lucas","Castro","luukascastro@gmail.com","Rua Palmas", 22, 981657344, "umasenhaai");
        ClienteDAO clienteRepository = new ClienteDAO();
        clienteRepository.gravar(test);
        
        
        Vendedor vTest = new Vendedor( "Anom", "Anonym", "anonym@gmail.com", "Sao Paulo", 11, 9999999, "2221212", "qqrsenha");
        VendedorDAO vendedorRepository = new VendedorDAO();
        vendedorRepository.gravar(vTest);
        
       /* VendedorDAO vendedorRepository2 = new VendedorDAO();
        Vendedor test2 = vendedorRepository2.buscar(1);*/
        System.out.println(test);
    }
}

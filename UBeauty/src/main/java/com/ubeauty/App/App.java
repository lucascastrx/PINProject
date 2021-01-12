package com.ubeauty.App;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Vendedor;

public class App {
    public static void main(String[] args) {
        Cliente test = new Vendedor(1,"Lucas","Castro","luukascastro@gmail.com","Rua Palmas", 22, 981657344, "99999999", "umasenhaai");
        
        System.out.println(test);
    }
}

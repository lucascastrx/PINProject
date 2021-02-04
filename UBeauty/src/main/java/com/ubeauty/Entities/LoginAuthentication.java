package com.ubeauty.Entities;

/**
 * Classe basica com um atributo estatico
 * para ser acessado sem necessidade de instanciar.
 * Se estiver como null o usuario nao esta logado,
 * caso contrario é só verificar os dados da classe 
 * com o DB para autenticar. 
 * 
 * Da pra tentar usar JWT com Spring Boot no futuro
 * se for seguir a linha do desenvolvimento com Java.
 *
 * @author Lucas Teixeira
 */
public class LoginAuthentication{
    public static Cliente cliente;
    public static Gestor gestor;

    public LoginAuthentication() {
    }

    
    
    
    
}

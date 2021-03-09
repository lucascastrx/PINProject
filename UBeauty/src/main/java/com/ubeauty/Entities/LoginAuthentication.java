package com.ubeauty.Entities;

/**
 * Classe basica com um atributo estatico
 * para ser acessado sem necessidade de instanciar.
 * Se estiver como null o usuario nao esta logado,
 * caso contrario é só verificar os dados da classe 
 * com o DB para autenticar. 
 * 
 * @author Lucas Teixeira
 */
public class LoginAuthentication{
    public static Cliente cliente;
    public static Gestor gestor;
    

    public LoginAuthentication() {
    }

    
    
    
    
}


package com.ubeauty.Controller.Gestor;

import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.Vendedor.*;
import com.ubeauty.View.Gestor.PanelTermosGestor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Teixeira
 */
public class TermosController {
    private PrincipalController cController;
    private PrincipalControllerVendedor vController;
    private boolean which;
    
    private PanelTermosGestor panelTermos;
    private final String FILE_PATH = "src/main/resources/termosUso.txt";

    public TermosController(PanelTermosGestor panelTermos,boolean which) {
        this.panelTermos = panelTermos;
        this.which = which;
        readFromFile();
    }
    
    private void readFromFile(){
        
        String texto = " ";
        
        
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            while ((line = reader.readLine()) != null)
            {
                texto += line+"\n";
            }
            reader.close();
            
        }catch (Exception e){
            e.printStackTrace();
            
        }finally{
            panelTermos.getTaTermos().setText(texto);
        }
        
        
    }
    
    public void writeIntoFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH));
            
            String texto = panelTermos.getTaTermos().getText();
            System.out.println(texto);
            bufferedWriter.write(texto);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void voltar(){
        if(which){
            vController.mostrarTela("conta");
        }else{
            cController.mostrarTela("conta");
        }
        
    }

    public void setcController(PrincipalController cController) {
        this.cController = cController;
    }

    public void setvController(PrincipalControllerVendedor vController) {
        this.vController = vController;
    }
    
    
}

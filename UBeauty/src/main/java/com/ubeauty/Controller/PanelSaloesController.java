package com.ubeauty.Controller;

import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelSaloes;
import com.ubeauty.View.PanelSaloes;
import java.util.Map;
/**
 *
 * @author Lucas Teixeira
 */
public class PanelSaloesController {
    private PanelSaloes panelSaloes;
    private TableModelSaloes modelSaloes;
    
   

    public PanelSaloesController(PanelSaloes p) {
        panelSaloes = p;
        
        VendedorDAO vendedorRep = new VendedorDAO();
        Map<Integer, Vendedor> mapSalao = vendedorRep.buscarTodosSaloes();
        this.modelSaloes = new TableModelSaloes(mapSalao);
        
        this.runComponents();
        
    }
    
    private void runComponents(){
        if(panelSaloes != null)
            panelSaloes.setTableModel(modelSaloes);
        else
            panelSaloes.exibirMensagem("Obj null");
    }
  
}

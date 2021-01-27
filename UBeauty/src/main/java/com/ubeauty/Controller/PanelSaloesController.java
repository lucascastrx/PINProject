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
    private PrincipalController controllerPC;
    private TableModelSaloes modelSaloes;
    
   

    public PanelSaloesController(PrincipalController controllerPC, PanelSaloes p) {
        this.controllerPC = controllerPC;
        panelSaloes = p;
        
        VendedorDAO vendedorRep = new VendedorDAO();
        Map<Integer, Vendedor> mapVendedor = vendedorRep.buscarTodosVendedores();
        this.modelSaloes = new TableModelSaloes(mapVendedor);
        
        this.runComponents();
        
    }
    
    private void runComponents(){
        if(panelSaloes != null)
            panelSaloes.setTableModel(modelSaloes);
        else
            panelSaloes.exibirMensagem("Obj null");
    }
  
}

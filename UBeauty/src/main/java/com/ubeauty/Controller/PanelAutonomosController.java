
package com.ubeauty.Controller;

import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelAutonomos;
import com.ubeauty.View.PanelAutonomos;
import java.util.Map;

/**
 *
 * @author Lucas Teixeira
 */
public class PanelAutonomosController {
    PanelAutonomos panelAutonomos;
    TableModelAutonomos modelAutonomos;

    public PanelAutonomosController(PanelAutonomos p) {
        this.panelAutonomos = p;
        
        VendedorDAO vendedorRep = new VendedorDAO();
        Map<Integer, Vendedor> mapAutonomo = vendedorRep.buscarTodosAutonomos();
        
        modelAutonomos = new TableModelAutonomos(mapAutonomo);
       
        runComponents();
        
        
        
    }
    
    private void runComponents(){
        if(panelAutonomos != null)
            panelAutonomos.setTableModel(modelAutonomos);
        else
            panelAutonomos.exibirMensagem("Obj null");
    }
    
    
}

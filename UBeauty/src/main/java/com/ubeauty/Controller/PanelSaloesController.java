package com.ubeauty.Controller;

import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelSaloes;
import com.ubeauty.View.PanelSaloes;
import com.ubeauty.View.PopUpProcurarSalao;
import java.util.Map;
import javax.swing.JTable;
/**
 *
 * @author Lucas Teixeira
 */
public class PanelSaloesController {
    private PanelSaloes panelSaloes;
    private TableModelSaloes modelSaloes;
    private PopUpProcurarSalao popUp;
    
   

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
    
    public void abrirSalao (){
        JTable tabela = panelSaloes.getTabela();
        Vendedor v = modelSaloes.getSalao(tabela.getSelectedRow());
        auxCarregar(v);
        
    }

    public void auxCarregar(Vendedor v) {
         panelSaloes.getPrincipalController().tempVendedor(v);
         panelSaloes.getPrincipalController().mostrarTela("paginaSalao");
         
    }

    public void abrirPesquisa() {
        popUp = new PopUpProcurarSalao(this);
        popUp.setVisible(true);
    }

    public void pesquisar() {
        String nome = popUp.getTfNome().getText();
        VendedorDAO vendedorRep = new VendedorDAO();
        Map<Integer, Vendedor> mapSalao = vendedorRep.buscarSaloesPorNome(nome);
        this.modelSaloes = new TableModelSaloes(mapSalao);
        
        this.runComponents();
        
        popUp.dispose();
        
    }

    public void limparPesquisa() {
        VendedorDAO vendedorRep = new VendedorDAO();
        Map<Integer, Vendedor> mapSalao = vendedorRep.buscarTodosSaloes();
        this.modelSaloes = new TableModelSaloes(mapSalao);
        
        this.runComponents();
    }
        
    
  
}

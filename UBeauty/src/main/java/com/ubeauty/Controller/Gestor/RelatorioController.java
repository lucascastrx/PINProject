package com.ubeauty.Controller.Gestor;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.View.Gestor.PanelRelatorioGestor;
import java.util.Map;

/**
 *
 * @author Lucas Teixeira
 */
public class RelatorioController {
    private PanelRelatorioGestor panelRelatorios;
    
    private final String CLIENTES_HEADER = "Listagem de Clientes:\n";
    private final String VENDEDORES_HEADER = "Listagem de Vendedores:\n";
    private final String AUTONOMOS_HEADER = "Listagem de Autonomos:\n";
    private final String SERVICOS_HEADER = "Listagem de Serviços:\n";
    

    public RelatorioController(PanelRelatorioGestor panelRelatorios) {
        this.panelRelatorios = panelRelatorios;
        runComponents();
    }
    
    private void runComponents(){
        String texto = CLIENTES_HEADER;
        
        Map<Integer, Cliente> mapCliente = new ClienteDAO().buscarTodosClientes();
        Map<Integer, Vendedor> mapVendedor = new VendedorDAO().buscarTodosSaloes();
        Map<Integer, Vendedor> mapAutonomo = new VendedorDAO().buscarTodosAutonomos();
        Map<Integer, Servico> mapServico = new ServicoDAO().buscarTodosServicos();
        
        for (Map.Entry<Integer, Cliente> c : mapCliente.entrySet()) {
            if(!(c.getValue() instanceof Vendedor)){
                Cliente cliente =  c.getValue();
                texto += cliente.toString() + "\n";}
        }
        
        texto += "\n" + VENDEDORES_HEADER;
        for (Map.Entry<Integer, Vendedor> v : mapVendedor.entrySet()) {
            if((v.getValue() instanceof Vendedor)){
                Vendedor vendedor =  v.getValue();
                texto += vendedor.toString() + "\n";}
        }
        
        texto += "\n" + AUTONOMOS_HEADER;
        for (Map.Entry<Integer, Vendedor> v : mapAutonomo.entrySet()) {
            if((v.getValue() instanceof Vendedor)){
                Vendedor vendedor =  v.getValue();
                texto += vendedor.toString() + "\n";}
        }
        
        texto += "\n" + SERVICOS_HEADER;
        for (Map.Entry<Integer, Servico> s : mapServico.entrySet()) {
                Servico servico =  s.getValue();
                texto += servico.toString() + "\n";
        }
        
        
        
        
        
        panelRelatorios.getTaRelatorio().setText(texto);
    
    }
}

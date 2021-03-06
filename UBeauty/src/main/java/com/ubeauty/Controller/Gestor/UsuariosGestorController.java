package com.ubeauty.Controller.Gestor;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelUsuarios;
import com.ubeauty.View.Gestor.PanelUsuariosGestor;
import com.ubeauty.View.Vendedor.PopUpEditarContaVendedor;
import com.ubeauty.View.PopUpEditarConta;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Lucas Teixeira
 */
public class UsuariosGestorController {
    PanelUsuariosGestor panelUsuarios;
    TableModelUsuarios modelUsuarios;

    public UsuariosGestorController(PanelUsuariosGestor panelUsuarios) {
        this.panelUsuarios = panelUsuarios;
       
        
        runComponents();
        
        
    }
    
    private void runComponents(){
        VendedorDAO vPersist = new VendedorDAO();
        ClienteDAO cPersist = new ClienteDAO();
        Map<Integer, Cliente> usuarios = cPersist.buscarTodosClientes();
        Map<Integer, Vendedor> vendedores = vPersist.buscarTodosVendedores();
        
        for(Map.Entry<Integer, Vendedor> v : vendedores.entrySet()){
            usuarios.putIfAbsent(v.getKey(), v.getValue());
        }
        
        this.modelUsuarios = new TableModelUsuarios(usuarios);
        
        panelUsuarios.setTableModel(modelUsuarios);
        
    }
    
    public void abrirConta (){
        JTable tabela = panelUsuarios.getTabela();
        Cliente c = modelUsuarios.getCliente(tabela.getSelectedRow());
        
            if (c instanceof Vendedor) {
                new PopUpEditarContaVendedor((Vendedor) c).setVisible(true);
            } else {
                try {
                    new PopUpEditarConta(c).setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não é possível visualizar gestores.");
                }
                
            }
        
    }
}

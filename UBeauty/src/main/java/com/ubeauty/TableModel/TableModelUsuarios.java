package com.ubeauty.TableModel;

import com.ubeauty.Entities.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas Teixeira
 */
public class TableModelUsuarios extends AbstractTableModel{
    private Map<Integer, Cliente> clientes;
    private List<Integer> clientesKEYS;
    
    private String [] colunas = {"Nome" , "E-mail"};
    
    private final int NOME = 0;
    private final int EMAIL = 1;

    public TableModelUsuarios(Map<Integer, Cliente> clientes) {
        this.clientes = new HashMap<>(clientes);
        this.clientesKEYS = new ArrayList<>(clientes.keySet());
    }
    
    
    
    
    @Override
    public int getRowCount() {
        return clientes.size();
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int index) {
    return colunas[index];
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == NOME) {
            return Integer.class;
        }
        return String.class;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); 
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        int key = clientesKEYS.get(rowIndex);
        Cliente cliente = clientes.get(key);
        
        switch(columnIndex){
            case NOME -> {
                return cliente.getNome();
            }
            case EMAIL -> {
                return cliente.getEmail();
            }
        }
        return null;
       
    }
    
    
    public Cliente getCliente(int row){
        int key = clientesKEYS.get(row);
        Cliente cliente = clientes.get(key);
        return cliente;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

}

package com.ubeauty.TableModel;

import com.ubeauty.Entities.Servico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas Teixeira
 */
public class TableModelServicos extends AbstractTableModel{
    private Map<Integer, Servico> servicos;
    private List<Integer> servicosKEYS;
    
    private final String [] colunas = {"Serviço","Preço"};
    
    private final int SERVICO = 0;
    private final int PRECO = 1;
    
    public TableModelServicos(Map<Integer, Servico> servicos){
        this.servicos = new HashMap<>(servicos);
        this.servicosKEYS = new ArrayList <>(servicos.keySet());
        fireTableStructureChanged();
    }

    
    
    
    @Override
    public int getRowCount() {
        return servicos.size();
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
        if (columnIndex == SERVICO) {
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
        int key = servicosKEYS.get(rowIndex);
        Servico s = servicos.get(key);
        
        switch (columnIndex) {
            case SERVICO -> {
                return s.getNome();
            }
            case PRECO -> {
                return s.getValor();
            }
        }
        
        
        return null;
    }
    
    public Servico getServico(int row){
        int key = servicosKEYS.get(row);
        Servico s = servicos.get(key);
        return s;
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

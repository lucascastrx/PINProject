package com.ubeauty.TableModel;

import com.ubeauty.Entities.Vendedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas Teixeira
 */
public class TableModelSaloes extends AbstractTableModel{
    private Map<Integer, Vendedor> saloes;
    private List<Integer> saloesKEYS;
    private Set<Vendedor> vv;
    
  
    private final String [] colunas = {"Nome","Descrição"};
    
    private final int NOME = 0;
    private final int DESCRICAO = 1;

    public TableModelSaloes(Map<Integer, Vendedor> saloes) {
        this.saloes = new HashMap<>(saloes);
       
        saloesKEYS = new ArrayList<>(saloes.keySet());
    }

    public Map<Integer, Vendedor> getSaloes() {
        return saloes;
    }

    public void setSaloes(Map<Integer, Vendedor> saloes) {
        this.saloes = saloes;
    }
    
    
    
    

    @Override
    public int getRowCount() {
       return saloes.size();
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
        int key = saloesKEYS.get(rowIndex);
        Vendedor v = saloes.get(key);
        
        switch (columnIndex) {
            case NOME -> {
                return v.getNome();
            }
            case DESCRICAO -> {
                return v.getDescricao();
            }
        }
        return null;
    }
    
    public Vendedor getSalao(int row){
        int key = saloesKEYS.get(row);
        Vendedor v = saloes.get(key);
        return v;
    }
    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}

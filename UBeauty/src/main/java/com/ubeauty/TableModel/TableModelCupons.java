package com.ubeauty.TableModel;

import com.ubeauty.Entities.Cupom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

public class TableModelCupons extends AbstractTableModel{
    private Map<Integer, Cupom> cupons;
    private List<Integer> cuponsKEYS;
    
    private final String [] colunas = {"Cupom","Desconto"};
    
    private final int CUPOM = 0;
    private final int DESCONTO = 1;
    
    public TableModelCupons(Map<Integer, Cupom> cupons){
        this.cupons = new HashMap<>(cupons);
        this.cuponsKEYS = new ArrayList <>(cupons.keySet());
        fireTableStructureChanged();
    }

    
    
    
    @Override
    public int getRowCount() {
        return cupons.size();
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
        if (columnIndex == CUPOM) {
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
        int key = cuponsKEYS.get(rowIndex);
        Cupom c = cupons.get(key);
        
        switch (columnIndex) {
            case CUPOM -> {
                return c.getNome();
            }
            case DESCONTO -> {
                return c.getDesconto();
            }
        }
        
        
        return null;
    }
    
    public Cupom getCupom(int row){
        int key = cuponsKEYS.get(row);
        Cupom c = cupons.get(key);
        return c;
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

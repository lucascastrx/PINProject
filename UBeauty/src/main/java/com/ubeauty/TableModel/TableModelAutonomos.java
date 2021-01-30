package com.ubeauty.TableModel;

import com.ubeauty.Entities.Vendedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lucas Teixeira
 */
public class TableModelAutonomos extends AbstractTableModel{
    private Map<Integer, Vendedor> autonomos;
    private List<Integer> autonomosKEYS;
    private final String [] colunas = {"Nome","Descrição"};
    
    private final int NOME = 0;
    private final int DESCRICAO = 1;

    public TableModelAutonomos(Map<Integer, Vendedor> autonomos) {
        this.autonomos = new HashMap<>(autonomos);
        this.autonomosKEYS = new ArrayList<>(autonomos.keySet());
    }

    
    
    @Override
    public int getRowCount() {
       return autonomos.size(); 
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        int key = autonomosKEYS.get(rowIndex);
        Vendedor v = autonomos.get(key);
        
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
        int key = autonomosKEYS.get(row);
        Vendedor v = autonomos.get(key);
        return v;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}

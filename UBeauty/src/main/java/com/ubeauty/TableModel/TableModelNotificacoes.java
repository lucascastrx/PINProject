package com.ubeauty.TableModel;

import com.ubeauty.Entities.Cupom;
import com.ubeauty.Entities.Notificacao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

public class TableModelNotificacoes extends AbstractTableModel{
    private Map<Integer, Notificacao> notificacoes;
    private List<Integer> notificacoesKEYS;
    
    private final String [] colunas = {"Info","Data/hora"};
    
    private final int NOTIFICACAO = 0;
    private final int DATAHORA = 1;
    
    public TableModelNotificacoes(Map<Integer, Notificacao> notificacoes){
        this.notificacoes = new HashMap<>(notificacoes);
        this.notificacoesKEYS = new ArrayList <>(notificacoes.keySet());
        fireTableStructureChanged();
    }

    
    
    
    @Override
    public int getRowCount() {
        return notificacoes.size();
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
        if (columnIndex == NOTIFICACAO) {
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
        int key = notificacoesKEYS.get(rowIndex);
        Notificacao n = notificacoes.get(key);
        
        switch (columnIndex) {
            case NOTIFICACAO -> {
                return n.getTexto();
            }
            case DATAHORA -> {
                return n.getData() + " - " + n.getHora();
            }
        }
        
        
        return null;
    }
    
    public Notificacao getNotificacao(int row){
        int key = notificacoesKEYS.get(row);
        Notificacao n = notificacoes.get(key);
        return n;
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}

package com.ubeauty.TableModel;

import com.ubeauty.Entities.Agendamento;
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
public class TableModelClienteAgendados extends AbstractTableModel{
    private Map<Integer, Agendamento> agendamentos;
    private List<Integer> agendamentosKEYS;
    private final String [] colunas = {"Serviço","Horário"};
    
    private final int SERVICO = 0;
    private final int HORARIO = 1;

    public TableModelClienteAgendados(Map<Integer, Agendamento> agendamento) {
        this.agendamentos = new HashMap<>(agendamento);
        this.agendamentosKEYS = new ArrayList<>(agendamento.keySet());
    }

    
    
    @Override
    public int getRowCount() {
       return agendamentos.size(); 
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
        int key = agendamentosKEYS.get(rowIndex);
        Agendamento a = agendamentos.get(key);
        String horario = a.getHora() + " - " + a.getData();
        
        switch (columnIndex) {
            case SERVICO -> {
                return a.getServico().getNome();
            }
            case HORARIO -> {
                return horario;
            }
        }
        
        return null;
    }
    
    public Agendamento getAgendamento(int row){
        int key = agendamentosKEYS.get(row);
        Agendamento a = agendamentos.get(key);
        return a;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}

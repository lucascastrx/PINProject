/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.Controller;

import com.ubeauty.Controller.Vendedor.PrincipalControllerVendedor;
import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Exceptions.ParseDateException;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.TableModel.TableModelClienteAgendados;
import com.ubeauty.View.Vendedor.PanelPrincipalVendedor;
import com.ubeauty.View.Vendedor.PopUpDisponibilizarHorario;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lucas Teixeira
 */
public class DisponibilizarHorarioController {
    private PrincipalControllerVendedor controller;
    private PopUpDisponibilizarHorario popDisponibilizar;
    private PanelPrincipalVendedor view;

    public DisponibilizarHorarioController(PrincipalControllerVendedor controller, PanelPrincipalVendedor view, PopUpDisponibilizarHorario pop) {
        this.controller = controller;
        this.popDisponibilizar = pop;
        this.view = view;
    }

    public DisponibilizarHorarioController(PanelPrincipalVendedor view) {
        this.view = view;
    }
    
    
    
    
    public void criarHorario() {
        String data = popDisponibilizar.getTfDia().getText() + "/" + popDisponibilizar.getTfMes().getText(); 
        String hora = popDisponibilizar.getTfHora().getText() + ":" + popDisponibilizar.getTfMinuto().getText();
        
        Servico servico = (Servico) popDisponibilizar.getCbServico().getSelectedItem(); 
        
            Agendamento agendamento = new Agendamento(data, hora);
            ServicoDAO sPersist = new ServicoDAO();
            Servico s = sPersist.buscar(servico.getId());
            s.addAgendamento(agendamento);
            sPersist.closeConnection();
            new AgendamentoDAO().gravar(agendamento);
            new ServicoDAO().atualizar(servico);
       
        
       setDadosTabelasAgendamentos();
       popDisponibilizar.dispose();
            
    }

    public void loadComboBox(){
        ServicoDAO repository = new ServicoDAO();
        Vendedor v = (Vendedor) LoginAuthentication.cliente;
        Map<Integer,Servico> servicos =  repository.buscarServicoPorIdVendedor( v.getId() );
        List<Servico> listServicos = new ArrayList<>();
        for(Map.Entry<Integer, Servico> s: servicos.entrySet()){
            Servico serv = s.getValue();
            listServicos.add(serv);
        }
        System.out.println("TAMANHO DO MAP DE SERVICOS PARA O COMBOBOX: " + listServicos.size());
        
        for(Servico s : listServicos){
            popDisponibilizar.getCbServico().addItem(s);
        }
        
       
    }
    
    public void setDadosTabelasAgendamentos() {
        
        AgendamentoDAO repository = new AgendamentoDAO();
        
        try{
            /**
             * Configurando tabela em que os horários existentes foram
             * agendados
             */
            
            Map<Integer, Agendamento> mapAgendamentos = repository.buscarTodosAgendados();
            TableModelClienteAgendados modelAgendamentos = new TableModelClienteAgendados(mapAgendamentos);
            view.setTableModelAgendamentos(modelAgendamentos);
            view.getTableAgendamentos1().repaint();
            
            /**
             * Configurando tabela com todos os horários existentes,
             * independente de estarem agendados ou não
             */
            AgendamentoDAO repository2 = new AgendamentoDAO();
            Map<Integer, Agendamento> mapAg = repository2.buscarTodosAgendamentos();
            TableModelClienteAgendados modelAg = new TableModelClienteAgendados(mapAg);
            view.setTableModelHorarios(modelAg);
            view.getTableHorarios().repaint();
        }catch(NullPointerException e){
            
        }
    }
    
    
}

package com.ubeauty.Controller;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.View.PopUpAgendar;
import java.util.List;

public class AgendamentoController {
    private Servico servico;
    private PopUpAgendar panelAgendamentos;
    
    private final boolean ESTAB_PARAM = false;
    private final boolean APP_PARAM = true;

    public AgendamentoController(Servico servico, PopUpAgendar panelAgendamentos) {
        this.servico = servico;
        this.panelAgendamentos = panelAgendamentos;
        carregarDados();
    }
    
    private void carregarDados(){
        loadComboBox();
        panelAgendamentos.getTxtPreco().setText(servico.getValor() + "");
        
    }
    
    private void loadComboBox(){
        AgendamentoDAO repository = new AgendamentoDAO();
        List<Agendamento> agendamentos =  repository.buscarAgendamentoPorIdServico(servico.getId());
        
        agendamentos.forEach(a ->{
            panelAgendamentos.getCbDia().addItem(a.getData());
        });
        
        agendamentos.forEach(a -> {
            panelAgendamentos.getCbHora1().addItem(a.getHora());    
        });
        
    }
    
    
    
    public void estabelecimento(){
        setFocus(ESTAB_PARAM);
    }
    
    public void aplicativo(){
        setFocus(APP_PARAM);
    }
    
    private void setFocus(boolean a){
        
        panelAgendamentos.getCbFormaPagamento().setFocusable(a);
        panelAgendamentos.getTfNumeroCartao().setFocusable(a);
        panelAgendamentos.getTfValidadeMes().setFocusable(a);
        panelAgendamentos.getTfValidadeAno().setFocusable(a);
        panelAgendamentos.getTfCodigo().setFocusable(a);
        
    }
    
}

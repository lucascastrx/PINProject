package com.ubeauty.Controller;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.View.PanelAgendamento;
import com.ubeauty.View.PanelPrincipal;
import javax.swing.JTable;

public class PanelAgendamentoController {
    Agendamento agendamento;
    PanelAgendamento panel;

    public PanelAgendamentoController(PanelAgendamento panel) {
        this.panel = panel;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    void carregarPanel() {
        String estabelecimento = "";
        String servico = agendamento.getServico().getNome();
        String data = agendamento.getData() + " - " + agendamento.getHora();
        String preco = "";
        String pagamento = "";
        
        panel.getTxtServico().setText(servico);
        panel.getTxtHorario().setText(data);
        panel.getTxtEstabelecimento().setText(estabelecimento);
        panel.getTxtPagamento().setText(pagamento);
        panel.getTxtPreco().setText(preco);
    }

    public void cancelarAgendamento() {
        
    }

    public void solicitarAlteracao() {
        panel.exibirMensagem("O aplicativo não possui suporte à alterações ainda. Entre em contato com o vendedor (*numero contato*) para solicitar alteração.");
    }
}

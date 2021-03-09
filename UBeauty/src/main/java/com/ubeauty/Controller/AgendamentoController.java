package com.ubeauty.Controller;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Carrinho;
import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Cupom;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.OrdemItem;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Exceptions.ParseDateException;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.Repository.CarrinhoDAO;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.CupomDAO;
import com.ubeauty.Repository.OrdemItemDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelClienteAgendados;
import com.ubeauty.View.PanelPrincipal;
import com.ubeauty.View.PopUpAgendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendamentoController {
    private Servico servico;
    private PopUpAgendar panelAgendamentos;
    private PrincipalController controller;
    private PanelPrincipal view;
    
    private final boolean ESTAB_PARAM = false;
    private final boolean APP_PARAM = true;

    public AgendamentoController(Servico servico, PopUpAgendar panelAgendamentos, PrincipalController controller) {
        this.servico = servico;
        this.panelAgendamentos = panelAgendamentos;
        this.controller = controller;
        this.view = (PanelPrincipal) this.controller.getJpPrincipal();
        carregarDados();
    }

    public AgendamentoController(PanelPrincipal view) {
        this.view = view;
    }
    
    
    
    private void carregarDados(){
       
        panelAgendamentos.getTxtPreco().setText(servico.getValor() + "");
        loadComboBox();
        
    }
    
    public void agendar() {
        double desconto = 0;
        
        Vendedor v = servico.getVendedorServico();
        Map<Integer,Cupom> mapCupom = new HashMap<>(new CupomDAO().buscarCupomPorIdVendedor(v.getId()));
        String cp = panelAgendamentos.getTfCupom2().getText();
        
        for(Map.Entry<Integer, Cupom> cupom : mapCupom.entrySet() ){
            if(cp.equalsIgnoreCase(cupom.getValue().getNome())){
                desconto = cupom.getValue().getDesconto();
            }
            
            desconto = ((desconto/100) * servico.getValor());
            
            Agendamento agendamento = (Agendamento) panelAgendamentos.getCbHorario().getSelectedItem();
            
            ClienteDAO rep = new ClienteDAO();
            Cliente c = rep.buscar(LoginAuthentication.cliente.getId());
            Carrinho carrinho = new Carrinho(new Date(), c);
            c.addCarrinho(carrinho);
            rep.closeConnection();
            new CarrinhoDAO().gravar(carrinho);
            new ClienteDAO().atualizar(c);
            
           
            AgendamentoDAO aPersist = new AgendamentoDAO();
            Agendamento a = aPersist.buscar(agendamento.getId());
            CarrinhoDAO cPersist = new CarrinhoDAO();
            Carrinho cc = cPersist.buscar(carrinho.getId());
            a.setAgendado(true);
            a.addCarrinhos(cc);
            cc.addAgendamentos(a);
            aPersist.closeConnection();
            cPersist.closeConnection();
            
            new CarrinhoDAO().atualizar(cc);
            new AgendamentoDAO().atualizar(a);
            
            this.setDadosTabelasAgendamentos();
            panelAgendamentos.exibirMensagem("Agendamento concluido!");
            panelAgendamentos.dispose();
            
        }
    }
    
    private void loadComboBox(){
        AgendamentoDAO repository = new AgendamentoDAO();
        List<Agendamento> agendamentos =  repository.buscarAgendamentoPorIdServico(servico.getId());
        
        agendamentos.forEach(a ->{
            panelAgendamentos.getCbHorario().addItem(a);
        });  
    }
    
     public void setDadosTabelasAgendamentos() {
        
   
        
        try{
            /**
             * Configurando tabela em que os horários existentes foram
             * agendados
             */ 
            
            Map<Integer, Agendamento> mapAgendamentos = new HashMap<>();
            List<Carrinho> carrinhos = LoginAuthentication.cliente.getCarrinhos();
            for(Carrinho cc : carrinhos){
                Set<Agendamento> listAg = cc.getAgendamentos();
                for(Agendamento ag : listAg){
                    mapAgendamentos.putIfAbsent(ag.getId(), ag );
                }
            }
            
            TableModelClienteAgendados modelAgendamentos = new TableModelClienteAgendados(mapAgendamentos);
            view.setTableModel(modelAgendamentos);
            view.getTabela().repaint();
            
        }catch(NullPointerException e){
            
        }
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

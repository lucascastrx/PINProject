package com.ubeauty.Controller;

import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.TableModel.TableModelServicos;
import com.ubeauty.View.PanelPaginaSalao;
import com.ubeauty.View.PopUpAgendar;
import com.ubeauty.View.PopUpReclamacoes;
import java.util.Map;
import javax.swing.JTable;

public class PaginaSalaoController {
    private PanelPaginaSalao panelPaginas;
    private PrincipalController controller;
    private Vendedor v;
    private TableModelServicos modelServicos;
    
    public PaginaSalaoController(PanelPaginaSalao p, PrincipalController c){
        panelPaginas = p;
        controller = c;
        
        
    }
    
    private void carregarDados(){
        String telefone = "(" + v.getDdd() + ") " + v.getTelefone();
        
        panelPaginas.getTxtNomeSalao().setText(v.getNome());
        panelPaginas.getTxtDescricao().setText(v.getDescricao());
        panelPaginas.getTxtEmail().setText(v.getEmail());
        panelPaginas.getTxtTelefone().setText(telefone);
        panelPaginas.getTxtEndereco().setText(v.getEndereco());
        panelPaginas.getTxtHorario1().setText(v.getHoraFunc());
    }
    
    public void voltar(){
        if(v.isAutonomo()){
         controller.mostrarTela("autonomos");
        }else{
        controller.mostrarTela("saloes");
        }
    }

    public void setDados(Vendedor v) {
        this.v = v;
        ServicoDAO repository = new ServicoDAO();
        Map<Integer, Servico> mapServicos = repository.buscarServicoPorIdVendedor(v.getId());
        modelServicos = new TableModelServicos(mapServicos);
        panelPaginas.setTableModel(modelServicos);
        panelPaginas.getTabela().repaint(); 
        
        carregarDados();
    }

    public Vendedor getV() {
        return v;
    }
    
    public void abrirReclamacoes(){
        if(LoginAuthentication.cliente != null ){
        new PopUpReclamacoes(v).setVisible(true);
        }else{
            controller.mostrarTela("contaConvidado");
        }
    }
    
    public void selecionarServico(){
        if(LoginAuthentication.cliente != null){
            JTable table = panelPaginas.getTabela();
            Servico s = modelServicos.getServico(table.getSelectedRow());
            new PopUpAgendar(s).setVisible(true);
        }else{
            controller.mostrarTela("contaConvidado");
        }
    }
}

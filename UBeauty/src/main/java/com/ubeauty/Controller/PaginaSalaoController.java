package com.ubeauty.Controller;

import com.ubeauty.Entities.Vendedor;
import com.ubeauty.View.PanelPaginaSalao;

public class PaginaSalaoController {
    private PanelPaginaSalao panelPaginas;
    private PrincipalController controller;
    private Vendedor v;
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
        controller.mostrarTela("saloes");
    }

    public void setDados(Vendedor v) {
        this.v = v;
        carregarDados();
    }
    
    
}

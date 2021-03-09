package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.Cupom;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.CupomDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelCupons;
import com.ubeauty.TableModel.TableModelServicos;
import com.ubeauty.View.Vendedor.PanelServicosVendedor;
import com.ubeauty.View.Vendedor.PopUpCriarServico;
import com.ubeauty.View.Vendedor.PopUpEditarServico;
import java.util.Map;
import javax.swing.JTable;

public class ServicoVendedorController {

    PanelServicosVendedor view;
    PopUpCriarServico popUpCriarServico;
    PopUpEditarServico popUpEditarServico;
    Vendedor vendedor;
    private TableModelServicos modelServicos;
    private TableModelCupons modelCupons;

    public ServicoVendedorController(PanelServicosVendedor view) {
        this.view = view;
        vendedor = (Vendedor) LoginAuthentication.cliente;
    }

    public void abrirPopUpCriarServico() {
        new PopUpCriarServico(this).setVisible(true);
    }

    public void carregarPopUpEdicao() {
        Servico s2 = popUpEditarServico.getServico();
        popUpEditarServico.getTfCategoria().setText(s2.getCategoria());
        popUpEditarServico.getTfDescricao().setText(s2.getDescricao());
        popUpEditarServico.getTfNome().setText(s2.getNome());
        popUpEditarServico.getTfPreco().setText(String.valueOf(s2.getValor()));
    }

    public void excluirCupom() {
        JTable tabela = view.getTableCupons();

        if (tabela.getSelectedRow() != -1) {

            CupomDAO persistencia = new CupomDAO();
            Cupom c = modelCupons.getCupom(tabela.getSelectedRow());

            persistencia.remover(c.getId());
            setDadosTabelaCupom();

        } else {
            view.exibirMensagem("Selecione um cupom para excluir.");
        }
    }

    public void excluirServico() {

        JTable tabela = view.getTableServicos();

        if (tabela.getSelectedRow() != -1) {

            ServicoDAO persistencia = new ServicoDAO();
            Servico s = modelServicos.getServico(tabela.getSelectedRow());

            persistencia.remover(s.getId());
            setDadosTabelaServico();

        } else {
            view.exibirMensagem("Selecione serviço para excluir.");
        }
    }

    public void setDadosTabelaServico() {
        ServicoDAO repository = new ServicoDAO();
        Map<Integer, Servico> mapServicos = repository.buscarServicoPorIdVendedor(vendedor.getId());
        modelServicos = new TableModelServicos(mapServicos);
        view.setTableModel(modelServicos);
        view.getTableServicos().repaint();
    }

    public void setDadosTabelaCupom() {
        CupomDAO repository = new CupomDAO();
        Map<Integer, Cupom> mapCupons = repository.buscarCupomPorIdVendedor(vendedor.getId());
        modelCupons = new TableModelCupons(mapCupons);
        view.setTableModel(modelCupons);
        view.getTableCupons().repaint();
    }

    public void salvarNovoServico() {
        String categoria = popUpCriarServico.getTfCategoria().getText();
        String descricao = popUpCriarServico.getTfDescricao().getText();
        String preco = popUpCriarServico.getTfPreco().getText();
        String nome = popUpCriarServico.getTfNome().getText();
        double valor = UtilController.converterParaDouble(preco);

        if (valor != -1.0) {
            //As ligações entre as entidades deve ser feitas com a conexão do DB aberta. Tentei explicar um pouco no App
            VendedorDAO persistencia = new VendedorDAO();
            Servico servico = new Servico(nome, descricao, categoria, valor);
            Vendedor v = persistencia.buscar(vendedor.getId());
            v.addServico(servico);
            persistencia.closeConnection();

            ServicoDAO sPersist = new ServicoDAO();
            sPersist.gravar(servico);

            VendedorDAO vPersist = new VendedorDAO();
            vPersist.atualizar(v);
            popUpCriarServico.dispose();
            setDadosTabelaServico();

        } else {
            view.exibirMensagem("Preço inválido.");
        }

    }

    public void salvarEdicaoServico() {
        String categoria = popUpEditarServico.getTfCategoria().getText();
        String descricao = popUpEditarServico.getTfDescricao().getText();
        String preco = popUpEditarServico.getTfPreco().getText();
        String nome = popUpEditarServico.getTfNome().getText();
        double valor = UtilController.converterParaDouble(preco);

        if (valor != -1.0) {

            Servico s2 = popUpEditarServico.getServico();
            s2.setCategoria(categoria);
            s2.setDescricao(descricao);
            s2.setNome(nome);
            s2.setValor(valor);

            new ServicoDAO().atualizar(s2);
           
            popUpEditarServico.dispose();
            setDadosTabelaServico();

        } else {
            view.exibirMensagem("Preço inválido.");
        }

    }

    public void abrirPopUpEditarServico() {
        JTable tabela = view.getTableServicos();
        Servico s = modelServicos.getServico(tabela.getSelectedRow());
        new PopUpEditarServico(this, s).setVisible(true);
    }

    public void setPopUpCriarServico(PopUpCriarServico popUp) {
        this.popUpCriarServico = popUp;
    }

    public void setPopUpEditarServico(PopUpEditarServico popUp) {
        this.popUpEditarServico = popUp;
    }

    public PanelServicosVendedor getView() {
        return view;
    }

}

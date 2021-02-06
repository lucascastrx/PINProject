package com.ubeauty.Controller.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.Cupom;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.CupomDAO;
import com.ubeauty.Repository.VendedorDAO;
import com.ubeauty.TableModel.TableModelCupons;
import com.ubeauty.View.Vendedor.PopUpCriarCupom;
import javax.swing.JTable;

public class CupomVendedorController {

    private PopUpCriarCupom popUp;
    private Vendedor vendedor;
    private ServicoVendedorController controllerPanel;
    private TableModelCupons modelCupons;

    public CupomVendedorController(ServicoVendedorController controllerPanel) {
        this.controllerPanel = controllerPanel;
        vendedor = (Vendedor) LoginAuthentication.cliente;
    }

    public void abrirPopUpCriarCupom() {
        popUp = new PopUpCriarCupom(this);
        popUp.setVisible(true);
    }

    public void criarCupom() {

        String desconto = popUp.getTfDesconto().getText();
        String nome = popUp.getTfNome().getText();

        int valor = UtilController.converterString(desconto);

        if (valor != -1) {

            Cupom cupom = new Cupom(nome, valor, vendedor);

            VendedorDAO persistenciaVendedor = new VendedorDAO();
            Vendedor v = persistenciaVendedor.buscar(vendedor.getId());
            v.addCupom(cupom);
            persistenciaVendedor.closeConnection();

            CupomDAO persistenciaCupom = new CupomDAO();
            persistenciaCupom.gravar(cupom);

            VendedorDAO vPersist = new VendedorDAO();
            vPersist.atualizar(v);
            popUp.dispose();

            controllerPanel.setDadosTabelaCupom();

        } else {
            controllerPanel.view.exibirMensagem("Preço inválido.");
        }
    }

}

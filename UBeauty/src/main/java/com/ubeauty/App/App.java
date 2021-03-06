package com.ubeauty.App;
        
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.Vendedor.NotificacaoVendedorController;
import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Carrinho;
import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Gestor;
import com.ubeauty.Entities.LoginAuthentication;
import com.ubeauty.Entities.Mensagem;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Entities.OrdemItem;
import com.ubeauty.Entities.Pagamento;
import com.ubeauty.Entities.Reclamacao;
import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.Repository.AgendamentoDAO;
import com.ubeauty.Repository.CarrinhoDAO;
import com.ubeauty.Repository.ClienteDAO;
import com.ubeauty.Repository.GestorDAO;
import com.ubeauty.Repository.NotificacaoDAO;
import com.ubeauty.Repository.OrdemItemDAO;
import com.ubeauty.Repository.ReclamacaoDAO;
import com.ubeauty.Repository.ServicoDAO;
import com.ubeauty.Repository.VendedorDAO;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
       
        /*
        Cliente test = new Cliente(false,"Lucas","Castro","luukascastro@gmail.com","Rua Palmas", 22, 981657344, "umasenhaai");
        ClienteDAO clienteRepository = new ClienteDAO();
        clienteRepository.gravar(test);
        
        
        Vendedor vTest = new Vendedor( "2221212",false, "Anom", "Anonym", "anonym@gmail.com", "Sao Paulo", 11, 9999999,  "qqrsenha");
        VendedorDAO vendedorRepository = new VendedorDAO();
        vendedorRepository.gravar(vTest);
       */
       
        
       
       /********************************************************************************* 
        * Exemplo abaixo que pode ser usado em controllers 
        * mais adiante no desenvolvimento. 
        * Mesmo que uma relação seja bidirecional, ainda é preciso persistir 
        * a Entidade que se agrega as collections. O SQLite não permite que
        * o Hibernate faça o uso de multithreading para persistir
        * Um Obj(o) de collections a partir da classe Pai (Acho que o motivo seja esse!)
        * Obs.: não necessariamente é preciso atualizar a classe Pai pra dar flush na new collections (eu acho)
        * 
        *   ServicoDAO servicoRepository = new ServicoDAO();
            Servico s = servicoRepository.buscar(28);
            Agendamento a = new Agendamento(new Date(),new Date());
            s.addAgendamento(a);
            servicoRepository.closeConnection();
        
            AgendamentoDAO agendamentoRepository = new AgendamentoDAO();
            agendamentoRepository.gravar(a);
        
            //VendedorDAO vd = new VendedorDAO();
            //vd.atualizar(v);
      
       
            ClienteDAO clienteRepository = new ClienteDAO();
            Cliente c = clienteRepository.buscar(12);
            Carrinho cc = new Carrinho(Instant.now(), c);
            c.addCarrinho(cc);
            clienteRepository.closeConnection();
        
            CarrinhoDAO cd = new CarrinhoDAO();
            cd.gravar(cc);
       
            ClienteDAO cr = new ClienteDAO();
            cr.atualizar(c);
       
        ********************************************************************************/
       /* CarrinhoDAO cd = new CarrinhoDAO();
       Carrinho cc = cd.buscar(35);
       
       
       AgendamentoDAO ad = new AgendamentoDAO();
       Agendamento a = ad.buscar(30);
       OrdemItem oi = new OrdemItem(cc, a, 45.00);
       a.addItems(oi);
       
       ad.closeConnection();
       cd.closeConnection();
       
       AgendamentoDAO ad1 = new AgendamentoDAO();
       ad1.atualizar(a);
       
       
       OrdemItemDAO od = new OrdemItemDAO();
       od.gravar(oi);
       */
       
       
       /*CarrinhoDAO cd = new CarrinhoDAO();
       Carrinho cc = cd.buscar(35);
       
       Pagamento p = new Pagamento();
       p.setCarrinho(cc);
       
       cc.setPagamento(p);
       cd.closeConnection();
       
       CarrinhoDAO c = new CarrinhoDAO();
       c.atualizar(cc);
       */
       
       /*
       CarrinhoDAO cd = new CarrinhoDAO();
       Carrinho cc = new Carrinho();
       cc.setMoment(new Date());
       cd.gravar(cc);
       
        System.out.println(cc.getMoment());
        
        Vendedor v = new Vendedor();
        
        v.getNome();
        
       */
       
       GestorDAO gd = new GestorDAO();
       gd.gravar(new Gestor("Lucas", "0", "lucas@gmail.com", "x", 0, 0, "lucas"));
       
       
         
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        System.out.println("Se você está lendo o console tu é corno");
        //E se chegou até aqui o chifre não passa nem da porta
    }
}

package com.ubeauty.Repository;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.ClienteNotificacao;
import com.ubeauty.Entities.Notificacao;
import com.ubeauty.Entities.Vendedor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteNotificacaoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public ClienteNotificacaoDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (ClienteNotificacao cn){
        try {
            em.getTransaction().begin();
            em.persist(cn);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public ClienteNotificacao remover (int id){
        ClienteNotificacao cn = null;
        
        try {
            em.getTransaction().begin();
            cn = em.find(ClienteNotificacao.class, id);
            em.remove(cn);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return cn;
    }
    
    public ClienteNotificacao atualizar (ClienteNotificacao cn){
        ClienteNotificacao clienteNotif = null;
        
        try {
            em.getTransaction().begin();
            clienteNotif = em.merge(cn);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return clienteNotif;
    }
    
    public ClienteNotificacao buscar (int id){
        ClienteNotificacao cn = null;
        
        try {
            em.getTransaction().begin();
            cn = em.find(ClienteNotificacao.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            
        }
        return cn;
    }
    
    public Map<Integer,ClienteNotificacao> buscarTodosClienteNotificacoes(){
        Map<Integer,ClienteNotificacao> mapClienteNotificacao = null;
        
        try {
            em.getTransaction().begin();
            List<ClienteNotificacao> listClienteNotificacao = em.createQuery("from ClienteNotificacao").getResultList();
            for (ClienteNotificacao cn : listClienteNotificacao) {
                Cliente c = cn.getCliente();
                if(c != null){
                mapClienteNotificacao.putIfAbsent(c.getId(), cn);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapClienteNotificacao;
    }
    
    public Map<Integer,ClienteNotificacao> buscarTodosClienteNotificacoesPorId(int id){
        Map<Integer,ClienteNotificacao> mapClienteNotificacao = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<ClienteNotificacao> listClienteNotificacao = em.createQuery("from ClienteNotificacao where cliente_id = " + id).getResultList();
            for (ClienteNotificacao cn : listClienteNotificacao) {
                Cliente c = cn.getCliente();
                if(c != null){
                mapClienteNotificacao.putIfAbsent(c.getId(), cn);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapClienteNotificacao;
    }
    
     public Map<Integer,Notificacao> buscarNotificacaoPorIdCliente(int id){
        Map<Integer, Notificacao> clientesN = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Notificacao> listNotificacao = em.createQuery(
                    "select n.id, n.data, n.hora, n.texto,n.gestor,n.vendedorN from Notificacao n " +
                    "    inner join ClienteNotificacao CN" +
                    "        on n.id = CN.id.notificacao " +
                    "    inner join Cliente C            " +
                    "        on CN.id.cliente = " + id).getResultList();
            for (Notificacao n : listNotificacao) {
                
                    clientesN.putIfAbsent(n.getId(),n);
                
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return clientesN;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> notificacoesKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Notificacao> listNotificacao = em.createQuery("from Notificacao").getResultList();
            for (Notificacao n : listNotificacao) {
                notificacoesKeys.add(n.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return notificacoesKeys;
    }
    
    
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
}

package com.ubeauty.Repository;

import com.ubeauty.Entities.Pagamento;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PagamentoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public PagamentoDAO (){
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
    }
    
    public void gravar (Pagamento pg){
        try {
            em.getTransaction().begin();
            em.persist(pg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Pagamento remover (int id){
        Pagamento pg = null;
        
        try {
            em.getTransaction().begin();
            pg = em.find(Pagamento.class, id);
            em.remove(pg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return pg;
    }
    
    public Pagamento atualizar (Pagamento pg){
        Pagamento p = null;
        
        try {
            em.getTransaction().begin();
            p = em.merge(pg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return p;
    }
    
    public Pagamento buscar (int id){
        Pagamento pg = null;
        
        try {
            em.getTransaction().begin();
            pg = em.find(Pagamento.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return pg;
    }
    
    public Map<Integer,Pagamento> buscarTodosPagamentos(){
        Map<Integer,Pagamento> mapPagamentos = null;
        
        try {
            em.getTransaction().begin();
            List<Pagamento> listPagamentos = em.createQuery("from Pagamento").getResultList();
            for (Pagamento pg : listPagamentos) {
                mapPagamentos.putIfAbsent(pg.getId(), pg);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapPagamentos;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> pagamentosKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Pagamento> listPagamentos = em.createQuery("from Pagamento").getResultList();
            for (Pagamento pg : listPagamentos) {
                pagamentosKeys.add(pg.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return pagamentosKeys;
    }
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

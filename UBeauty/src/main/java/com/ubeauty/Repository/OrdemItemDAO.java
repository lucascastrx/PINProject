package com.ubeauty.Repository;

import com.ubeauty.Entities.Agendamento;
import com.ubeauty.Entities.Carrinho;
import com.ubeauty.Entities.OrdemItem;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OrdemItemDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public OrdemItemDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (OrdemItem oi){
        try {
            em.getTransaction().begin();
            em.persist(oi);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public OrdemItem remover (int id){
        OrdemItem oi = null;
        
        try {
            em.getTransaction().begin();
            oi = em.find(OrdemItem.class, id);
            em.remove(oi);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return oi;
    }
    
    public OrdemItem atualizar (OrdemItem orderItem){
        OrdemItem oi = null;
        
        try {
            em.getTransaction().begin();
            oi = em.merge(orderItem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return oi;
    }
    
    public OrdemItem buscar (int id){
        OrdemItem oi = null;
        
        try {
            em.getTransaction().begin();
            oi = em.find(OrdemItem.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            
        }
        return oi;
    }
    
    public Map<Integer,OrdemItem> buscarTodosOrderItems(){
        Map<Integer,OrdemItem> mapOrdemItem = null;
        
        try {
            em.getTransaction().begin();
            List<OrdemItem> listOrdemItem = em.createQuery("from OrdemItem").getResultList();
            for (OrdemItem oi : listOrdemItem) {
                Carrinho c = oi.getCarrinho();
                if(c != null){
                mapOrdemItem.putIfAbsent(c.getId(), oi);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapOrdemItem;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> agendamentosKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Agendamento> listAgendamentos = em.createQuery("from Agendamento").getResultList();
            for (Agendamento ag : listAgendamentos) {
                agendamentosKeys.add(ag.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return agendamentosKeys;
    }
    
    
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
}

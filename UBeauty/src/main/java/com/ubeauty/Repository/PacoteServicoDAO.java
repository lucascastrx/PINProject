package com.ubeauty.Repository;

import com.ubeauty.Entities.PacoteServico;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PacoteServicoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public PacoteServicoDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (PacoteServico ps){
        try {
            em.getTransaction().begin();
            em.persist(ps);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public PacoteServico remover (int id){
        PacoteServico ps = null;
        
        try {
            em.getTransaction().begin();
            ps = em.find(PacoteServico.class, id);
            em.remove(ps);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return ps;
    }
    
    public PacoteServico atualizar (PacoteServico ps){
        PacoteServico p = null;
        
        try {
            em.getTransaction().begin();
            p = em.merge(ps);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return p;
    }
    
    public PacoteServico buscar (int id){
        PacoteServico ps = null;
        
        try {
            em.getTransaction().begin();
            ps = em.find(PacoteServico.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return ps;
    }
    
    public Map<Integer,PacoteServico> buscarTodosPacoteServico(){
        Map<Integer,PacoteServico> mapPS = null;
        
        try {
            em.getTransaction().begin();
            List<PacoteServico> listPS = em.createQuery("from PacoteServico").getResultList();
            for (PacoteServico ps : listPS) {
                mapPS.putIfAbsent(ps.getId(), ps);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapPS;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> PSKeys = null;
        
        try {
            em.getTransaction().begin();
            List<PacoteServico> listPS = em.createQuery("from PacoteServico").getResultList();
            for (PacoteServico ps : listPS) {
                PSKeys.add(ps.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return PSKeys;
    }
    
    
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

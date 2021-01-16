package com.ubeauty.Repository;

import com.ubeauty.Entities.Gestor;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GestorDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public GestorDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar(Gestor gestor){
        
        try {
            em.getTransaction().begin();
            em.persist(gestor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
    }
    
    public Gestor remover (int id){
        Gestor g = null;
        
        try {
            em.getTransaction().begin();
            g = em.find(Gestor.class, id);
            em.remove(g);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return g;
    }
    
    public Gestor atualizar (Gestor gestor){
        Gestor g = null;
        
        try {
            em.getTransaction().begin();
            g = em.merge(gestor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return g;
    }
    
    public Gestor buscar (int id){
        Gestor g = null;
        
        try {
            em.getTransaction().begin();
            g = em.find(Gestor.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return g;
    }
    
    public Map<Integer,Gestor> buscarTodosGestores (){
        Map<Integer,Gestor> mapGestores = null;
        
        try {
            em.getTransaction().begin();
            List<Gestor> listGestores = em.createQuery("from Gestor").getResultList();
            for (Gestor g : listGestores) {
                mapGestores.putIfAbsent(g.getId(), g);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapGestores;
    }
    
    public List<Integer> buscarTodasKeys (){
        List<Integer> gestoresKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Gestor> listGestores = em.createQuery("from Gestor").getResultList();
            for (Gestor g : listGestores) {
                gestoresKeys.add(g.getId());
            }
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return gestoresKeys;
    }
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
    
}

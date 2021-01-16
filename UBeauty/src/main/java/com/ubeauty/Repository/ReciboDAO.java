package com.ubeauty.Repository;

import com.ubeauty.Entities.Recibo;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReciboDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public ReciboDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Recibo r){
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Recibo remover (int id){
        Recibo r = null;
        
        try {
            em.getTransaction().begin();
            r = em.find(Recibo.class, id);
            em.remove(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return r;
    }
    
    public Recibo atualizar (Recibo rc){
        Recibo r = null;
        
        try {
            em.getTransaction().begin();
            r = em.merge(rc);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return r;
    }
    
    public Recibo buscar (int id){
        Recibo r = null;
        
        try {
            em.getTransaction().begin();
            r = em.find(Recibo.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return r;
    }
    
    public Map<Integer,Recibo> buscarTodosRecibos(){
        Map<Integer,Recibo> mapRecibos = null;
        
        try {
            em.getTransaction().begin();
            List<Recibo> listRecibos = em.createQuery("from Recibo").getResultList();
            for (Recibo r : listRecibos) {
                mapRecibos.putIfAbsent(r.getId(), r);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapRecibos;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> recibosKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Recibo> listRecibos = em.createQuery("from Recibo").getResultList();
            for (Recibo r : listRecibos) {
                recibosKeys.add(r.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return recibosKeys;
    }
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

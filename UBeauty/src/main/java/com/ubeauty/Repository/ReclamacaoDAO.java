package com.ubeauty.Repository;

import com.ubeauty.Entities.Reclamacao;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReclamacaoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public ReclamacaoDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Reclamacao r){
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
    
    public Reclamacao remover (int id){
        Reclamacao r = null;
        
        try {
            em.getTransaction().begin();
            r = em.find(Reclamacao.class, id);
            em.remove(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return r;
    }
    
    public Reclamacao atualizar (Reclamacao rc){
        Reclamacao r = null;
        
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
    
    public Reclamacao buscar (int id){
        Reclamacao r = null;
        
        try {
            em.getTransaction().begin();
            r = em.find(Reclamacao.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return r;
    }
    
    public Map<Integer,Reclamacao> buscarTodasReclamacoes(){
        Map<Integer,Reclamacao> mapReclamacoes = null;
        
        try {
            em.getTransaction().begin();
            List<Reclamacao> listReclamacoes = em.createQuery("from Reclamacao").getResultList();
            for (Reclamacao r : listReclamacoes) {
                mapReclamacoes.putIfAbsent(r.getId(), r);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapReclamacoes;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> reclamacoesKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Reclamacao> listReclamacoes = em.createQuery("from Reclamacao").getResultList();
            for (Reclamacao r : listReclamacoes) {
                reclamacoesKeys.add(r.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return reclamacoesKeys;
    }
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

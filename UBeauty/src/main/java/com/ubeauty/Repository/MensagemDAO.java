package com.ubeauty.Repository;

import com.ubeauty.Entities.Mensagem;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MensagemDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public MensagemDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Mensagem mensagem){
        try {
            em.getTransaction().begin();
            em.persist(mensagem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Mensagem remover (int id){
        Mensagem m = null;
        
        try {
            em.getTransaction().begin();
            m = em.find(Mensagem.class, id);
            em.remove(m);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return m;
    }
    
    public Mensagem atualizar (Mensagem mensagem){
        Mensagem m = null;
        
        try {
            em.getTransaction().begin();
            m = em.merge(mensagem);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return m;
    }
    
    public Mensagem buscar (int id){
        Mensagem m = null;
        
        try {
            em.getTransaction().begin();
            m = em.find(Mensagem.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return m;
    }
    
    public Map<Integer,Mensagem> buscarTodasMensagens(){
        Map<Integer,Mensagem> mapMensagens = null;
        
        try {
            em.getTransaction().begin();
            List<Mensagem> listMensagens = em.createQuery("from Mensagem").getResultList();
            for (Mensagem m : listMensagens) {
                mapMensagens.putIfAbsent(m.getId(), m);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapMensagens;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> mensagensKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Mensagem> listMensagens = em.createQuery("from Mensagem").getResultList();
            for (Mensagem m : listMensagens) {
                mensagensKeys.add(m.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mensagensKeys;
    }
    
    
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

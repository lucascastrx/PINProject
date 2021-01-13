package com.ubeauty.Repository;

import com.ubeauty.Entities.Notificacao;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NotificacaoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public NotificacaoDAO (){
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
    }
    
    public void gravar (Notificacao notificacao){
        try {
            em.getTransaction().begin();
            em.persist(notificacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Notificacao remover (int id){
        Notificacao n = null;
        
        try {
            em.getTransaction().begin();
            n = em.find(Notificacao.class, id);
            em.remove(n);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return n;
    }
    
    public Notificacao atualizar (Notificacao notificacao){
        Notificacao n = null;
        
        try {
            em.getTransaction().begin();
            n = em.merge(notificacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return n;
    }
    
    public Notificacao buscar (int id){
        Notificacao n = null;
        
        try {
            em.getTransaction().begin();
            n = em.find(Notificacao.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return n;
    }
    
    public Map<Integer,Notificacao> buscarTodasNotificacoes(){
        Map<Integer,Notificacao> mapNotificacoes = null;
        
        try {
            em.getTransaction().begin();
            List<Notificacao> listNotificacoes = em.createQuery("from Notificacao").getResultList();
            for (Notificacao n : listNotificacoes) {
                mapNotificacoes.putIfAbsent(n.getId(), n);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapNotificacoes;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> notificacoesKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Notificacao> listNotificacoes = em.createQuery("from Notificacao").getResultList();
            for (Notificacao n : listNotificacoes) {
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
    
    
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

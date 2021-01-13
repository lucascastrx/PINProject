package com.ubeauty.Repository;

import com.ubeauty.Entities.Servico;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ServicoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public ServicoDAO (){
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
        em = emf.createEntityManager();
    }
    
    public void gravar (Servico s){
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Servico remover (int id){
        Servico s = null;
        
        try {
            em.getTransaction().begin();
            s = em.find(Servico.class, id);
            em.remove(s);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return s;
    }
    
    public Servico atualizar (Servico sv){
        Servico s = null;
        
        try {
            em.getTransaction().begin();
            s = em.merge(sv);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return s;
    }
    
    public Servico buscar (int id){
        Servico s = null;
        
        try {
            em.getTransaction().begin();
            s = em.find(Servico.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return s;
    }
    
    public Map<Integer,Servico> buscarTodosServicos(){
        Map<Integer,Servico> mapServicos = null;
        
        try {
            em.getTransaction().begin();
            List<Servico> listServicos = em.createQuery("from Servico").getResultList();
            for (Servico s : listServicos) {
                mapServicos.putIfAbsent(s.getId(), s);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapServicos;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> servicosKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Servico> listServicos = em.createQuery("from Servico").getResultList();
            for (Servico s : listServicos) {
                servicosKeys.add(s.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return servicosKeys;
    }
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

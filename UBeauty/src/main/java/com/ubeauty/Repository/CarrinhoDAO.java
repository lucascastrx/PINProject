package com.ubeauty.Repository;

import com.ubeauty.Entities.Carrinho;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarrinhoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public CarrinhoDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Carrinho carrinho){
        try {
            em.getTransaction().begin();
            em.persist(carrinho);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Carrinho remover (int id){
        Carrinho c = null;
        
        try {
            em.getTransaction().begin();
            c = em.find(Carrinho.class, id);
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return c;
    }
    
    public Carrinho atualizar (Carrinho carrinho){
        Carrinho c = null;
        
        try {
            em.getTransaction().begin();
            c = em.merge(carrinho);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return c;
    }
    
    public Carrinho buscar (int id){
        Carrinho c = null;
        
        try {
            em.getTransaction().begin();
            c = em.find(Carrinho.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            
        }
        return c;
    }
    
    public Map<Integer,Carrinho> buscarTodosCarrinhos(){
        Map<Integer,Carrinho> mapCarrinhos = null;
        
        try {
            em.getTransaction().begin();
            List<Carrinho> listCarrinhos = em.createQuery("from Carrinho").getResultList();
            for (Carrinho c : listCarrinhos) {
                mapCarrinhos.putIfAbsent(c.getId(), c);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapCarrinhos;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> carrinhosKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Carrinho> listCarrinhos = em.createQuery("from Carrinho").getResultList();
            for (Carrinho c : listCarrinhos) {
                carrinhosKeys.add(c.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return carrinhosKeys;
    }
    
    
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
}

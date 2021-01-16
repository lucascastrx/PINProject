package com.ubeauty.Repository;

import com.ubeauty.Entities.Cliente;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;

    public ClienteDAO() {
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Cliente cliente){
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Cliente remover(int id){
        Cliente cliente = null;
        
        try {
            em.getTransaction().begin();
            cliente = em.find(Cliente.class, id);
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return cliente;
    }
    
    public Cliente atualizar (Cliente cliente){
        Cliente cliente2 = null;
        try {
            em.getTransaction().begin();
            cliente2 = em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
       
        return cliente2;
    }
    
    public Cliente buscar (int id){
        Cliente cliente = null;
        try {
            em.getTransaction().begin();
            cliente = em.find(Cliente.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return cliente;
    }
    
    public Map<Integer,Cliente> buscarTodosClientes(){
        Map <Integer, Cliente> clientesMap = new HashMap <> ();
        
        try {
            em.getTransaction().begin();
            List<Cliente> listClientes = em.createQuery("from Cliente").getResultList();
            for (Cliente c : listClientes) {
                clientesMap.putIfAbsent(c.getId(), c);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return clientesMap;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> clientesKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Cliente> listClientes = em.createQuery("from Cliente").getResultList();
            for (Cliente c : listClientes) {
                clientesKeys.add(c.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return clientesKeys;
    }
     
    private void closeConnection(){
        em.close();
        emf.close();
    }
    
    
}

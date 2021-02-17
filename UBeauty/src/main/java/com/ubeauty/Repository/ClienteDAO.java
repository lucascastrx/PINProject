package com.ubeauty.Repository;

import com.ubeauty.Entities.Cliente;
import com.ubeauty.Entities.Vendedor;
import java.util.ArrayList;
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
    

    
    public void atualizar(Cliente c) {
       
        
        try{
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally{
            closeConnection();
        }
    }
    
    /**
     *
     * @param id
     * 
     * É necessário que a conexão seja fechada manualmente
     * devido a inconsistencia de persistir objetos de coleções
     * em relações ToMany
     * 
     * @return Cliente
     */
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
    
    public List<Cliente> buscarClientesPorCidade(String cidade){
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            em.getTransaction().begin();
            List<Cliente> listClientes = em.createQuery("from Cliente WHERE endereco LIKE :cidade").setParameter("cidade", cidade + "%").getResultList();
            for (Cliente c : listClientes) {
                if (!(c instanceof Vendedor)) {
                    clientes.add(c);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return clientes;
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
     
   public void closeConnection(){
        em.close();
        emf.close();
    }
    
    
}

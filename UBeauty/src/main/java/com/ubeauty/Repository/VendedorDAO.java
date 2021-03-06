package com.ubeauty.Repository;

import com.ubeauty.Entities.Servico;
import com.ubeauty.Entities.Vendedor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.annotations.QueryHints;
/**
 * 
 * @author Lucas Teixeira
 */
public class VendedorDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public VendedorDAO(){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar(Vendedor vendedor){
        try {
            em.getTransaction().begin();
            em.persist(vendedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
    }
    
    public Vendedor remover (int id){
        Vendedor v = null;
        
        try {
            em.getTransaction().begin();
            v = em.find(Vendedor.class, id);
            em.remove(v);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return v;
    }
    
    /**
     *
     * @param vendedor
     * Se a atualizacao falhar ele retorna um obj (o) null,
     * caso contrario ele retorna o obj (o) que foi atualizado
     * @return 
     */
    public Vendedor atualizar (Vendedor vendedor){
        Vendedor v = null;
        
        try {
            em.getTransaction().begin();
            v = em.merge(vendedor);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return v;
    }
    
    public Vendedor buscar(int id){
        Vendedor v = null;
        
        try {
            em.getTransaction().begin();
            v = em.find(Vendedor.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            
        }
        return v;
    }
    
    public Map<Integer,Vendedor> buscarTodosVendedores(){
        Map<Integer,Vendedor> mapVendedores = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Vendedor> listVendedores = em.createQuery("from Vendedor").getResultList();
            for (Vendedor v : listVendedores) {
                mapVendedores.putIfAbsent(v.getId(), v);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return mapVendedores;
    }
    
    public Map<Integer,Vendedor> buscarTodosSaloes(){
        Map<Integer,Vendedor> mapVendedores = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Vendedor> listVendedores = em.createQuery("from Vendedor").getResultList();
            for (Vendedor v : listVendedores) {
                if(v.isAutonomo() == false){
                    mapVendedores.putIfAbsent(v.getId(), v);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return mapVendedores;
    }
    
        public Map<Integer,Vendedor> buscarSaloesPorNome(String nome){
        Map<Integer,Vendedor> mapVendedores = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Vendedor> listVendedores = em.createQuery("from Vendedor WHERE nomeProfissao LIKE :nome").setParameter("nome", nome + "%").getResultList();
            for (Vendedor v : listVendedores) {
                if(v.isAutonomo() == false){
                    mapVendedores.putIfAbsent(v.getId(), v);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return mapVendedores;
    }
    
    public Map<Integer,Vendedor> buscarTodosAutonomos(){
        Map<Integer,Vendedor> mapVendedores = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Vendedor> listVendedores = em.createQuery("from Vendedor").getResultList();
            for (Vendedor v : listVendedores) {
                if(v.isAutonomo() == true){
                    mapVendedores.putIfAbsent(v.getId(), v);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return mapVendedores;
    }
    
    public List<Integer> buscarTodasKeys (){
        List<Integer> vendedoresKeys = null;
        
        try {
            em.getTransaction().begin();
            List<Vendedor> listVendedores = em.createQuery("from Vendedor").getResultList();
            for (Vendedor v : listVendedores) {
                vendedoresKeys.add(v.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally { 
            closeConnection();
        }
        return vendedoresKeys;
    }
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
}

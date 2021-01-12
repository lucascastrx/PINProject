package com.ubeauty.Repository;

import com.ubeauty.Entities.Vendedor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VendedorDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public VendedorDAO(){
        emf = Persistence.createEntityManagerFactory("hibernatejpa");
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
    
    
    
    private void closeConnection(){
        em.close();
        emf.close();
    }
}

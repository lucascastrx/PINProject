package com.ubeauty.Repository;

import com.ubeauty.Entities.Cupom;
import com.ubeauty.Entities.Servico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CupomDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public CupomDAO() {
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }

    public void gravar(Cupom c) {
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    public Cupom remover(int id) {
        Cupom c = null;

        try {
            em.getTransaction().begin();
            c = em.find(Cupom.class, id);
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return c;
    }

    public Cupom buscar(int id) {
        Cupom c = null;

        try {
            em.getTransaction().begin();
            c = em.find(Cupom.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return c;
    }

    public Map<Integer, Cupom> buscarCupomPorIdVendedor(int id) {
        Map<Integer, Cupom> mapCupons = new HashMap<>();

        try {
            em.getTransaction().begin();
            List<Cupom> listCupons = em.createQuery("from Cupom where vendedorCupom_id = " + id).getResultList();
            for (Cupom c : listCupons) {
                mapCupons.putIfAbsent(c.getId(), c);
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return mapCupons;
    }

    public Map<Integer, Cupom> buscarTodosCupons() {
        Map<Integer, Cupom> mapCupons = new HashMap<>();

        try {
            em.getTransaction().begin();
            List<Cupom> listCupons = em.createQuery("from Cupom").getResultList();
            for (Cupom c : listCupons) {
                mapCupons.putIfAbsent(c.getId(), c);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapCupons;
    }

    public List<Integer> buscarTodasKeys() {
        List<Integer> cuponsKeys = new ArrayList<>();

        try {
            em.getTransaction().begin();
            List<Cupom> listCupons = em.createQuery("from Cupom").getResultList();
            for (Cupom c : listCupons) {
                cuponsKeys.add(c.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return cuponsKeys;
    }

    public void closeConnection() {
        em.close();
        emf.close();
    }

}

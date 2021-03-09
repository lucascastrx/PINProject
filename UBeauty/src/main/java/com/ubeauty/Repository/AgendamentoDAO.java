package com.ubeauty.Repository;

import com.ubeauty.Entities.Agendamento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgendamentoDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public AgendamentoDAO (){
        emf = Persistence.createEntityManagerFactory("ubeautydb");
        em = emf.createEntityManager();
    }
    
    public void gravar (Agendamento agendamento){
        try {
            em.getTransaction().begin();
            em.persist(agendamento);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
    
    public Agendamento remover (int id){
        Agendamento ag = null;
        
        try {
            em.getTransaction().begin();
            ag = em.find(Agendamento.class, id);
            em.remove(ag);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            closeConnection();
        }
        return ag;
    }
    
    public Agendamento atualizar (Agendamento agendamento){
        Agendamento ag = null;
        
        try {
            em.getTransaction().begin();
            ag = em.merge(agendamento);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return ag;
    }
    
    public Agendamento buscar (int id){
        Agendamento ag = null;
        
        try {
            em.getTransaction().begin();
            ag = em.find(Agendamento.class, id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            
        }
        return ag;
    }
    
     
     
    public List<Agendamento> buscarAgendamentoPorIdServico(int id){
        List<Agendamento> listAgendamentos = new ArrayList<>();
        List<Agendamento> listAgendamentos2 = new ArrayList<>();
        try {
            em.getTransaction().begin();
            listAgendamentos = em.createQuery("from Agendamento where servico_id = " + id).getResultList();
            for(Agendamento a : listAgendamentos){
                if(a.isAgendado() == false){
                    listAgendamentos2.add(a);
                }
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        
        return listAgendamentos2;
    }
    
     public List<Agendamento> buscarAgendamentosPorIdCarrinho(int id){
        List<Agendamento> listAgendamentos = new ArrayList<>();
        try {
            em.getTransaction().begin();
            listAgendamentos = em.createQuery(
                    "select a from Agendamento a " + 
                    "left join fetch a.items i" +
                    "where i.id = :id"
            ).setParameter("id", id).getResultList();
            
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return listAgendamentos;
    }
    
    public Map<Integer,Agendamento> buscarTodosAgendamentos(){
        Map<Integer,Agendamento> mapAgendamentos = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Agendamento> listAgendamentos = em.createQuery("from Agendamento").getResultList();
            for (Agendamento ag : listAgendamentos) {
                mapAgendamentos.putIfAbsent(ag.getId(), ag);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapAgendamentos;
    }
    
    public Map<Integer,Agendamento> buscarTodosAgendados(){
        Map<Integer,Agendamento> mapAgendamentos = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Agendamento> listAgendamentos = em.createQuery("from Agendamento").getResultList();
            for (Agendamento ag : listAgendamentos) {
                if(ag.isAgendado()== true){
                mapAgendamentos.putIfAbsent(ag.getId(), ag);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapAgendamentos;
    }
    
    public Map<Integer,Agendamento> buscarTodosNaoAgendados(){
        Map<Integer,Agendamento> mapAgendamentos = new HashMap<>();
        
        try {
            em.getTransaction().begin();
            List<Agendamento> listAgendamentos = em.createQuery("from Agendamento").getResultList();
            for (Agendamento ag : listAgendamentos) {
                if(ag.isAgendado() == false){
                mapAgendamentos.putIfAbsent(ag.getId(), ag);
                }
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return mapAgendamentos;
    }
    
    public List<Integer> buscarTodasKeys(){
        List<Integer> agendamentosKeys = new ArrayList<>();
        
        try {
            em.getTransaction().begin();
            List<Agendamento> listAgendamentos = em.createQuery("from Agendamento").getResultList();
            for (Agendamento ag : listAgendamentos) {
                agendamentosKeys.add(ag.getId());
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return agendamentosKeys;
    }
    
    
    
    public void closeConnection(){
        em.close();
        emf.close();
    }
}

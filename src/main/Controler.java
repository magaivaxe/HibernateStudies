/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author sire_marcos
 */
public class Controler {
    //
    EntityManagerFactory emf;
    EntityManager em;
    //
    public Controler() {
        this.emf = Persistence.createEntityManagerFactory("eleves");
        this.em = emf.createEntityManager();
    }
    
    public void save (Eleve eleve){
        em.getTransaction().begin();
        em.merge(eleve);
        em.getTransaction().commit();
        emf.close();
    }
    
    public void remove (Eleve eleve){
        em.getTransaction().begin();
        Query q = em.createNativeQuery(
            "delete eleve from eleves where matricule =" + eleve.getMatricule()
        );
        em.getTransaction().commit();
        emf.close();
    }
}

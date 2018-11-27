/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP;

import java.io.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Stateless

public class FindUser implements Serializable{     
    @PersistenceUnit(name="manager")
    private EntityManagerFactory emf;
    
    public List populateList(String name){
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select * from imenik").getResultList();
        }
        finally{
            em.close();
        }
    }
}

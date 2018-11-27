/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import JSP.FindUser;

/**
 *
 * @author Ziga
 */

@Named(value = "EntityImenik")
@SessionScoped

public class EntityImenik implements Serializable {
    @EJB
    private FindUser finduser;
    
    String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Integer number;
    
    public EntityImenik() {
        this.name = "%";
    }
    
    public List getUserList(){
        return finduser.populateList(this.name);
    }
}

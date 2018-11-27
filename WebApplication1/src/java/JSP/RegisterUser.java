/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP;

import java.beans.Statement;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.*;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ziga
 */
@Named(value = "RegisterUser")
@SessionScoped
public class RegisterUser implements Serializable {

    /**
     * Creates a new instance of registerUser
     */
    String name;
    Integer number;
    String email;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterUser() {
        name = "";
        email = "";
        number = 0;
        password = "";
    }

    public String register() {
        //https://alvinalexander.com/java/edu/pj/jdbc/jdbc0003
        try {
            String url = "jdbc:mysql://localhost:3306/vajasluzba";
            String sql = "INSERT INTO user(name, number, email, password) VALUES (?,?,?,?)";
            Connection myConn = DriverManager.getConnection(url, "root", "");
            PreparedStatement stat = myConn.prepareStatement(sql);
            stat.setString(1, this.name);
            stat.setInt(2, this.number);
            stat.setString(3, this.email);
            stat.setString(4, this.password);
            
            stat.executeUpdate();
            myConn.close();
            
            return "responseRegistration/name=" + this.name;

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return "";
    }
}

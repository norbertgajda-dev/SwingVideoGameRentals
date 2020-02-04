package model;

import java.io.Serializable;

/**
 *
 * @author GAJDA NORBERT
 */
public class Employee implements Serializable{
    
    private int id;
    private String name;
    private String userName;
    private String password;

    public Employee() {
    }
    
   
    public Employee(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }
    

    public Employee(int id, String name, String userName, String password) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " -  Username: " + userName;
    }

    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
}

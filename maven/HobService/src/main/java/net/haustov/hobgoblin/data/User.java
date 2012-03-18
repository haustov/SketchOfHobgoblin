package net.haustov.hobgoblin.data;
// Generated Mar 15, 2012 12:36:19 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer iduser;
     private String login;
     private String passwordHash;
     private String firstName;
     private String lastName;
     private Set orders = new HashSet(0);
     private Set stores = new HashSet(0);
     private Set purchases = new HashSet(0);

    public User() {
    }

	
    public User(String login) {
        this.login = login;
    }
    public User(String login, String passwordHash, String firstName, String lastName, Set orders, Set stores, Set purchases) {
       this.login = login;
       this.passwordHash = passwordHash;
       this.firstName = firstName;
       this.lastName = lastName;
       this.orders = orders;
       this.stores = stores;
       this.purchases = purchases;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPasswordHash() {
        return this.passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }
    public Set getStores() {
        return this.stores;
    }
    
    public void setStores(Set stores) {
        this.stores = stores;
    }
    public Set getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set purchases) {
        this.purchases = purchases;
    }




}


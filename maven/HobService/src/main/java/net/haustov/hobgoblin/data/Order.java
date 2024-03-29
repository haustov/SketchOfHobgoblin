package net.haustov.hobgoblin.data;
// Generated Mar 15, 2012 12:36:19 AM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Order generated by hbm2java
 */
public class Order  implements java.io.Serializable {


     private Integer idorder;
     private Product product;
     private User user;
     private BigDecimal amount;
     private Date date;
     private Set purchases = new HashSet(0);

    public Order() {
    }

	
    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }
    public Order(Product product, User user, BigDecimal amount, Date date, Set purchases) {
       this.product = product;
       this.user = user;
       this.amount = amount;
       this.date = date;
       this.purchases = purchases;
    }
   
    public Integer getIdorder() {
        return this.idorder;
    }
    
    public void setIdorder(Integer idorder) {
        this.idorder = idorder;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Set getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set purchases) {
        this.purchases = purchases;
    }




}



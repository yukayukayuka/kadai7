package servlet;

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private int payment;
     
    @Persistent
    private String comment;
    
    @Persistent
    private String shuushi;

    public LinkData(int payment, String comment,String shuushi) {
        super();
        this.payment = payment;
        this.comment = comment;
        this.shuushi=shuushi;
    }
 
    public Long getId() {return id;} 
    public void setId(Long id) {this.id = id;}
 
    public int getPayment() {return payment;}
    public void setPayment(int payment) {this.payment = payment;}

    public String getShuushi() {return shuushi;}
    public void setShuushi(String shuushi) {this.shuushi = shuushi;}
 
    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}
 
}
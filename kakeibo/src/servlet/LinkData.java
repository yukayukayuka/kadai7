package servlet;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String shuushi;
    
    @Persistent
    private int payment;
     
    @Persistent
    private String comment;
    


    public LinkData(String shuushi,int payment, String comment) {
        super();
        this.shuushi=shuushi;
        this.payment = payment;
        this.comment = comment;
    }
 
    public Long getId() {return id;} 
    public void setId(Long id) {this.id = id;}
    
    public String getShuushi() {return shuushi;}
    public void setShuushi(String shuushi) {this.shuushi = shuushi;}
 
    public int getPayment() {return payment;}
    public void setPayment(int payment) {this.payment = payment;}
 
    public String getComment() {return comment;}
    public void setComment(String comment) {this.comment = comment;}
 
}
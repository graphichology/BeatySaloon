import java.util.Date;
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(Customer name , Date date){ /*Stirng name*/
        customer=name;
        this.date=date;
    }
    public Visit(Customer name ){ 
        customer=name;
    }
    public String getName(){
        return customer.getName();
    }
    public double getServiceExpense(){
        return serviceExpense;
    }
    public void setServiceExpense(double ex){
        serviceExpense=ex;
    }
    public double getProductExpense(){
        return productExpense;
    }
    public void setProductExpense(double ex){
        productExpense=ex;
    }

    public double getTotalExpense() {
        return  (serviceExpense)*(1- DiscountRate.getServiceDiscountRate(customer.getMemberType()))+
                (productExpense)*(1- DiscountRate.getProductDiscountRate(customer.getMemberType()));
    } 

}

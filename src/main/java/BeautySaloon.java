import java.util.Scanner;
import java.util.Date;
public class BeautySaloon {
    public static void main(String[] args) {
        System.out.println("Please enter customer's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();    
        Customer c=new Customer(name);
        System.out.println("Set a membership type: ");  
        c.setMemberType(scanner.nextLine()); //the member type is case senstive
        if(c.getMemberType()=="Premium"||c.getMemberType()=="Gold"||c.getMemberType()=="Silver")c.setMember(true);
        else c.setMember(false);
        Visit v=new Visit(c);
        System.out.println("Set Services Expense: ");  
        v.setServiceExpense(Double.parseDouble(scanner.nextLine()));
        System.out.println("Set Products Expense: ");  
        v.setProductExpense(Double.parseDouble(scanner.nextLine()));
        System.out.print("customer name is : "+c.getName()+", is member : "+c.isMember()+", ");
        if(c.isMember())System.out.print("member type is : "+c.getMemberType()+", ");
        System.out.print("service expense : "+v.getServiceExpense()+",product expense : "+v.getProductExpense()+",total expense : "+v.getTotalExpense());
    }
    
}

import java.util.*;
public class A1Q18 {
    
    public static void main(String[] args) {
        System.out.println("enter your age.");
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch(age){
            case 18:
               System.out.println("Now you are going become adult.");
               break;
            case 23:
               System.out.println("you get a job");
               break;
            case 60:
               System.out.println("you are now retired");
               break;
            default:
               System.out.println("enjoy your life");
        }
            
            
        
                
        
    
        
    }
    
}

import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		
		   
		        Scanner sc = new Scanner(System.in);
		        int sum = 0;
		        int n = 0;

		        System.out.println("Enter a number:");
		       // n = sc.nextInt(); // Read the first number before entering the loop

		        while (n >= 0) {
		            sum += n;
		            System.out.println("Enter another number (negative to stop):");
		            n = sc.nextInt();
		        }

		        System.out.println("Sum = " + sum);
		    }
			
			
			
			  
			  

	}



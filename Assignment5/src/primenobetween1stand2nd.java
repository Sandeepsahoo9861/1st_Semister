import java.util.Scanner;
public class primenobetween1stand2nd {

	public static void main(String[] args) {
		int i,j; 
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter first and sec number");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		
		for ( i=(number1 +1); i< number2;i++) {
			
			
		

			for ( j=2;j< i;j++) {  
				if(i % j==0 ) 
					break;
			  		
				
			}
			if(i==j)
				System.out.println(j);
		}
		  
	
	
	   }

}



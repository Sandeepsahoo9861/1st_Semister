import java.util.Scanner;
public class TwistedprimeQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to cheack twisted prime or not");
		int n=sc.nextInt();
		int rem,rev=0,c=0,d=0;
		for(int i=2;i<n;i++) {
			if(n%i ==0) {
			c=c+1;
			}	
		}
		if (c==0) {
			System.out.println("the original n0 number is prime number");
		}
		else
		{System.out.println("the original not is not prime");}
		while(n !=0) {
			rem=n%10;
			rev=rev*10 +rem;
			n=n/10;
			
			}
		{System.out.println("reverse no is " + rev);}
		
		for (int j=2;j<rev;j++) {
			if(rev%j==0) {
				d=d+1;
				
			}
		}
			if (d==0) {
				System.out.println("reverse no is prime");
				System.out.println("entire number is twisted prime");
			}
				
			else {
				System.out.println("the enire no is not twisted prime");
			}
		
			
	 }	
		
	}			
					
					
				 
				
			
		
			
		

	



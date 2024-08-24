import java.util.Scanner;
public class Twistedprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to check twisted prime");
		int n=sc.nextInt();
		int rev=1,rem;
		int temp=0;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10 + rem;
			n=n/10;}
			for ( int i=2;i< rev;i++) {
				if (rev%i==0)
					temp=temp +1;
			}
				
			
		if (temp==0) {
			System.out.println("twisted prime");
		}
		else {
			System.out.println("not a twisted prime");
		}

	}
	}

import java.util.Scanner;
public class spyno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nuber to check spy or not");
		int n=sc.nextInt();
		int a, sum =0,prod=1;
		while(n!=0) {
		   a=n%10;
		   sum=sum+a;
		   prod=prod*a;
		   n=n/10;}
		if(sum==prod) {
			System.out.println("The no is spy");}
		else
			System.out.println("not spy");
		
		
		

	}

}

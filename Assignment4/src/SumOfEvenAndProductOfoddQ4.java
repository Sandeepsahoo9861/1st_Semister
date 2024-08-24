import java.util.Scanner;
public class SumOfEvenAndProductOfoddQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0,k=1,prod=1;
		for (int i=1 ; i<=n;i++) {
			if( i%2==0) {
				sum=sum+i;
				
			}
			else
				prod=prod*i;
				
		}
		System.out.println("sum of even no" + "=" + sum);
		System.out.println("prod of odd no" + "="+ prod);
		

	 }

}

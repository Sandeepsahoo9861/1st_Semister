import java.util.Scanner;
public class taylorseriescosxQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x in degree");
		double degree =sc.nextDouble();
		double x=(double)Math.toRadians(degree);
		double i=1;
		double den=1;
		double sum=0;
		double num=1;
		double term=1;
		while(Math.abs(term)> 0.000001) {
			sum= sum +term;
	 		num=-num*x*x;
			den=den*(i)*(i+1);
			term=num/den;
			i=(i +2);
			
		}
		
		
		System.out.println("cos(" +degree +") is approxmately :" + sum);		
		
		
		 

	}

}
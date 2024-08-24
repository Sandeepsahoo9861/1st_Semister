import java.util.Scanner;
public class NrandomDowhileLoop {

	public static void main(String[] args) {
		int rand;
		int j=0;
		double store=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		double a=sc.nextDouble();
		do {
		rand=(int)(Math.random()*a)+1;
		j=j+1;
		System.out.print(rand +" ");
		store=store+rand;
		
		
		}while(j<a);
			
			
		
		System.out.println("average value"+ store/a);
	}
	

}

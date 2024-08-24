 import java.util.Scanner;
public class pentagonalNumberQ2 {
	public static int getpentagonal( int n) {
		return n*(3*n-1)/2;
		
	}
	public static void main(String[] args) {
	 System.out.println("enter the number");
     Scanner sc=new Scanner(System.in);
     int no=sc.nextInt();
     
	 
		int pentagonal=getpentagonal(no);
		System.out.println("required pentagonal no is" + pentagonal);
		
	 

	}

}

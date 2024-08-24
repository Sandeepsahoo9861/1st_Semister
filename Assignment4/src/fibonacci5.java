import java.util.Scanner;

public class fibonacci5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int c;
		
		
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
		System.out.print(a);
		c=a+b;
		a=b;
		b=c;}
	}

}

import java.util.Scanner;
public class A1Q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b && b<c) {
			System.out.println("it is in ascending order");
		}else if (a>b && b>c) {
			System.out.println("it is in descending  order");
		}else {
			System.out.println("not valid");
		}
			
		
		

	}

}

import java.util.Scanner;
public class sumof10intigerfromuser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 integers");
		int sum=0;
		int c=1;
		while(c<=10){
		System.out.println("enter the number"+c );
		
		int n=sc.nextInt();
		sum=sum +n;
		c=c+1;}
		System.out.println("sum is "+""+sum);
		System.out.println("average value is" +( sum/10));
		
				

	}

}

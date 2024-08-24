import java.util.Scanner;
public class userentervaluestopinnegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=0;
		
		System.out.println("enter the number");
		
		while(n>=0){
			System.out.println("enter  no(stop in negative)");
			sum =sum +n;
		n=sc.nextInt();
		
			
		}
		System.out.println(sum);
		
		
		
		

	}

}

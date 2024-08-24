import java.util.Scanner;
public class AmicablenumberQ1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sumN=0;
		int sumM=0;
		for(int i=1;i<n;i++) {
			if (n % i==0)
				sumN=sumN+i;
		}
		for (int i=1;i<m;i++) {
			if (m % i==0)
				sumM=sumM +i;
		}
	if((sumM==n) && (sumN==m))
		System.out.println("Amicable number");
	else
		System.out.println("not an Amicable number");
		
	
			// TODO Auto-generated method stub

		}

}

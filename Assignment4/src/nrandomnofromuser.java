import java.util.Scanner;
 public class nrandomnofromuser{
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int randomno,sum=0;
	for(int i=1;i<=n;i++) {
		randomno=(int)(Math.random()*n)+1;
		System.out.println( i + "random no" + randomno);
	    sum=sum+randomno;
	
		
	}
	 double average=(double)sum/n;
      System.out.println("average random value" + average);
	}

}


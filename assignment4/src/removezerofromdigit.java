import java.util.Scanner;
public class removezerofromdigit {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to remove it's digit");
		int n=sc.nextInt();
		int no=0;
		int rem;
		int i=1;   
		while (n!=0) {
			rem=n%10;
			if(rem!=0) {
				no= no +i*rem ;
			    i=i*10;}
			
				n=n/10;
			
			
			
		}
		System.out.println(no);

	}
 
}

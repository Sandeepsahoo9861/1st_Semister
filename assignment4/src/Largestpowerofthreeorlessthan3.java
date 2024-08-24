import java.util.Scanner;
public class Largestpowerofthreeorlessthan3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int pow=1;
	    while(pow *3 <=n) {
	    	pow=pow*3;
	    }
	    System.out.println(pow);
	    
	    

	}  
	

}

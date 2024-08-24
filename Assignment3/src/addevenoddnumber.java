import java.util.Scanner;
public class addevenoddnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int sumeven=0;
		int sumodd=0;
			int n=sc.nextInt();
			System.out.println("enter"+n+"number");
			for( int i = 1;i<n;i++);{
		     
			int num=sc.nextInt();
			if(num %2==0) { 
				System.out.println("even");
				sumeven=sumeven+num;}
			else { 
				
				System.out.println("odd");
				sumodd=sumodd +num;}}
	
			System.out.println("sum of even no" +sumeven);
			System.out.println("sum of odd no" +sumodd); 
	}

			
					
					
					
		

	}

}

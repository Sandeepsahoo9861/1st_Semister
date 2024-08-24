import java.util.*;
public class primeNoBetweenTwoNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr 1st");
		int a=sc.nextInt();
		System.out.println("Enetr 2nd");
		int b=sc.nextInt();
		
		for(int i=a+1; i<b; i++) 
		{
			int count=0;
			for(int j=2; j<i/2; j++) 
			{
				if(i%j==0) 
				{
					count++;
				}
				
			}
			if(count==0)
			{
				System.out.println(i);
				
			}
			
					
		}
		

	}

}

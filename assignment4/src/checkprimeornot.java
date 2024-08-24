import java.util.Scanner;
public class checkprimeornot 
{

	public static void main(String[] args)
	{
		int count=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a no to check prime or composite");
		int n=Sc.nextInt();
		
	    for(int i=2;i<n;i++) 
	    {
	    	if(n%i==0)
	    	{ 
	    		
	    		 count=count+1; 
	    	}
	    
	    	
	    }
	    if (count ==0) {
	    	System.out.println("prime");
	    }
	    else
	    	System.out.println("composite");
	    

	
	
	}
}

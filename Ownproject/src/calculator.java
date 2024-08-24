import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x and y");
		int x= sc.nextInt();
		int y= sc.nextInt();
   System.out.println("1 for Add,2 for sub,3 mul,4 div");
   int num= sc.nextInt();
   double sum,sub;
   double mul;
   switch(num) {
   case 1:
	    sum=x+y;
	    System.out.println(sum);
	   break;
   case 2:
	    sub=x-y;
	    System.out.println(sub);
	   break;
   case 3:
	    mul=x*y;
	    System.out.println(mul);
	   break;
  case 4:
	    mul=x/y;
	    System.out.println(mul);
	   break;
	   
   }
		
	}

}

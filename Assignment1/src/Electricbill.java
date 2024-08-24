import java.util.Scanner;
public class Electricbill {

	public static void main(String[] args) {
		System.out.println("enter the unit");
		Scanner sc=new Scanner(System.in);
		float unit=sc.nextFloat();
		if(unit<=50)
			System.out.println("bill is" + unit*3);
		else if(unit>50 && unit<=200)
			System.out.println("bill is" +(50*3) + (unit-50)*4.8);
		else if(unit>200 && unit<= 400)
			System.out.println("bill is" +(50*3) + 4.8*150 + (unit-200)*5.80);
		else
			System.out.println("bill is" +50*3 + 4.8*150 + 200*5.80+ (unit-400)* 6.20);
			
			 
		
		// TODO Auto-generated method stub

	}

}
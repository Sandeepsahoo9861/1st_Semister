//Write a java program to convert days into years, months 2 and days. Assume month to be 30 days.
import java.util.Scanner;
public class DayToYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of days");
		int days=sc.nextInt();
		int year=days/360;
		int remaingdays=days%360;
		int months=remaingdays/30;
		 int remaningdays=remaingdays%30;
		 int noOfdays=remaingdays;
		
	
	
	System.out.println("year="+year+" "+"months="+months+" "+"no of days="+noOfdays);
	}

}
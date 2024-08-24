//Write a java program that prompts the user to enter an integer for today's day of the week (Sunday is 0, Monday is 1... and 
//Saturday is 6). Also prompt the user to enter the number of 
//days after today for a future day and display the future day of 
//the week.
import java.util.Scanner;
public class SwitchcasequestionOfDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("SUNDAY:0,MONDAY:1,TUESDAY:2,WEDNESDAY:3,THURSDAY:4,FRIDAY:5,SATURDAY;6");
		System.out.println("enter the today's date");
		int todaydate=sc.nextInt();
		System.out.println("enter the number of days  for future ");
		int futerday=sc.nextInt();
		int store=((todaydate + futerday)%7);
		String a="";
		String b="";
		switch(todaydate){
			case 0:
			a="Sunday";
			break;
			case 1:
			a="Monday";
			break;
			case 2:
			a="Tuesday";
			case 3:
			a="Wednesday";
			break;
			case 4:
			a="Thursday";
			break;
			case 5:
			a="Friday";
			break;
			case 6:
			a="Saturday";
			
			
		}
		System.out.println("Today is " +a);
		
		switch(store){
		case 0:
		b="Sunday";
		break;
		case 1:
		b="Monday";
		break;
		case 2:
		b="Tuesday";
		case 3:
		b="Wednesday";
		break;
		case 4:
		b="Thursday";
		break;
		case 5:
		b="Friday";
		break;
		case 6:
		b="Saturday";
		
		
		}
		System.out.println("future day is" +b);
		
		
		

	}

}
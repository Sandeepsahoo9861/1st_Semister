//Tom is running after jerry. Jerry is running at a speed of X
//meter per second while Tom is chasing him at a speed of Y
//meter per second. Determine whether Tom will able to catch
//Jerry. Note that initially Jerry is not at the same position as
//TOM. Write a Java program for the given problem.
//Constraint 1<=(X,Y)<=100
//E.g: Jerry speed=4, Tom speed=1, so can't catch
//Jerry speed=3, Tom speed=5, so can catch 
import java.util.Scanner;

public class TomAndJerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the speed between 1and 100 (1 and 100 are included)");
		System.out.println("enter the jerry speed");
		int speed1=sc.nextInt();
		System.out.println("enter the tom speed");
		int speed2=sc.nextInt();
			if ((1<=speed1&&speed1<=100 )&&(1<=speed2&&speed2<=100)) {
				
			if (speed1>speed2) {
			
			System.out.println(" Can't catch");
			
		}
		    else {
			System.out.println("can catch");
		}
			}
		
		else {
			System.out.println("invalid output");
		}

		}

}

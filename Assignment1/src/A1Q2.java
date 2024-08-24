import java.util.Scanner;

public class A1Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter degree in fahrenheit");
		double F = sc.nextDouble();
		double c = (5.0 / 9) * (F - 32);
		System.out.println(F + "fahrenheit is  " + c + "celcius");
	}
}

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        int store = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();
        System.out.print("enter the third number:");
        int c = sc.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i =i+ c) {
                store = store + i;
            }
            System.out.println("The sum of numbers displayed is " + store);
        } else {
            System.out.println("Invalid input: The first number should be less than or equal to the second number.");
        }
    }
}
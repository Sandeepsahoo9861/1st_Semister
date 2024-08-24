import java.util.Scanner;

public class fibonacciseries2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for the Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
 
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
        	int sum = a + b;
            System.out.print(a + ";" );
           // int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
import java.util.Scanner;

public class ofindfactorialDiffOfTwoN
{
    public static void main(String args[]) {
        int fact ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();

        if (m < n && m > 0 && n > 0) {
            for (int i = m; i <= n; i++) {
                 fact= 1;
                for (int j = 1; j <= i; j++) 
                    fact = fact *j;{
                System.out.println("Factorial of " + i + " = " + fact);} 
            }
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
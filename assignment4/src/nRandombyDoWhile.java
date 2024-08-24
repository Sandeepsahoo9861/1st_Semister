import java.util.Scanner;

public class nRandombyDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;

        do {
            int randomNumber = (int) (Math.random() * n) + 1;
            System.out.println("Random Number: " + randomNumber);
            sum += randomNumber;
            count=count+1;
        } while (count < n);

        double average = (double) sum / n;
        System.out.println("Average of " + n + " random numbers: " + average);

        scanner.close();
    }
}
import java.util.Scanner;

public class EvenOddSumCalculato{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even.");
                sumEven += num;
            } else {
                System.out.println(num + " is odd.");
                sumOdd += num;
            }
        }

        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

        scanner.close();
    }
}
import java.util.Scanner;

public class Largestpower3lessthann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc .nextInt();

        int powerOfThree = 1;
        while (powerOfThree *3 <= number) {
            powerOfThree = powerOfThree *3;
        }

        System.out.println("The largest power of 3 less than or equal to " + number + " is " + powerOfThree);
    }
}
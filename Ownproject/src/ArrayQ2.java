import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] occurrences = new int[100]; // Array to store occurrences, index 0 is not used

        System.out.print("Enter the integers between 1 and 100: ");
        int num;
        while ((num = scanner.nextInt()) != 0) {
            if (num >= 1 && num <= 100) {
                occurrences[num]++;
            } else {
                System.out.println("Please enter a number between 1 and 100.");
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " occurs " + occurrences[i] + (occurrences[i] > 1 ? " times" : " time"));
            }//?(ternary operator)
        }

        scanner.close();
    }
}
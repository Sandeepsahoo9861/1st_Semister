import java.util.Scanner;

public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input 10 integers into an array
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input the number to be searched
        System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

        // Check if the number is present and display the count
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Number " + searchNumber + " is present in the array, and it appears " + count + " times.");
        } else {
            System.out.println("Number " + searchNumber + " is not present in the array.");
        }
        
        scanner.close();
    }
}
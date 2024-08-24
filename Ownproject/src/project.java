import java.util.Scanner;

public class project {

    public static void rotateRightBy2Bits(int s[]) {
        int n = s.length - 1;
        int arr[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0)
                arr[i] = s[i] >>> 2 | s[n] << 30;
            else
                arr[i] = s[i] >>> 2 | s[i - 1] << 30;
        }

        System.out.println("Original array:");
        printIntArray(s);
        printBinaryStringArray(s);

        System.out.println("After rotation array:");
        printIntArray(arr);
        printBinaryStringArray(arr);
    }

    public static void printIntArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printBinaryStringArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Integer.toBinaryString(arr[i]) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter four integers separated by spaces:");
        int[] inputArray = new int[4];

        for (int i = 0; i < 4; i++) {
            inputArray[i] = scan.nextInt();
        }

        rotateRightBy2Bits(inputArray);
    }
}
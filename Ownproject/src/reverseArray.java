import java.util.Scanner;

public class reverseArray {

    public static void reverse(int a[]) {
        int r[] = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            r[i] = a[j];
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(arr);
    }
}
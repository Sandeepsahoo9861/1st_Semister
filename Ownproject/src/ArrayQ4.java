import java.util.Arrays;

public class ArrayQ4{
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};
        int secondLargest = findSecondLargest(array);

        System.out.println("Second Largest Element: " + secondLargest);
    }

    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // or handle accordingly
        }

        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
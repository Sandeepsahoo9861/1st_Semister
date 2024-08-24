//Write a method to find the element present in the Array using Linear Search. The method 
//header is given below
//Enter ten numbers: 9 5 7 2 6
//Enter the item to search: 7
// The element is present in the array at position: 3
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		        int[] numbers = new int[5];
		        
		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = scanner.nextInt();
		        }
		        
		        System.out.println("Enter item to search:");
		        int searchItem = scanner.nextInt();
		        
		        if (isElementPresent(numbers, searchItem)) {
		            System.out.println("Element found in the array");
		        } else {
		            System.out.println("Element not found in the array");
		        }
		    }
		    
		    public static boolean isElementPresent(int[] arr, int item) {
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == item) {
		                return true;
		            }
		        }
		        return false;
	}

}

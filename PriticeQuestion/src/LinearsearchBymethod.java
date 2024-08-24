//Write a java method to search an element present in the array 
//using linear search. The method signature is as follows. 


import java.util.Scanner;

public class LinearsearchBymethod {

    public static void main(String[] args) {
        boolean k;
        
        int search;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int a = sc.nextInt();
        int[] arr = new int[a];
       
        System.out.println("Enter the elements");
        
        
        
        
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        search = sc.nextInt();
        
        
        
        for (int j = 0; j < arr.length; j++) {

        k = linearSearch(arr[j], search);
        
        if (k) {
            System.out.println("Element found at index " +j );
            return;
    }}//this bracket  helps the curser to not go to downstatement as
      //bracket is used inside the for loop even if k return false 
       // as this stament  System.out.println("Element found at index " +j ); return
        // present inside for loop if k has false value  then j will increase to 
        //1 start cheking once checking completed and alement not found it goes to
        // second statement (System.out.println("Element is not found")
            System.out.println("Element is not found");
            
        
    }
    public static  boolean  linearSearch(int c, int z) {
        
            if (c == z) {
                return  true;
            }
        
        return false;
    }
}
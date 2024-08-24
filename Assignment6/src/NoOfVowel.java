import java.util.Scanner;

public class NoOfVowel {
    public static int countVowel(String c) {
        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 'a' || c.charAt(i) == 'e' || c.charAt(i) == 'o' || c.charAt(i) == 'i' || c.charAt(i) == 'u' || c.charAt(i) == 'A' || c.charAt(i) == 'I' || c.charAt(i) == 'O' || c.charAt(i) == 'E' || c.charAt(i) == 'U') {
                count = count + 1;
            }
        } 
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        int b = countVowel(a);
        System.out.println("The number of vowels in the string is " + b);
    }
}
import java.util.Scanner;

public class NoOfVowel2 {
    public static int countVowel(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        int result = countVowel(input);
        System.out.println("The number of vowels in the string is " + result);
    }
}
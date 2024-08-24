import java.util.Scanner;

public class PalindromeStringQ8 {
    public static String stringreverse(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        return str;
    }

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string");
        String S = ob.nextLine();
        String r = stringreverse(S);
        
        if (S.equalsIgnoreCase(r)) { 
            System.out.println(S + " is a palindrome. Reverse: " + r);
        } else {
            System.out.println(S + " is not a palindrome. Reverse: " + r);
        }
    }
}
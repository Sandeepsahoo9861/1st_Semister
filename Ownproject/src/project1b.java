import java.util.Scanner;

public class project1b {

    public static String convertToAnyBase(int n, int b) {
        String op = "";
        char temp2;

        while (n > 0) {
            int temp = n % b;
            if (temp > 9) {
                temp2 = (char) (temp + 55);
                op = temp2 + op;
            } else {
                op = temp + op;
            }
            n = n / b;
        }

        return op;
    }

    public static void main(String[] args) {
        System.out.println("Enter the decimal number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the base value: ");
        int base = sc.nextInt();

        String result = convertToAnyBase(n, base);
        System.out.println("Result: " + result);
    }
}
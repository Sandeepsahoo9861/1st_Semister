import java.util.Scanner;

public class A1PROJECT {

    public static String convertToAnyBase(int n, int b) {
        String op = "";
        char temp2;

        while (n != 0) {
            int temp = n % b;

            if (temp > 9) {
                temp2 = (char) (temp + 55);
            } else {
                temp2 = (char) (temp + 48);
            }

            op = temp2 + op;
            n = n / b;
        }

        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Enter base: ");
        int b = sc.nextInt();

        System.out.println(convertToAnyBase(n, b));
    }
}
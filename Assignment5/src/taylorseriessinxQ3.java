import java.util.Scanner;

public class taylorseriessinxQ3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x in degrees: ");
        float degree = sc.nextFloat();
        float x = (float) Math.toRadians(degree);
        int i = 1;
        float sum = 0;
        float term = x;
        float num = x;
        float den = 1;

        while (Math.abs(term) > 0.000001) {
            sum = sum +term;
            num = -num * x * x;
            den = den * (i + 1) * (i + 2);
            term = num / den;
            i += 2;
        }

        System.out.println("Sin(" + degree + ") is approximately: " + sum);
    } 
}

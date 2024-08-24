import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        double km = scanner.nextDouble();

        double meters = km * 1000;
        double feet = km * 3280.8399;
        double inches = km * 39370.0787;
        double centimeters = km * 10000 ;

        System.out.println(km + " km is " +  meters + " meters");
        System.out.println(km + " km is " + (int)feet + " feet");
        System.out.println(km + " km is " + inches + " inches");
        System.out.println(km + " km is " +  centimeters + " centimeters");

        scanner.close();
    }
}
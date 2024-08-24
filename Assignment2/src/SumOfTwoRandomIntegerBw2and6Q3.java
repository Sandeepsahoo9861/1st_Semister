public class SumOfTwoRandomIntegerBw2and6Q3 {

    public static void main(String[] args) {
        int MinR = Integer.parseInt(args[0]);
        int MaxR = Integer.parseInt(args[1]);
        
        int firstNumber = (int) (Math.random() * (MaxR - MinR + 1) + MinR);
        int secondNumber = (int) (Math.random() * (MaxR - MinR + 1) + MinR);
        
        int sum = firstNumber + secondNumber;
        System.out.println( "first number is" +firstNumber);
        System.out.println("second number is" + secondNumber);
        
        System.out.println("Sum of two random integers between " + MinR + " and " + MaxR + " is " + sum);
    }
}
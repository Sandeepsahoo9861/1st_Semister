import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {
        // Computer generates a random number between 1 and 9
        int computerNumber = (int) (Math.random() * 9) + 1;
        

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9 inclusive: ");
        
        int userGuess = scanner.nextInt();
        if (userGuess <=9) { 
        	System.out.println("user guess is" + userGuess + "and computerguess is" + computerNumber);

        // Check the user's guess
        if (userGuess == computerNumber) {
       
            System.out.println("You got it right!");
        } else if (userGuess == computerNumber + 1 || userGuess == computerNumber - 1) {
            System.out.println("Almost got it!");
        } else {
            System.out.println("You got it wrong.");
        }
        
        }
        else
        	System.out.println("invalid input");
        
        
    }
}
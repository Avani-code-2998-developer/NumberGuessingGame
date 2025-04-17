import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int guess;
            boolean guessedCorrectly = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a number between 1 and 100. Try to guess it.");
            
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                try {
                    guess = scanner.nextInt();
                    attempts++;
                    
                    if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        guessedCorrectly = true;
                        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input from the scanner
                }
                
            }
        }
    }
}
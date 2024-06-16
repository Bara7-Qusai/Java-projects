import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        int guess;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Loop to continue guessing until the user finds the correct number
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("The number is higher than " + guess);
            } else if (guess > numberToGuess) {
                System.out.println("The number is lower than " + guess);
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}

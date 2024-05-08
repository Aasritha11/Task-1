import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Initialize game variables
        int maxAttempts = 6; // limit the number of attempts
        int maxRounds = 3; // limit the number of rounds
        int score = 0; // initialize score

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Play multiple rounds
        for (int round = 1; round <= maxRounds; round++) {
            // Generate a random number between 1 and 100
            int randomNumber = new Random().nextInt(100) + 1;

            // Initialize attempt counter
            int attempts = 0;

            // Play a single round
            while (attempts < maxAttempts) {
                // Prompt the user to enter their guess
                System.out.print("Round " + round + ": Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                // Compare the user's guess with the generated number
                if (userGuess == randomNumber) {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    score++; // increment score for correct guess
                    break; // exit the round
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++; // increment attempt counter
            }

            // Display feedback for the round
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you didn't guess the correct number. The correct answer was " + randomNumber);
            }
        }

        // Display final score
        System.out.println("Your final score is " + score + " out of " + maxRounds);
    }
}
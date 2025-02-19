import java.util.*;

public class CodeSoftTask1 {
    private static final int MAX_ATTEMPTS = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNum = new Random();
        boolean playAgain = true;
        int totalRounds = 0;
        int totalWins = 0;
        int totalAttempts = 0;

        while (playAgain) {
            int numberToBeGuess = randomNum.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("The Number to be Guessed is between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");

            while (!guessed && attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                    System.out.println("Please enter a number within the range.");
                } else if (guess < numberToBeGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToBeGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you didn't guess the number. It was " + numberToBeGuess + ".");
            }

            totalRounds++;
            totalAttempts += attempts;

            if (guessed) {
                totalWins++;
            }

            System.out.println("Your current score:");
            System.out.println("Rounds played: " + totalRounds);
            System.out.println("Rounds won: " + totalWins);
            System.out.println("Total attempts: " + totalAttempts);
            System.out.println("Average attempts per round: " + (totalAttempts / (double) totalRounds));

            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            playAgain = response.equals("yes");
        }

        scanner.close();
    }
}
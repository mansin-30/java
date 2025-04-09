import java.util.Random; import java.util.Scanner;

public class NumberGuessingGame { public static void main(String[] args) { Scanner scanner = new Scanner(System.in); Random random = new Random(); int totalScore = 0; boolean playAgain;

System.out.println("Welcome to the Number Guessing Game!");
    
    do {
        int numberToGuess = random.nextInt(100) + 1; // Generate random number between 1 and 100
        int attempts = 5; // Limit the number of attempts
        boolean guessedCorrectly = false;

        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
        System.out.println("You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number.");
                guessedCorrectly = true;
                totalScore += attempts; // More attempts left means higher score
                break;
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }

            attempts--;
            System.out.println("Attempts remaining: " + attempts);
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You've run out of attempts. The correct number was " + numberToGuess + ".");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = scanner.next().equalsIgnoreCase("yes");
    } while (playAgain);

    System.out.println("Thanks for playing! Your total score is: " + totalScore);
    scanner.close();
}

}
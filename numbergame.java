import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int roundsPlayed = 0;
        int totalScore = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            int secretNumber = rand.nextInt(100) + 1;  // 1 to 100
            int maxAttempts = 7;
            int attemptsUsed = 0;
            boolean guessedCorrectly = false;

            System.out.println("\n🔢 Guess the number between 1 and 100. You have " + maxAttempts + " attempts!");

            while (attemptsUsed < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attemptsUsed++;

                if (guess == secretNumber) {
                    System.out.println("🎉 Correct! You guessed it in " + attemptsUsed + " attempts.");
                    totalScore += (maxAttempts - attemptsUsed + 1) * 10; // More points for fewer attempts
                    guessedCorrectly = true;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The correct number was: " + secretNumber);
            }

            roundsPlayed++;

            System.out.print("\nDo you want to play another round? (yes/no): ");
            sc.nextLine(); // clear buffer
            String response = sc.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n🏁 Game Over! You played " + roundsPlayed + " round(s).");
        System.out.println("💯 Total Score: " + totalScore);
        System.out.println("Thanks for playing!");

        sc.close();
    }
}



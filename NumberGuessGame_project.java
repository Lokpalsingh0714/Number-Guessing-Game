import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame_project {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;

        printTitle();

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            int randomNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
            int attempts = 0;

            System.out.println();
            System.out.println("=========== ROUND " + round + " ===========");
            System.out.printf("Guess the number between %d and %d\n", MIN_RANGE, MAX_RANGE);
            System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

            while (attempts < MAX_ATTEMPTS) {
                int guess = readGuess(scanner);
                attempts++;

                if (guess == randomNumber) {
                    int score = (MAX_ATTEMPTS - attempts) + 1; 
                    totalScore += score;

                    System.out.println("\n✅ HURRAY! You guessed it right.");
                    System.out.println("Attempts used : " + attempts);
                    System.out.println("Round score   : " + score);
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("The number is GREATER than " + guess);
                } else {
                    System.out.println("The number is LESS than " + guess);
                }

                System.out.println("Attempts left : " + (MAX_ATTEMPTS - attempts));
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\n❌ You are out of attempts in this round.");
                System.out.println("The correct number was : " + randomNumber);
            }

            System.out.println("------------------------------");
            System.out.println("Total score till now : " + totalScore);
        }

        System.out.println();
        System.out.println("============ GAME OVER ============");
        System.out.println("Your FINAL SCORE is : " + totalScore);
        System.out.println("Thanks for playing! ❤️");
        scanner.close();
    }

    private static void printTitle() {
        System.out.println("===================================");
        System.out.println("       NUMBER GUESSING GAME        ");
        System.out.println("===================================");
        System.out.println("Total Rounds          : " + MAX_ROUNDS);
        System.out.println("Attempts per Round    : " + MAX_ATTEMPTS);
        System.out.printf("Range of the Number   : %d to %d\n", MIN_RANGE, MAX_RANGE);
        System.out.println("-----------------------------------");
    }

    private static int readGuess(Scanner scanner) {
        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess >= MIN_RANGE && guess <= MAX_RANGE) {
                    return guess;
                } else {
                    System.out.printf("Please enter a number between %d and %d only.\n",
                            MIN_RANGE, MAX_RANGE);
                }
            } else {
                System.out.println("Invalid input! Please enter a NUMBER.");
                scanner.next(); 
            }
        }
    }
}




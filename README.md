Task-2-Number-Guessing-Game


This Java program implements a simple number guessing game where the player has to guess a random number generated within a specified range. The game consists of multiple rounds, and in each round, the player has a limited number of attempts to guess the correct number.

How to Play Setup

The game will generate a random number within a specified range (default: 1 to 100). You will have a limited number of attempts to guess the correct number (default: 10 attempts per round). The game consists of a total of 3 rounds. Playing a Round

In each round, you will be prompted to guess the number within the given range. Enter your guess and receive feedback on whether the actual number is greater or smaller than your guess. Try to guess the number within the given attempts for each round. Scoring

You earn points based on the number of attempts left after guessing the correct number. The score for each round is calculated as MAX_ATTEMPTS - attempts_taken. Total Score

Your total score is the sum of scores from all the rounds played. Game Over

After completing the specified number of rounds, the game ends, and your total score is displayed. Customize the Game You can customize the game by adjusting the following constants in the Task2 class:

MIN_RANGE: Minimum value for the random number generation. MAX_RANGE: Maximum value for the random number generation. MAX_ATTEMPTS: Maximum attempts allowed to guess the number in each round. MAX_ROUNDS: Total number of rounds in the game. Running the Program Compile the Java file (Task2.java). Run the compiled Java program. Contributing Feel free to contribute to this project by creating issues, suggesting improvements, or submitting pull requests. Your contributions are welcomed and appreciated!

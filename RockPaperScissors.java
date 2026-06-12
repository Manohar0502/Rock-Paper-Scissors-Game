
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
        // Array to store the choices matching index positions (0=Rock, 1=Paper, 2=Scissors)
        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Welcome to Rock, Paper, Scissors! ===");

        while (true) {
            // 1. Get User Choice
            System.out.println("\nEnter your move (Rock, Paper, Scissors). To exit, type Quit: ");
            String userInput = scanner.next().trim().toLowerCase();

            // Check for exit command
            if (userInput.startsWith("q")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            // Convert string input into a numeric choice
            int userChoice = -1;
            if (userInput.startsWith("ro")) userChoice = 0;      // Rock
            else if (userInput.startsWith("p")) userChoice = 1;  // Paper
            else if (userInput.startsWith("s")) userChoice = 2;  // Scissors

            // Validate user input
            if (userChoice == -1) {
                System.out.println("Invalid input! Please type Rock, Paper, or Scissors.");
                continue;
            }

            // 2. Generate Computer Choice
            // Generates a random number: 0, 1, or 2
            int computerChoice = random.nextInt(3); 

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // 3. Determine the Winner
            if (userChoice == computerChoice) {
                System.out.println(" It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) || // Rock beats Scissors
                       (userChoice == 1 && computerChoice == 0) || // Paper beats Rock
                       (userChoice == 2 && computerChoice == 1)) {  // Scissors beats Paper
                System.out.println(" You win!");
            } else {
                System.out.println(" Computer wins!");
            }
        }
        scanner.close();
    }
}
///Jada McDuffie
import java.util.Random;
import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] choices = {"rock", "paper", "scissors"};
		boolean playAgain;
		
		System.out.println("Welcome to Rock, Paper. Scissors!");
		
		
		// Loop for replaying game
		do {
			int playerScore = 0;
			int computerScore = 0;
		
		//Loop for 3 rounds
		for (int round = 1 ; round <=3 ; round++) {
				System.out.println("Round" + round);
		
				// Get player's choice
				System.out.println("Enter your choice (rock, paper, or scissor): ");
				String playerChoice = scanner.nextLine().toLowerCase();
				
				//Validate user input
				if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                    System.out.println("Invalid choice! Computer gets a point.");
                    	computerScore++;
                    	continue; //next round
		}
				//Computer's choice
				int computerIndex = random.nextInt(3);
                String computerChoice = choices[computerIndex];
                System.out.println("Computer chose: " + computerChoice);
                
                //Determine the winner of the round
                if (playerChoice.equals(computerChoice)) {
                	System.out.println("It's a draw! No points awarded.");
                } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                		 (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                         (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                  System.out.println("You win this round!");
                  playerScore++;
                } else {
                	System.out.println("Computer wins this round.");
                	computerScore++;
                }
                // Print the current score
                System.out.println("Current score - You: " + playerScore + " | Computer: " + computerScore);
                System.out.println();
			}
		// Declare overall winner or a tie
        if (playerScore > computerScore) {
            System.out.println("You are the overall winner!");
        } else if (computerScore > playerScore) {
            System.out.println("Computer is the overall winner!");
        } else {
            System.out.println("It's a tie!");
        }

        // Ask if the player wants to play again
        System.out.print("Do you want to play again? (yes or no): ");
        String replayChoice = scanner.nextLine().toLowerCase();
        playAgain = replayChoice.equals("yes");
      
		} while (playAgain);
		
		System.out.println("Thanks for playing!");
		scanner.close();
	}

}

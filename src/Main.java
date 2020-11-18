import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Welcome to the guessing game!");
		System.out.println("Guess a number between 1 and 100 and I will tell you if you are too high or too low!");
		boolean playGame = true;
		
		Generator generator = new Generator();
		Player player = new Player();
		
		while(playGame) {
			int randomNum = generator.generateRandomNumber();
			System.out.println(randomNum);
			boolean guessing = true;
			while(guessing) {
				int guess = player.makeGuess();
				if(guess > randomNum) {
					System.out.println("Sorry, " + guess + " is too high!");
				}else if(guess < randomNum) {
					System.out.println("Sorry, " + guess + " is too low!");
				}else {
					System.out.println("You got it!");
					guessing = false;
				}
			}
			System.out.println("Would you like to play again? y/n");
			String response = stdin.next();
			if(response.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing!");
				playGame = false;
			}
			
		}

	}

}

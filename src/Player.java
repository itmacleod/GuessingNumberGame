import java.util.Scanner;
public class Player {
	
	private int guess;
	
	public int makeGuess() {
		Scanner stdin = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 100 ");
		this.guess = stdin.nextInt();
		return this.guess;
	}

}

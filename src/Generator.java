import java.util.Random;
public class Generator {
	
	private Random random;
	
	public Generator() {
		random = new Random();
	}
	
	public int generateRandomNumber() {
		return random.nextInt(100) + 1;
	}
	

}

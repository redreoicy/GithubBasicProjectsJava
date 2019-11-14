import java.util.Scanner;
import java.util.Random;
public class Basics {

	public static void main(String[] args) {
		//Mini practice one by one 
		System.out.println("Hello, World!");

		
		
		//number guessing
		Scanner stdin = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("I'm thinking of an integer from 1-10000. Guess it!");
		
		int randomInt = rand.nextInt(9999) + 1;
		int guess = -1;
		while(guess!=randomInt) {
			guess = stdin.nextInt();
			if (guess > randomInt)
				System.out.println("Too High!");
			else if (guess < randomInt)
				System.out.println("Too Low!");
			else 
				System.out.println("Correct!");
		}
		stdin.close();
		
		
		
		
		
		//comment comment comment
		//more comment
		
		
		
	}
	
	

}

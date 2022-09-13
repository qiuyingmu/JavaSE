import java.util.*;

public class GuessTheNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to the number guessing game.\n" + 
				           "You have five chances,start your game.\n" +
				           "Please enter the number you want to guess(1~100):");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		int guessNumber = scanner.nextInt();
		
		if(guessNumber <= 0 || guessNumber >= 101) {
			System.out.println("Input data error!");
			scanner.close();
			return;
		}
		for(int i = 2; i <= 6; i++) {
			if(guessNumber == number) {
				System.out.println("You guessed it!This number is " + number + ".");
				break;
			}else if(guessNumber > number) {
				System.out.println("Your guess is too big.");
			}else {
				System.out.println("Your guess is too small.");
			}
			if(i == 6)
			{
				System.out.println("You've guessed five times. You've lost.");
			}
			else {
				System.out.println("Please guess again:");
				guessNumber = scanner.nextInt();
			}
		}
		scanner.close();
	}
	
}

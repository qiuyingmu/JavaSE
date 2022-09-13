import java.util.Scanner;

public class TheAverage {

	public static void main(String[] args) {
		double theAverage = 0, theNumber = 0, count = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			if(scanner.hasNextDouble()) {
				theNumber += scanner.nextDouble();
				count++;
				theAverage = theNumber / count;
				System.out.println("The current average is " + theAverage);
			}else {
				theAverage = theNumber / count;
				System.out.println("The current average is " + theAverage);
				break;
			}
		}
		scanner.close();
	}

}
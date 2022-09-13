import java.util.Scanner;

public class PersonalIncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("**********************************************\n" + 
							   "****         1.Start counting             ****\n" +
							   "****         2.Exit calculator            ****\n" + 
							   "**********************************************\n" +
					   		   "Welcome to the personal income tax calculator.\n" +
							   "Please enter your options(1 or 2):");
			int options = scanner.nextInt();
			if(options == 2) {
				System.out.println("Calculator exit succeeded.");
				break;
			}else if(options != 1) {
				System.out.println("Incorrect selection, please select again.");
			}else {
				System.out.println("Please enter the salary after deducting four gold coins:");
				double salary = scanner.nextDouble() - 5000;
				double tax = 0;
				if(salary < 0) {
					tax = 0;
				}else if(salary <= 3000) {
					tax = salary * 0.03;
				}else if(salary <= 12000) {
					tax = 90 + (salary - 3000) * 0.1;
				}else if(salary <= 25000) {
					tax = 90 + 900 + (salary - 12000) * 0.2;
				}else if(salary <= 35000) {
					tax = 90 + 900 + 2600 + (salary - 25000) * 0.25;
				}else if(salary <= 55000) {
					tax = 90 + 900 + 2600 + 2500 + (salary - 35000) * 0.30;
				}else if(salary <= 80000) {
					tax = 90 + 900 + 2600 + 2500 + 6000 + (salary - 55000) * 0.35;
				}else {
					tax = 90 + 900 + 2600 + 2500 + 6000 + 8750 + (salary - 80000) * 0.45;
				}
				System.out.println("You should pay " + tax + " yuan.");
			}
		}while(true);
		scanner.close();
	}
}

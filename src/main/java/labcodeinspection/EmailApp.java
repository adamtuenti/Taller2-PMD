package labcodeinspection;

import java.util.Scanner;

@SuppressWarnings("PMD.UseUtilityClass")
public class EmailApp { //NOPMD

	public static void main(String[] args) { //NOPMD 
		Scanner sc = new Scanner(System.in); //NOPMD 

		System.out.print("Enter your first name: "); //NOPMD 
		String firstName = sc.nextLine(); // NOPMD 

		System.out.print("Enter your last name: "); //NOPMD 
		String lastName = sc.nextLine(); //NOPMD 

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: "); //NOPMD 

		int depChoice = sc.nextInt(); //NOPMD 
		sc.close();

		Email email = new Email(firstName, lastName); //NOPMD
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
	
}

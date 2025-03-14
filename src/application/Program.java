package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Exceptions.DomainException;
import entities.Account;

public class Program {
	public static void main(String[] args) {

		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			Account account;
				
			// Digitalização dos dados ----------------------------
			
			try {
			System.out.print("Enter account number: ");
			int number = sc.nextInt();
			System.out.print("Enter account holder: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Is there na initial deposit (y/n)?");
			char resp = sc.next().charAt(0);
			if (resp == 'y') {
				System.out.print("Enter initial deposit value:");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, name, initialDeposit);
			} else {
				account = new Account(number, name);
			}
			
			

			// Operação  -----------------------------------
			System.out.println();
			System.out.println("Account data:");
			System.out.println(account);

			System.out.print("Enter a deposit value: ");
			account.deposit(sc.nextDouble());

			System.out.println();
			System.out.println("Update account data:");
			System.out.println(account);

			System.out.println("Enter a withdraw value: ");
			account.withdraw(sc.nextDouble());

			System.out.println();
			System.out.println("Update account data");
			System.out.println(account);
			sc.close();

		}

		catch (DomainException e) {
			System.out.println("Operation error: " + e.getMessage());
		}
		
		catch (InputMismatchException e) {
			   System.out.println("Scanning process failed: Check what is wrong and try again");
		}

		
	}

}

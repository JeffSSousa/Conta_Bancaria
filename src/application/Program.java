package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		Account account ;
		
		System.out.print("Is there na initial deposit (y/n)?");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		}
		else  {
			account = new Account(number, name);
		} 
		
		System.out.println(account);
		
		
		sc.close();
		
	}

}

package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine().toUpperCase();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.println(account);
			System.out.println();
			
			System.out.print("Enter the amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
			
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}

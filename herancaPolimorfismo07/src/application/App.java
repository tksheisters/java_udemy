package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Matheus", 1000.0, 0.1));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 2000.0));
		list.add(new SavingsAccount(1003, "Tania", 1000.0, 0.1));
		list.add(new BusinessAccount(1004, "André", 1000.0, 2000.0));
		
		double sum = 0.0;
		
		for (Account account : list) {
			sum += account.getBalance();
		}
		System.out.println("TOTAL: " + sum);
		
		for (Account account : list) {
			account.deposit(100.0);
			System.out.println(account.getNumber() + ", $" + account.getBalance());
		}
		
		
	}
}

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Matheus", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
	
		Account scc1 = new SavingsAccount(1002, "Tania", 1000.0, 0.1);
		scc1.withdraw(200.0);
		System.out.println(scc1.getBalance());
		
		Account bcc1 = new BusinessAccount(1003, "Joaquim", 1000.0, 2000.);
		bcc1.withdraw(200.0);
		System.out.println(bcc1.getBalance());
	}
}

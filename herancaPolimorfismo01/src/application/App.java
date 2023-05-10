package application;

import entities.BusinessAccount;

public class App {

	public static void main(String[] args) {
		BusinessAccount account = new BusinessAccount(3535, "matheus", 1200.50, 5000.00);
		account.loan(2000.00);
		System.out.println(account.getBalance());

	}

}

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Matheus", 50.00);
		BusinessAccount bcc = new BusinessAccount(1002, "Tania", 1500.00, 5000.00);
		SavingsAccount scc = new SavingsAccount(1003, "Ay", 2500.00, 0.20);
		
		//upcasting
		
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(	1008, "Pod", 0.0, 2000.00);
		Account acc3 = new SavingsAccount(1010, "Maria", 1000.0, 0.1);

		//downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // vai dar erro
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();;
			System.out.println(acc5.getBalance());
		}
	}

}

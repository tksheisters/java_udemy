package application;

import java.util.Scanner;

import services.PrintService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();

		System.out.print("How many values: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("#" + (i + 1) + ": ");
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();	
		System.out.println("First: " + ps.first());

		sc.close();
	}

}

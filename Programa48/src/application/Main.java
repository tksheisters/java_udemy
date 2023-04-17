package application;

import java.util.Scanner;

import entity.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dollar price today: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars you want: ");
		double dollarQuantity = sc.nextDouble();
		
		double totalWithIOF = CurrencyConverter.converter(dollarPrice, dollarQuantity);
		
		System.out.println();
		System.out.printf("Amount to be paid in R$: %.2f", totalWithIOF);
		
		sc.close();
	}

}

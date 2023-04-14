package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		product.name = sc.next().toUpperCase();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();

		double total = product.totalValueStock();

		System.out.printf("Product data: \nName: %s\nPrice: %.2f\nQuantity: %s\nTotal: ", product.name, product.price,
				product.quantity, total);

		sc.close();
	}

}

package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.next().toUpperCase();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println(product.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println(product.toString());
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println(product.toString());
		
		sc.close();

	}

}

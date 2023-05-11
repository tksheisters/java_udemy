package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data: \n", (i + 1));
			
			System.out.print("Common, used or imported (c/u/i)?: ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine().toUpperCase();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (type == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				sc.nextLine();
				
				products.add(new ImportedProduct(name, price, fee));
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manuDate = sdf.parse(sc.next());
				sc.nextLine();
				
				products.add(new UsedProduct(name, price, manuDate));
			} else {
				products.add(new Product(name, price));
			}
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS: ");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}

		sc.close();

	}

}

package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class App {

	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();

		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("ipad", 800.0));

		Product prod = new Product("Notebook", 1200.0);

		System.out.println(set.contains(prod));

		for (Product product : set) {
			System.out.println(product);
		}

	}

}

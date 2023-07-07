package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		/*
		 * Comparator<Product> comp = (o1, o2) -> { return
		 * o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()); };
		 */

		/*
		 * new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product o1, Product o2) { return
		 * o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()); } };
		 */

		list.sort(/* new MyComparator() //comp */ (o1, o2) -> o1.getName().toUpperCase()
				.compareTo(o2.getName().toUpperCase()));
		for (Product product : list) {
			System.out.println(product);
		}
	}

}

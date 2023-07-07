package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class App {

	public static int globalValue = 3;

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		/*
		 * int[] vect = new int[] { 3, 4, 5 }; changeOddValues(vect);
		 * System.out.println(Arrays.toString(vect));
		 */

		List<Product> list = new ArrayList<>();

		list.add(new Product("a", 3.0));
		list.add(new Product("d", 7.0));
		list.add(new Product("c", 1.0));

		list.sort(App::compareProducts);

		list.forEach(System.out::println);
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

	/*
	 * este algoritmo nao tem transparencia referencial pois a função
	 * changeOddValues() depedende de uma variavel externa, e dependendo desta
	 * variavel o comportamento pode mudar
	 */

}

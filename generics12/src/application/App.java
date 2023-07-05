package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class App {

	public static void main(String[] args) {
		/*
		 * Map<String, String> cookies = new TreeMap<>();
		 * 
		 * cookies.put("username", "maria"); cookies.put("email", "maria@gmail.com");
		 * cookies.put("phone", "99771122");
		 * 
		 * cookies.remove("email"); cookies.put("phone", "123012840");
		 * 
		 * System.out.println("Contains phone key: " + cookies.containsKey("phone"));
		 * System.out.println("Phone number: " + cookies.get("phone"));
		 * System.out.println("email: " + cookies.get("email"));
		 * System.out.println("Size: " + cookies.size());
		 * 
		 * System.out.println("All cookies:"); for (String key : cookies.keySet()) {
		 * System.out.println(key + ": " + cookies.get(key)); }
		 */

		Map<Product, Double> cookies = new HashMap<>();

		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("iPad", 1500.0);

		cookies.put(p1, 10000.0);
		cookies.put(p2, 20000.0);
		cookies.put(p3, 15000.0);

		Product ps = new Product("Tv", 900.0);

		System.out.println("Contains ps key: " + cookies.containsKey(ps));
	}

}

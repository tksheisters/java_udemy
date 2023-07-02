package application;

import entities.Client;

public class App {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "José";

		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a == b);

		Client c1 = new Client("maria", "maria@gmail.com");
		Client c2 = new Client("maria", "maria@gmail.com");
		Client c3 = new Client("mario", "mario@gmail.com");

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		String x = /*new String*/("Maria");
		String y = /*new String*/("Maria");
		
		System.out.println(x == y);

	}

}

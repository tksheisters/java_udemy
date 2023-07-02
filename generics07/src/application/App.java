package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		/*
		 * Set<String> set = new HashSet<>();
		 * 
		 * set.add("TV"); set.add("Notebook"); set.add("iPad");
		 * 
		 * // set.remove("iPad"); // set.removeIf(x -> x.length() >= 3); //
		 * set.removeAll(set); // System.out.println(set.contains("Notebook"));
		 * 
		 * for (String string : set) { System.out.println(string); }
		 */

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// união
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// interseção
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// diferença
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}

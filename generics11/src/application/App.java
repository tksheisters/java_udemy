package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> students = new HashSet<>();
		System.out.print("How many students for course A: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("ID student #%d: ", (i + 1));
			int id = sc.nextInt();
			students.add(id);
		}
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("ID student #%d: ", (i + 1));
			int id = sc.nextInt();
			students.add(id);
		}
		System.out.print("How many students for course C: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("ID student #%d: ", (i + 1));
			int id = sc.nextInt();
			students.add(id);
		}
		System.out.println("Total users: " + students.size());

		sc.close();

	}

}

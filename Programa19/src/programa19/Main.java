package programa19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;
		System.out.println("Digite dois valores: ");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("ORIGEM");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q2");
		}

		sc.close();
	}

}

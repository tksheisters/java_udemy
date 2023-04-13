package programa34;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double quadrado;
		double cubo;

		for (int i = 1; i <= n; i++) {
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			
			System.out.printf("%s %.0f %.0f\n", i, quadrado, cubo);
		}

		sc.close();

	}

}

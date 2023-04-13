package programa25;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite as coordenadas: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}

			System.out.println("Digite as coordenadas: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}

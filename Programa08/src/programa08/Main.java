package programa08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b, c, d;
			
			System.out.println("Digite quatro valores:");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			int diferenca = a * b - c * d;
			System.out.println("Diferença = " + diferenca);
		}

	}

}

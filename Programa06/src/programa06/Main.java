package programa06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Digite dois valores: ");
			double x, y;
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			double soma = x + y;
			System.out.println("Resultado: " + soma);
		}
	}

}

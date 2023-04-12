package programa07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Digite o valor do raio de um círculo:");
			double raio = sc.nextDouble();
			double pi = 3.14159;
			double raioQuadrado = Math.pow(raio, 2);
			double areaCirculo = pi * raioQuadrado;
			
			System.out.printf("Área do círculo: %.4f", areaCirculo);
		}
	}
}

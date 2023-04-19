package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Tamanho do vetor: ");
		int n = input.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura: ");
			vect[i] = input.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		double media = soma / vect.length;

		System.out.printf("Media das alturas: %.2f", media);

		input.close();
	}

}

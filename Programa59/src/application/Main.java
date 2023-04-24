package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, posicaoMaior;
		double maior;
		
		System.out.print("Quantos numeros vai digitar?: ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posicaoMaior = 0;
		
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("\nMaior valor: %.2f", maior);
		System.out.printf("\nPosição maior valor: %d", posicaoMaior);
		
		
		sc.close();
	}

}

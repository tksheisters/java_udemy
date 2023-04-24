package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho vetor (1 - 10): ");
		int n = sc.nextInt();
		while (n > 10 || n <= 0) {
			System.out.print("Tamanho vetor (min: 1; max: 10): ");
			n = sc.nextInt();
		}
		double[] vect = new double[n];
		
		double soma = 0.0; 
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite umm numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Valores: %.2f\n", vect[i]);
		}
		System.out.printf("Soma: %.2f\n", soma);
		System.out.printf("Media: %.2f\n", media);
		
		sc.close();

	}

}

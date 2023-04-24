package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media, total;
		int n;
		
		System.out.print("Quantos elementos no vetor?: ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		total = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			total += vect[i];
		}
		
		media = total / vect.length;
		System.out.printf("\nMedia dos vetores: %.4f", media);
		
		System.out.println("\nElementos abaixo da media: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}

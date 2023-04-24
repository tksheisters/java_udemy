package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho vetor (1 - 10): ");
		int n = sc.nextInt();
		while(n > 10 || n <= 0) {
			System.out.println("Tamanho de 1 a 10");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero inteiro: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf(" %d", vect[i]);
			}
		}
		
		
		sc.close();
	}

}

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, numerosPares;
				
		System.out.print("Quantos numeros vai digitar?: ");
		n = sc.nextInt();
		
		int [] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		numerosPares = 0;
		
		System.out.println("Numeros pares: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.println(vect[i]);
				numerosPares++;
			}
		}
		
		System.out.printf("Quantidade de pares: %d", numerosPares);
		
		
		sc.close();

	}

}

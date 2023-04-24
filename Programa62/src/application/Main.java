package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double total, mediaPares, numerosPares;
		
		System.out.print("Quantos elementos vai ter o vetor?: ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		total = 0.0;
		numerosPares = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble(); 
			
			if (vect[i] % 2 == 0) {
				total += vect[i];
				numerosPares++;
			}
		}
		
		mediaPares = total / numerosPares;
		
		if (numerosPares > 0) {
			System.out.printf("Media dos pares: %.2f\n", mediaPares);			
		} else {
			System.out.println("Nenhum numero par");
		}
		
		sc.close();
	}

}

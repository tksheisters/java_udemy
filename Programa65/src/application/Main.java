package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, pessoa, qtHomens, qtMulheres;
		double menorAltura, maiorAltura, mediaMulheres, totalMulheres;
		
		System.out.print("Quantas pessoas vao ser cadastradas?: ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		qtMulheres = 0;
		totalMulheres = 0.0;
		maiorAltura = 0;
		menorAltura = 5;
		qtHomens = 0;
		pessoa = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", pessoa);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", pessoa);
			genero[i] = sc.next().charAt(0);
			pessoa++;
			
			if (genero[i] == 'm' || genero[i] == 'M') {
				qtHomens++;
			} else {
				totalMulheres += altura[i];
				qtMulheres++;
			}
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
		}
		
		mediaMulheres = totalMulheres / qtMulheres;
		
		System.out.printf("\nMenor altura: %.2f", menorAltura);
		System.out.printf("\nMaior Altura: %.2f", maiorAltura);
		System.out.printf("\nMedia altura feminina: %.2f", mediaMulheres);
		System.out.printf("\nQuantidade de homens: %d", qtHomens);
 		
		sc.close();

	}

}

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		double somaAltura = 0;
		double mediaAltura, percentualMenores;
		int menor16anos = 0;
		
		System.out.print("Quantas pessoas serão cadastradas?: ");
		n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		int j = 1;


		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %sa pesssoa: \n", j);
			sc.nextLine();		
			System.out.print("Nome: ");
			nome[i] = sc.nextLine().toUpperCase();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			j++;
		}
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menor16anos++;
			}
			somaAltura += altura[i];
		}
		
		percentualMenores = ((double)menor16anos / n) * 100.0;
		
		mediaAltura = somaAltura / n;
		
		System.out.printf("Altura media: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos:  %.2f\n", percentualMenores);
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();

	}

}

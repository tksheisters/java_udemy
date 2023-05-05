package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;

		System.out.print("Quantidade de linhas: ");
		n = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		m = sc.nextInt();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite um numero: ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.printf("Posição [%d,%d]\n", i, j);

					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.err.println("Direita: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Baixo: " + matriz[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}

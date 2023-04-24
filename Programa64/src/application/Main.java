package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, aluno;
		double media = 6.0;
		
		System.out.print("Quantos alunos vao ser cadastrados?: ");
		n = sc.nextInt();
		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];

		aluno = 1;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda do %do aluno: \n", aluno);
			nomes[i] = sc.nextLine().toUpperCase();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
			aluno++;
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			if (((notas1[i] + notas2[i]) / 2) >= media) {
				System.out.println(nomes[i]);
			}
		}
			
		
		sc.close();

	}

}

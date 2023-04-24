package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, j, idadeMaisVelho;
		String nomeMaisVelho = null;
		
		System.out.print("Quantas pessoas vai cadastrar?: ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		
		j = 1;
		idadeMaisVelho = 0;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: \n", j);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine().toUpperCase();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			j++;
			
			if (idades[i] > idadeMaisVelho) {
				idadeMaisVelho = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.printf("Pessoa mais velha: %s", nomeMaisVelho);
		
		sc.close();

	}

}

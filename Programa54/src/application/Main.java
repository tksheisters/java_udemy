package application;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Tamanho vetor: ");
		int n = input.nextInt();
		Produto[] vect = new Produto[n];

		for (int i = 0; i < vect.length; i++) {
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Preço: ");
			double preco = input.nextDouble();
			vect[i] = new Produto(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}

		double media = soma / vect.length;

		System.out.printf("Media: %.2f", media);

		input.close();
	}

}

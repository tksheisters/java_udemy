package application;

import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int conta;
		String nome;
		double valor = 0;

		System.out.print("Digite o numero da conta: ");
		conta = sc.nextInt();

		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		nome = sc.nextLine().toUpperCase();

		System.out.print("Deseja fazer um deposito inicial (s/n)? ");
		String confirmacao = sc.next();
		if (confirmacao.equalsIgnoreCase("s")) {
			System.out.print("Digite o valor do deposito: ");
			valor = sc.nextDouble();
		}

		Account account = new Account(conta, nome, valor);

		System.out.println();
		System.out.println("---------- DADOS DA CONTA: ----------\n");
		System.out.println(account.toString());

		System.out.println();

		System.out.print("Digite o valor do deposito: ");
		valor = sc.nextDouble();
		account.deposito(valor);
		System.out.println("---------- DADOS ATUALIZADOS: ----------\n");
		System.out.println(account.toString());

		System.out.println();

		System.out.print("Digite o valor do saque: ");
		valor = sc.nextDouble();
		account.saque(valor);
		System.out.println("---------- DADOS ATUALIZADOS: ----------\n");
		System.out.println(account.toString());

		sc.close();
	}

}

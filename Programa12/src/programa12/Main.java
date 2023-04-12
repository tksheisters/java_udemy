package programa12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// && = E, || = OU, ! = negação

		// estrutura condicional simples
		System.out.println("Quantas horas? ");
		int x = sc.nextInt();

		if (x < 12 && x > 5) {
			System.out.println("Bom dia");

		} else {
			if (x >= 12 && x <= 18) {
				System.out.println("Boa tarde");

			} else {
				System.out.println("Boa noite");

			}

		}
		sc.close();

	}
}

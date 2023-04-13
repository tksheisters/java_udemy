package programa24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha (quatro digitos): ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha incorreta");
			
			System.out.println("Digite a senha (quatro digitos): ");
			senha = sc.nextInt();
		}

		if (senha == 2002) {
			System.out.println("Senha correta");

		}

		sc.close();

	}

}

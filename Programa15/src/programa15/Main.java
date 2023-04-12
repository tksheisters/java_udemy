package programa15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int sair = 0;
		while (sair == 0) {
			System.out.println("Digite dois números: ");
			a = sc.nextInt();
			b = sc.nextInt();

			if (a % b == 0 || b % a == 0) {
				System.out.println("São multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
			
			System.out.println("Deseja sair? 0 = Não / 1 = Sim");
			sair = sc.nextInt();
			if(sair == 1) {
				System.out.println("PROGRAMA ENCERRADO");
			}

		}
		sc.close();

	}

}

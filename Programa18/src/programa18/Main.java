package programa18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int condicao = 0;
		while (condicao == 0) {
			System.out.println("Digite qualquer valor entre um intervalo de 0 a 100: ");
			double valor = sc.nextDouble();

			if (valor >= 0 && valor <= 25) {
				System.out.println("Está entre 0 e 25");
			} else if (valor > 25 && valor <= 50) {
				System.out.println("Está entre 25 e 50");
			} else if (valor > 50 && valor <= 75) {
				System.out.println("Está entre 50 e 75");
			} else if (valor > 75 && valor <= 100) {
				System.out.println("Está entre 75 e 100");
			} else {
				System.out.println("Fora do intervalo");
			}
			
			System.out.println("Encerrar? 0 = Não / 1 = Sim");
			condicao = sc.nextInt();
			if (condicao == 1) {
				System.out.println("PROGRAMA ENCERRADO");
			}

		}

		sc.close();

	}

}

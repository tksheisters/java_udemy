package programa17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
		double total = 0;

		int condicao = 0;
		while (condicao == 0) {
			System.out.println("Digite o código do produto e a quantidade: ");
			codigo = sc.nextInt();
			qtd = sc.nextInt();

			if (codigo == 1) {
				total = qtd * 4.0;
				System.out.println("TOTAL = R$" + total);
			} else if (codigo == 2) {
				total = qtd * 4.5;
				System.out.println("TOTAL = R$" + total);
			} else if (codigo == 3) {
				total = qtd * 5.0;
				System.out.println("TOTAL = R$" + total);
			} else if (codigo == 4) {
				total = qtd * 2.0;
				System.out.println("TOTAL = R$" + total);
			} else if (codigo == 5) {
				total = qtd * 1.5;
				System.out.println("TOTAL = R$" + total);
			} else {
				System.out.println("Código inválido");
			}
			System.out.println("Encerrar? 0 = Não / 1 = Sim");
			condicao = sc.nextInt();
			if(condicao == 1 ) {
				System.out.println("PROGRAMA ENCERRADO");
			}
		}

		sc.close();
		;

	}

}

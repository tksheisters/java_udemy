package programa10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int codigo1, quantidade1, codigo2, quantidade2;
			double valorUn1, valorUn2, peca1, peca2, total;

			System.out.println("Digite o código do produto: ");
			codigo1 = sc.nextInt();
			System.out.println("Digite a quantidade: ");
			quantidade1 = sc.nextInt();
			System.out.println("Digite o valor UNITÁRIO: ");
			valorUn1 = sc.nextDouble();
			peca1 = quantidade1 * valorUn1;

			System.out.printf("\nCÓDIGO: %s\nTOTAL: R$%.2f\n\n", codigo1, peca1);

			System.out.println("Digite o código do produto: ");
			codigo2 = sc.nextInt();
			System.out.println("Digite a quantidade: ");
			quantidade2 = sc.nextInt();
			System.out.println("Digite o valor UNITÁRIO: ");
			valorUn2 = sc.nextDouble();
			peca2 = quantidade2 * valorUn2;

			System.out.printf("\nCÓDIGO: %s\nTOTAL: R$%.2f\n\n", codigo2, peca2);

			total = peca1 + peca2;
			System.out.printf("----TOTAL A PAGAR = R$%.2f----\n", total);

		}

	}

}

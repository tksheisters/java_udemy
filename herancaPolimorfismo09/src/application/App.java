package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite o numero de contribuintes: ");
		int n = sc.nextInt();

		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.printf("Imposto contribuinte #%d: \n", (i + 1));
			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine().toUpperCase();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (tipo == 'f') {
				System.out.print("Gastos com saude: ");
				double gastoSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		
		double sum = 0.0;
		System.out.println("IMPOSTO PAGO: ");
		for (Contribuinte contribuinte : list) {
			System.out.println(contribuinte.getNome() + ": $" + String.format("%.2f", contribuinte.imposto()));
			sum += contribuinte.imposto();
		}
		System.out.println("----------------------------");
		System.out.println("IMPOSTO TOTAL: " + String.format("%.2f", sum));

		sc.close();
	}

}

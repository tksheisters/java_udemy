package programa09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int id, horasTrabalho;
			double salarioHora;

			System.out.println("Digite o ID do funcionário: ");
			id = sc.nextInt();

			System.out.println("Digite as horas trabalhadas: ");
			horasTrabalho = sc.nextInt();

			System.out.println("Digite o salário hora: ");
			salarioHora = sc.nextDouble();

			double salario = horasTrabalho * salarioHora;

			System.out.printf("ID = %s \nHoras trabalhadas = %s \nSalário = R$%.2f\n", id, horasTrabalho, salario);
		}

	}

}

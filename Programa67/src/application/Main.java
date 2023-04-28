package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<Empregado>();

		System.out.print("Quantos empregados serao cadastrados: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i);

			System.out.print("ID: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("ID já existe! Tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			Double salario = sc.nextDouble();

			Empregado emp = new Empregado(id, nome, salario);
			list.add(emp);
		}

		System.out.println();
		System.out.print("Digite o ID do funcionario que recebera um aumento: ");
		int id = sc.nextInt();

		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		// Integer pos = posicaoId(list, id);

		if (emp == null) {
			System.out.println("Este ID não existe!");
		} else {
			System.out.print("Quantos %: ");
			double porcentagem = sc.nextDouble();
			emp.aumentoSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de empregados: ");

		for (Empregado e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static Integer posicaoId(List<Empregado> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}

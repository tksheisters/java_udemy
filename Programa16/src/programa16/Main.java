package programa16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, duracao;
		System.out.println("Digite a hora inicial e a hora final de um jogo: ");
		a = sc.nextInt();
		b = sc.nextInt();
				
		if (a < b) {
			duracao = b - a;
		} else {
			duracao = 24 - a + b;
		}
		System.out.println("Duração do jogo = " + duracao + " horas");
		
		sc.close();

	}

}

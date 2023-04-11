package programa03;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// para leitura de dados de entrada pelo teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		System.out.println("Digite um número inteiro: ");
		int a;
		a = sc.nextInt();
		System.out.println("Você digitou: " + a);

		System.out.println("Digite um número com casa decimal: ");
		double b;
		b = sc.nextDouble();
		System.out.printf("Você digitou: %.2f \n", b);

		System.out.println("Digite uma palavra: ");
		char y;
		y = sc.next().charAt(0);
		System.out.println("A primeira letra é: " + y);

		String q;
		int w;
		double e;

		q = sc.next();
		w = sc.nextInt();
		e = sc.nextDouble();
		System.out.println("Você digitou: ");
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		sc.close();

	}

}

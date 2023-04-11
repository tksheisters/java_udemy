package programa01;

import java.util.Locale;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Bom dia");

		int y = 32;

		System.out.println(y);

		double x = 32.653713;

		// %.2f delimita quantas casas decimais após a virgula
		// %n quebra de linha
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		// configurar o local do aplicativo como EUA (mudar a virgula para ponto no
		// console)
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		// concatenação
		System.out.println("Resultado = " + x + "m");
		// concatenação com formatação
		System.out.printf("Resultado = %.2fm\n", x);

		String nome = "Maria";
		int idade = 32;
		double renda = 4500.00;
		// %s = strings, %d = inteiros
		System.out.printf("%s tem %d anos e ganha R$%.2f reais\n", nome, idade, renda);

	}

}

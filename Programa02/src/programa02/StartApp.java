package programa02;

import java.util.Locale;

public class StartApp {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 32;
		int codigo = 5520;
		char genero = 'F';
		
		double preco1 = 3320.90;
		double preco2 = 250.50;
		double medida = 53.24;
		
		System.out.println("Produtos:");
		System.out.printf("O %s, custa R$%.2f \n", produto1, preco1);
		System.out.printf("O %s, custa R$%.2f \n\n", produto2, preco2);
		
		System.out.printf("Registro: %d anos, código %d, gênero: %s \n", idade, codigo, genero);
		
		System.out.printf("Medida(8 casas decimais): %.8f \n", medida);
		System.out.printf("Arredondado (3 casas decimais): %.3f \n", medida);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com ponto decimal americano: %.3f \n", medida);

	}

}

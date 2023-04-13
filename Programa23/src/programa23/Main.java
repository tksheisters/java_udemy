package programa23;

public class Main {

	public static void main(String[] args) {
		// expressão condicional ternária
		// (condição) ? valor_se_verdadeiro : valor_se_falso;

		double preco = 34.5;
		double desconto = (preco < 20.0) ? (preco * 0.1) : (preco * 0.05);
		System.out.printf("Total de desconto: R$%.2f\n", desconto);
	}

}

package programa21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Minutos falados: ");
		int minutos = sc.nextInt();
		double conta = 50.0;
		
		if (minutos <= 100) {
			System.out.printf("Valor a pagar: R$%.2f\n", conta);
		} else {
			conta = conta + (minutos - 100) * 2;
			System.out.printf("Valor a pagar: R$%.2f\n", conta);
		}
		
		sc.close();
	}

}

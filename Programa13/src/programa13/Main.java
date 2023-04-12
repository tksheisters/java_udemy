package programa13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro negativo ou positivo: ");
		int a = sc.nextInt();
		
		if (a >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		sc.close();
	}

}

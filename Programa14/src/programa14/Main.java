package programa14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número par ou impar: ");
		int a = sc.nextInt();
		a = a % 2;
		if (a == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}
		sc.close();
	}

}

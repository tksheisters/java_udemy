package programa31;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (a != 0) {
				double divisao = a / b;
				System.out.println(divisao);
			}	else {
				System.out.println("Divisao impossivel");
			}
		}

		sc.close();
	}

}

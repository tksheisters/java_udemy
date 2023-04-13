package programa20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		System.out.println("Digite seu salário: ");
		x = sc.nextDouble();
		
		double imposto;
		
		if(x <= 2000) {
			System.out.println("Salário isento");
			
		} else if (x > 2000 && x <= 3000) {
			imposto = (x - 2000) * 0.08;
			System.out.printf("Imposto = %.2f", imposto);
			
		} else if (x > 3000 && x <= 4500) {
			imposto = (x - 3000) * 0.18 + 80;
			System.out.printf("Imposto = %.2f", imposto);
			
		} else if (x > 4500) {
			imposto = (x - 4500) * 0.28 + 80 + 270;
			System.out.printf("Imposto = %.2f", imposto);
			
		} else {
			System.out.println("Por favor digite um valor maior que zero.");
			
		}
		
		
		sc.close();
	}

}

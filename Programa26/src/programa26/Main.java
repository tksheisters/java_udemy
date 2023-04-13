package programa26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combustivel utilizado: \n1 = Alcool | 2 = Gasolina | 3 = Diesel | 4 = Fim");
		int tipo = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
			} else if (tipo == 2) {
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;			
			} else {
				System.out.println("Codigo invalido");
			}			
			
			System.out.println("Combustivel utilizado: \n1 = Alcool | 2 = Gasolina | 3 = Diesel | 4 = Fim");
			tipo = sc.nextInt();
		}
		
		System.out.println("Obrigado");
		System.out.printf("ALCOOL = %s\nGASOLINA = %s\nDIESEL = %s\n", alcool, gasolina, diesel);
		
		sc.close();

	}

}

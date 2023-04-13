package programa35;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temp;
		char repete;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temp = sc.nextDouble();
			
			temp = 9 * temp / 5 + 32;
			
			sc.nextLine();
			
			System.out.printf("Farenheit: %.1fF\n", temp);
			
			System.out.print("Deseja repetir (s/n)? ");
			repete = sc.next().charAt(0);
			
		} while (repete == 's' || repete == 'S');
		
		sc.close();

	}

}

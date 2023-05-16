package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int pos = sc.nextInt();
			System.out.println(vect[pos]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posicao invalida");
		} catch (InputMismatchException e) {
			System.out.println("posicao invalida");
		}
		
		System.out.println("fim");
		
		sc.close();
	}

}

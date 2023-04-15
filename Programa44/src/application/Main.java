package application;

import java.util.Scanner;

import entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rectangle width and height: ");
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Area = %.2f\n", rectangle.area());
		System.out.printf("Perimeter = %.2f\n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f\n", rectangle.diagonal());
		
		sc.close();
	}

}

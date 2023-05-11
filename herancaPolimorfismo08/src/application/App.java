package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Shape #%d: \n", (i+1));
			System.out.print("Rectangle or circle (r/c)?: ");
			char type = sc.next().charAt(0);
			System.out.print("Color (BLACK/RED/BLUE): ");
			String color = sc.next().toUpperCase();
			if (type == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		
		sc.close();

	}

}

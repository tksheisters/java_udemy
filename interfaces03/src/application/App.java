package application;

import entities.AbstractShape;
import entities.Circle;
import entities.Color;
import entities.Rectangle;

public class App {

	public static void main(String[] args) {

		AbstractShape shape1 = new Circle(Color.BLACK, 2.0);
		AbstractShape shape2 = new Rectangle(Color.BLACK, 2.0, 4.0);
		
		System.out.println("Circle color: " + shape1.getColor());
		System.out.println("Circle area: " + shape1.area());
		System.out.println("Rectangle color: " + shape2.area());
		System.out.println("Rectangle color: " + shape2.getColor());
		
	}

}

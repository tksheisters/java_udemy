package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class App {

	public static void main(String[] args) {
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		//System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));
		System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
	}

	public static double totalArea(List<? extends Shape> list) {
		// n é possivel adicionar elementos quando estiver usando curingas <?>
		double sum = 0;
		for (Shape shape : list) {
			sum += shape.area();
		}
		return sum;
	}

}

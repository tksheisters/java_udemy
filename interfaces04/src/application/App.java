package application;

import entities.ComboDevices;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class App {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2023");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevices c = new ComboDevices("2081");
		c.processDoc("Lorem ipsum");
		c.print("Lorem ipsum");
		System.out.println("Scan result: " + c.scan());
	}

}

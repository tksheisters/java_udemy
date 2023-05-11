package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		List<Employee> emps = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data: \n", (i + 1));
			System.out.print("Outsourced (y/n)?: ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine().toUpperCase();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();		
			if (outsourced == 'y' || outsourced == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				emps.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				emps.add(emp);
			}
			
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		for (Employee emp : emps) {
			System.out.println(emp);
		}

		sc.close();

	}

}

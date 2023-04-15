package application;

import java.util.Scanner;

import entity.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.next().toUpperCase();

		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.println();

		System.out.printf("Employee: %s, $%.2f\n\n", employee.name, employee.netSalary());

		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();

		employee.increaseSalary(percentage);

		System.out.printf("\nUpdated data: %.2f\n", employee.netSalary());

		sc.close();
	}

}

package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		// mudar a path caso não funcione
		String path1 = "src/names.txt";
		String path2 = "src/employees.csv";

		try (BufferedReader br1 = new BufferedReader(new FileReader(path1))) {
			String name = br1.readLine();
			while (name != null) {
				names.add(name);
				name = br1.readLine();
			}
			Collections.sort(names);

			for (String string : names) {
				System.out.println(string);
			}
			System.out.println("------------------------------------------");

			try (BufferedReader br2 = new BufferedReader(new FileReader(path2))) {
				String itemCsv = br2.readLine();
				while (itemCsv != null) {
					String[] fields = itemCsv.split(",");

					String nameEmployee = fields[0];
					double salary = Double.parseDouble(fields[1]);
					list.add(new Employee(nameEmployee, salary));

					itemCsv = br2.readLine();
				}
				Collections.sort(list);
				for (Employee employee : list) {
					System.out.println(employee);
				}
			} catch (FileNotFoundException e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}

}

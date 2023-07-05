package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				System.out.println(fields);
				line = br.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		sc.close();

	}

}

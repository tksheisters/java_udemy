package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file path: ");
		String path = sc.nextLine();

		Map<String, Integer> votosPorNome = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);

				if (votosPorNome.containsKey(nome)) {
					votos += votosPorNome.get(nome);
				}
				
				votosPorNome.put(nome, votos);
				
				line = br.readLine();
			}
			for (Map.Entry<String, Integer> entry : votosPorNome.entrySet()) {
				System.out.println(entry.getKey().toUpperCase() + ": " + entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}

}

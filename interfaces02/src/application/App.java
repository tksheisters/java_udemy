package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.println("Digite os dados do contrato: ");

			int number = 0;
			while (number == 0) {
				try {
					System.out.print("Numero: ");
					number = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Numero inválido!");
					sc.nextLine();
				}
			}

			LocalDate date = null;
			while (date == null) {
				try {
					System.out.print("Data (dd/mm/aaaa): ");
					date = LocalDate.parse(sc.next(), formatter);
				} catch (DateTimeParseException e) {
					System.out.println("Data invalida!");
				}
			}

			double value = 0;
			int parcels = 0;
			while (value == 0 || parcels == 0) {
				try {
					System.out.print("Valor do contrato: $");
					value = sc.nextDouble();
					System.out.print("Numero de parcelas: ");
					parcels = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Valor invalido!");
					sc.nextLine();
				}
			}

			Contract contract = new Contract(number, date, value);
			ContractService service = new ContractService(new PaypalService());
			service.processContract(contract, parcels);

			List<Installment> installmentList = contract.getInstallments();

			System.out.println("PARCELAS:");
			for (Installment installment : installmentList) {
				System.out.println(installment);
			}

		} catch (AppException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}

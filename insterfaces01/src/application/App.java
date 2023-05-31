package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		try {
			System.out.println("Entre com os dados do alugel: ");
			System.out.print("Modelo do carro: ");
			String model = sc.nextLine().toUpperCase();

			LocalDateTime start = null;
			LocalDateTime finish = null;

			while (start == null || finish == null) {
				try {
					System.out.print("Retirada (dd/mm/aaaa hh:mm): ");
					start = LocalDateTime.parse(sc.nextLine(), dtf);
					System.out.print("Entrega (dd/mm/aaaa hh:mm): ");
					finish = LocalDateTime.parse(sc.nextLine(), dtf);

				} catch (DateTimeParseException e) {
					System.out.println("Data invalida!");
				}
			}

			CarRental cr = new CarRental(start, finish, new Vehicle(model));

			double pricePerHour = 0.0;
			double pricePerDay = 0.0;

			while (pricePerDay == 0.0 || pricePerHour == 0.0) {
				try {
					System.out.print("Entre com o preço por hora: ");
					pricePerHour = sc.nextDouble();
					System.out.print("Entre com o preço por dia: ");
					pricePerDay = sc.nextDouble();

				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				}
			}

			RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			rentalService.processInvoice(cr);

			System.out.println("FATURA: ");
			System.out.println("Pagamento basico: R$" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
			System.out.println("Imposto: R$" + String.format("%.2f", cr.getInvoice().getTax()));
			System.out.println("Pagamento total: R$" + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		} catch (AppException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

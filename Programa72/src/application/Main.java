package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:56:23");
		Instant d06 = Instant.parse("2022-07-20T01:56:23Z");
		
		LocalDate semanaPassadaLocal = d04.minusDays(7);
		LocalDate proximaSemanaLocal = d04.plusDays(7);
		
		LocalDateTime semanaPassadaDateTime = d05.minusDays(7);
		LocalDateTime proximaSemanaDateTime = d05.plusDays(7);
		
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semana passada d04: " + semanaPassadaLocal);
		System.out.println("proxima semana d04: " + proximaSemanaLocal);
		
		System.out.println("semana passada d05: " + semanaPassadaDateTime);
		System.out.println("proxima semana d05: " + proximaSemanaDateTime);

		System.out.println("semana passada d06: " + semanaPassadaInstant);
		System.out.println("proxima semana d06: " + proximaSemanaInstant);
		
		Duration t1 = Duration.between(semanaPassadaInstant, proximaSemanaInstant);
		Duration t2 = Duration.between(semanaPassadaLocal.atStartOfDay(), proximaSemanaLocal.atTime(0,0));
		Duration t3 = Duration.between(semanaPassadaDateTime, proximaSemanaDateTime);
		
		System.out.println("t1: " + t1.toDays());
		System.out.println("t2: " + t2.toDays());
		System.out.println("t3: " + t3.toDays());
	}

}

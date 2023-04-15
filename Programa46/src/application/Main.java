package application;

import java.util.Scanner;

import entity.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		student.nome = sc.next();
		student.trimestre1 = sc.nextDouble();
		student.trimestre2 = sc.nextDouble();
		student.trimestre3 = sc.nextDouble();
		student.notaFinal = student.notaFinal();
		student.notaFaltante = student.notaFaltante();
		student.aprovado = student.aprovado();
		
		System.out.printf("NOTA FINAL: %.2f\n", student.notaFinal);
		System.out.println(student.aprovado);
		
		sc.close();
	}

}

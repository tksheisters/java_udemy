package application;

import java.util.Scanner;

import entity.Calculator;

public class Main {
// metodos estaticos nao precisam instanciar a classe para assim poder utiliza-las
// exemplo Calculator cal = new Calculator() --> Calculator.etc()
// basta somente chamar a classe e em seguida o metodo
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME O RAIO: ");
		double raio = sc.nextDouble();
		double circ = Calculator.circunferencia(raio);
		double vol = Calculator.volume(raio);
		
		
		System.out.printf("CIRCUNFERENCIA: %.2f\n", circ);
		System.out.printf("VOLUME: %.2f\n", vol);
		System.out.printf("PI: %.2f\n", Calculator.PI);
		
		sc.close();
	}

}

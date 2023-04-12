package programa11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double a, b, c;
			
			System.out.println("Digite 3 medidas: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			double areaTrianguloRet = (a * c) / 2;
			double areaCirculo = 3.14159 * Math.pow(c, 2);
			double areaTrapezio = ((a + b) * c) / 2;
			double areaQuadrado = Math.pow(b, 2);
			double areaRetangulo = a * b;
			
			System.out.printf("TRIANGULO = %.3f\n", areaTrianguloRet);
			System.out.printf("CIRCULO = %.3f\n", areaCirculo);
			System.out.printf("TRAPEZIO = %.3f\n", areaTrapezio);
			System.out.printf("QUADRADO = %.3f\n", areaQuadrado);
			System.out.printf("RETANGULO = %.3f\n", areaRetangulo);
		}

	}

}

package entity;

public class Student {

	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	public double notaFinal;
	public String aprovado;
	public double notaFaltante;

	public double notaFinal() {
		return notaFinal = trimestre1 + trimestre2 + trimestre3;
	}

	public double notaFaltante() {
		if (notaFinal < 60) {
			notaFaltante = 60.0 - notaFinal;
		} else {
			notaFaltante = 0;
		}
		return notaFaltante;
	}

	public String aprovado() {
		if (notaFaltante < 0) {
			aprovado = "APROVADO";
		} else {
			aprovado = "REPROVADO \nNOTA FALTANTE: " + String.format("%.2f", notaFaltante);
		}
		return aprovado;
	}

}

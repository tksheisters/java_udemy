package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		double sum = 0.0;
		if (numeroFuncionarios <= 10) {
			sum = (rendaAnual * 0.16);
		} else {
			sum = (rendaAnual * 0.14);
		}
		return sum;
	}
}

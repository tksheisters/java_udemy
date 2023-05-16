package entities;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		double sum = 0.0;
		if (rendaAnual < 20000) {
			sum = (rendaAnual * 0.15) - (gastoSaude * 0.50);
		} else {
			sum = (rendaAnual * 0.25) - (gastoSaude * 0.50);
		}
		return sum;
	}

}

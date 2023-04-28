package entities;

public class Empregado {
	private Integer id;
	private String nome;
	private Double salario;

	public Empregado() {

	}

	public Empregado(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

	public void aumentoSalario(double porcento) {
		this.salario += salario * (porcento / 100);
	}

}

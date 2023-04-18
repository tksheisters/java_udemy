package entities;

public class Account {
	private int numeroConta;
	private String nome;
	private double valorConta;

	public Account() {

	}

	public Account(int numeroConta, String nome, double valorConta) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.valorConta = valorConta;
	}

	public Account(int numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorConta() {
		return valorConta;
	}

	public double deposito(double deposito) {
		return this.valorConta += deposito;
	}

	public double saque(double saque) {
		return this.valorConta -= (saque + 5);
	}

}

package entities;

public class Account {
	private int numeroConta;
	private String nome;
	private double saldo;

	public Account(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Account(int numeroConta, String nome) {
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

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
		this.saldo -= (saque + 5);
	}
	
	public String toString() {
		return "Conta: " + numeroConta + "\nTitular: " + nome + "\nSaldo: R$" + String.format("%.2f", saldo);
	}

}

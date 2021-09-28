package entities;

public class Conta {
	private String nomeTitular;
	private int numeroConta;
	private double saldo;
	
	public Conta(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
	public Conta(String nomeTitular, int numeroConta, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: R$"
				+ String.format("%.2f", saldo);
	}
	
}

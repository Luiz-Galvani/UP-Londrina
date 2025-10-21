
public class ContaCorrente {
	private int numero;
	private String nome;
	private double saldo;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero=" + numero + "\nNome=" + nome 
				+ "\nSaldo=" + saldo + "\n";
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(saldo > valor) {
			saldo -= valor;
			saldo -= valor*0.005;
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
}

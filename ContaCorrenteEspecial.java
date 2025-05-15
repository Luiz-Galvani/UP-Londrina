
public class ContaCorrenteEspecial extends ContaCorrente{

	public ContaCorrenteEspecial() {
		
	}
	
	public ContaCorrenteEspecial(int numero, String nome, 
			double saldo) {
		super(numero, nome, saldo);
	}
	
	public void sacar(double valor) {
		if(getSaldo() > valor) {
			setSaldo(getSaldo()-valor);
			setSaldo(getSaldo()-valor*0.001);
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
}

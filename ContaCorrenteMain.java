
public class ContaCorrenteMain {
	public static void main(String [] args) {
		ContaCorrente cc = new ContaCorrente(1, "Joana Silva", 1000);
		ContaCorrenteEspecial ce = new ContaCorrenteEspecial(2, 
										"Maria das Neves", 1000);
		cc.sacar(100);
		ce.sacar(100);
		
		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CE: " + ce.getSaldo());
	}
}

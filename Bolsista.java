
public class Bolsista extends Aluno{
	private double desconto;
	
	public Bolsista() {
		
	}
	
	public Bolsista(String nome, int registro, 
			double valorMensalidade, double desconto) {
		super(nome, registro, valorMensalidade);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return super.toString() + "Desconto=" + desconto + "\n";
	}
	
	public double pagarMensalidade(int dia) {
		if(dia <= 15) {
			return getValorMensalidade() - getValorMensalidade()*
							desconto/100;
		}
		else {
			return getValorMensalidade();
		}
	}
	
}

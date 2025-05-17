
public class ReceitaUniversidade {
	private double valor = 0;
	
	public double getValor() {
		return valor;
	}
	
	public void receberPagamento(Aluno a, int dia) {
		valor += a.pagarMensalidade(dia);
	}
}

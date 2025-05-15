
public class Aluno {
	private String nome;
	private int registro;
	private double valorMensalidade;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int registro, double valorMensalidade) {
		this.nome = nome;
		this.registro = registro;
		this.valorMensalidade = valorMensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + "\nRegistro=" + registro + 
				"\nValorMensalidade=" + valorMensalidade + "\n";
	}
	
	public double pagarMensalidade(int dia) {
		if(dia < 5) {
			return valorMensalidade - valorMensalidade*0.05;
		}
		else if(dia > 10) {
			return valorMensalidade + valorMensalidade * 0.1;
		}
		else {
			return valorMensalidade;
		}
	}
	
}

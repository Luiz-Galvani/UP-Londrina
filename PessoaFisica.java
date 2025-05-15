
public class PessoaFisica extends Pessoa{
	private String cpf;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String endereco,
			double rendaBruta, String cpf) {
		super(nome, endereco, rendaBruta);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "Cpf=" + cpf + "\n";
	}
	
	public double calcularImposto() {
		double renda = getRendaBruta();
		if(renda <= 1400) {
			return 0;
		}
		else if(renda > 1400 && renda <= 2100) {
			return renda * 0.1 - 100;
		}
		else if(renda > 2100 && renda <= 2800) {
			return renda * 0.15 - 270;
		}
		else if(renda > 2800 && renda <= 3600) {
			return renda * 0.25 - 500;
		}
		else {
			return renda * 0.3 - 700;
		}
	}
	
}

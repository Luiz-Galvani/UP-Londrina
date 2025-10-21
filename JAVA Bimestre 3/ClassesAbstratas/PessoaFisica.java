package ClassesAbstratas;
public class PessoaFisica extends Pessoa {
    private String cpf;
    public PessoaFisica(){

    }
    public PessoaFisica(String nome, String endereco, double rendaBruta, String cpf){
        super(nome,endereco,rendaBruta);
        this.cpf = cpf;
        
    }
    
    @Override
    public double calculaImposto() {
		double rendaBruta = getRendaBruta();
		if(rendaBruta <= 1400) {
			return 0;
		}
		else if(rendaBruta > 1400 && rendaBruta <= 2100) {
			return rendaBruta * 0.1 - 100;
		}
		else if(rendaBruta > 2100 && rendaBruta <= 2800) {
			return rendaBruta * 0.15 - 270;
		}
		else if(rendaBruta > 2800 && rendaBruta <= 3600) {
			return rendaBruta * 0.25 - 500;
		}
		else {
			return rendaBruta * 0.3 - 700;
		}
	}

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return super.toString() + "PessoaFisica [cpf=" + cpf + "]";
    }
    
    
}

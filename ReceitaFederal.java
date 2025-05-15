import java.util.ArrayList;

public class ReceitaFederal {
	private ArrayList<Pessoa> pessoas;
	
	public ReceitaFederal() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public ReceitaFederal(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public void adicionarPessoa(Pessoa p) {
		boolean achou = false;
		for(int i = 0; i < pessoas.size();i++) {
			if(p instanceof PessoaFisica && pessoas.get(i) instanceof PessoaFisica) {
				PessoaFisica p1 = (PessoaFisica) p;
				PessoaFisica p2 = (PessoaFisica) pessoas.get(i);
				if(p1.getCpf().equals(p2.getCpf())) {
					achou = true;
					break;
				}
			}
			else if(p instanceof PessoaJuridica && pessoas.get(i) instanceof PessoaJuridica) {
				PessoaJuridica p1 = (PessoaJuridica) p;
				PessoaJuridica p2 = (PessoaJuridica) pessoas.get(i);
				if(p1.getCnpj().equals(p2.getCnpj())){
					achou = true;
					break;
				}
			}
		}
		if(achou == false) {
			pessoas.add(p);
			System.out.println("Pessoa adicionada com sucesso!");
		}
		else {
			System.out.println("Não foi possível adicionar a pessoa!");
		}
	}
	public void removerPessoa(String nome){
		boolean achou = false;
		for (int i = 0; i < pessoas.size(); i++){
			if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
				achou = true;
				pessoas.remove(i);
				System.out.println("Pessoa removida com sucesso!");
			}
		}

	}
	public int qntPessoasFisicas(){
		int cont = 0;
		for(int i = 0; i < pessoas.size(); i++){
			if(pessoas.get(i)instanceof PessoaFisica){
					cont++;
			}
		}
		return cont;
	}
	public int qntPessoasJuridicas(){
		int cont = 0;
		for(int i = 0; i < pessoas.size(); i++){
			if(pessoas.get(i)instanceof PessoaJuridica){
				cont ++;
			}
		}
		return cont;
	}
	public void calcularImpostoPessoa(String nome){
		boolean achou = false;
		for(int i = 0; i < pessoas.size(); i++){
			if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
				System.out.println("Imposto a pagar: " + pessoas.get(i).calcularImposto());
				achou = true;
			}
		}
		if (achou == false){
			System.out.println("Pessoa não encontrada!");
		}
	}
	public double totalImposto(){
		double total = 0;
		for(int i = 0; i < pessoas.size(); i ++){
			total += pessoas.get(i).calcularImposto();
		}
		return total;
	}
	public void imprimirDados(){
		for(int i = 0; i < pessoas.size(); i++){
			System.out.println(pessoas.get(i).toString());
		}
	}


}

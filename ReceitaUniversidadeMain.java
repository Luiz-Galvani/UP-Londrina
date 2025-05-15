
public class ReceitaUniversidadeMain {
	public static void main(String [] args) {
		Aluno a1 = new Aluno("João Paulo", 1, 350);
		Bolsista a2 = new Bolsista("Aline Santos", 2, 400, 15);
		
		ReceitaUniversidade ru = new ReceitaUniversidade();
		
		System.out.println("Receita da universidade: " + 
							ru.getValor());
		
		ru.receberPagamento(a1, 1);
		
		System.out.println("Receita da universidade: " + 
							ru.getValor());
		
		ru.receberPagamento(a2, 16);
		
		System.out.println("Receita da universidade: " + 
				ru.getValor());
		
	}
}

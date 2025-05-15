import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        PessoaFisica p1 = new PessoaFisica("Maria das Neves", "Rua 10", 3500, "123123123");
        PessoaJuridica p2 = new PessoaJuridica("Supermercado arco iris", "Rua 50", 200000, "1111111111111");
        pessoas.add(p1);
        pessoas.add(p2); 

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " : " + p.calculaImposto());
        }
    }
    
}

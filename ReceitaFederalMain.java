public class ReceitaFederalMain{
    public static void main(String [] args){
        PessoaFisica p1 = new PessoaFisica("Maria das Neves", "Rua 10", 2500, "123123132");
        PessoaFisica p2 = new PessoaFisica("Pedro Silva", "Rua 5", 6800, "1111111111");
        PessoaJuridica p3 = new PessoaJuridica("Supermercado arco iris", "Rua 50", 200000, "1231312313123");

        ReceitaFederal rf = new ReceitaFederal();
        rf.adicionarPessoa(p1);
        rf.adicionarPessoa(p2);
        rf.adicionarPessoa(p3);
        System.out.println("Quantidade de pessoas físicas: "+ rf.qntPessoasFisicas());
        System.out.println("Quantidade de pessoas jurídicas: "+ rf.qntPessoasJuridicas());
    }
}
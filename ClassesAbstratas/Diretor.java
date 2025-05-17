public class Diretor extends Gerente {

    public double bonificacao(double salario){
        return salario * 0.18;
    }
    public Diretor(){

    }
    public Diretor(String nome, String cpf, double salario, String setor){
        super(nome,cpf,salario,setor);
    }
}

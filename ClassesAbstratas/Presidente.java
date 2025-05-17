public class Presidente extends Funcionario{
    private String divisao;
    

    public Presidente(){

    }

    public Presidente(String nome, String cpf, double salario, String divisao){
        super(nome,cpf,salario);
        this.divisao = divisao;
    }

    @Override
    public double bonificacao() {
        
        return salario * 0.2;
    }


    @Override
    public String toString() {
        return super.toString() + "Presidente [divisao=" + divisao + "]";
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }
    
    
}

package ClassesAbstratas;
public class Gerente extends Funcionario {
    private String setor;
    
    public Gerente(){

    }
    public Gerente(String nome, String cpf, double salario, String setor){
        super(nome,cpf,salario);
        this.setor = setor;

    }
    
    @Override
    public double bonificacao() {
       
        return salario * 0.15;
    }
    
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    @Override
    public String toString() {
        return "Gerente [setor=" + setor + "]";
    }
    
    
}

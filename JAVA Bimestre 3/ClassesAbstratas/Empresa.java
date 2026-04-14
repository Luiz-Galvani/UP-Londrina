package ClassesAbstratas;
import java.util.ArrayList;

public class Empresa{
    private ArrayList<Funcionario> funcionarios;

    public Empresa(){
        funcionarios = new ArrayList<Funcionario>();
    }
    public Empresa(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    public void adicionarFuncionario(Funcionario func){
        funcionarios.add(func);
    }

    public void removerFuncionario(String cpf){
        for (int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getCpf().equals(cpf)){
                System.out.println("Funcionário removido com sucesso!");
            }
        }
    }
    public double gastosBonificacao(){
        double total = 0;
        for(Funcionario f : funcionarios ){
            total += f.bonificacao();

        }
        return total;

    }
}
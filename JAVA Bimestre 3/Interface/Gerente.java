package Interface;

import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticavel{
    private String setor;
    protected int senha;
    
    public Gerente(){

    }
    public Gerente(String nome, String cpf, double salario, String setor, int senha){
        super(nome,cpf,salario);
        this.setor = setor;
        this.senha = senha;

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
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    @Override
    public boolean autentica(int senha){
        ArrayList<String> setores = new ArrayList<String>();
        setores.add("RH");
        setores.add("ADM");
        
        return true;

    }
    

    
    
}

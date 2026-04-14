package TryCatch;

public class ContaExcecao extends Exception {
    private double valor;

    public ContaExcecao(){

    }
    public ContaExcecao(double valor){
        this.valor = valor;
    }
    public String getMessage(){
        return "O saldo é insuficiente para sacar o valor: "+ valor + "!";
    }
    public String toString() {
        return "Saldo insuficiente!";
    }
    
    
}

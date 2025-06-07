package TryCatch;

public class Conta{
    private double saldo;

    public Conta(){

    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo +=  valor;
        System.out.println("Valor depositado!");
    }
    
    public void sacar(double valor){
        try{
            if(saldo >= valor){
                saldo -= valor;
            }
            else{
                throw new ContaExcecao(valor);
            }
        }
        catch(ContaExcecao e){
            System.out.println(e.toString());

        }
    }


}
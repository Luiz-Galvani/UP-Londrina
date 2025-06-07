package TryCatch;

public class ExcecaoImpar extends Exception{
    
    private int numero;
    
    public ExcecaoImpar(){

    }
    public ExcecaoImpar(int numero){
        this.numero = numero;
    }

    public String getMessage(){
        return "O número " + numero + " é ímpar!";
    }
    public String toString(){
        return "O número é ímpar!";
    }
}

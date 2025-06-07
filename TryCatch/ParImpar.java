package TryCatch;

public class ParImpar {
    private int numero;
    public ParImpar(){

    }
    public ParImpar(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;  
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void verificaPar(){
        try{
            if(numero % 2 == 0){
                System.out.println("O número é par e nenhuma exceção é lançada!");

            }
            else{
                throw new ExcecaoImpar(numero);
            }
        }
        catch(ExcecaoImpar e){
            System.out.println(e.toString());
        }
    }

    public void verificaPar2() throws ExcecaoImpar{
        if(numero % 2 ==0){
            System.out.println("O número é par e nenhuma exceção é lançada!");
        }
        else{
            throw new ExcecaoImpar(numero);
        }
    }
    
}

package TryCatch;

public class EX2 {
    public void metodo1(){
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }
    public void metodo2(){
        System.out.println("Início do método 2!");
        int [] vetor = new int[10];
        
        try{
            for(int i = 0; i < 15; i++){
                vetor[i] = i;
                System.out.println(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException o){
            System.out.println(o.toString());
        }
        finally{
            System.out.println("Fim do método 2!");
        }
    }
    
}

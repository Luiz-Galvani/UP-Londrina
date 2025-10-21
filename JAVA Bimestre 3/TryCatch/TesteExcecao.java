package TryCatch;

import java.util.Scanner;

public class TesteExcecao {
    public static void main(String[] args) {
        ParImpar p = new ParImpar();
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número: ");
        p.setNumero(in.nextInt());
        p.verificaPar();
        try{
            p.verificaPar2();
        }
        catch(ExcecaoImpar e){
            System.out.println(e.getMessage());
        }
        finally{
            in.close();
        }
        
    }
    
}

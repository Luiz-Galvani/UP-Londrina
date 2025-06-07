package Revisão;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int num = 0, soma = 0, quant = 0;

        try{
            System.out.println("Informe um número: ");
            num += in.nextInt();
            quant ++;
            while(num < 100){
                System.out.println("Soma: " + num);
                System.out.println("Quantidade de números: " + quant);
                System.out.println("Média: "+ num/quant);
                System.out.println("Informe um número: ");
                num += in.nextInt();
                quant++;
            }
            throw new ExcecaoAcimaDeCem();
        }
        catch (ExcecaoAcimaDeCem e){
            System.out.println(e.toString());
        }
        catch(InputMismatchException e){
            System.out.println(e.toString());
        }
        finally{
            in.close();
        }
    }
}

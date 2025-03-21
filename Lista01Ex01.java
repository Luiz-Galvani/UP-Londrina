
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i, maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;
        double soma=0, media, quantidade=0;
        
        for (i = 1 ; ; i++){
            System.out.print("Informe o número, ou um número negativo para parar a execução:");
            int num;
            num = in.nextInt();

            if(num < 0){
                break;
            }
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            soma += num;
            quantidade++;

        }
        if(quantidade > 0){
            media = soma/quantidade;
            System.out.print("Maior valor: " + maior +"\n");
            System.out.print("Menor valor: " + menor+"\n");
            System.out.print("Média: " + media+"\n");
        }
        else{
            System.out.print("Nenhum valor válido inserido");

        }
        in.close();
    }
}
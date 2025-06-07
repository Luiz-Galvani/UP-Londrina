package Revisão;

import java.util.Random;
import java.util.Scanner;

public class MaiorMenor implements InterfaceJogar {
    private int num;
    Scanner in = new Scanner(System.in);

    public MaiorMenor(){
        resetar();
    }
    public MaiorMenor(int num){
        this.num = num;
    }
    
    


    @Override
    public void jogar() {
        System.out.println("Informee um número para jogar Maior Menor, digite 0 para sair: ");
        int num2 = in.nextInt();
        while (num2 != num){
            System.out.println("Número informado: " + num2);
            if(num2 > num){
                System.out.println("O número sorteado é menor.");
            }
            else if(num2 == 0){
                System.out.println("Saindo do jogo.");
                break;
            }
            else{
                 System.out.println("O número sorteado é maior.");                  
            }
            System.out.println("Informe um número para jogar Maior Menor: ");
            num2 = in.nextInt();
        }
        System.out.println("Você acertou, o número era: " + num + "!");

    }



    @Override
    public void resetar() {
        Random r = new Random();
        num = r.nextInt(100) + 1;        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}

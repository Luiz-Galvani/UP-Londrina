package Revisão;

import java.util.Scanner;

public class Jogar {
    public static void main(String [] args){
        int num;
        Scanner in = new Scanner(System.in);
        CaraCoroa c = new CaraCoroa();
        MaiorMenor m = new MaiorMenor();
        System.out.println("Jogar:\n 1. Menor Maior\n 2. Cara ou Coroa\n3. Finalizar");
        num = in.nextInt();
        switch (num) {
            case 1:
                m.jogar();
                break;
        
            default:
                break;
        }
        }

    
}

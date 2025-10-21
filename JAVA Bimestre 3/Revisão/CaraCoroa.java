package Revisão;

import java.util.Random;
import java.util.Scanner;

public class CaraCoroa implements InterfaceJogar{
    private int num;
    Scanner in = new Scanner(System.in);

    public CaraCoroa(){
        resetar();
    }
    public CaraCoroa(int num){
        this.num = num;


    }
    @Override
    public void jogar() {
        System.out.println("Cara ou Coroa, digite 1 para Cara e 2 para Coroa: ");
        Random r = new Random();
        num = r.nextInt(2) + 1;
        System.out.println("Informe um número (1 ou 2): ");
        int num2 = in.nextInt();
        if(num2 == num){
            System.out.println("Acertou!");
        }
        else{
            System.out.println("Errou!");
        }
    }

    @Override
    public void resetar() { 
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }
    
    
}

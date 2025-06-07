package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Calculadora c = new Calculadora();
        try{
            System.out.println("Informe o primeiro número: ");
            c.setX(in.nextInt());

            System.out.println("Informe o segundo número: ");
            c.setY(in.nextInt());
        
            System.out.println("Divisão : "+ c.divisao());
        }
        catch(InputMismatchException e ){
            System.out.println(e.getMessage());
        }
        in.close();
    }
}

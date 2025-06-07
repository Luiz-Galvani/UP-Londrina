package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    private int x;
    private int y;

    public Calculadora(){

    }

    public Calculadora(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int soma(){
        return x + y;
    }
    public int subttracao(){
        return x - y;
    }
    public int multiplicacao(){
        return x * y;

    }
    public int divisao(){
        boolean continuar = true;
        while(continuar){
            try{
                return x / y;
            }
            catch(ArithmeticException e){
                System.out.println("Divisão por zero!" + e.getMessage());
                Scanner in = new Scanner(System.in);
                System.out.println("Informe outro número: ");
                y = in.nextInt();
                        
            }
        }
        return -1;
        
    }

    public int divisao2(){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Informe o primeiro número: ");
            x = in.nextInt();

            System.out.println("Informe o segundo número: ");
            y = in.nextInt();
            return x / y;
        }
        catch(ArithmeticException e){
            System.out.println("Erro: "+ e.toString());
        }
        catch(InputMismatchException e){
            System.out.println("Erro : "+ e.toString());
        }
        return -1;
    }

    public int divisao3(){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Informe o primeiro número: ");
            x = in.nextInt();
            System.out.println("Informe o segundo número: ");
            y = in.nextInt();
        }
        catch(Exception e){
            System.out.println("Erro: " + e.toString());
        }
        return -1;
    }
    
}

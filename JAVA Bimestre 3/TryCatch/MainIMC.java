package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainIMC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double peso = 0;
        double altura = 0;

        while (true) {
            try {
                System.out.println("Informe o seu peso: ");
                peso = in.nextDouble();
                if (peso <= 0) {
                    System.out.println("Peso deve ser um valor positivo. Tente novamente.");
                    continue;
                }
                break; 
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida para o peso. Tente novamente.");
                in.nextLine();
            }
        }


        while (true) {
            try {
                System.out.println("Informe a sua altura: ");
                altura = in.nextDouble();
                if (altura <= 0) {
                    System.out.println("Altura deve ser um valor positivo e maior que zero. Tente novamente.");
                    continue; 
                }
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida para a altura. Tente novamente.");
                in.nextLine(); 
            }
        }
        altura = altura / 100;
        double imc = peso / (Math.pow(altura, 2));

        System.out.println("IMC: " + String.format("%.2f", imc));

        in.close();
    }
}
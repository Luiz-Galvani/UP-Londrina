package TryCatch;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args){
        Conta c = new Conta();
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite 1 para Depósito, 2 para Sacar e 0 para sair: ");
            num = in.nextInt();

            switch(num) {
                case 1:
                    System.out.println("Insira um valor para o depósito:");
                    c.depositar(in.nextDouble());
                    break;
                case 2:
                    System.out.println("Informe um valor para sacar: ");
                    c.sacar(in.nextDouble());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while(num != 0);

        in.close();
    }
}

package ManipulacaoArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exemplo2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo: ");
        String nome = in.nextLine();
        
        try{
            FileWriter file = new FileWriter(nome, true);
            BufferedWriter buffWrite = new BufferedWriter(file);
            System.out.println("Entre com alguma informação: ");
            String texto = in.nextLine();
            buffWrite.append(texto + "\n");
            buffWrite.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
        in.close();
        
    }
}

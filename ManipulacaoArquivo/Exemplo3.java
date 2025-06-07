package ManipulacaoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o arquivo: ");
        String nome = in.nextLine();
        try{
            FileReader file = new FileReader(nome);
            BufferedReader buffRead = new BufferedReader(file);
            String linha = "";
            while( linha != null ){
                System.out.println(linha);
                linha = buffRead.readLine();
            }
            buffRead.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}

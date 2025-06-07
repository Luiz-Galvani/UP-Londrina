package ManipulacaoArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exeercico2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo: ");
        String nomeArquivo = in.nextLine();
        System.out.println("Informe o curso: ");
        String curso = in.nextLine();
        int cont = 0;
        try{
            FileReader leitor = new FileReader(nomeArquivo);
            BufferedReader buffReader = new BufferedReader(leitor);
            String linha ="";
            while( linha != null){
                linha = buffReader.readLine();
                String palavras[] = linha.split("\t");
                if(palavras[2].equalsIgnoreCase(curso)){
                    cont++;
                }
            }
            buffReader.close();
            System.out.println("Quantidade de alunos: " + cont);
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }   
}

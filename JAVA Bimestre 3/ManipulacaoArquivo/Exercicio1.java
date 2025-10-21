package ManipulacaoArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o arquivo: ");
        String nomeArquivo = in.nextLine();
        String nome;
        String curso;
        int ra;
            
        
        try{
            FileWriter file = new FileWriter(nomeArquivo, true);
            BufferedWriter buffWrite = new BufferedWriter(file);
            System.out.println("Informe o RA: ");
            ra =in.nextInt();
            while(ra != -1){
                in.nextLine();               
                System.out.println("Entre com o nome: ");
                nome = in.nextLine();

                System.out.println("Entre com o curso: ");
                curso = in.nextLine();
                
                buffWrite.append(ra + "\t" + nome + "\t" + curso + "\n");
                
                System.out.println("Informe o RA: ");
                ra =in.nextInt();
                
            }
            buffWrite.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    
        
        try{
            FileReader file = new FileReader(nomeArquivo);
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

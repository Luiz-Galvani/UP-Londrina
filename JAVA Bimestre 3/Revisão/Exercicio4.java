package Revisão;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Exercicio4 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("C:\\Workspace\\LANG\\UPLondrina\\Revisão\\Nomes.txt");
            BufferedReader burffR = new BufferedReader(file);
            ArrayList<String> nomes = new ArrayList<String>();
            String linha = burffR.readLine();
            while(linha != null){
                nomes.add(linha);
                linha = burffR.readLine();
            }
            burffR.close();
            Collections.sort(nomes);
            FileWriter fileW = new FileWriter("C:\\Workspace\\LANG\\UPLondrina\\Revisão\\Nomes.txt");
            BufferedWriter buffW = new BufferedWriter(fileW);
            for(String nome : nomes){
                buffW.write(nome + "\n");
            }
            buffW.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}

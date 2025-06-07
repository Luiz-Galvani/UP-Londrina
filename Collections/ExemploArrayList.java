package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList{
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(50);
        numeros.add(44);
        numeros.add(0);


        System.out.println("Antes da ordenação: " + numeros);

        Collections.sort(numeros);

        System.out.println("Depois da ordenação: " + numeros);

        System.out.println("Busca do número 5: " + Collections.binarySearch(numeros, 44));

        System.out.println("Maior: " + Collections.max(numeros));
        System.out.println("Menor: " + Collections.min(numeros));

        numeros.add(44);

        System.out.println("Frequência do 44: " + Collections.frequency(numeros, 44) + " vezes.");
        
        Collections.reverse(numeros);

        System.out.println("Lista invertida: " +  numeros);
    }
}
package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class ExemploConjuntos {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<String>();
        conjunto.add("Diretor");
        conjunto.add("Presidente");
        conjunto.add("Analista de TI");
        conjunto.add("Secretária");

        conjunto.add("Analista de TI");
        conjunto.add("Secretária");

        System.out.println(conjunto);

        for(String cargo : conjunto){
            System.out.println(cargo);
        }

        System.out.println("------------------------------------------");
        
        Iterator<String> elemento = conjunto.iterator();

        while(elemento.hasNext()){
            System.out.println(elemento.next());
        }
    }
}

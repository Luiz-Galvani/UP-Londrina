package Collections;

import java.util.HashMap;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Conta> hash = new HashMap<String, Conta>();
         Conta c1 = new Conta(1, "12345", "23456-9", 1000);
         Conta c2 = new Conta(2, "23456", "34456-X", 5000);
         hash.put("Maria das Neves", c1);
         hash.put("Paulo da Silva", c2);


         System.out.println("Saldo da conta da Maria das Neves: " + hash.get("Maria das Neves").getSaldo());

         Set<String> chaves = hash.keySet();

         for(String chave : chaves){
            System.out.println(chave + " " + hash.get(chave).toString());
         }
    }
}

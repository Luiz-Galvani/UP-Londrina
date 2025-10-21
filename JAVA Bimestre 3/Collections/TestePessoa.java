package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestePessoa{
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa p1 = new Pessoa("Maria das Neves", "216.965.362-99", "10/08/1988");
        Pessoa p2 = new Pessoa("Joao da Silva", "123.123.123-22", "10/10/2000");
        Pessoa p3 = new Pessoa("Eliana Moraes", "222.222.222-00", "15/06/2000");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Pessoas antes da ordenação: " + pessoas);

        Collections.sort(pessoas);

        System.out.println("Pessoas depois da ordenação: " + pessoas);

    }
}
package Interface;

import java.util.ArrayList;

public class Cidade {
    private ArrayList<EmissaoCarbono> elementos;
    
    public Cidade(){
        elementos = new ArrayList<EmissaoCarbono>();
    }

    public Cidade(ArrayList<EmissaoCarbono> elementos){
        this.elementos = elementos;
    }

    public void adicionaElementos(EmissaoCarbono e){
        elementos.add(e);
    }

    public double totalCarbono(){
        double total = 0;
        for(EmissaoCarbono e : elementos){
            total += e.quantidadeEmitida();
        }
        return total;
    }
}

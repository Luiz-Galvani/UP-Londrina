package Revisão;

import java.util.HashMap;

import org.omg.IOP.ProfileIdHelper;

public class Estoque {
    private HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();

    public Estoque(){
        produtos = new HashMap<Integer, Produto>();
    }
    public Estoque(HashMap<Integer,Produto> produtos){
        this.produtos = produtos;

    }
    public HashMap<Integer, Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(HashMap<Integer, Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarPoduto(Produto p){
        produtos.put(produtos.keySet().size() + 1, p);
    }
}

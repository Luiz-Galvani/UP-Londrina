package Revisao2.EX1;

import java.util.ArrayList;

public class Locacao {
    private ArrayList<Item> itensLocados;

    public Locacao(){
        itensLocados = new ArrayList<Item>();
    }
    public Locacao(ArrayList<Item> itensLocados){
        this.itensLocados = itensLocados;
    }
    public void adicionarItem(Item item){
        itensLocados.add(item);
    }
    public void removerItem(String nome){
        boolean achou = false;
        for(int i = 0; i < itensLocados.size(); i++){
            if ((itensLocados.get(i).getNome().equalsIgnoreCase(nome))) {
                itensLocados.remove(i);
                achou = true;
                System.out.println("Item removido!");
                break;
            }
        }
        if(!achou){
            System.out.println("O item não está na lista!");
        }
    }
    public double valorTotal(){
        double total = 0;
        for(Item item : itensLocados){
            total += item.getPreco();
        }
        return total;
    }
    public int quantidadeItens(){
        return itensLocados.size();
    }
    public int quantidadeLivros(){
        int count = 0;
        for(Item item : itensLocados){
            if(item instanceof Livros){
                count ++;
            }
        }
        return count;

    }
    public void imprimirItens(){
        for(Item item : itensLocados){
            System.out.println(item.toString());
        }
    }
}

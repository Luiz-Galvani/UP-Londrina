package Revisao2.EX1;

public class DVDs extends Item {
    private int duracao;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public DVDs(){

    }
    public DVDs(String nome, double preco, int duracao){
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}

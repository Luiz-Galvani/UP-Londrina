package Revisao2.EX1;

public abstract class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Item(){

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Nome = " + nome + "\nPreço = " + preco;
    }
    
}

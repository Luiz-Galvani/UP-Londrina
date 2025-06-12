package Revisao2.EX1;

public class Livros extends Item {
    private String autor;
    public Livros(){

    }
    public Livros(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

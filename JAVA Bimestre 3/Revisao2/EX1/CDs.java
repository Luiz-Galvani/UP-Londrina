package Revisao2.EX1;

public class CDs extends Item {
    private int numFaixas;

    public CDs(){

    }
    public CDs(String nome, double preco, int numFaixas){
        super(nome, preco);
        this.numFaixas = numFaixas;
    }
    public int getNumFaixas() {
        return numFaixas;
    }
    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}

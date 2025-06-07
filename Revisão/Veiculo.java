package Revisão;

public abstract class Veiculo {
    private String cor;
    private String placa;
    private String marca;
    private double imposto;

    public Veiculo(){

    }
    public Veiculo(String cor, String placa, String marca, double imposto){
        this.cor = cor;
        this.placa = placa;
        this.marca = marca; 
        this.imposto = imposto;

    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public abstract double valorLocacao();
    
}

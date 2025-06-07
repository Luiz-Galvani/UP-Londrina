package Revisão;

public class Caminhao extends Veiculo {
    private int eixos;
    
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    public Caminhao(){

    }
    
    public Caminhao(String cor, String placa, String marca, double imposto,int eixos){
        super(cor,placa,marca,imposto);
        this.eixos = eixos;
    }

    @Override
    public double valorLocacao() {
        return getImposto() + (eixos*100);
    }

    
}

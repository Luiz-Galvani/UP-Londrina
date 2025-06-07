package Revisão;

public class Motos extends Veiculo{
    private int cilindradas;

    public Motos(){

    }

    public Motos(String cor, String placa, String marca, double imposto,int cilindradas){
        super(cor,placa,marca,imposto);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public double valorLocacao() {
        if(cilindradas >= 150){
            return getImposto() + (cilindradas*0.3);
        }
        else{
            return 0;
        }
    }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
}

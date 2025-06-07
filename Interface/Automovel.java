package Interface;

public class Automovel implements EmissaoCarbono{
    private int combustivel;
    private double kms;
    public Automovel(){

    }
    public Automovel(int combustivel, double kms){
        this.combustivel = combustivel;
        this.kms = kms;
    }
    
    @Override
    public double quantidadeEmitida() {
        if(combustivel == 1){
            return 96 * kms;
        }
        else if(combustivel == 2){
            return 53 * kms;
        }
        else if(combustivel == 3){
            return 171 * kms;
        }
        else{
            System.out.println("Combustível inválido!");
            return 0;
        }
    }
    public int getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }
    
}

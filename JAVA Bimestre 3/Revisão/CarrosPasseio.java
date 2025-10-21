package Revisão;

public class CarrosPasseio extends Veiculo {
    private int classe;
    public CarrosPasseio(){

    }
    public CarrosPasseio(String cor, String placa, String marca, double imposto,int classe){
        super(cor,placa,marca,imposto);
        this.classe = classe;
    }

    @Override
    public double valorLocacao() {
        if(classe == 1){
            return getImposto() + 100;
        }    
        else{
            return getImposto() + 300;
        }
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
    
    
}

package Interface;

public class Bicicleta implements EmissaoCarbono{
    private String cor;
    private String marca;
    

    public Bicicleta(){

    }
    public Bicicleta(String cor, String marca){
        this.cor = cor;
        this.marca = marca;

    }
    @Override
    public double quantidadeEmitida() {
        
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}

package Interface;

public class Predio implements EmissaoCarbono {
    private int numPessoas;
    private boolean usoEnergiaRenovavel;
    private int numLampadas;
    private int numArCondicionado;


    public Predio(){

    }
    public Predio(int numPessoas, boolean usoEnergiaRenovavel, int numLampadas, int numArCondicionado){
        this.numPessoas = numPessoas;
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
        this.numLampadas = numLampadas;
        this.numArCondicionado = numArCondicionado;

    }
    
    @Override
    public String toString() {
        return "Predio [numPessoas=" + numPessoas + ", usoEnergiaRenovavel=" + usoEnergiaRenovavel + ", numLampadas="
                + numLampadas + ", numArCondicionado=" + numArCondicionado + "]";
    }
    @Override
    public double quantidadeEmitida() {
        double total = 14.4 * numLampadas + 10 * numPessoas + 100 * numArCondicionado;
        if(usoEnergiaRenovavel == true){
            return total/2;
        }
        return total;
    }



    public int getNumPessoas() {
        return numPessoas;
    }



    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }



    public boolean getUsoEnergiaRenovavel() {
        return usoEnergiaRenovavel;
    }



    public void setUsoEnergiaRenovavel(boolean usoEnergiaRenovavel) {
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
    }



    public int getNumLampadas() {
        return numLampadas;
    }



    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }



    public int getNumArCondicionado() {
        return numArCondicionado;
    }



    public void setNumArCondicionado(int numArCondicionado) {
        this.numArCondicionado = numArCondicionado;
    }
    
}

public abstract class Pessoa{
    protected String nome;
    protected String endereco;
    protected double rendaBruta;
    public Pessoa(){

    }
    public Pessoa(String nome, String endereco, double rendaBruta){
        this.nome = nome;
        this.endereco = endereco;
        this.rendaBruta = rendaBruta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getRendaBruta() {
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", rendaBruta=" + rendaBruta + "]";
    }
    public abstract double calculaImposto();
}
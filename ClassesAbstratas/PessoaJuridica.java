public class PessoaJuridica extends Pessoa{
    private String cnpj;
    public PessoaJuridica(){

    }
    public PessoaJuridica(String nome, String endereco, double rendaBruta, String cnpj){
        super(nome, endereco, rendaBruta);
        this.cnpj = cnpj;

    }
    
    @Override
    public String toString() {
        return super.toString()+ "PessoaJuridica [cnpj=" + cnpj + "]";
    }
    @Override
    public double calculaImposto() {
        return rendaBruta * 0.1;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
package Collections;

public class Conta {
    private int tipo;
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(){

    }

    public Conta(int tipo, String agencia, String numero, double saldo){
        this.tipo = tipo;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tipo = " + tipo +"\nAgência = " + agencia + "\nNúmero = " + numero + "\nSaldo = " + saldo + "\n";
    }
    
}

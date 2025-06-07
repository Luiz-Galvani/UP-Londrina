package ClassesAbstratas;
public class Retangulo extends Forma {
    private double lado1;
    private double lado2;

    public Retangulo(){

    }
    public Retangulo(double lado1,double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Lado1=" + lado1 + "\nLado2=" + lado2 + "\n";
    }


    @Override
    public double calcularArea() {
        return lado1*lado2;
    }
    @Override
    public double calcularPerimetro() {
        return 2*(lado1*lado2);
    }

    
}

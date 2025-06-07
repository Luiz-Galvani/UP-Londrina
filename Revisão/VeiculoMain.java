package Revisão;

import java.util.Scanner;

public class VeiculoMain {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Caminhao c1 = new Caminhao();
        CarrosPasseio cp = new CarrosPasseio();
        Motos m1 = new Motos();

        c1.setImposto(100);
        cp.setImposto(100);
        m1.setImposto(100);
        System.out.println("Informe o número de eixos: ");
        c1.setEixos(in.nextInt());
        System.out.println("Informe a classe do carro (1 para popular, e qualquer dígito para luxo): ");
        cp.setClasse(in.nextInt());
        System.out.println("Informe as cilindradas da moto: ");
        m1.setCilindradas(in.nextInt());

        System.out.println("Valor de locação da moto: " + m1.valorLocacao() );
        System.out.println("Valor de locação do carro de passeio: " + cp.valorLocacao() );
        System.out.println("Valor de locação do caminhão: " + c1.valorLocacao() );
    }
    
}

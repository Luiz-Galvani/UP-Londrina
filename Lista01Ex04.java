import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double massaInicial, massaFinal, massa;
		int horas = 0, minutos = 0, segundos = 0;
		System.out.println("Informe o a massa do material em gramas: ");
		massa = in.nextDouble();
		massaInicial=massa;
		while (massa > 0.5) {
			massa = massa/2;
			segundos +=  50;
		}
		massaFinal=massa;
		horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;
		
	    System.out.println("Massa inicial: " + massaInicial + " gramas");
	    System.out.println("Massa final: " + massaFinal + " gramas");
	    System.out.println("Tempo necessário: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
		in.close();
	}

}

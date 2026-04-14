import java.util.Scanner;
public class Lista01Ex05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int velocMax, velocCarro;
		double multa;
		System.out.println("Informe a velocidade do motorista(Km/h): ");
		velocCarro = in.nextInt();
		System.out.println("Informe a velocidade máxima(Km/h) permitida na via: ");
		velocMax = in.nextInt();
		if( velocCarro > velocMax && velocCarro <= (velocMax*1.2) ) {
			multa = 130.16; 
			System.out.println("Valor da multa: R$ "+multa);
		}
		if( velocCarro > (velocMax*1.2) && velocCarro < (velocMax*1.5) ){
			multa = 195.23;
			System.out.println("Valor da multa: R$ "+multa);
		}
		if(velocCarro >= (velocMax*1.5) ) {
			multa = 880.41;
			System.out.println("Valor da multa: R$ "+multa);
		}
		if( velocCarro < velocMax ) {
			System.out.println("O motorista não ultrapassou o limite da via.");
		}
		
		
		
		in.close();
	}

}

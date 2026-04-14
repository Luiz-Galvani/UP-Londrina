import java.util.Scanner;
import java.util.Random;
public class Lista01Ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int sortead = rnd.nextInt(100);
		int num;
		int contador = 0;
		System.out.println("Informe um número: ");
		num = in.nextInt();
		if(num == sortead) {
			System.out.println("Acertou!");
			contador++;
			return;
		}
		if(num > sortead) {
			System.out.println("O número sorteado é MENOR!");
			contador++;
		}
		if(num < sortead) {
			System.out.println("O número sorteado é MAIOR!");
			contador++;
		}
		while( num != sortead) {
			System.out.println("Informe um número: ");
			num = in.nextInt();
			if(num == sortead) {
				System.out.println("Acertou!");
				contador++;
				System.out.println("Tentativas até o acerto: "+ contador + ".");
				break;
			}
			if(num > sortead) {
				System.out.println("O número sorteado é MENOR!");
				contador++;
			}
			if(num < sortead) {
				System.out.println("O número sorteado é MAIOR!");
				contador++;
			}
			
		}
		in.close();
	}

}

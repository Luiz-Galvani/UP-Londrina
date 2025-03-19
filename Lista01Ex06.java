import java.util.Scanner;
import java.util.Random;
public class Lista01Ex06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int sortead = rnd.nextInt(100);
		int num;
		System.out.println("Informe um número: ");
		num = in.nextInt();
		if(num == sortead) {
			System.out.println("Acertou!");
			return;
		}
		if(num > sortead) {
			System.out.println("O número sorteado é MENOR!");
		}
		if(num < sortead) {
			System.out.println("O número sorteado é MAIOR!");
		}
		while( num != sortead) {
			System.out.println("Informe um número: ");
			num = in.nextInt();
			if(num == sortead) {
				System.out.println("Acertou!");
				break;
			}
			if(num > sortead) {
				System.out.println("O número sorteado é MENOR!");
			}
			if(num < sortead) {
				System.out.println("O número sorteado é MAIOR!");
			}
			
		}
		in.close();
	}

}

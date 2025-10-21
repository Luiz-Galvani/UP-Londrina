import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int soma, pt1, pt2;
		System.out.println("Informe o número de 4 algarismos: ");
		n = in.nextInt();
		
		if (n <= 9999 && n >= 1000) {
			pt1 = n/100;
			pt2 = n%100;
			soma = pt1 + pt2;
			
			if (Math.sqrt(n) == soma) {
				System.out.println("A soma das duas partes do número "+n +" é igual a raiz do mesmo.");
			}
			else {
				System.out.println("A soma das duas partes do número "+n +" não é igual a raiz do mesmo.");
			}
		}
		else {
			System.out.println("O número inserido não possui 4 algarismos.");
		}
				
	}

}

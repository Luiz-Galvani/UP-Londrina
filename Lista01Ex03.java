public class ex03 {
	public static void main(String[] args) {
		int ze = 110, chico = 150;
		int anos=0;
		int i;
		for (i=1; ;i++) {
			if(ze < chico) {
				ze = ze + 3;
				chico = chico + 2;
				anos++;
			}
			else {
				System.out.println("Serão necessários " + anos +" para que Ze passe Chico.");
				break;
			}
		}
	}
}

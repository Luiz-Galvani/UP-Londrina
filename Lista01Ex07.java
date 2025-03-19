import java.util.Scanner;
public class Lista01Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = in.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();

        String[] partes = nomeCompleto.split(" ");

        StringBuilder resultado = new StringBuilder();


        for (int i = 0; i < partes.length; i++) {
            String parte = partes[i];
            
  
            if (parte.length() > 2) {
                resultado.append(parte.charAt(0)).append(".");
           
            } else {
                resultado.append(" ").append(parte).append(" ");
            }
        }
        System.out.println("Abreviação: " + resultado.toString().trim());
    }
}


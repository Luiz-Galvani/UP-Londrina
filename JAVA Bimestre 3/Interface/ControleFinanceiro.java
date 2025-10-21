package Interface;

import java.util.Scanner;



public class ControleFinanceiro {
    public void login(Autenticavel a){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma senha: ");
        int senha = in.nextInt();
        if(a.autentica(senha)){
            System.out.println("Usuário logado!");
        }
        else{
            System.out.println("Permissão negada!");
        }
        in.close();
    }
    
}

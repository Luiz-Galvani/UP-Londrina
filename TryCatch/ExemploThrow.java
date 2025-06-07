package TryCatch;

import java.util.Scanner;

public class ExemploThrow {
    public static void main(String[] args){
        String senha = "123456";
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Informe a senha: ");
            String senhaUser = in.nextLine();
            if(!senhaUser.equals(senha)){
                throw new Exception("Senha inválida!");
            }
            System.out.println("Senha correta!");
        }
        catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
        finally{
            in.close();
        }

    }
}

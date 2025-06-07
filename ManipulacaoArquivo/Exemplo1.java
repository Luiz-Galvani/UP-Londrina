package ManipulacaoArquivo;
import java.io.File;
import java.util.Scanner;


public class Exemplo1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um nome de um arquivo ou diretório: ");
        String nome = in.nextLine();
        File objFile = new File(nome);
        if(objFile.exists()){
            if(objFile.isFile()){
                System.out.println("O arquivo " + objFile.getName() + " tem " + objFile.length() + " bytes.");
            }
            else{
                String diretorio[] = objFile.list();
                System.out.println("Conteúdo do diretório ");
                for( String item : diretorio){
                    System.out.println(item);
                }
            }
        }
        else{
            System.out.println("O arquivo/diretório não existe!");
        }
        
        in.close();

    }
    
}

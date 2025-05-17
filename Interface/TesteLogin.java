package UPLondrina.Interface;

public class TesteLogin {
    public static void main(String [] args){
        ControleFinanceiro cf = new ControleFinanceiro();
        Gerente g = new Gerente("Maria Silva", "1111111111111", 12000, "TI", 12345);
        cf.login(g);
    }
    
}

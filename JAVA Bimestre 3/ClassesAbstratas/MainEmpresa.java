package ClassesAbstratas;
public class MainEmpresa {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        Gerente g = new Gerente("Paulo Santos", "1111111111111", 12000, "TI");
        Diretor d = new Diretor("Maria Silva", "2222222222222222", 5000, "RH");
        Presidente p = new Presidente("Saulo Neves", "33333333333333333", 50000, "Sul");
        emp.adicionarFuncionario(p);
        emp.adicionarFuncionario(d);
        emp.adicionarFuncionario(g);
        System.out.println("Total gasto com bonificação: "+ emp.gastosBonificacao());
    }
    
}

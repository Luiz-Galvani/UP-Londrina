package Interface;

public class MainCidade {
    public static void main(String[] args){

        Cidade c = new Cidade();
        Predio e1 = new Predio( 1000, false, 50000, 200);
        Automovel e2 = new Automovel(1, 500);
        Bicicleta e3 = new Bicicleta("Azul", "Caloi");
        c.adicionaElementos(e1);
        c.adicionaElementos(e2);
        c.adicionaElementos(e3);

        System.out.println("Quantidade de carbono: "+ c.totalCarbono());
    }
    
}

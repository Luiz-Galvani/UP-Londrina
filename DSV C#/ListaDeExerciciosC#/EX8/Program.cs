public class Program
{
    public static void Main(string[] args)
    {
        Produtos prod1 = new Produtos();
        prod1.Nome = "Celular";
        prod1.ID = 1;
        prod1.Preco = 5000.50;
        Produtos prod2 = new Produtos(2, "Notebook", 7500.00);
        Produtos prod3 = new Produtos(3, "PC", 10000.00);

        Console.WriteLine("Produto 1:\n" + prod1 );
        double precoComDesconto = prod1.MostrarPrecoComDesconto(10);
        Console.WriteLine("Preço com 10% de desconto: " + precoComDesconto.ToString("F2"));

        Console.WriteLine("\nProduto 2:\n" + prod2 );
        double precoComDesconto2 = prod2.MostrarPrecoComDesconto(10);
        Console.WriteLine("Preço com 10% de desconto: " + precoComDesconto2.ToString("F2"));

        Console.WriteLine("\nProduto 3:\n" + prod3 );
        double precoComDesconto3 = prod3.MostrarPrecoComDesconto(10); 
        Console.WriteLine("Preço com 10% de desconto: " + precoComDesconto3.ToString("F2"));

    }
}
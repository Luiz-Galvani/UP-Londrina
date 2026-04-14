public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de leitura e e escrita de nome.");

        Console.WriteLine("Informe um nome: ");
        string nome = Console.ReadLine();

        Console.WriteLine("Informe sua idade:");
        int idade = int.Parse(Console.ReadLine());

        Console.WriteLine(" \nOlá, " + nome + ".Você tem " + idade + " anos.");
    }
}
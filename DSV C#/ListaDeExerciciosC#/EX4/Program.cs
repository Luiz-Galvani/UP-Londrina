public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de FOR.");
        Console.WriteLine("Informe um número inteiro: ");
        int num = int.Parse(Console.ReadLine());
        Console.WriteLine("Sequência: ");
        for (int i = 1; i <= num; i++)
        {
            Console.WriteLine(i );
        }
    }
}
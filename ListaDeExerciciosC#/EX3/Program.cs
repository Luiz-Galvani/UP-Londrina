public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício Par ou Ímpar");
        Console.WriteLine("Informe um número para verificar se é Par ou Ímpar:");
        double num = double.Parse(Console.ReadLine());

        if (num % 2 == 0)
        {
            Console.WriteLine("O número " + num + " é PAR.");
        }
        else
        {
            Console.WriteLine("O número " + num + " é ÍMPAR.");

        }
    }
}
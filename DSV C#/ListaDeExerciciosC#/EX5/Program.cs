public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de WHILE.");
        Console.WriteLine("Informe números para somar, para finalizar, informe 0.");

        double soma = 0;
        double num;
        do
        {
            Console.WriteLine("Informe um número para a soma: ");
            num = double.Parse(Console.ReadLine());
            soma += num;
        } while (num != 0);

        Console.WriteLine("Soma final: " + soma);
    }
}
public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de operações matemáticas.");
        Console.WriteLine("Informe dois números: ");
        Console.WriteLine("Primeiro número: ");
        double num1 = double.Parse(Console.ReadLine());
        Console.WriteLine("Segundo double: ");
        double num2 = double.Parse(Console.ReadLine());

        Console.WriteLine("Operações:\n" +
                            "Soma: " + (num1 + num2)+"\n" +
                            "Subtração: " +(num1 - num2)+"\n" +
                            "Divisão: " + (num1/num2).ToString("F2")+"\n" +
                            "Multiplicação: " + (num1 * num2));

        
    }
}
public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de VETOR.");
        int[] numeros = new int[5];

        Console.WriteLine("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.Length; i++)
        {
            Console.Write("Número "+ (i + 1) + ":" );
            numeros[i] = int.Parse(Console.ReadLine());
        }

        int maior = numeros[0];

        for (int i = 1; i < numeros.Length; i++)
        {
            if (numeros[i] > maior)
            {
                maior = numeros[i];
            }
        }

        Console.WriteLine("O maior valor digitado foi: " + maior);
    }
}

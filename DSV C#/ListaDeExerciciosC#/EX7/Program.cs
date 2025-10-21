using System;

public class Program
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Exercício de MATRIZ.");

        int[,] matriz = new int[2, 2];
        int soma = 0;

        Console.WriteLine("Digite os elementos da matriz 2x2:");

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                Console.Write($"Elemento [{i+1},{j+1}]: ");
                matriz[i, j] = int.Parse(Console.ReadLine());
                soma += matriz[i, j];
            }
        }

        Console.WriteLine("\nA soma de todos os elementos da matriz é: " + soma);
    }
}

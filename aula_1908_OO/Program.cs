// See https://aka.ms/new-console-template for more information
public class Program
{
    public static void Main(string[] args)
    {
        ContaCorrente conta1 = new ContaCorrente();
        Cliente cliente1 = new Cliente();
        conta1.agencia = 12;
        conta1.titular = "Luiz";
        conta1.saldo = 200;
        conta1.conta = "123-X";

        conta1.Sacar();

        cliente1.Nome = "Juliana";
        Console.WriteLine(cliente1.Nome);
        cliente1.setCpf("090909090909");
        cliente1.Email = "l@gmail.com";
    }
}
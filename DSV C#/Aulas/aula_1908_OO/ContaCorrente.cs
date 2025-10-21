public class ContaCorrente
{
    public string titular;
    public int agencia;
    public string conta;
    public double saldo;
    public bool Sacar()
    {
        double valor;
        Console.WriteLine("Saldo atual: " + saldo);
        Console.WriteLine("Informe um valor para saque: ");
        valor = double.Parse(Console.ReadLine());

        if (valor <= saldo)
        {
            saldo = saldo - valor;
            Console.WriteLine("Saque completo!");
            Console.WriteLine("Novo saldo:" + saldo);
            return true;
        }
        else
        {
            Console.WriteLine("Saldo insuficiente!\nInforme um valor válido.");
            return false;
        }
    }
}
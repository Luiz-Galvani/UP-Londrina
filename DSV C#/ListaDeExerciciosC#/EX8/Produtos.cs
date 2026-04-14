public class Produtos
{
    int id;
    string nome;
    double preco;

    ////Explicação:
    ///  O encapsulamento protege os dados internos da classe.
    ///  Ele aumenta a segurança, permite validações e mantém o código mais flexível e confiável.
    public Produtos(int id, string nome, double preco)
    {
        this.ID = id;
        this.Nome = nome;
        this.Preco = preco;
    }
    public Produtos()
    {
        
    }

    public string Nome
    {
        get
        {
            return nome;
        }
        set
        {
            nome = value;
        }
    }
    public double Preco
    {
        get
        {
            return preco;
        }
        set
        {
            preco = value;
        }
    }
    public int ID
    {
        get
        {
            return id;
        }
        set
        {
            id = value;
        }
    }
    public override string ToString()
    {
        return "ID: " + ID + "\nNome: " + Nome + "\nPreco: " + Preco.ToString("F2");
    }
     public double MostrarPrecoComDesconto(double percentual)
    {
        double desconto = Preco * (percentual / 100);
        return Preco - desconto;
    }
}
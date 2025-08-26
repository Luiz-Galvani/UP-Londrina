public class Pessoa
{
    string nome;
    int idade;

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
    public int Idade
    {
        get
        {
            return idade;
        }
        set
        {
            idade = value;
        }
    }
    public virtual string Apresentar()
    {
        return "Olá, eu sou uma pessoa";
    }
}
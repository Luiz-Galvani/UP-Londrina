public class Cliente
{

    //no C#, se não declarar a visibilidade, ele fica automaticamente como PRIVATE
    string nome;
    string cpf;
    string email;
    string telefone;

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
    public string getCpf()
    {
        return this.cpf;
    }
    public void setCpf(string cpf)
    {
        this.cpf = cpf;
    }
    
        public string Email
    {
        get
        {
            return email;
        }
        set
        {
            email = value;
        }
    }
}
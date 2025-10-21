public class Aluno : Pessoa
{
    string curso;

    public string Curso
    {
        get
        {
            return curso;
        }
        set
        {
            curso = value;
        }
    }

    public override string Apresentar()
    {
        return "Olá, eu sou um aluno do curso: " + Curso;
    }
    public override string ToString()
    {
        return "Nome: " + Nome + "\nIdade: " + Idade + "\nCurso: " + Curso;
    }
}
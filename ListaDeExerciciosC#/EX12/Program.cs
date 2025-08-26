public class Program
{
    public static void Main(string[] args)
    {
        Pessoa pessoa1 = new Pessoa();
        Aluno aluno1 = new Aluno();
        aluno1.Nome = "Luiz";
        aluno1.Idade = 23;
        aluno1.Curso = "Engenharia de Software";

        Console.WriteLine("Nome: " + aluno1.Nome);
        Console.WriteLine("Idade: " + aluno1.Idade);
        Console.WriteLine("Curso: " + aluno1.Curso);

        Console.WriteLine(pessoa1.Apresentar());
        Console.WriteLine(aluno1.Apresentar());
        Console.WriteLine();


        List<Aluno> alunos = new List<Aluno>();
        alunos.Add(new Aluno { Nome = "Luiz", Idade = 23, Curso = "Engenharia de Software" });
        alunos.Add(new Aluno { Nome = "Silvana", Idade = 23, Curso = "Medicina Veterinária" });
        alunos.Add(new Aluno { Nome = "Liz", Idade = 20, Curso = "Medicina" });

        foreach (Aluno aluno in alunos)
        {
            Console.WriteLine(aluno);
            Console.WriteLine();
        }
    }
}
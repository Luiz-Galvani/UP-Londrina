using Microsoft.AspNetCore.Mvc;

namespace AULA_API_.Controllers;

[ApiController]
[Route("user")]

public class UserController : ControllerBase
{
    private static List<string> nomes = new List<string>();



    [HttpGet(Name = "GetUser")]
    public IActionResult Get()
    {
        return Ok(nomes);
    }

    [HttpGet("{id}")]
    public IActionResult GetById(int id)
    {
        if (id >= 0 && id < nomes.Count)
        {
            return Ok("Id " + nomes[id] + " encontrado");
        }
        else
        {
            return Ok("Id " + id + " não encontrado");
        }
    }


    [HttpPost]
    public IActionResult Post([FromBody] string nome)
    {
        if (nome != null)
        {
            nomes.Add(nome);
            return Ok("Seja bem vindo  " + nome);
        }
        else
        {
            return NotFound();
        }
    }
}
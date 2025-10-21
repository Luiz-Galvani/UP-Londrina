using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic; 
using System;
namespace AtividadeAPI.Controllers
{

    [ApiController]
    [Route("Users")]

    public class UsuarioController : ControllerBase
    {
        private static readonly Random _random = new Random();
        private static readonly List<string> _possibleNames = new List<string>
            {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda", "Felipe", "Gabriela",
                "Heitor", "Isabela", "João", "Karen", "Lucas", "Maria", "Nathan",
                "Olívia", "Pedro", "Rafaela", "Samuel", "Tatiana", "Victor"
            };
        [HttpGet(Name = "GetNames")]
        public IActionResult Get()
        {
            var nomesRand = new List<string>();

            for (int i = 0; i < 10; i++)
            {
                var j = _random.Next(_possibleNames.Count);
                nomesRand.Add(_possibleNames[j]);
            }
            return Ok(nomesRand);
        }


        [HttpPost]
        public IActionResult postName([FromBody] string input)
        {
            if (input == null || string.IsNullOrEmpty(input))
            {
                return BadRequest("O campo é obrigatório");

            }
            string name = input.Replace(" ","");
            int tamanho = name.Length;

            return Ok($"Olá {input} seu nome tem {tamanho} caracteres.");
        }
    }
}
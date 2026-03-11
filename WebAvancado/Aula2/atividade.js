const usuarios = [
  { nome: "Ana", idade: 20, ativo: true, compras: [100, 50, 25] },
  { nome: "Bruno", idade: 17, ativo: false, compras: [30, 20] },
  { nome: "Carlos", idade: 32, ativo: true, compras: [200, 150, 50, 100] },
  { nome: "Diana", idade: 25, ativo: true, compras: [] },
  { nome: "Eduardo", idade: 15, ativo: false, compras: [10] }
];

//ex 1
console.log("Exercício 1: ")
const soma = (compras) => {
    let total = 0;

    for (let i in compras){
        total += compras[i];
    }

    return total;
}

for (let i in usuarios){
    const total = soma(usuarios[i].compras);
    console.log(`${usuarios[i].nome}: Total = ${total}`);
}
// ---------------------------------------------------------

console.log("Exercício 2: ")
const ativos = (u) =>{
    if(u.ativo === true){
        return u.nome
    }
}

for(let i of usuarios){
    let nomes = ativos(usuarios[i])

    if(nomes){
        console.log(nomes)
    }
}
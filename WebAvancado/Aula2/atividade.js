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
console.log("Ativos: ")
const ativos = (u) =>{

    if(u.ativo === true){
        return u.nome
    }
}

for(let usuario of usuarios){
    let nomes = ativos(usuario)

    if(nomes){
        console.log(nomes)
    }
}
// ----------------------------------------------------------
console.log("Exercício 3: ")
console.log("Maiores de idade: ")
const maiores = (u) =>{
    if(u.idade >= 18){
        return u.nome
    }
}
for(let usuario of usuarios){
    let maior = maiores(usuario)

    if(maior){
        console.log(maior)
    }
}
//------------------------------------------------------------
console.log("Exercício 4: ")
let totalVolume = 0
let nomeMaiorVolume = ""
for (let i of usuarios){
    if(soma(i.compras) > totalVolume){
        totalVolume = soma(i.compras)
        nomeMaiorVolume = i.nome
    }
}
console.log(`${nomeMaiorVolume}: ${totalVolume}`)

//-------------------------------------------------------------
console.log("Exercício 5: ")
console.log("5" + 2);
console.log("Isso ocorre pois o 5 está em formato de string, e o + faz com que o 2(inteiro) concatene.")
console.log("5" - 2);
console.log("Isso ocorre pois o 5 está em formato de string, e o - só funciona com números, convertendo ele para número e subtraindo o 2(inteiro).")
console.log(true + 1);
console.log("Isso ocorre pois o true equivale a 1, e ele é somado ao 1 inteiro")
console.log(false == 0);
console.log("Isso ocorre pois o valor de false booleano é 0, e comparando 0 booleano com 0 número, é igual.")
console.log(false === 0);
console.log("Isso ocorre pois o 0 do false é do tipo booleano, e não vai ser do mesmo tipo do 0 número.")

//-------------------------------------------------------------
console.log("Exercício 6:")
console.log("O primeiro caso é o correto, pois retorna o nome da pessoa que fez a ação falar")
console.log("O outro não funciona pois o this não especifíca para a arrow function")
console.log("O this herda de onde está definido, se você não colocar o this.nome = 'Maria', ele vai continuar fixo do que herdou do escopo global.")
// const pessoa = {
//   nome: "Maria",
//   falar: function(){
//     console.log(this.nome);
//   }
// };

// pessoa.falar();
// const pessoa = {
//   nome: "Maria",
//   falar: () => {
//     console.log(this.nome);
//   }
// };

// pessoa.falar();

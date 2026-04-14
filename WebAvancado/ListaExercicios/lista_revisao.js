let nome = "";
let idade = 22;
let curso = "BES";

console.log("Olá, meu nome é " + nome + ", tenho " + idade + " anos e estou cursando " + curso + ".");

let numero = 99;

if(numero > 0){
    console.log("O número é positivo.");
}
else if(numero < 0){    
    console.log("O número é negativo.");
}
else if(numero === 0){
    console.log("O número é zero.");    
}

let notas = [7.5, 8.0, 6.0];
let soma = 0;
for (let i = 0; i < notas.length; i++){
    soma += notas[i];
}
console.log("A média das notas é: " + (soma / notas.length));
if(soma / notas.length >= 7){
    console.log("Aprovado!");
}else{
    console.log("Reprovado!");
} 

if(idade >= 18){
    console.log("Pode dirigir.");
    let habilitacao = true;
}
else{
    console.log("Não pode dirigir.");
    let habilitacao = false;
}

let array = [1, 2, 3, 4, 5];
let somaArray = 0;
for (let n of array){
    console.log(n);
    somaArray += n;
}
console.log("A soma dos elementos do array é: " + somaArray);

let contPar = 0;
let contImpar = 0;
for(let n of array){
    if( n % 2 === 0){
        contPar ++;
    }
    else{
        contImpar ++;
    }

}
console.log(`Quantidade par: ${contPar}`)
console.log(`Quantidade ímpar: ${contImpar}`)

let arrayMaiores = [10, 30, 50, 5, 9]

let maiores = arrayMaiores.filter(n => n>= 10)
console.log(`Array nova com números maiores ou iguais a 10: ${maiores}`)


const produto = [   {nome: "Caneta", preco: 10, quantidade: 5 },
                    {nome: "Caderno", preco: 10, quantidade: 4 },
                    { nome: "Notebook", preco: 2000, quantidade: 10 }
]

for(let i of produto){
    console.log(`Produto: ${i.nome}, valor total em estoque: R$ ${i.preco * i.quantidade}`)
}

const alunos =  [   {nome: "Silvana", notas: [ 9,9,9]},
                    {nome: "Luiz", notas: [5,10,7]}                    
                ]       
for(let i of alunos){
    console.log(`Nome: ${i.nome}`)
    let somaAluno = 0
    for(let j of i.notas){
        somaAluno += j
    }
    let mediaAluno = somaAluno/i.notas.length

    console.log(`Média: ${mediaAluno.toFixed(2)}`)
}

function mediaNota(i){
    let mediaAluno = 0
    let somaAluno = 0
    for(let j of i.notas){
        somaAluno += j
    }
    mediaAluno = somaAluno/i.notas.length
    return mediaAluno
}
console.log("Função normal: ")
    
for(let i of alunos){
    console.log(`Média do aluno: ${mediaNota(i).toFixed(2)}`)
}


const mediaArrow = (a) =>{
    let mediaAluno = 0
    let somaAluno = 0
    for(let j of a.notas){
        somaAluno += j
    }
    mediaAluno = somaAluno/a.notas.length
    return mediaAluno
}
console.log("Função Arrow: ")
for(let i of alunos){
    console.log(`Média do aluno: ${mediaArrow(i).toFixed(2)}`)
}

let arrayNew = array.map(n => n*2)
console.log(`Array dobro: ${arrayNew}`)
const pares = array.filter(n => n%2 === 0)
console.log(`Pares do Array: ${pares}`)
const somaDoArray = array.reduce((acumulador, valor)=>{
    return acumulador + valor
},0)
console.log(`Soma do array: ${somaDoArray}`)
const quantidadeBaixa = (a) =>{
    for(let i of a){
        if(i.quantidade < 5){
            console.log(`Produto: ${i.nome} com estoque baixo!`)
        }
        else{
            console.log(`Produto: ${i.nome} com estoque ok!`)
        }
    }
}
quantidadeBaixa(produto)

const totalVendas = produto.reduce((acumulador, item) =>{
    return acumulador + (item.preco*item.quantidade)
},0);

console.log(`Total de vendas: R$ ${totalVendas}`)
const alunosComMedia = alunos.map(aluno => {
    const soma = aluno.notas.reduce((acc, nota) => acc + nota, 0);
    const media = soma / aluno.notas.length;

    return {
        nome: aluno.nome,
        media: media.toFixed(2)
    };
});

console.log(alunosComMedia);

let alunoFilter = alunosComMedia.filter(aluno => aluno.media >= 7)

console.log(`Alunos com média maior que 7: `, alunoFilter)


const nomesAprovados = alunosComMedia.filter(aluno => aluno.media >= 7).map(aluno => aluno.nome)
console.log("Lista com os aprovados: ", nomesAprovados)


const estoque = [
    { nome: "Teclado Mecânico", preco: 250, quantidade: 15 },
    { nome: "Mouse Gamer", preco: 180, quantidade: 8 },
    { nome: "Monitor 24'", preco: 900, quantidade: 3 },
    { nome: "Cabo HDMI", preco: 25, quantidade: 50 },
    { nome: "Headset USB", preco: 320, quantidade: 0 },
    { nome: "Webcam Full HD", preco: 210, quantidade: 12 }
];

console.log("Lista dos produtos: ")
for(let i of estoque){
    console.log(i)
}
console.log("Valor total de cada produto: ")
const somaTotal = estoque.map(n =>{
    return{
        produto: n.nome,
        valorTotal:  n.preco * n.quantidade
    }
})
console.log(somaTotal)

console.log("Estoque baixo: ")
const estoqueBaixo = estoque.filter(n => n.quantidade < 5).map(n => {
    return{
        produto: n.nome,
        quantidade: n.quantidade
    }
})
console.log(estoqueBaixo)

const totalVendasProdutos = estoque.reduce((acumulador, item) =>{
    return acumulador + (item.quantidade * item.preco)
}, 0)

console.log(`Total de vendas dos produtos: `, totalVendasProdutos)


console.log("Mais caro: ")
const maisCaro = estoque.reduce((atual, maior) =>{
    if(atual.preco > maior.preco){
        return atual
    }
    else{
        return maior
    }
})
console.log(maisCaro)
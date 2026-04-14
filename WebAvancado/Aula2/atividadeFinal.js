const usuarios = [
  { nome: "Ana", idade: 20, ativo: true, compras: [100, 50, 25] },
  { nome: "Bruno", idade: 17, ativo: false, compras: [30, 20] },
  { nome: "Carlos", idade: 32, ativo: true, compras: [200, 150, 50, 100] },
  { nome: "Diana", idade: 25, ativo: true, compras: [] },
  { nome: "Eduardo", idade: 15, ativo: false, compras: [10] }
];

console.log("Exercício 7 - Atividade Final: ")
    let quantidade = 0
    let usuariosAtivos = 0
    let usuariosInativos = 0
    let soma = 0
    let maiorComprador = 0
    let nomeMaiorComprador = ''
const contar = (u) =>{
    quantidade += 1
}
const ativos = (u) =>{
    if(u.ativo === true){
        usuariosAtivos += 1
    }
}
const inativos = (u) =>{
    if(u.ativo === false){
        usuariosInativos += 1
    }
}
const mediaIdade = (u) =>{
    soma += u.idade
}
const somaCompras = (u) =>{
    let total = 0

    for (let i of u.compras){
        total += i
        if(total > maiorComprador){
            maiorComprador = total
            nomeMaiorComprador = u.nome
        }
    }
}
    const gerarRelatorio = (u) =>{
    for(let usuario of usuarios){
        contar(usuario);
        ativos(usuario);
        inativos(usuario);
        mediaIdade(usuario);
        somaCompras(usuario)
    }
    console.log(`totalUsuarios: ${quantidade}` )
    console.log(`usuariosAtivos: ${usuariosAtivos}` )
    console.log(`usuariosInativos: ${usuariosInativos}` )
    console.log(`mediaIdade: ${soma/quantidade}`)
    console.log(`maiorComprador: ${nomeMaiorComprador}`)
}
gerarRelatorio(usuarios);





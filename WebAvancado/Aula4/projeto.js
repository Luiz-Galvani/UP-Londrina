const http = require('node:http')
const port = 3000;

const fs = require('node:fs')

function lerArquivoJson(nomeArquivo){
    const conteudo = fs.readFileSync(nomeArquivo, 'utf-8')
    return JSON.parse(conteudo)
}

const callback = (req, res)=> {
    const url = new URL(`http://localhost:${port}${req.url}`)
    const rota = url.pathname;
    
    res.setHeader('Content-Type', 'application/json; charset=utf-8');
   const nomeROTA = ["classicos","luxo","esportivos"]
    for(let i in nomeROTA){
    try{
        
        if(rota === `/carros/${nomeROTA[i]}`){
            res.statusCode = 200;
            const dados = lerArquivoJson(`${nomeROTA[i]}.json`)
            res.end(JSON.stringify(dados))
        }
        else{
            res.statusCode = 404;
            res.end("404 - Página não encontrada")
        }
    }catch(erro){
        res.statusCode = 500
        res.end(JSON.stringify({erro:"Arquivo não encontrado"}))
    } 

}
}
const server = http.createServer(callback);



server.listen(port, () =>{
    console.log('Servidor executando em http://localhost:'+port);
})





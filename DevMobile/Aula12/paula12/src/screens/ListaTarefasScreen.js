import { useEffect, useState } from "react"
import {Text, View, } from "react-native"
import { API_URL } from "../config/api"
import { FlatList } from "react-native"
import { ActivityIndicator } from "react-native"
import { Button } from "react-native"

export default function ListaTarefasScreen(){
    const[filmes, setFilmes] = useState([])
    const[carregando,setCarregando] = useState(false)
    const [erro,setErro] = useState(null)


    async function getData(){
        try{
            setErro(null)
            setCarregando(true)
            const resposta = await fetch(`${API_URL}/movies.json`)
            if(!resposta.ok){
                throw new Error('O servidor respondeu com erro: ' + resposta.status) 
            }

            const dados = await resposta.json()
            
            setFilmes(dados.movies)
            console.log(`Dados vindos da API: ${JSON.stringify(dados.movies)}`)

        }catch(error){
            setErro(error.message)
            console.log(error.message)
        }
        finally{
            setCarregando(false)
        }
    }

    useEffect(() => {
        getData()
    }, [])

    if(carregando){
        return(
            <View style = {{flex: 1, justifyContent: 'center', alignItems: 'center', backgroundColor: "#fff"}}>
                <ActivityIndicator size = "large"/>
                <Text style ={{fontSize: 30, fontWeight:"bold"}}>Carregando...</Text>
            </View>        )
    }
    
    return(
        <View>
            <Text>Lista de Tarefas</Text>
            <FlatList
                data={filmes}
                keyExtractor={(item) => item.id}
                renderItem={({item}) => (<Text> {item.title} | {item.releaseYear}</Text>)}
            />
            <Button
                title= "Atualizar"
                onPress={() => getData()}
            />
        </View>
    )
}
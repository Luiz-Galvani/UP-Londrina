import { FlatList } from "react-native"
import ItemContato from "../components/ItemContato"


const CONTATOS = [
    {id:1,nome:'Luiz',idade: 23 +1,cargo:'Consultor SAP',icone:"user"},
    {id:2,nome:'Silvana',idade: 23 +1,cargo:'Veterinária',icone:"user"},
    {id:3,nome:'Gica',idade: 27,cargo:'Médica',icone:"user"},
    {id:5,nome:'Miura',idade: 24,cargo:'Eng.Elétrico',icone:"user"},
    {id:6,nome:'Gabi',idade: 29,cargo:'Eng.Ambiental',icone:"user"}
]
export default function Home2(){
    return(
        <FlatList 
            data ={CONTATOS}
            keyExtractor={(item) => item.id}
            renderItem = {({item}) => <ItemContato contato={item}/>}
        />
    )
}
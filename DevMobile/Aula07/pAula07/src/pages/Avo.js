import { View,StyleSheet,Text } from "react-native";
import Filho from "../components/Filho";
export default function Avo(){

    function mensagemDoNeto(msgNeto){
        console.log("Mensagem do Neto: "+ msgNeto)
    }
    return(
        <View style={{flex:1, justifyContent:'center',alignItems:'center'}}>
            <Filho mensagemDoPai = "Olá Neto" caixaPostalDoPai={mensagemDoNeto}/>
        </View>
    )
}
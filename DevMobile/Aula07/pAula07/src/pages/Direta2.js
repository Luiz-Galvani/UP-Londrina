import { Text,StyleSheet,View } from "react-native";
import BotaoCurtir from "../components/BotaoCurtir";
export default function Direta2(){
    function aoCurtir(nomePost){
        console.log('Foi curtido o POST: '+ nomePost);
    }

    return(
        <View style={estilos.tela}>
            <Text style={estilos.titulo}>Foto de praia</Text>
            <BotaoCurtir nomePost="Foto Praia" aoPressionar={aoCurtir}/>
            <Text style={estilos.titulo}>Foto de Cachorro</Text>
            <BotaoCurtir nomePost="Foto Cachorro" aoPressionar={aoCurtir}/>
        </View>
    )
}

const estilos= StyleSheet.create({
    tela:{
        flex:1,
        justifyContent:'center',
        alignItems:'center',
        backgroundColor:'#f0f0f0'
    },
    titulo:{
        fontSize: 18,
        fontWeight:'bold',
        color: "#0328fc",
        marginBottom: 16
    }
})
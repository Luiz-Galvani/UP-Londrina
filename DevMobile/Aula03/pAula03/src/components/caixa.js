import { View, Text, StyleSheet } from "react-native";
import { StatusBar } from "expo-status-bar";

export default function Caixa({cor,numero}){
    return(
        <>
            <View style = {[estilo.caixa,{backgroundColor: cor}]}>
                <Text style={estilo.texto}>{numero}</Text>
            </View>
        </>
    )
}

const estilo = StyleSheet.create({
    caixa:{
        width:80,
        height: 80,
        margin: 8,
        alignItems: 'center',
        justifyContent: 'center',
        borderRadius: 14,
        borderWidth: 1,
        borderColor: '#4454ec'
    },
    texto:{
        color:' #ad444400',
        fontSize: 24,
        fontWeight: 'bold'
    }
})
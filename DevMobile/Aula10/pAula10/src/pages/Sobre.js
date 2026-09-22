import { StyleSheet } from "react-native";
import { Button, Text, View } from "react-native";

export default function Sobre({navigation}){
    return(
        <View style={estilo.tela}>
            <Text style={estilo.texto}>Tela Sobre</Text>
            <Button
                title= 'Voltar'
                color= "#118AB2"
                onPress={() => navigation.goBack()}
            />
        </View>
    )
}

const estilo= StyleSheet.create({
    tela:{
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: "#fff"
    },
    texto:{
        fontSize: 14,
        color:'#5b5b5b',
        textAlign: 'center',
        marginBottom: 24
    }
})
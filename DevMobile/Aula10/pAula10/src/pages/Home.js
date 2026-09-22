import { StyleSheet } from "react-native";
import { Button } from "react-native";
import { Text, View } from "react-native";

export default function Home({navigation}){
    return(
        <View style={estilo.tela}>
            <Text style={estilo.texto}> Tela Principal</Text>
            <Button
                title= "Ir para sobre"
                color= "#004403"
                onPress={() => navigation.navigate('TelaSobre')}
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
import { Button } from "react-native";
import { View, Text } from "react-native";

export default function Neto({mensagemDoAvo, caixaPostalDoAvo}){
    return (
        <View style={{flex:1, justifyContent:'center', alignItems:'center'}}>
            <Text>Eu sou o Neto</Text>
            <Text>{mensagemDoAvo}</Text>
            <Button
                title = "Falar com o Avô"
                onPress={() => caixaPostalDoAvo("Bença Vô")}
            />

        </View>
    )
}
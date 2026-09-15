import { useState } from "react";
import {Button, Text, View } from "react-native";

export default function Contador(){
    const [valor,setValor] = useState(0)
    function incrementa(){
        console.log(`Valor atual: ${valor}`)
        setValor(valor + 1)
        console.log(`Novo valor: ${valor}`)
    }
    function decrementa(){
        console.log(`Valor atual: ${valor}`)
        setValor(valor - 1)
        console.log(`Novo valor: ${valor}`)
    }
    return(
        <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
            <View style={{flex: 1, justifyContent: 'center', alignItems: 'center', flexDirection: 'row', gap: 10}}>
                <Button
                    title = '+'
                    onPress={incrementa}            
                />
                <Button
                    title = '-'
                    onPress={decrementa}            
                />
            </View>
            <View style={{flex: 1, justifyContent: 'center', alignItems: 'center', marginTop: -900}}>
                <Text style={{fontSize: 16,fontWeight: 'bold'}}>{valor}</Text>

                {visivel ? (<Text> Esse texto é um segredo !</Text>): false}
                <Button
                    title = {visivel ? 'Esconder': 'Mostrar'
                    onPress = {toogle}
                />
            </View>
        </View>
    )
}
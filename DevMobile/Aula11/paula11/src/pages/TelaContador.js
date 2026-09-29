import { useEffect, useState } from "react";
import { Text } from "react-native";
import { View } from "react-native";

export default function TelaContador(){
    const [contador, setContador] = useState(0)
    useEffect(() => {
        console.log("Chamado o useEffect")
        setContador(1)
    },[])
    return(
        <View style={{flex:1, justifyContent: 'center', alignItems: 'center'}}>
            <Text style={{fontSize: 20, fontWeight: 'bold'}}>{contador}</Text>
        </View>
    )
}
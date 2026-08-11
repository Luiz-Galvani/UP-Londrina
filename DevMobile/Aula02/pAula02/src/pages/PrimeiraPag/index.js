import React from "react";
import { Text, View, StyleSheet, Button, TouchableOpacity } from "react-native";

export default function PrimeiraPag(){

    const lidarComClick = () =>{
        alert('Vitor Gay')
    }
    return(
        <>
            <View style={estilo.container}>
                    <Text style={estilo.textoPrincipal}>Página 1</Text>
                    <Button title="Botão 01"
                            color = "#2924a7"
                            onPress={lidarComClick}
                    ></Button>
                    <TouchableOpacity>
                        onPress ={lidarComClick}
                        <View style={estilo.botao}>
                                <Text style={estilo.textoBotao}>Botão 02</Text>
                        </View>
                    </TouchableOpacity>
            </View>
        </>
    )
}

const estilo = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'rgb(202, 187, 187)',
        fontSize: 25,
    },
    textoPrincipal:{
        fontSize: 25,
        color: 'rgb(7, 71, 36)',
        fontWeight: '650'
    },
    textoBotao:{
        fontSize: 14,
        fontWeight: 300
    },
    botao:{
        marginTop: 12,
        width: 120,
        height: 60,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#00c2fd',
        borderRadius: 14

    }

})

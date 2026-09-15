import {Button, StyleSheet, Text, TextInput, View} from "react-native"
import { useState } from "react"

const dadosForm ={
    nome: '',
    idade: '',
    senha: '',
    maisInfo: '',
}

function aoEnviar(){
    const {nome,idade,senha,maisInfo} = dadosForm
    console.log('Formulário enviado!:', {nome,idade,senha: '*'.repeat(senha.length),maisInfo})
}
export default function Home(){
    const [nomeEstado,setNomeEstado]=useState('')
    function aoDigitar(texto){
        console.log(`Texto digitado: ${texto}`)
        setNomeEstado(texto)
        dadosForm.nome = texto
    }
    return(
        <View style={estilo.container}>
            <Text style={estilo.textao}> {nomeEstado}</Text>
                <View style={estilo.containerInput}>
                    <Text style={estilo.label}>Nome:</Text>
                    <TextInput
                        placeholder="Digite aqui o seu texto: "
                        style = {estilo.input}
                        onChangeText={setNomeEstado}
                        value = {nomeEstado}
                    
                    />
                </View>
            {/* <View style={estilo.containerInput}>
                <Text style={estilo.label}>Nome:</Text>
                <TextInput
                    placeholder="Digite aqui o seu texto: "
                    style = {estilo.input}
                    onChangeText={(texto) => (dadosForm.nome = texto)}
                
                />
            </View> */}
            <View style={estilo.containerInput}>
                <Text style={estilo.label}>Idade:</Text>
                <TextInput
                    style={estilo.input}
                    placeholder=" Digite a idade: "
                    onChangeText={(texto) => (dadosForm.idade = texto)}
                    keyboardType="numeric"
                />
            </View>
            <View style={estilo.containerInput}>
                <Text style={estilo.label}>Senha:</Text>
                <TextInput
                    style={estilo.input}
                    placeholder=" Digite a senha: "
                    onChangeText={(texto) => (dadosForm.senha = texto)}
                    secureTextEntry
                />
            </View>
            <View style={estilo.containerInput}>
                <Text style={estilo.label}>Fale mais sobre você:</Text>
                <TextInput
                    style={estilo.input}
                    placeholder=" Conte mais sobre você: "
                    onChangeText={(texto) => (dadosForm.maisInfo = texto)}
                    multiline
                    maxLength={60}
                />
            </View>
            <Button
                title = "Enviar"
                color='#00f7ff'
                onPress={aoEnviar}
            />
                
            
        </View>

    )
}

const estilo = StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: 'center',
        alignItems: 'flex-start',
        backgroundColor: '#dadada',
        flexDirection: 'column',
        gap: 10,
        marginStart: 6
    },
    containerInput:{
        flexDirection: 'row',
        gap: 8,
        alignItems: 'center',
        marginBottom: 12,
        marginStart: 6
    },
    input:{
        borderWidth: 1,
        borderColor: '#000',
        borderRadius:5 ,
        fontSize: 16,
        paddingHorizontal: 12,
        paddingVertical:10,
        backgroundColor: '#fff'
    },
    label:{
        fontSize:14,
        fontWeight:'bold',
    },
    textao:{
        fontSize:30,
        fontWeight:'bold'
    }
})
import {View, StyleSheet, Text, ScrollView} from 'react-native'
import Header from '../components/Header'
import Saldo from '../components/Saldo'
import Actions from '../components/Actions'


export default function Principal(){
    return(
        <View style={estilos.container}>
            <Header nome= "Luiz Galvani" icone = "user"/>
            <Saldo />
            <ScrollView>
                <Actions />
            </ScrollView>
        </View>
    
    )
}

const estilos = StyleSheet.create({
    container:{
        flex: 1
    },
    texoNome: {
        color: '#ffffff'
    },
})
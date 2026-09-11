import {View, StyleSheet, Text, ScrollView} from 'react-native'
import Header from '../components/Header'
import Saldo from '../components/Saldo'
import Actions from '../components/Actions'


export default function Principal(){
    return(
        <View style={estilos.container}>
            <Header nome= "Luiz Galvani" icone = "user"/>
            <Saldo />
            <ScrollView showsVerticalScrollIndicator={false}>
                <Actions />
            </ScrollView>
            <Text style = {estilos.texoNome}>Últimos Lançamentos</Text>
        </View>
    
    )
}

const estilos = StyleSheet.create({
    container:{
        flex: 1,
        backgroundColor: '#adadad'
    },
    texoNome: {
        color: '#000000'
        
    },
})
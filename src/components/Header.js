import { View, StyleSheet, Text, TouchableOpacity} from "react-native"
import{Feather} from '@expo/vector-icons'

export default function Header({nome,icone}){
    return (
        <View style= {estilos.container}>
            <Text style= {estilos.textoNome}>{nome}</Text>
            <TouchableOpacity style = {estilos.iconeCirculo}>
                <Feather
                    name = {icone}
                    size={25}
                    color={'#fff'}
                />
            </TouchableOpacity>            
        </View>
    )
}

const estilos = StyleSheet.create({
    container: {
        height: 150,
        backgroundColor: '#00863c',
        flexDirection: 'row',
        alignItems: 'center',
        justifyContent: 'space-between',
        paddingHorizontal: 20, 
    },
    iconeCirculo: {
        width: 40,
        height: 40,
        borderRadius: 20,
        backgroundColor: '#9ea1a383',
        justifyContent: 'center',
        alignItems: 'center'
    },

    textoNome: {
        fontSize: 20,
        fontWeight: 'bold',
        color: '#fff'
    }
})
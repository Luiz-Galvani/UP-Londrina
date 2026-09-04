import { View, StyleSheet, Text} from "react-native"
import{Feather} from '@expo/vector-icons'

export default function Saldo({saldo,gastos}){
    return (
        <View style= {estilos.container}>
            <View style = {estilos.containerSaldo}>
                <Text style={estilos.textoPadrao}>Saldo R$: </Text>
                    <Text style={estilos.textoSaldo}>30.123</Text>
            </View>
            <View style = {estilos.containerGasto}>
                <Text style={estilos.textoPadrao}>Saldo R$: </Text>
                <Text style={estilos.textoGasto}>-2.500</Text>
            </View>
        </View>
    )
}

const estilos = StyleSheet.create({
    container: {
        height: 160,
        backgroundColor: '#ffffff',
        flexDirection: 'row',
        alignItems: 'center',
        justifyContent: 'space-between',
        marginTop: -30,
        marginHorizontal: 10,
        borderRadius: 15,
        borderWidth:1,
        borderColor: '#c4c4c4',
        elevation: 5,
        shadowOpacity: 4,
        shadowColor: "#85858594"

    },
    textoPadrao:{
        fontSize: 18,
        color: '#5a5656',
        fontWeight: 'bold'
    },
    textoSaldo: {
        fontSize: 20,
        color: '#30eb68'
    },
    textoGasto:{
        fontSize: 20,
        color: '#df2c2c'
    },
    containerSaldo:{
        justifyContent: 'flex-start',
        margin: 30
    },
    containerGasto:{
        justifyContent: 'flex-end',
        margin: 30
    }
})
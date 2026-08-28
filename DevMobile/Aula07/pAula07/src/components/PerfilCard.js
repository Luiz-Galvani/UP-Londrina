import { Text,StyleSheet,View } from "react-native";

export default function PerfilCard({nome,cargo,cor}){

    return(
        <View style={[estilos.cartao,{backgroundColor:cor}]}>
            <Text style={estilos.nome}>{nome}</Text>
            <Text style={estilos.cargo}>{cargo}</Text>

        </View>
    )
}

const estilos = StyleSheet.create({
    cartao:{
        borderRadius: 12,
        padding:20,
        marginBottom: 14
    },
    nome:{
        color: "#ffff",
        fontSize: 18,
        fontWeight: 'bold',

    },
    cargo:{
        color: "#fff",
        fontSize: 13,
        marginTop: 4,
    }
})
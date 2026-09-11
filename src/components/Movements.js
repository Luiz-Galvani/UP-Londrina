import { Text,View,ScrollView,TouchableOpacity, StyleSheet } from "react-native";


export default function Movements({data}){
    return (
        <TouchableOpacity style={estilos.container}>
            <Text style={estilos.date}>{data.date}</Text>
            <View style={estilos.content}>
                <Text style={estilos.label}>{data.label}</Text>
                <Text style={estilos.value}>{data.value}</Text>
            </View>
        </TouchableOpacity>
    )
}

const estilos = StyleSheet.create({
    container:{
        flex: 1,
        marginStart: 14,
        marginEnd: 14,
        borderBottomWidth: 0.5,
        borderBottomColor:'#dadada'
    },
    content:{
        flexDirection: 'row',
        justifyContent: 'space-between',
        marginTop: 2,
        marginBottom: 8
    },
    date:{

    },
    label:{

    },
    value:{

    }

})
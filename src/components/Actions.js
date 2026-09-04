import { ScrollView, StyleSheet, View} from "react-native";
import{Feather} from '@expo/vector-icons'

const ICONES = [
    {id:1,nome:"folder-plus"},
    {id:2,nome:"tag"},
    {id:3,nome:"credit-card"},
    {id:5,nome:"calendar"},
    {id:6,nome:"activity"}
]
export default function Actions(){
    return(
        <ScrollView
            horizontal
            showsHorizontalScrollIndicator={false}
        >
            <View style={estilos.linha}>

                {ICONES.map((item) => (
                    <View
                        key={item.id}
                        style={estilos.iconeCirculo}
                    >
                        <Feather
                            name={item.nome}
                            size={25}
                            color="#fff"
                        />
                    </View>
                ))}

            </View>
        </ScrollView>
                            
    )
}

const estilos = StyleSheet.create({
    linha:{
        flex: 1,
        height:70,
        flexDirection: 'row',
        alignItems: 'center',
        backgroundColor: '#000000',
        padding: 14,
        borderRadius: 10,
        marginBottom: 10
    },
    iconeCirculo: {
        width: 40,
        height: 40,
        borderRadius: 20,
        backgroundColor: '#a4a4a583',
        justifyContent: 'center',
        alignItems: 'center'
    },
})
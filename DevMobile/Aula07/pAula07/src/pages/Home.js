import { Text,StyleSheet,View } from "react-native";
import PerfilCard from "../components/PerfilCard";

export default function Home(){
    return(
        <View style={estilos.tela}>
            <PerfilCard nome = "Luiz" cargo = "SAP Consultant" cor ="#0044ff"/>
            <PerfilCard nome = "Silvana" cargo = "Veterinária" cor ="#3700ff"/>
        </View>
    )
}

const estilos = StyleSheet.create({
    tela:{
        flex: 1,
        justifyContent: 'center',
        paddingHorizontal:20,
        backgroundColor: "#f0f0f0"
    }
})
import { StyleSheet, Text, View } from "react-native";

export default function Profile() {
    return (
        <View style={estilo.tela}>
            <Text style={estilo.texto}>Tela Profile</Text>
        </View>
    );
}

const estilo = StyleSheet.create({
    tela: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: "#fff"
    },
    texto: {
        fontSize: 14,
        color: '#5b5b5b',
        textAlign: 'center',
        marginBottom: 24
    }
});
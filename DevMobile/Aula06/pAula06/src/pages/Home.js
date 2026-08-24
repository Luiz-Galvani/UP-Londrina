import { View, Text, StyleSheet, FlatList } from "react-native";

const FRUTAS = ['Maça','Banana','Laranja','Uva','Manga','Abacaxi','Ameixa','Kiwi','Morango','Açaí'];

export default function Home(){
    return(
        <View style={styles.container}>
            <Text>
                Home Page
            </Text>
            <FlatList
                data= {FRUTAS}
                keyExtractor={(item) => item}
                renderItem = {({item}) => (<View style={styles.linha}>
                    <Text style = {styles.text}>{item}</Text>
                    </View>)}
                    contentContainerStyle = {styles.content}
            />
        </View>
    )
}

const styles= StyleSheet.create({
    container:{
        flex: 1,
        backgroundColor: '#f0f0f0',
        alignItems: 'center',
    },
    linha:{
        backgroundColor:'#ffff',
        paddingVertical: 16,
        paddingHorizontal:20,
        borderBottomWidth:1,
        borderColor:'#eeee'
    },
    text:{
        fontSize: 16
    },
    content:{
        paddingTop: 10
    }
})
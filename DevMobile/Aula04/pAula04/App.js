//npx create-expo-app Nome do projeto --template

import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, TouchableOpacity, View , Image} from 'react-native';
import {Feather} from '@expo/vector-icons';

const ITEM_Menu = [
  {icone: 'user', texto: 'Meu Perfil'},
  {icone: 'settings', texto: 'Configurações'},
  {icone: 'bell', texto: 'Notificações'},
  {icone: 'log-out', texto: 'Sair'},
]
export default function App() {
  return (
    <View style={styles.container}>
      {ITEM_Menu.map((atual) => (<ItemMenu icone={atual.icone}
      texto = {atual.texto}
      key={atual.texto}
      />))}
      <StatusBar style="auto" />
      <Image 
        source={{uri: 'https://www.pngplay.com/wp-content/uploads/8/The-Last-of-Us-PNG-Background.png'}}
        style = {styles.imagem}
      /> 
      <Image 
        source={require('./src/assets/The-Last-of-Us-PNG-Background.png')}
        style = {styles.imagem}
      /> 

    </View>
  );
}

function ItemMenu({icone,texto}){
  return(
    <TouchableOpacity style = {styles.linha}>
      <View style={styles.iconeCirculo}>
        <Feather name ={icone} size ={20} color = '#000000'/>
      </View>
       <Text style={styles.textoLinha}>{texto}</Text>
        <Feather name= "chevron-right" size={20} color="#000"></Feather> 
    </TouchableOpacity>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#dbdada',
    alignItems: 'flex',
    justifyContent: 'flex-start',
  },
  linha:{
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: 12,
    borderBottomWidth: 1,
    borderColor:'#5e5a5aee'  
  },
  iconeCirculo:{
    width: 36,
    height: 36,
    borderRadius: 18,
    backgroundColor: 'rgb(192, 97, 211)',
    justifyContent: 'center',
    alignItems: 'center',
    marginRight: 12,
    borderColor: "#bf44f0",
    borderWidth:2
  },
  textoLinha:{
    fontSize: 16,
    flex: 1,
    color: '#000'
  },
  imagem:{
    width: 300,
    height: 300,
    alignContent:"center",
    justifyContent:"center",
    borderRadius: 150,
    marginTop: 5
  }
,
});

import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Caixa from './src/components/caixa.js'

export default function App() {
  return (
    <>
      <View style={styles.containerPai}>
        <View style={styles.container}>
          <Caixa cor= "#24dce2" numero = {1}/>
          <Caixa cor= "#f79f1a" numero = {2}/>
          <Caixa cor= "#a00cf7" numero = {3}/>
          <Caixa cor= "#f3f70c" numero = {4}/>
          <Caixa cor= "#f70c0c" numero = {5}/>
          <Caixa cor= "#02fc6a" numero = {6}/>
          <Caixa cor= "#6e3702" numero = {7}/>
          <StatusBar style="auto" />
        </View>
        <View style={styles.container2}>
          <Caixa cor= "#24dce2" numero = {8}/>
          <Caixa cor= "#f79f1a" numero = {9}/>
          <Caixa cor= "#a00cf7" numero = {10}/>
          <Caixa cor= "#f3f70c" numero = {11}/>
          <Caixa cor= "#f70c0c" numero = {12}/>
          <Caixa cor= "#02fc6a" numero = {13}/>
          <Caixa cor= "#6e3702" numero = {14}/>
        </View>
      </View>
    </>
  );
}

const styles = StyleSheet.create({
  containerPai:{
    flex:1,
    justifyContent:'center',
    alignContent:'center',
    flexWrap: 'wrap',
    alignSelf: 'flex-start',
  },
  container: {
    flex: 1,
    backgroundColor: '#989ca0',
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-evenly',
    flexWrap:'wrap'
  },
  container2:{
    flex: 2,
    backgroundColor: '#dadada',
    flexDirection:  'column',
    justifyContent:'space-evenly',
    alignItems: 'center',
  }
});

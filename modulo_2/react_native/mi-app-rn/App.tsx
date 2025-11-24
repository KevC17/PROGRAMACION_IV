import { StyleSheet, Text, View } from 'react-native';
import React from "react";
import Saludo from "./src/components/Saludo";
import SaludoProps from './src/components/SaludoProps';
import Contador from './src/components/Contador';

export default function App() {
  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center", backgroundColor: "#0d1117" }}>
      <Saludo />
      <Text style={{color:"yellow"}}> Los poderosos programadores del 4to. Semestre</Text>
      <SaludoProps nombre="Kevin" />
      <Contador/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});

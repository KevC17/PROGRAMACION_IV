import React from "react";
import { View, Text, Image, Button, StyleSheet, Alert } from "react-native";
import { Pet } from "../types/Pet";
import { NativeStackScreenProps } from "@react-navigation/native-stack";
import { RootStackParamList } from "../../App";

type Props = NativeStackScreenProps<RootStackParamList, "PetDetail">;

export default function PetDetailScreen({ route }: Props) {
  const { pet } = route.params;

  return (
    <View style={styles.container}>
      <Image source={pet.image} style={styles.image} />
      <Text style={styles.name}>{pet.name}</Text>
      <Text style={styles.info}>Tipo: {pet.type}</Text>
      <Text style={styles.info}>Edad: {pet.age} años</Text>
      <Text style={styles.description}>{pet.description}</Text>

      <Button
        title="Adoptar"
        onPress={() => Alert.alert("¡Gracias!", `Has adoptado a ${pet.name}`)}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 20, backgroundColor: "#fff" },
  image: { width: "100%", height: 250, borderRadius: 10 },
  name: { fontSize: 28, fontWeight: "bold", marginTop: 10 },
  info: { fontSize: 16, marginTop: 5 },
  description: { fontSize: 16, marginTop: 10, color: "#555" }
});

import React from "react";
import { View, Text, Image, TouchableOpacity, StyleSheet } from "react-native";
import { Pet } from "../types/Pet";

interface Props {
  pet: Pet;
  onPress: () => void;
}

export default function PetCard({ pet, onPress }: Props) {
  return (
    <TouchableOpacity style={styles.card} onPress={onPress}>
      <Image source={pet.image} style={styles.image} />
      <Text style={styles.name}>{pet.name}</Text>
      <Text style={styles.type}>{pet.type}</Text>
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#fff",
    padding: 10,
    marginVertical: 8,
    borderRadius: 10,
    alignItems: "center",
    elevation: 3
  },
  image: { width: 120, height: 120, borderRadius: 10 },
  name: { fontSize: 20, fontWeight: "bold", marginTop: 5 },
  type: { fontSize: 14, color: "#555" }
});

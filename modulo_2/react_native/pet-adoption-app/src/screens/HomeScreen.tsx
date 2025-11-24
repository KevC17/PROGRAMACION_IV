import React from "react";
import { View, FlatList, StyleSheet } from "react-native";
import PetCard from "../components/PetCard";
import { pets } from "../data/pets";
import { Pet } from "../types/Pet";
import { NativeStackNavigationProp } from "@react-navigation/native-stack";

interface Props {
  navigation: NativeStackNavigationProp<any>;
}

export default function HomeScreen({ navigation }: Props) {
  return (
    <View style={styles.container}>
      <FlatList
        data={pets}
        keyExtractor={(item: Pet) => item.id.toString()}
        renderItem={({ item }) => (
          <PetCard
            pet={item}
            onPress={() => navigation.navigate("PetDetail", { pet: item })}
          />
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 15, backgroundColor: "#f1f1f1" }
});

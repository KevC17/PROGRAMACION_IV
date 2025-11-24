import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";

import HomeScreen from "./src/screens/HomeScreen";
import PetDetailScreen from "./src/screens/PetDetailScreen";
import { Pet } from "./src/types/Pet";

export type RootStackParamList = {
  Mascotas: undefined;
  PetDetail: { pet: Pet };
};

const Stack = createNativeStackNavigator<RootStackParamList>();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Mascotas" component={HomeScreen} />
        <Stack.Screen
          name="PetDetail"
          component={PetDetailScreen}
          options={{ title: "Detalle" }}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
}

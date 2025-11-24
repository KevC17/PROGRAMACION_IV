import { Pet } from "../types/Pet";

export const pets: Pet[] = [
  {
    id: 1,
    name: "Boby",
    type: "Perro",
    age: 2,
    image: require("../../assets/pets/dog1.jpg"),
    description: "Cariñoso, juguetón y perfecto para familias."
  },
  {
    id: 2,
    name: "Luna",
    type: "Gata",
    age: 1,
    image: require("../../assets/pets/cat1.jpg"),
    description: "Tranquila, limpia y muy mimosa."
  },
  {
    id: 3,
    name: "Rex",
    type: "Perro",
    age: 4,
    image: require("../../assets/pets/dog2.jpg"),
    description: "Protector, noble y muy inteligente."
  }
];
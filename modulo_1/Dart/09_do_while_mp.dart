void main() {
  int totalAnimales = 10;
  int costoPorAnimal = 3;

  int i = 0;
  while (i <= totalAnimales) {
    i++;
    print("Animal $i: Costo total = ${i * costoPorAnimal}");
  }

  i = 1;
  do {
    i++;
    print("Animal $i: Costo total = ${i * costoPorAnimal}");
  } while (i < totalAnimales);
}

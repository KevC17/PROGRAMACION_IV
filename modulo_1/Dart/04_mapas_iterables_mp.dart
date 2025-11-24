void main() {
  print("Listas e Iterables de Animales");
  final edades = [1, 2, 3, 3, 5, 5, 5, 7, 7, 8, 9, 10];
  print("Lista original de edades: $edades");
  print("Cantidad de animales: ${edades.length}");
  print("Edad en la posición 4: ${edades[4]}");
  print("Edad del primer animal: ${edades.first}");
  final edadesReverso = edades.reversed;
  print("Edades en orden inverso: $edadesReverso");
  print("Lista: ${edadesReverso.toList()}");
  print("Conjunto (sin repetidos): ${edadesReverso.toSet()}");
}

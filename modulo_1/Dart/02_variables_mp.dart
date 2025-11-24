void main() {
  print("Información sobre Adopción de Animales");

  final String animal = "Firulais";
  // animal = "Luna";
  print("Nombre del animal: $animal");

  String cuidador = "Kevin";
  cuidador = "Cóndor";
  print("Cuidador encargado: $cuidador");

  const String especie = "Perro";
  print("Especie: $especie");

  bool adoptado = false;
  adoptado = true;
  print("¿Fue adoptado?: $adoptado");

  int edad = 3;
  print("Edad: $edad años");

  List<String> vacunas = ["Rabia", "Parvovirus", "Moquillo"];
  print("Vacunas aplicadas: $vacunas");

  final fotos = <String>["src/firulais1.jpg", "src/firulais2.jpg"];
  print("Fotos del animal: $fotos");

  print("Resumen del registro de adopción:");
  print("""
  Nombre del animal: $animal
  Especie: $especie
  Edad: $edad años
  Adoptado: $adoptado
  Vacunas: $vacunas
  Fotos: $fotos
  Cuidador: $cuidador
  """);
}

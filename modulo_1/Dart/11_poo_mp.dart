class Animal {
  String nombre = "";
  String especie = "";
  Animal({required this.nombre, this.especie = "Desconocida"});
  @override
  String toString() {
    return "$nombre - $especie";
  }
}

class Refugio {
  Refugio();

  double calcularCostoVacunas(double costo1, double costo2) {
    return costo1 + costo2;
  }

  double calcularDiferenciaEdades(double edad1, double edad2) {
    return edad1 - edad2;
  }

  double calcularGastoAlimento(double cantidad, double precioUnidad) {
    return cantidad * precioUnidad;
  }

  double calcularPromedioEdad(double totalEdad, double cantidadAnimales) {
    return totalEdad / cantidadAnimales;
  }
}

void main() {
  final Animal perro = Animal(nombre: "Firulais", especie: "Perro");
  print(perro);
  print(perro.nombre);
  print(perro.especie);

  final Refugio refugio = Refugio();
  print(refugio.calcularCostoVacunas(20, 15));
  print(refugio.calcularDiferenciaEdades(5, 2));
  print(refugio.calcularGastoAlimento(10, 3.5));
  print(refugio.calcularPromedioEdad(24, 6));
}

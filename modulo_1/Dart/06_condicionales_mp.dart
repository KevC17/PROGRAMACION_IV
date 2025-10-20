void main() {
  int cantidadAnimales = 2;
  if (cantidadAnimales > 2) {
    print('Hay más de 2 animales disponibles');
  }
  if (cantidadAnimales < 2) {
    print('Hay menos de 2 animales disponibles');
  }
  if (cantidadAnimales == 2) {
    print('Hay exactamente 2 animales disponibles');
  }
  if (cantidadAnimales > 2) {
    print('Hay más de 2 animales disponibles');
  } else {
    print('Hay 2 o menos animales disponibles');
  }
  if (cantidadAnimales == 2) {
    print('Hay exactamente 2 animales disponibles');
  } else {
    print('No hay 2 animales disponibles');
  }

  int edadAnimal = 2;
  if (edadAnimal > 2) {
    print('El animal es mayor de 2 años');
  } else if (edadAnimal < 2) {
    print('El animal es menor de 2 años');
  } else {
    print('El animal tiene exactamente 2 años');
  }

  int edadPersona = 18;
  String tipoPersona = edadPersona >= 18 ? 'Adulto apto para adoptar' : 'Menor de edad, no puede adoptar';
  print(tipoPersona);
}

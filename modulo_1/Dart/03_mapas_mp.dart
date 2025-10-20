void main() {
  print("Mapa de Adopción de Animales");
  final Map<String, dynamic> animal = {
    'nombre': 'Firulais',
    'edad': 3,
    'adoptado': true,
    'vacunas': <String>['Rabia', 'Parvovirus'],
    'fotos': {
      1: 'src/firulais1.jpg',
      2: 'src/firulais2.jpg'
    }
  };
  print(animal);
  print(animal['nombre']);
  print(animal['fotos']);
  print(animal['adoptado']);
}

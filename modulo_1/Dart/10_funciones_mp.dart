void main() {
  print(saludarRefugio());
  print(calcularAdopciones(3, 4));
  print(calcularTotalDonaciones(6, 8));
  print(calcularTotalDonaciones(6));
  print(saludarAdoptante(nombre: "Kevin", mensaje: "Gracias por adoptar"));
  print(saludarAdoptante(nombre: "Luis"));
}

String saludarRefugio() => 'Bienvenidos al refugio de animales';
int calcularAdopciones(int perros, int gatos) => perros + gatos;
int calcularTotalDonaciones(int monto1, [int monto2 = 0]) {
  return monto1 + monto2;
}

String saludarAdoptante({required String nombre, String mensaje = "Hola"}) {
  return '$mensaje, $nombre';
}

void main() {
  print(greetEveryone());
  print(suma(3,4));
  print(addTwoNumbresOptional(6,8));
  print(addTwoNumbresOptional(6));
  print(greetPerson(name: "Kevin", message: "Hasta la vista"));
  print(greetPerson(name: "Luis"));
}

String greetEveryone()=>'Hellow everyone';
int suma(int a, int b)=> a+b;
int addTwoNumbresOptional(int a, [int b=0]){
  return a+b;
}

String greetPerson({required String name, String message = "Hola"}){
  return '$message $name';
}
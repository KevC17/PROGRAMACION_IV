class Pet {
  final String name;
  final String type;
  final int age;
  final String image;
  final String description;
  bool isLiked;

  Pet({
    required this.name,
    required this.type,
    required this.age,
    required this.image,
    required this.description,
    this.isLiked = false,
  });
}

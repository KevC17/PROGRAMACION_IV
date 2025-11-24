import 'package:flutter/material.dart';
import '../data/pets.dart';
import '../widgets/pet_card.dart';

class HomeScreen extends StatefulWidget {
  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  void toggleLike(int index) {
    setState(() {
      pets[index].isLiked = !pets[index].isLiked;
    });
  }

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemCount: pets.length,
      itemBuilder: (context, i) =>
          PetCard(pet: pets[i], onLike: () => toggleLike(i)),
    );
  }
}

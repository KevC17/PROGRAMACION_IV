import 'package:flutter/material.dart';
import '../data/pets.dart';
import '../widgets/pet_card.dart';

class FavoritesScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final favorites = pets.where((p) => p.isLiked).toList();

    if (favorites.isEmpty) {
      return Center(child: Text("Aún no tienes favoritos"));
    }

    return ListView.builder(
      itemCount: favorites.length,
      itemBuilder: (ctx, i) =>
          PetCard(pet: favorites[i], onLike: () {}),
    );
  }
}

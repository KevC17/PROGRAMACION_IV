import 'package:flutter/material.dart';
import '../models/pet.dart';
import '../widgets/like_button.dart';
import '../screens/pet_detail_screen.dart';

class PetCard extends StatelessWidget {
  final Pet pet;
  final VoidCallback onLike;

  PetCard({required this.pet, required this.onLike});

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        Navigator.push(
          context,
          MaterialPageRoute(builder: (_) => PetDetailScreen(pet: pet)),
        );
      },
      child: Card(
        elevation: 4,
        margin: const EdgeInsets.all(12),
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20)),
        child: Column(
          children: [
            ClipRRect(
              borderRadius: const BorderRadius.vertical(top: Radius.circular(20)),
              child: Image.asset(pet.image, height: 150, width: double.infinity, fit: BoxFit.cover),
            ),
            ListTile(
              title: Text(pet.name, style: TextStyle(fontWeight: FontWeight.bold)),
              subtitle: Text("${pet.type} • ${pet.age} años"),
              trailing: LikeButton(
                initialValue: pet.isLiked,
                onToggle: onLike,
              ),
            )
          ],
        ),
      ),
    );
  }
}

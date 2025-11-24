import 'package:flutter/material.dart';
import '../data/pets.dart';
import '../models/pet.dart';


class PetDetailScreen extends StatelessWidget {
  final Pet pet;

  const PetDetailScreen({super.key, required this.pet});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(pet.name)),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          children: [
            Image.asset(pet.image, height: 200),
            const SizedBox(height: 20),
            Text(
              pet.name,
              style: const TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            Text("${pet.age} años • ${pet.type}"),
            const SizedBox(height: 20),
            Text(pet.description, style: const TextStyle(fontSize: 16)),
            const Spacer(),
            ElevatedButton(
              onPressed: () {},
              child: const Text("Adoptar"),
            ),
          ],
        ),
      ),
    );
  }
}


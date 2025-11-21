import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class HospitalizationCostPage extends StatefulWidget {
  const HospitalizationCostPage({super.key});

  @override
  State<HospitalizationCostPage> createState() => _HospitalizationCostPageState();
}

class _HospitalizationCostPageState extends State<HospitalizationCostPage> {
  String roomType = 'General';
  String insuranceType = 'Público';
  String daysText = '';
  String dailyCostText = ''; 
  String resultText = '';

  void calculateHospitalizationCost() {
    final days = int.tryParse(daysText) ?? 0;
    final dailyCost = double.tryParse(dailyCostText.replaceAll(',', '.')) ?? 0.0;

    if (days <= 0 || dailyCost <= 0) {
      setState(() {
        resultText = 'Ingrese valores válidos para los días y el costo diario';
      });
      return;
    }

    double roomFactor = 1.0;
    if (roomType == 'Semi-Privada') {
      roomFactor = 1.4;
    } else if (roomType == 'Privada') {
      roomFactor = 1.6;
    }

    double discount = 0.0;
    if (insuranceType == 'Público') {
      discount = 0.30;
    } else if (insuranceType == 'Privado') {
      discount = 0.50;
    }
    
    double totalCost = dailyCost * days * roomFactor;
    totalCost = totalCost * (1 - discount);

    setState(() {
      resultText =
        'Costo Total: \$${totalCost.toStringAsFixed(2)}\n'
        'Habitación: $roomType\n'
        'Seguro: $insuranceType';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Cálculo de Costo de Hospitalización'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => context.go('/'),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            const Text(
              'Cálculo del Costo de Hospitalización',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 16),

            DropdownButtonFormField<String>(
              value: roomType,
              decoration: const InputDecoration(
                labelText: 'Tipo de Habitación',
                border: OutlineInputBorder(),
              ),
              onChanged: (value) {
                setState(() {
                  roomType = value!;
                });
              },
              items: ['General', 'Semi-Privada', 'Privada']
                  .map((room) => DropdownMenuItem<String>(
                        value: room,
                        child: Text(room),
                      ))
                  .toList(),
            ),

            const SizedBox(height: 16),

            DropdownButtonFormField<String>(
              value: insuranceType,
              decoration: const InputDecoration(
                labelText: 'Tipo de Seguro Médico',
                border: OutlineInputBorder(),
              ),
              onChanged: (value) {
                setState(() {
                  insuranceType = value!;
                });
              },
              items: ['Público', 'Privado', 'Sin seguro']
                  .map((insurance) => DropdownMenuItem<String>(
                        value: insurance,
                        child: Text(insurance),
                      ))
                  .toList(),
            ),

            const SizedBox(height: 16),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Días de Hospitalización',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                daysText = value;
              },
            ),

            const SizedBox(height: 16),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Costo Diario Base',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                dailyCostText = value;
              },
            ),

            const SizedBox(height: 16),

            ElevatedButton(
              onPressed: calculateHospitalizationCost,
              child: const Text('Calcular'),
            ),

            const SizedBox(height: 16),

            Text(resultText),
          ],
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class TravelCostPage extends StatefulWidget {
  const TravelCostPage({super.key});

  @override
  State<TravelCostPage> createState() => _TravelCostPageState();
}

class _TravelCostPageState extends State<TravelCostPage> {
  // Variables de entrada
  String daysText = '';
  String peopleText = '';
  String dailyBaseCostText = '';
  
  // Variables de opciones seleccionadas
  String destination = 'Playa'; // Valor por defecto
  String accommodation = 'Hostal'; // Valor por defecto
  bool includeTours = false;
  bool includeInsurance = false;

  // Variables para mostrar resultados
  String resultText = '';
  String subtotalText = '';
  String surchargeText = '';
  String totalText = '';
  String pricePerPersonText = '';

  // Función de cálculo
  void calculateTotal() {
    final days = int.tryParse(daysText) ?? 0;
    final people = int.tryParse(peopleText) ?? 0;
    final dailyBaseCost = double.tryParse(dailyBaseCostText.replaceAll(',', '.')) ?? 0.0;

    // Validación de los inputs
    if (days <= 0 || people <= 0 || dailyBaseCost <= 0) {
      setState(() {
        resultText = 'Por favor ingrese valores válidos para los días, personas y el precio base por día.';
      });
      return;
    }

    // Calculando el subtotal
    double subtotal = days * people * dailyBaseCost;

    // Calculando los recargos según el destino
    double destinationSurcharge = 0.0;
    if (destination == 'Montaña') {
      destinationSurcharge = 0.15; // 15% de recargo para montaña
    } else if (destination == 'Ciudad') {
      destinationSurcharge = 0.10; // 10% de recargo para ciudad
    }

    // Recargo de destino
    double destinationCost = subtotal * destinationSurcharge;

    // Recargo por alojamiento
    double accommodationSurcharge = 0.0;
    if (accommodation == 'Hotel 3 estrellas') {
      accommodationSurcharge = 0.20; // 20% de recargo para hotel 3 estrellas
    } else if (accommodation == 'Hotel 5 estrellas') {
      accommodationSurcharge = 0.40; // 40% de recargo para hotel 5 estrellas
    }

    // Recargos adicionales
    double toursSurcharge = includeTours ? 0.10 : 0.0; // 10% si incluye tours
    double insuranceSurcharge = includeInsurance ? 0.05 : 0.0; // 5% si incluye seguro

    // Cálculo de los recargos
    double totalSurcharge = destinationCost + accommodationCost + (subtotal * toursSurcharge) + (subtotal * insuranceSurcharge);

    // Cálculo del precio total
    double totalCost = subtotal + totalSurcharge;

    // Cálculo del precio por persona
    double pricePerPerson = totalCost / people;

    setState(() {
      subtotalText = 'Subtotal: \$${subtotal.toStringAsFixed(2)}';
      surchargeText = 'Recargos: \$${totalSurcharge.toStringAsFixed(2)}';
      totalText = 'Precio Total: \$${totalCost.toStringAsFixed(2)}';
      pricePerPersonText = 'Precio por Persona: \$${pricePerPerson.toStringAsFixed(2)}';
      resultText = '';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Cálculo de Costo de Viaje'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => context.go('/'),
        ),
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              const Text(
                'Cálculo de Costo de Viaje',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),
              const SizedBox(height: 16),

              // Campo de días de viaje
              TextField(
                decoration: const InputDecoration(
                  labelText: 'Días de Viaje',
                  border: OutlineInputBorder(),
                ),
                keyboardType: TextInputType.number,
                onChanged: (value) {
                  daysText = value;
                },
              ),

              const SizedBox(height: 16),

              // Campo de número de personas
              TextField(
                decoration: const InputDecoration(
                  labelText: 'Número de Personas',
                  border: OutlineInputBorder(),
                ),
                keyboardType: TextInputType.number,
                onChanged: (value) {
                  peopleText = value;
                },
              ),

              const SizedBox(height: 16),

              // Campo de precio base por día
              TextField(
                decoration: const InputDecoration(
                  labelText: 'Precio Base por Día',
                  border: OutlineInputBorder(),
                ),
                keyboardType: TextInputType.number,
                onChanged: (value) {
                  dailyBaseCostText = value;
                },
              ),

              const SizedBox(height: 16),

              // Dropdown para el destino
              DropdownButtonFormField<String>(
                value: destination,
                decoration: const InputDecoration(
                  labelText: 'Destino',
                  border: OutlineInputBorder(),
                ),
                onChanged: (value) {
                  setState(() {
                    destination = value!;
                  });
                },
                items: ['Playa', 'Montaña', 'Ciudad']
                    .map((destinationOption) => DropdownMenuItem<String>(
                          value: destinationOption,
                          child: Text(destinationOption),
                        ))
                    .toList(),
              ),

              const SizedBox(height: 16),

              // Radio buttons para tipo de alojamiento
              const Text('Alojamiento:', style: TextStyle(fontWeight: FontWeight.bold)),
              RadioListTile<String>(
                title: const Text('Hostal'),
                value: 'Hostal',
                groupValue: accommodation,
                onChanged: (value) {
                  setState(() {
                    accommodation = value!;
                  });
                },
              ),
              RadioListTile<String>(
                title: const Text('Hotel 3 estrellas'),
                value: 'Hotel 3 estrellas',
                groupValue: accommodation,
                onChanged: (value) {
                  setState(() {
                    accommodation = value!;
                  });
                },
              ),
              RadioListTile<String>(
                title: const Text('Hotel 5 estrellas'),
                value: 'Hotel 5 estrellas',
                groupValue: accommodation,
                onChanged: (value) {
                  setState(() {
                    accommodation = value!;
                  });
                },
              ),

              const SizedBox(height: 16),

              // Checkbox para tours
              CheckboxListTile(
                title: const Text('Incluir Tours (+10%)'),
                value: includeTours,
                onChanged: (value) {
                  setState(() {
                    includeTours = value!;
                  });
                },
              ),

              // Checkbox para seguro
              CheckboxListTile(
                title: const Text('Incluir Seguro (+5%)'),
                value: includeInsurance,
                onChanged: (value) {
                  setState(() {
                    includeInsurance = value!;
                  });
                },
              ),

              const SizedBox(height: 16),

              // Botón para calcular
              ElevatedButton(
                onPressed: calculateTotal,
                child: const Text('Calcular'),
              ),

              const SizedBox(height: 16),

              // Mostrar resultados
              if (resultText.isNotEmpty) ...[
                Text(resultText),
                const SizedBox(height: 8),
              ],
              Text(subtotalText),
              Text(surchargeText),
              Text(totalText),
              Text(pricePerPersonText),
            ],
          ),
        ),
      ),
    );
  }
}

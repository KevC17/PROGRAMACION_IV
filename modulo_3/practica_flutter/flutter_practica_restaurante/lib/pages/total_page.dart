import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class TotalPage extends StatefulWidget {
  const TotalPage({super.key});

  @override
  State<TotalPage> createState() => _TotalPageState();
}

class _TotalPageState extends State<TotalPage> {
  String basePriceText = '';
  String cantidadMenu = '';
  String descuento = 'Nuevo';

  String resultText = '';
  void calculateTotal() {
    final basePrice = double.tryParse(basePriceText.replaceAll(',', '.')) ?? 0.0;
    final cantidad = double.tryParse(cantidadMenu.replaceAll(',', '.')) ?? 0.0;

    if (basePrice <= 0 || cantidad <= 0) {
      setState(() {
        resultText = 'Ingrese valores válidos';
      });
      return;
    };

    double fee = 0.0;

    if (descuento == 'Nuevo') {
        fee = 0;
    } else if (descuento == 'Frecuente') {
        fee = 0.08;
    } else if (descuento == 'Corporativo') {
        fee = 0.12;
    };

    double subt = basePrice * cantidad;
    double total = subt * (1 - fee);

    setState(() {
      resultText =
        'Subtotal: \$${subt.toStringAsFixed(2)}\n'
        'Total a pagar: \$${total.toStringAsFixed(2)}';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Meú del día'),
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
              'Total a pagar por el menú',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 16),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Precio Base (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                basePriceText = value;
              },
            ),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Cantidad de menús (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                cantidadMenu = value;
              },
            ),

            const SizedBox(height: 16),
            DropdownButton<String>(
              value: descuento,
              isExpanded: true,
              items: const [
                DropdownMenuItem(
                  value: 'Nuevo',
                  child: Text('0%'),
                ),
                DropdownMenuItem(
                  value: 'Frecuente',
                  child: Text('8%'),
                ),
                DropdownMenuItem(
                  value: 'Corporativo',
                  child: Text('12%'),
                ),
              ],
              onChanged: (value) {
                setState(() {
                  descuento = value;
                });
              },
            ),

            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: calculateTotal,
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

import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class TipPage extends StatefulWidget {
  const TipPage({super.key});

  @override
  State<TipPage> createState() => _TipPageState();
}

class _TipPageState extends State<TipPage> {
  String subjectsCountText = '';
  int subjectsCount = 0;

  final List<TextEditingController> consumoControllers = [];
  final List<String> porcentajeSeleccionado = [];

  String resultText = '';

  void _generateSubjects() {
    final parsed = int.tryParse(subjectsCountText) ?? 0;

    if (parsed <= 0 || parsed > 10) {
      setState(() {
        resultText = 'Ingrese una cantidad de mesas entre 1 y 10';
        subjectsCount = 0;
        consumoControllers.clear();
        porcentajeSeleccionado.clear();
      });
      return;
    }

    subjectsCount = parsed;
    consumoControllers.clear();
    porcentajeSeleccionado.clear();

    for (int i = 0; i < subjectsCount; i++) {
      consumoControllers.add(TextEditingController());
      porcentajeSeleccionado.add('10%'); // valor inicial para cada mesa
    }

    setState(() {
      resultText = 'Ingrese el consumo y porcentaje para cada mesa.';
    });
  }

  void _calculateTips() {
    if (subjectsCount == 0) {
      setState(() {
        resultText = 'Primero genere y complete los datos de las mesas.';
      });
      return;
    }

    double totalPropina = 0;
    List<String> lines = [];

    for (int i = 0; i < subjectsCount; i++) {
      final consumo = double.tryParse(consumoControllers[i].text.trim()) ?? 0;

      final porcentaje = double.parse(
        porcentajeSeleccionado[i].replaceAll('%', ''),
      );

      final propina = consumo * (porcentaje / 100);
      totalPropina += propina;

      lines.add(
        'Mesa ${i + 1}: Consumo \$${consumo.toStringAsFixed(2)}, '
        'Propina (${porcentajeSeleccionado[i]}) = \$${propina.toStringAsFixed(2)}'
      );
    }

    setState(() {
      resultText =
        'Detalle de mesas:\n\n'
        '${lines.join('\n')}\n\n'
        'Propina total: \$${totalPropina.toStringAsFixed(2)}';
    });
  }

  @override
  void dispose() {
    for (final c in consumoControllers) {
      c.dispose();
    }
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Cálculo de propinas'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => context.go('/'),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: SingleChildScrollView(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              const Text(
                'Propina por Mesas',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),

              const SizedBox(height: 12),

              TextField(
                decoration: const InputDecoration(
                  labelText: 'Cantidad de mesas (1 - 10)',
                  border: OutlineInputBorder(),
                ),
                keyboardType: TextInputType.number,
                onChanged: (value) {
                  subjectsCountText = value;
                },
              ),

              const SizedBox(height: 12),

              ElevatedButton(
                onPressed: _generateSubjects,
                child: const Text('Generar mesas'),
              ),

              const SizedBox(height: 16),

              if (subjectsCount > 0)
                ListView.builder(
                  shrinkWrap: true,
                  physics: const NeverScrollableScrollPhysics(),
                  itemCount: subjectsCount,
                  itemBuilder: (context, index) {
                    return Card(
                      margin: const EdgeInsets.symmetric(vertical: 6),
                      child: Padding(
                        padding: const EdgeInsets.all(12),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(
                              'Mesa ${index + 1}',
                              style: const TextStyle(
                                fontWeight: FontWeight.bold,
                                fontSize: 16,
                              ),
                            ),

                            const SizedBox(height: 8),

                            TextField(
                              controller: consumoControllers[index],
                              keyboardType: TextInputType.number,
                              decoration: const InputDecoration(
                                labelText: 'Consumo de la mesa',
                                border: OutlineInputBorder(),
                              ),
                            ),

                            const SizedBox(height: 8),

                            DropdownButton<String>(
                              value: porcentajeSeleccionado[index],
                              isExpanded: true,
                              items: const [
                                DropdownMenuItem(
                                    value: '10%', child: Text('10%')),
                                DropdownMenuItem(
                                    value: '12%', child: Text('12%')),
                                DropdownMenuItem(
                                    value: '15%', child: Text('15%')),
                              ],
                              onChanged: (value) {
                                if (value == null) return;
                                setState(() {
                                  porcentajeSeleccionado[index] = value;
                                });
                              },
                            ),
                          ],
                        ),
                      ),
                    );
                  },
                ),

              const SizedBox(height: 16),

              if (subjectsCount > 0)
                ElevatedButton(
                  onPressed: _calculateTips,
                  child: const Text('Calcular propina total'),
                ),

              const SizedBox(height: 20),

              Text(
                resultText,
                style: const TextStyle(fontSize: 16),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';

TextEditingController fahrenheitController = TextEditingController();
TextEditingController celsiusController = TextEditingController();
TextEditingController kelvinController = TextEditingController();
TextEditingController reamurController = TextEditingController();

class KonversiSuhu extends StatelessWidget {
  const KonversiSuhu({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Konversi Suhu"),
        backgroundColor: Colors.cyan,
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextField(
                controller: fahrenheitController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Input Suhu dalam Fahrenheit",
                  labelText: "Fahrenheit",
                  prefixIcon: Icon(Icons.thermostat),
                ),
                keyboardType: TextInputType.number,
              ),
              SizedBox(height: 10),
              ElevatedButton(
                onPressed: () {
                  // Parse input Fahrenheit
                  double fahrenheit = double.parse(fahrenheitController.text);

                  // Konversi ke Celsius, Kelvin, dan Reamur
                  double celsius = (fahrenheit - 32) * 5 / 9;
                  double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                  double reamur = (fahrenheit - 32) * 4 / 9;

                  // Set hasil ke masing-masing controller
                  celsiusController.text = celsius.toStringAsFixed(2);
                  kelvinController.text = kelvin.toStringAsFixed(2);
                  reamurController.text = reamur.toStringAsFixed(2);
                },
                child: Text("Konversi"),
              ),
              SizedBox(height: 10),
              TextField(
                controller: celsiusController,
                enabled: false,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Hasil dalam Celsius",
                  labelText: "Celsius",
                  prefixIcon: Icon(Icons.thermostat),
                ),
              ),
              SizedBox(height: 10),
              TextField(
                controller: kelvinController,
                enabled: false,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Hasil dalam Kelvin",
                  labelText: "Kelvin",
                  prefixIcon: Icon(Icons.thermostat),
                ),
              ),
              SizedBox(height: 10),
              TextField(
                controller: reamurController,
                enabled: false,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Hasil dalam Reamur",
                  labelText: "Reamur",
                  prefixIcon: Icon(Icons.thermostat),
                ),
              ),
              SizedBox(height: 10),
              ElevatedButton(
                onPressed: () {
                  fahrenheitController.clear();
                  celsiusController.clear();
                  kelvinController.clear();
                  reamurController.clear();
                },
                child: Text("Clear"),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

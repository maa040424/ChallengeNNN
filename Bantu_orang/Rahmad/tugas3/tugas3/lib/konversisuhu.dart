import 'package:flutter/material.dart';

class KonversiSuhu extends StatefulWidget {
  const KonversiSuhu({super.key});

  @override
  _KonversiSuhuState createState() => _KonversiSuhuState();
}

class _KonversiSuhuState extends State<KonversiSuhu> {
  final TextEditingController fahrenheitController = TextEditingController();
  final TextEditingController celsiusController = TextEditingController();
  final TextEditingController kelvinController = TextEditingController();
  final TextEditingController reamurController = TextEditingController();

  void konversi() {
    // Mengambil nilai dari input
    double fahrenheit = double.tryParse(fahrenheitController.text) ?? 0;

    // Konversi ke Celsius, Kelvin, dan Reamur
    double celsius = (fahrenheit - 32) * 5 / 9;
    double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
    double reamur = (fahrenheit - 32) * 4 / 9;

    // Menampilkan hasil di field masing-masing
    celsiusController.text = celsius.toStringAsFixed(2);
    kelvinController.text = kelvin.toStringAsFixed(2);
    reamurController.text = reamur.toStringAsFixed(2);
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Konversi Suhu"),
        backgroundColor: Colors.teal, // Ganti warna app bar
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              // Input suhu dalam Fahrenheit
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
                onPressed:
                    konversi, // Panggil fungsi konversi saat tombol ditekan
                child: const Text("Konversi"),
              ),
              SizedBox(height: 20),
              // Field untuk menampilkan hasil konversi
              TextField(
                controller: celsiusController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Hasil dalam Celsius",
                  prefixIcon: Icon(Icons.thermostat),
                ),
                readOnly: true, // Membuat field hasil hanya bisa dibaca
              ),
              SizedBox(height: 10),
              TextField(
                controller: kelvinController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Hasil dalam Kelvin",
                  prefixIcon: Icon(Icons.thermostat),
                ),
                readOnly: true, // Membuat field hasil hanya bisa dibaca
              ),
              SizedBox(height: 10),
              TextField(
                controller: reamurController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Hasil dalam Reamur",
                  prefixIcon: Icon(Icons.thermostat),
                ),
                readOnly: true, // Membuat field hasil hanya bisa dibaca
              ),
            ],
          ),
        ),
      ),
    );
  }
}

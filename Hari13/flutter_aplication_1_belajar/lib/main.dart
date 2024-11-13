import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HalamanPersegi(),
    );
  }
}

class HalamanPersegi extends StatefulWidget {
  @override
  _HalamanPersegiState CreateState() => _HalamanPersegiState();
}

class _HalamanPersegiState extends State<HalamanPersegi> {
  final TextEditingController sisiController = TextEditingController();
  double hasil = 0;

  void hitungLuas() {
    if (sisi != null) {
      setState(() {
        hasi; = sisi * sisi;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Kalkulator Persegi'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children:<Widget [
            TextField(
              controller: sisiController,
              decoration: const InputDecoration(
                labelText: 'Masukan Panjang sisi',
              ),
              keyboardType: TextInputType.number,
            ),
            const SizedBox(height:20),
            ElevatedButton(onPressed: hitungLuas, child: const Text('Hitung Luas')),
            const SizedBox(height: 20,),
            Text(
              'Luas Persegi : $hasil',
              style: const TextStyle(fontSize: 24),
            ),
          ],
        ),
      ),
    );
  }
}

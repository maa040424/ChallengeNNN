import 'package:flutter/material.dart';

class Operasi2bilangan extends StatefulWidget {
  const Operasi2bilangan({super.key});

  @override
  _Operasi2bilanganState createState() => _Operasi2bilanganState();
}

class _Operasi2bilanganState extends State<Operasi2bilangan> {
  final TextEditingController bil1Controller = TextEditingController();
  final TextEditingController bil2Controller = TextEditingController();
  final TextEditingController hasilController =
      TextEditingController(); // Controller untuk hasil

  void hitung() {
    // Mengambil nilai dari input
    double bil1 = double.tryParse(bil1Controller.text) ?? 0;
    double bil2 = double.tryParse(bil2Controller.text) ?? 0;

    // Menghitung hasil (misalnya penjumlahan)
    double total = bil1 + bil2;

    // Menampilkan hasil di field hasil
    hasilController.text = total.toString(); // Mengubah hasil menjadi string
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Operasi 2 Bilangan"),
        backgroundColor: Colors.teal, // Ganti warna app bar
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              // Input bilangan pertama
              TextField(
                controller: bil1Controller,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Input Bilangan Pertama",
                  labelText: "Bilangan 1",
                  prefixIcon: Icon(Icons.numbers),
                ),
                keyboardType: TextInputType.number,
              ),
              SizedBox(height: 10),
              // Input bilangan kedua
              TextField(
                controller: bil2Controller,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  hintText: "Input Bilangan Kedua",
                  labelText: "Bilangan 2",
                  prefixIcon: Icon(Icons.numbers),
                ),
                keyboardType: TextInputType.number,
              ),
              SizedBox(height: 10),
              ElevatedButton(
                onPressed: hitung, // Panggil fungsi hitung saat tombol ditekan
                child: const Text("Hitung"),
              ),
              SizedBox(height: 20),
              // Field untuk menampilkan hasil
              TextField(
                controller: hasilController,
                decoration: InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: "Hasil",
                  prefixIcon: Icon(Icons.calculate),
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

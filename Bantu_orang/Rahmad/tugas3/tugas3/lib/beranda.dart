import 'package:flutter/material.dart';
import 'package:tugas3/operasi2bilangan.dart'; // Path sesuai dengan struktur folder
import 'package:tugas3/konversisuhu.dart'; // Pastikan file konversi_suhu.dart ada

class BerandaPage extends StatelessWidget {
  const BerandaPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Aplikasi Perhitungan"),
        backgroundColor: Colors.teal, // Ganti warna background app bar
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text("Silahkan pilih menu yang tersedia"),
            SizedBox(height: 10),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => Operasi2bilangan()),
                );
              },
              child: const Text("Operasi 2 Bilangan"),
            ),
            SizedBox(height: 10),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => KonversiSuhu()),
                );
              },
              child: const Text("Konversi Suhu"),
            ),
          ],
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:projek02_perhitungan5b/operasi2bilangan.dart';
import 'package:projek02_perhitungan5b/konversisuhu.dart'; // Pastikan ada file konversi_suhu.dart yang berisi widget KonversiSuhu

class BerandaPage extends StatelessWidget {
  const BerandaPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Aplikasi Perhitungan"),
        backgroundColor: Colors.cyan,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text("Silahkan pilih menu yang tersedia"),
            SizedBox(
              height: 10,
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => Operasi2bilangan(),
                  ),
                );
              },
              child: Text("Operasi 2 Bilangan"),
            ),
            SizedBox(
              height: 10,
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => KonversiSuhu(),
                  ),
                );
              },
              child: Text("Konversi Suhu"),
            ),
          ],
        ),
      ),
    );
  }
}

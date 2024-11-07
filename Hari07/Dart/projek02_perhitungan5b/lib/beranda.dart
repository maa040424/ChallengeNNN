import 'package:flutter/material.dart';
import 'package:projek02_perhitungan5b/operasi2bilangan.dart';

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
                          builder: (context) => Operasi2bilangan()));
                },
                child: Text("Operasi 2 Bilangan")),
            SizedBox(
              height: 10,
            ),
            ElevatedButton(onPressed: () {}, child: Text("Konversi Suhu")),
          ],
        ),
      ),
    );
  }
}

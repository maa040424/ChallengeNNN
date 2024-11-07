import 'package:flutter/material.dart';

class Operasi2bilangan extends StatelessWidget {
  const Operasi2bilangan({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Operasi 2 Bilangan"),
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
              onPressed: () {},
              child: Text("Operasi 2 Bilangan"),
            ),
            SizedBox(
              height: 10,
            ),
            ElevatedButton(
              onPressed: () {},
              child: Text("Konversi Suhu"),
            ),
          ],
        ),
      ),
    );
  }
}

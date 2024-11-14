import 'package:flutter/material.dart';
import 'pajak.dart'; // Import file pajak.dart
import 'profil.dart'; // Import file profil.dart

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Projek UTS',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HalamanUtama(),
    );
  }
}

class HalamanUtama extends StatelessWidget {
  final int noAbsen = 13;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Projek UTS'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              'No Absen: $noAbsen',
              style: TextStyle(fontSize: 24),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => PajakPage()),
                );
              },
              child: Text('Pajak'),
            ),
            SizedBox(height: 10),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => ProfilPage()),
                );
              },
              child: Text('Profil'),
            ),
          ],
        ),
      ),
    );
  }
}

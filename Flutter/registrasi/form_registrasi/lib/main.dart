import 'package:flutter/material.dart';
import 'registrasi.dart'; // Pastikan untuk mengimpor file registrasi.dart

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Form Registrasi',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: PageRegistrasi(), // Memanggil halaman registrasi
    );
  }
}

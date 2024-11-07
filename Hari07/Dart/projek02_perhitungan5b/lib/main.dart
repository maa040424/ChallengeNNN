import 'package:flutter/material.dart';
import 'package:projek02_perhitungan5b/beranda.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(home: BerandaPage());
  }
}

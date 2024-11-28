import 'package:flutter/material.dart';
import 'package:tugas3/beranda.dart'; // Path sesuai dengan struktur folder

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

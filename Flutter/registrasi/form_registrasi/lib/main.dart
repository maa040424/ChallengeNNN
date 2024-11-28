import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Aplikasi Saya',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      debugShowCheckedModeBanner: false, // Menonaktifkan label debug
      home: PageRegistrasi(),
    );
  }
}

class PageRegistrasi extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Form Registrasi'),
      ),
      body: Center(
        child: Text('Isi Form Registrasi Anda'),
      ),
    );
  }
}

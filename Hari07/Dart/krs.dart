// krs.dart
import 'package:flutter/material.dart';

class KrsPage extends StatelessWidget {
  const KrsPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Kartu Rencana Studi (KRS)"),
        backgroundColor: Colors.blueGrey,
      ),
      body: ListView(
        padding: EdgeInsets.all(16.0),
        children: [
          Text(
            "Daftar Mata Kuliah",
            style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
          ),
          SizedBox(height: 10),
          courseCard("Matematika Lanjut", "3 SKS"),
          courseCard("Fisika Dasar", "2 SKS"),
          courseCard("Algoritma dan Pemrograman", "4 SKS"),
          courseCard("Basis Data", "3 SKS"),
          courseCard("Sistem Operasi", "3 SKS"),
        ],
      ),
    );
  }

  Widget courseCard(String courseName, String sks) {
    return Card(
      margin: EdgeInsets.symmetric(vertical: 8),
      child: ListTile(
        leading: Icon(Icons.book, color: Colors.blue),
        title: Text(courseName),
        subtitle: Text("SKS: $sks"),
      ),
    );
  }
}

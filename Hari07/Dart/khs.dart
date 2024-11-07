// khs.dart
import 'package:flutter/material.dart';

class KhsPage extends StatelessWidget {
  const KhsPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Kartu Hasil Studi (KHS)"),
        backgroundColor: Colors.green,
      ),
      body: ListView(
        padding: EdgeInsets.all(16.0),
        children: [
          Text(
            "Nilai Mata Kuliah",
            style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
          ),
          SizedBox(height: 10),
          gradeCard("Matematika Lanjut", "A"),
          gradeCard("Fisika Dasar", "B+"),
          gradeCard("Algoritma dan Pemrograman", "A"),
          gradeCard("Basis Data", "B"),
          gradeCard("Sistem Operasi", "A-"),
        ],
      ),
    );
  }

  Widget gradeCard(String courseName, String grade) {
    return Card(
      margin: EdgeInsets.symmetric(vertical: 8),
      child: ListTile(
        leading: Icon(Icons.grade, color: Colors.green),
        title: Text(courseName),
        trailing: Text(
          grade,
          style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
        ),
      ),
    );
  }
}

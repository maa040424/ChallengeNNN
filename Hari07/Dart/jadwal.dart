// jadwal.dart
import 'package:flutter/material.dart';

class JadwalPage extends StatelessWidget {
  const JadwalPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Jadwal Kuliah"),
        backgroundColor: Colors.purple,
      ),
      body: ListView(
        padding: EdgeInsets.all(16.0),
        children: [
          Text(
            "Jadwal Mata Kuliah",
            style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
          ),
          SizedBox(height: 10),
          scheduleCard("Senin", "Algoritma dan Pemrograman", "08:00 - 10:00"),
          scheduleCard("Selasa", "Matematika Lanjut", "10:00 - 12:00"),
          scheduleCard("Rabu", "Basis Data", "08:00 - 10:00"),
          scheduleCard("Kamis", "Sistem Operasi", "10:00 - 12:00"),
          scheduleCard("Jumat", "Fisika Dasar", "08:00 - 10:00"),
        ],
      ),
    );
  }

  Widget scheduleCard(String day, String course, String time) {
    return Card(
      margin: EdgeInsets.symmetric(vertical: 8),
      child: ListTile(
        leading: Icon(Icons.calendar_today, color: Colors.purple),
        title: Text("$day - $course"),
        subtitle: Text(time),
      ),
    );
  }
}

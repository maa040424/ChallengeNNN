// profil.dart
import 'package:flutter/material.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Profil Mahasiswa"),
        backgroundColor: Colors.grey,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Center(
              child: CircleAvatar(
                radius: 60,
                backgroundImage: AssetImage(
                    "lib/assets/Aqueit.jpg"), // Sesuaikan dengan gambar profil
              ),
            ),
            SizedBox(height: 20),
            Center(
              child: Text(
                "Muhammad Adam Alghifari",
                style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
              ),
            ),
            SizedBox(height: 5),
            Center(
              child: Text(
                "NPM: 2210010314",
                style: TextStyle(fontSize: 18, color: Colors.grey[700]),
              ),
            ),
            Divider(height: 30, thickness: 1),
            ListTile(
              leading: Icon(Icons.school),
              title: Text("Kelas: 5B RegBJB"),
            ),
            ListTile(
              leading: Icon(Icons.calendar_today),
              title: Text("Semester: V (Lima)"),
            ),
            ListTile(
              leading: Icon(Icons.date_range),
              title: Text("Tahun Angkatan: 2022"),
            ),
          ],
        ),
      ),
    );
  }
}

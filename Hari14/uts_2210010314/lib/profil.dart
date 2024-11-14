import 'package:flutter/material.dart';

class ProfilPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Profil'),
        backgroundColor: Colors.deepPurple,
      ),
      body: Container(
        decoration: BoxDecoration(
          gradient: LinearGradient(
            colors: [Colors.deepPurple, Colors.indigo],
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
          ),
        ),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              CircleAvatar(
                radius: 50,
                backgroundImage: AssetImage(
                    'assets/re.jpg'), // Ganti NetworkImage dengan AssetImage
                backgroundColor: Colors.white,
              ),
              SizedBox(height: 20),
              Text(
                'Profil',
                style: TextStyle(
                  fontSize: 28,
                  fontWeight: FontWeight.bold,
                  color: Colors.amber,
                ),
              ),
              SizedBox(height: 20),
              InfoText(
                label: 'NPM:',
                value: '2210010314',
              ),
              SizedBox(height: 10),
              InfoText(
                label: 'Nama Lengkap:',
                value: 'Muhammad Adam Alghifari',
              ),
              SizedBox(height: 10),
              InfoText(
                label: 'Prodi:',
                value: 'Teknik Informatika',
              ),
            ],
          ),
        ),
      ),
    );
  }
}

// Custom widget for displaying profile information
class InfoText extends StatelessWidget {
  final String label;
  final String value;

  InfoText({required this.label, required this.value});

  @override
  Widget build(BuildContext context) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Text(
          '$label ',
          style: TextStyle(
            fontSize: 18,
            fontWeight: FontWeight.bold,
            color: Colors.white,
          ),
        ),
        Text(
          value,
          style: TextStyle(
            fontSize: 18,
            color: Colors.white,
          ),
        ),
      ],
    );
  }
}

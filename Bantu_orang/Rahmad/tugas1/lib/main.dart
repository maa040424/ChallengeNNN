import 'package:flutter/material.dart';

void main() {
  runApp(Helloworld());
}

class Helloworld extends StatelessWidget {
  const Helloworld({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "Hello World",
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.greenAccent, // Ganti warna app bar
          title: const Text("Hello World App"),
          centerTitle: true,
          actions: [
            IconButton(icon: Icon(Icons.search), onPressed: () {}),
            IconButton(icon: Icon(Icons.settings), onPressed: () {})
          ],
          shape: const BeveledRectangleBorder(
            borderRadius: BorderRadius.only(
              bottomLeft: Radius.circular(25),
              bottomRight: Radius.circular(25),
            ),
          ),
        ),
        body: Center(
          child: Padding(
            padding: const EdgeInsets.all(16.0),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                Text(
                  'Nama: Rahmad', // Ganti nama
                  style: TextStyle(fontSize: 18),
                ),
                SizedBox(height: 16),
                Text(
                  'NPM: 2210010446', // Ganti NPM
                  style: TextStyle(fontSize: 18),
                ),
                SizedBox(height: 16),
                Text(
                  'Kelas : 5B BJB Reguler Pagi',
                  style: TextStyle(fontSize: 18),
                ),
                SizedBox(height: 16),
                Text(
                  'Semester: 5',
                  style: TextStyle(fontSize: 18),
                ),
                SizedBox(height: 16),
                Text(
                  'Tahun Angkatan: 2022',
                  style: TextStyle(fontSize: 18),
                ),
              ],
            ),
          ),
        ),
        drawer: Drawer(),
        floatingActionButton: FloatingActionButton(
          onPressed: () {},
          child: Icon(Icons.add),
          backgroundColor: Colors.blue, // Ganti warna tombol aksi
        ),
        bottomNavigationBar: BottomNavigationBar(
          items: [
            BottomNavigationBarItem(icon: Icon(Icons.home), label: 'Home'),
            BottomNavigationBarItem(
                icon: Icon(Icons.notifications), label: 'Notifikasi'),
            BottomNavigationBarItem(
                icon: Icon(Icons.settings), label: 'Pengaturan'),
          ],
          backgroundColor: Colors.orangeAccent, // Ganti warna bottom nav
        ),
      ),
    );
  }
}

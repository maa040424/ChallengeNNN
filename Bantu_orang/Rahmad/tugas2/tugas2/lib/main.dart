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
      title: "Hello World App",
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
                SizedBox(height: 16),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    _buildIconContainer(
                        icon: Icons.account_circle, title: "Profil"),
                    _buildIconContainer(icon: Icons.book, title: "KRS"),
                  ],
                ),
                SizedBox(height: 10),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                  children: [
                    _buildIconContainer(
                        icon: Icons.calendar_month, title: "Jadwal"),
                    _buildIconContainer(
                        icon: Icons.account_balance, title: "Pembayaran"),
                  ],
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

  // Fungsi untuk membangun kotak menu
  Widget _buildIconContainer({required IconData icon, required String title}) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.blue, // Ganti warna kotak
        borderRadius: BorderRadius.circular(20),
        border: Border.all(color: Colors.black, width: 2),
      ),
      width: 100,
      height: 100,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Icon(icon, size: 60, color: Colors.white),
          SizedBox(height: 8),
          Text(
            title,
            style: TextStyle(
              color: Colors.white,
              fontWeight: FontWeight.bold,
            ),
          ),
        ],
      ),
    );
  }
}

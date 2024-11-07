import 'package:flutter/material.dart';
import 'package:flutter_hellowordl1/krs.dart';
import 'package:flutter_hellowordl1/profil.dart';
import 'package:flutter_hellowordl1/khs.dart';
import 'package:flutter_hellowordl1/jadwal.dart';
import 'package:flutter_hellowordl1/pembayaran.dart';

void main() {
  runApp(HelloWorld());
}

class HelloWorld extends StatelessWidget {
  const HelloWorld({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        title: "Project Hello World",
        home: BerandaPage());
  }
}

class BerandaPage extends StatelessWidget {
  const BerandaPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.grey,
        title: Text("Hello World Project"),
        centerTitle: true,
        actions: [
          IconButton(onPressed: () {}, icon: Icon(Icons.add)),
          IconButton(
              onPressed: () {}, icon: Icon(Icons.signal_wifi_4_bar_rounded))
        ],
        shape: const RoundedRectangleBorder(
            borderRadius: BorderRadius.only(
                bottomLeft: Radius.circular(20),
                bottomRight: Radius.circular(20))),
        elevation: 30,
        shadowColor: Colors.black,
      ),
      body: Center(
        child: Column(children: [
          Text(
            "Biodata Diri",
            style: TextStyle(
              fontSize: 45,
            ),
          ),
          Text(
            "Nama : Muhammad Adam Alghifari",
            style: TextStyle(fontSize: 20),
          ),
          Text(
            "NPM : 2210010314",
            style: TextStyle(fontSize: 20),
          ),
          Text(
            "Kelas : 5B RegBJB",
            style: TextStyle(fontSize: 20),
          ),
          Text(
            "Semester : V (Lima)",
            style: TextStyle(fontSize: 20),
          ),
          Text(
            "Tahun Angkatan : 2022",
            style: TextStyle(fontSize: 20),
          ),
          SizedBox(
            height: 10,
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              tombol(
                  "Beranda",
                  Icon(Icons.home),
                  const Color.fromARGB(255, 209, 16, 16),
                  context,
                  BerandaPage()), // Halaman Beranda
              tombol(
                  "Profile",
                  Icon(Icons.person),
                  const Color.fromARGB(255, 234, 180, 2),
                  context,
                  ProfilePage()), // Halaman Profile
            ],
          ),
          SizedBox(
            height: 10,
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              tombol(
                  "KRS",
                  Icon(Icons.bookmark_add),
                  const Color.fromARGB(255, 4, 246, 40),
                  context,
                  KrsPage()), // Halaman KRS
              tombol(
                  "KHS",
                  Icon(Icons.book),
                  const Color.fromARGB(255, 53, 48, 193),
                  context,
                  KhsPage()), // Halaman KHS
            ],
          ),
          SizedBox(
            height: 10,
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              tombol(
                  "Jadwal",
                  Icon(Icons.calendar_month),
                  const Color.fromARGB(255, 23, 132, 169),
                  context,
                  JadwalPage()), // Halaman Jadwal
              tombol(
                  "Pembayaran",
                  Icon(Icons.account_balance),
                  const Color.fromARGB(255, 169, 25, 182),
                  context,
                  PembayaranPage()), // Halaman Pembayaran
            ],
          )
        ]),
      ),
      drawer: const Drawer(),
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        backgroundColor: const Color.fromARGB(255, 53, 52, 52),
        child: const Icon(
          Icons.add,
          color: Colors.white,
        ),
      ),
      bottomNavigationBar: BottomNavigationBar(items: [
        BottomNavigationBarItem(icon: Icon(Icons.home), label: "Home"),
        BottomNavigationBarItem(
            icon: Icon(Icons.notifications), label: "Notifikasi")
      ]),
    );
  }
}

// function dengan tipe widget dan 4 parameter agar mempersingkat kodingan
Widget tombol(String judul, Icon iconTombol, Color warna, BuildContext context,
    Widget tujuan) {
  return Container(
    decoration: BoxDecoration(
        color: warna,
        borderRadius: BorderRadius.circular(20),
        border: Border.all(color: Colors.black, width: 2)),
    width: 100,
    height: 100,
    child: Column(
      children: [
        IconButton(
          onPressed: () {
            Navigator.push(
                context, MaterialPageRoute(builder: (context) => tujuan));
          },
          icon: iconTombol,
          iconSize: 60,
          color: Colors.white,
        ),
        Text(
          judul,
          style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold),
        )
      ],
    ),
  );
}

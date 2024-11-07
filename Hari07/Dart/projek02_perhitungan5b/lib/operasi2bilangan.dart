import 'package:flutter/material.dart';

TextEditingController bil1 = TextEditingController();
TextEditingController bil2 = TextEditingController();
TextEditingController hasil = TextEditingController();

class Operasi2bilangan extends StatelessWidget {
  const Operasi2bilangan({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Operasi 2 Bilangan"),
        backgroundColor: Colors.cyan,
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextField(
                controller: bil1,
                decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    hintText: "Input Bilangan Pertama",
                    labelText: "Input Bilangan Pertama",
                    prefixIcon: Icon(Icons.numbers)),
              ),
              SizedBox(
                height: 10,
              ),
              TextField(
                controller: bil2,
                decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    hintText: "Input Bilangan Kedua",
                    labelText: "Input Bilangan Kedua",
                    prefixIcon: Icon(Icons.numbers)),
              ),
              SizedBox(
                height: 10,
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  ElevatedButton(
                      onPressed: () {
                        double hitung =
                            double.parse(bil1.text) + double.parse(bil2.text);
                        hasil.text = hitung.toString();
                      },
                      child: Text("+")),
                  SizedBox(
                    width: 10,
                  ),
                  ElevatedButton(
                      onPressed: () {
                        bil1.clear();
                        bil2.clear();
                        hasil.clear();
                      },
                      child: Text("Clear")),
                ],
              ),
              SizedBox(
                height: 10,
              ),
              TextField(
                controller: hasil,
                enabled: false,
                decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    hintText: "Hasil Perhitungan",
                    labelText: "Hasil Perhitungan",
                    prefixIcon: Icon(Icons.numbers)),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';

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
                decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    hintText: "Input Bilangan Kedua",
                    labelText: "Input Bilangan Kedua",
                    prefixIcon: Icon(Icons.numbers)),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

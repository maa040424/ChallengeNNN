// pembayaran.dart
import 'package:flutter/material.dart';

class PembayaranPage extends StatelessWidget {
  const PembayaranPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Pembayaran Kuliah"),
        backgroundColor: Colors.red,
      ),
      body: ListView(
        padding: EdgeInsets.all(16.0),
        children: [
          Text(
            "Status Pembayaran",
            style: TextStyle(fontSize: 22, fontWeight: FontWeight.bold),
          ),
          SizedBox(height: 10),
          paymentStatus("Semester 1", "Lunas"),
          paymentStatus("Semester 2", "Lunas"),
          paymentStatus("Semester 3", "Lunas"),
          paymentStatus("Semester 4", "Lunas"),
          paymentStatus("Semester 5", "Belum Lunas"),
        ],
      ),
    );
  }

  Widget paymentStatus(String semester, String status) {
    return Card(
      margin: EdgeInsets.symmetric(vertical: 8),
      child: ListTile(
        leading: Icon(
          status == "Lunas" ? Icons.check_circle : Icons.error,
          color: status == "Lunas" ? Colors.green : Colors.red,
        ),
        title: Text(semester),
        trailing: Text(
          status,
          style: TextStyle(
            color: status == "Lunas" ? Colors.green : Colors.red,
            fontWeight: FontWeight.bold,
          ),
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';

class PajakPage extends StatefulWidget {
  @override
  _PajakPageState createState() => _PajakPageState();
}

class _PajakPageState extends State<PajakPage> {
  final TextEditingController _hargaController = TextEditingController();
  final TextEditingController _pajakController = TextEditingController();
  final TextEditingController _hasilPajakController = TextEditingController();
  final TextEditingController _hargaSetelahPajakController =
      TextEditingController();

  void _hitungPajak() {
    double harga = double.tryParse(_hargaController.text) ?? 0;
    double pajak = double.tryParse(_pajakController.text) ?? 0;
    double hasilPajak = harga * pajak / 100;
    double hargaSetelahPajak = harga + hasilPajak;

    setState(() {
      _hasilPajakController.text = hasilPajak.toStringAsFixed(0);
      _hargaSetelahPajakController.text = hargaSetelahPajak.toStringAsFixed(0);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Kalkulator Pajak'),
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
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'Masukkan Detail',
              style: TextStyle(
                fontSize: 24,
                fontWeight: FontWeight.bold,
                color: Colors.white,
              ),
            ),
            SizedBox(height: 20),
            TextField(
              controller: _hargaController,
              decoration: InputDecoration(
                labelText: 'Harga Barang',
                labelStyle: TextStyle(color: Colors.white),
                border: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                enabledBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                focusedBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.amber),
                ),
              ),
              keyboardType: TextInputType.number,
              style: TextStyle(color: Colors.white),
            ),
            SizedBox(height: 10),
            TextField(
              controller: _pajakController,
              decoration: InputDecoration(
                labelText: 'Jumlah Pajak (%)',
                labelStyle: TextStyle(color: Colors.white),
                border: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                enabledBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                focusedBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.amber),
                ),
              ),
              keyboardType: TextInputType.number,
              style: TextStyle(color: Colors.white),
            ),
            SizedBox(height: 20),
            Center(
              child: ElevatedButton(
                onPressed: _hitungPajak,
                style: ElevatedButton.styleFrom(
                  padding: EdgeInsets.symmetric(horizontal: 40, vertical: 15),
                  backgroundColor: Colors.amber,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(30),
                  ),
                ),
                child: Text(
                  'Hitung',
                  style: TextStyle(
                    color: Colors.deepPurple,
                    fontSize: 18,
                    fontWeight: FontWeight.bold,
                  ),
                ),
              ),
            ),
            SizedBox(height: 20),
            TextField(
              controller: _hasilPajakController,
              decoration: InputDecoration(
                labelText: 'Jumlah Pajak (Rp.)',
                labelStyle: TextStyle(color: Colors.white),
                border: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                enabledBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                focusedBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.amber),
                ),
              ),
              readOnly: true,
              style: TextStyle(color: Colors.white),
            ),
            SizedBox(height: 10),
            TextField(
              controller: _hargaSetelahPajakController,
              decoration: InputDecoration(
                labelText: 'Harga Setelah Pajak',
                labelStyle: TextStyle(color: Colors.white),
                border: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                enabledBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.white),
                ),
                focusedBorder: OutlineInputBorder(
                  borderSide: BorderSide(color: Colors.amber),
                ),
              ),
              readOnly: true,
              style: TextStyle(color: Colors.white),
            ),
          ],
        ),
      ),
    );
  }
}

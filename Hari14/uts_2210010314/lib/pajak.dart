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
        title: Text('Pajak'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            TextField(
              controller: _hargaController,
              decoration: InputDecoration(
                labelText: 'Harga Barang',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
            ),
            SizedBox(height: 10),
            TextField(
              controller: _pajakController,
              decoration: InputDecoration(
                labelText: 'Jumlah Pajak (%)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
            ),
            SizedBox(height: 20),
            Center(
              child: ElevatedButton(
                onPressed: _hitungPajak,
                child: Text('Hitung'),
              ),
            ),
            SizedBox(height: 20),
            TextField(
              controller: _hasilPajakController,
              decoration: InputDecoration(
                labelText: 'Jumlah Pajak (Rp.)',
                border: OutlineInputBorder(),
              ),
              readOnly: true,
            ),
            SizedBox(height: 10),
            TextField(
              controller: _hargaSetelahPajakController,
              decoration: InputDecoration(
                labelText: 'Harga Setelah Pajak',
                border: OutlineInputBorder(),
              ),
              readOnly: true,
            ),
          ],
        ),
      ),
    );
  }
}

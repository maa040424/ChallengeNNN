import 'package:flutter/material.dart';

class PageRegistrasi extends StatefulWidget {
  @override
  _PageRegistrasiState createState() => _PageRegistrasiState();
}

class _PageRegistrasiState extends State<PageRegistrasi> {
  final _formKey = GlobalKey<FormState>();
  String? npm;
  String? nama;
  String? jenisKelamin;
  String? jurusan;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Form Registrasi'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            children: [
              // Input NPM
              TextFormField(
                decoration: InputDecoration(labelText: 'NPM'),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'NPM tidak boleh kosong';
                  }
                  return null;
                },
                onSaved: (value) {
                  npm = value;
                },
              ),
              // Input Nama
              TextFormField(
                decoration: InputDecoration(labelText: 'Nama'),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Nama tidak boleh kosong';
                  }
                  return null;
                },
                onSaved: (value) {
                  nama = value;
                },
              ),
              // Dropdown Jurusan
              DropdownButtonFormField<String>(
                decoration: InputDecoration(labelText: 'Jurusan'),
                items: <String>[
                  'Teknik Informatika',
                  'Sistem Informasi',
                  'Desain Komunikasi Visual'
                ].map((String value) {
                  return DropdownMenuItem<String>(
                    value: value,
                    child: Text(value),
                  );
                }).toList(),
                onChanged: (value) {
                  jurusan = value;
                },
                validator: (value) => value == null ? 'Pilih jurusan' : null,
              ),
              // Radio Button Jenis Kelamin
              ListTile(
                title: Text('Laki-laki'),
                leading: Radio<String>(
                  value: 'Laki-laki',
                  groupValue: jenisKelamin,
                  onChanged: (value) {
                    setState(() {
                      jenisKelamin = value;
                    });
                  },
                ),
              ),
              ListTile(
                title: Text('Perempuan'),
                leading: Radio<String>(
                  value: 'Perempuan',
                  groupValue: jenisKelamin,
                  onChanged: (value) {
                    setState(() {
                      jenisKelamin = value;
                    });
                  },
                ),
              ),
              // Tombol Daftar
              ElevatedButton(
                onPressed: () {
                  if (_formKey.currentState!.validate()) {
                    _formKey.currentState!.save();
                    ScaffoldMessenger.of(context).showSnackBar(
                      SnackBar(content: Text('Registrasi berhasil!')),
                    );
                  }
                },
                child: Text('Submit'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

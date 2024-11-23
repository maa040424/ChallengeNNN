import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

void main() {
  runApp(FinanceApp());
}

class FinanceApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Pengelola Keuangan',
      theme: ThemeData(
        primarySwatch: Colors.green,
      ),
      home: FinanceHome(),
    );
  }
}

class FinanceHome extends StatefulWidget {
  @override
  _FinanceHomeState createState() => _FinanceHomeState();
}

class _FinanceHomeState extends State<FinanceHome> {
  final List<Map<String, dynamic>> _transactions = [];
  double _totalBalance = 0.0;

  final TextEditingController _titleController = TextEditingController();
  final TextEditingController _amountController = TextEditingController();

  void _addTransaction(String title, double amount, bool isIncome) {
    setState(() {
      _transactions.add({
        'title': title,
        'amount': amount,
        'isIncome': isIncome,
        'date': DateTime.now(),
      });

      _totalBalance += isIncome ? amount : -amount;
    });

    Navigator.of(context).pop();
  }

  void _showAddTransactionModal(BuildContext context) {
    showModalBottomSheet(
      context: context,
      builder: (_) {
        return Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            mainAxisSize: MainAxisSize.min,
            children: [
              TextField(
                controller: _titleController,
                decoration: InputDecoration(labelText: 'Judul Transaksi'),
              ),
              TextField(
                controller: _amountController,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(labelText: 'Jumlah'),
              ),
              SizedBox(height: 10),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: [
                  ElevatedButton(
                    onPressed: () {
                      final title = _titleController.text;
                      final amount =
                          double.tryParse(_amountController.text) ?? 0.0;
                      if (title.isNotEmpty && amount > 0) {
                        _addTransaction(title, amount, true);
                      }
                    },
                    child: Text('Tambah Pemasukan'),
                  ),
                  ElevatedButton(
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Colors.red, // Warna tombol pengeluaran
                    ),
                    onPressed: () {
                      final title = _titleController.text;
                      final amount =
                          double.tryParse(_amountController.text) ?? 0.0;
                      if (title.isNotEmpty && amount > 0) {
                        _addTransaction(title, amount, false);
                      }
                    },
                    child: Text('Tambah Pengeluaran'),
                  ),
                ],
              ),
            ],
          ),
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Pengelola Keuangan'),
      ),
      body: Column(
        children: [
          Container(
            padding: const EdgeInsets.all(16.0),
            child: Card(
              elevation: 5,
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  children: [
                    Text(
                      'Total Saldo',
                      style:
                          TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
                    ),
                    SizedBox(height: 10),
                    Text(
                      'Rp ${_totalBalance.toStringAsFixed(2)}',
                      style: TextStyle(
                        fontSize: 24,
                        fontWeight: FontWeight.bold,
                        color: _totalBalance >= 0 ? Colors.green : Colors.red,
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
          Expanded(
            child: _transactions.isEmpty
                ? Center(child: Text('Belum ada transaksi.'))
                : ListView.builder(
                    itemCount: _transactions.length,
                    itemBuilder: (ctx, index) {
                      final tx = _transactions[index];
                      return ListTile(
                        leading: CircleAvatar(
                          backgroundColor:
                              tx['isIncome'] ? Colors.green : Colors.red,
                          child: Icon(
                            tx['isIncome']
                                ? Icons.arrow_downward
                                : Icons.arrow_upward,
                            color: Colors.white,
                          ),
                        ),
                        title: Text(tx['title']),
                        subtitle: Text(
                          DateFormat('dd-MM-yyyy HH:mm').format(tx['date']),
                          style: TextStyle(fontSize: 12),
                        ),
                        trailing: Text(
                          'Rp ${tx['amount'].toStringAsFixed(2)}',
                          style: TextStyle(
                            color: tx['isIncome'] ? Colors.green : Colors.red,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      );
                    },
                  ),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () => _showAddTransactionModal(context),
        child: Icon(Icons.add),
      ),
    );
  }
}

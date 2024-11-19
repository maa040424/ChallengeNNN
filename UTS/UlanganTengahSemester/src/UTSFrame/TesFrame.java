
package UTSFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TesFrame extends JFrame {
     private JTable tableRiwayat;
    private DefaultTableModel tableModel;
    private JLabel labelJudul;
    private JButton buttonKembali;
    public TesFrame() {
       setTitle("Riwayat Transaksi");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Label Judul
        labelJudul = new JLabel("Riwayat Transaksi");
        labelJudul.setBounds(200, 10, 200, 20);
        labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelJudul);

        // Tabel untuk menampilkan riwayat transaksi
        String[] kolom = {"Tanggal", "Deskripsi", "Kategori", "Jenis", "Nominal"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableRiwayat = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableRiwayat);
        scrollPane.setBounds(50, 50, 500, 200);
        add(scrollPane);

        // Tombol Kembali
        buttonKembali = new JButton("Kembali");
        buttonKembali.setBounds(250, 300, 100, 30);
        add(buttonKembali);

        // Event Tombol Kembali
        buttonKembali.addActionListener(e -> dispose());
    }

    public void tambahData(String tanggal, String deskripsi, String kategori, String jenis, String nominal) {
        tableModel.addRow(new Object[]{tanggal, deskripsi, kategori, jenis, nominal});
    }

    public static void main(String[] args) {
        // Simulasi data riwayat
        TesFrame riwayat = new TesFrame();
        riwayat.tambahData("2024-11-19", "Gaji Bulanan", "Gaji", "Pemasukan", "Rp 5.000.000");
        riwayat.tambahData("2024-11-20", "Belanja Bulanan", "Makanan", "Pengeluaran", "Rp 1.200.000");
        riwayat.tambahData("2024-11-21", "Bonus Proyek", "Gaji", "Pemasukan", "Rp 2.000.000");
        riwayat.tambahData("2024-11-22", "Netflix Subscription", "Hiburan", "Pengeluaran", "Rp 120.000");

        riwayat.setVisible(true);
    }
}

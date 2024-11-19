
package UTSFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TesFrame extends JFrame {
    private JTable tableLaporan;
    private DefaultTableModel tableModel;
    private JLabel labelJudul, labelTotalPemasukan, labelTotalPengeluaran, labelSaldoAkhir;
    private JTextField textTotalPemasukan, textTotalPengeluaran, textSaldoAkhir;
    private JButton buttonKembali;
    
    public TesFrame() {
        setTitle("Laporan Keuangan");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        // Label Judul
        labelJudul = new JLabel("Laporan Keuangan");
        labelJudul.setBounds(200, 10, 200, 20);
        labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelJudul);

        // Tabel untuk menampilkan laporan
        String[] kolom = {"Tanggal", "Deskripsi", "Pemasukan", "Pengeluaran"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableLaporan = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableLaporan);
        scrollPane.setBounds(50, 50, 500, 200);
        add(scrollPane);

        // Label Total Pemasukan
        labelTotalPemasukan = new JLabel("Total Pemasukan: ");
        labelTotalPemasukan.setBounds(50, 260, 150, 20);
        add(labelTotalPemasukan);

        textTotalPemasukan = new JTextField();
        textTotalPemasukan.setBounds(180, 260, 120, 20);
        textTotalPemasukan.setEditable(false);
        add(textTotalPemasukan);

        // Label Total Pengeluaran
        labelTotalPengeluaran = new JLabel("Total Pengeluaran: ");
        labelTotalPengeluaran.setBounds(320, 260, 150, 20);
        add(labelTotalPengeluaran);

        textTotalPengeluaran = new JTextField();
        textTotalPengeluaran.setBounds(450, 260, 120, 20);
        textTotalPengeluaran.setEditable(false);
        add(textTotalPengeluaran);

        // Label Saldo Akhir
        labelSaldoAkhir = new JLabel("Saldo Akhir: ");
        labelSaldoAkhir.setBounds(50, 290, 150, 20);
        add(labelSaldoAkhir);

        textSaldoAkhir = new JTextField();
        textSaldoAkhir.setBounds(180, 290, 120, 20);
        textSaldoAkhir.setEditable(false);
        add(textSaldoAkhir);

        // Tombol Kembali
        buttonKembali = new JButton("Kembali");
        buttonKembali.setBounds(250, 330, 100, 30);
        add(buttonKembali);

        // Event Tombol Kembali
        buttonKembali.addActionListener(e -> dispose());
    }

    public void tambahData(String tanggal, String deskripsi, String pemasukan, String pengeluaran) {
        tableModel.addRow(new Object[]{tanggal, deskripsi, pemasukan, pengeluaran});
    }

    public void setTotalPemasukan(String totalPemasukan) {
        textTotalPemasukan.setText(totalPemasukan);
    }

    public void setTotalPengeluaran(String totalPengeluaran) {
        textTotalPengeluaran.setText(totalPengeluaran);
    }

    public void setSaldoAkhir(String saldoAkhir) {
        textSaldoAkhir.setText(saldoAkhir);
    }

    public static void main(String[] args) {
        // Simulasi data laporan
        TesFrame laporan = new TesFrame();
        laporan.tambahData("19 Nov 2024", "Gaji Bulanan", "5,000,000", "0");
        laporan.tambahData("20 Nov 2024", "Belanja Bulanan", "0", "1,200,000");
        laporan.tambahData("21 Nov 2024", "Bonus Proyek", "2,000,000", "0");

        // Set total dan saldo
        laporan.setTotalPemasukan("7,000,000");
        laporan.setTotalPengeluaran("1,200,000");
        laporan.setSaldoAkhir("5,800,000");

        // Tampilkan form
        laporan.setVisible(true);
    }
}

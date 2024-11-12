
package UTS;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class CatatanKeuanganPribadi {
    ublic CatatanKeuanganPribadi() {
        setTitle("Catatan Keuangan Pribadi");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Panel Navigasi Atas
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(33, 150, 243));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel titleLabel = new JLabel("Catatan Keuangan");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        topPanel.add(titleLabel);
        
        // Tabs untuk Bulan
        JPanel tabsPanel = new JPanel(new FlowLayout());
        tabsPanel.setBackground(Color.WHITE);
        
        JButton btnBulanIni = new JButton("Bulan ini");
        JButton btnBulanLalu = new JButton("Bulan Lalu");
        JButton btn3Bulan = new JButton("3 Bulan");
        
        tabsPanel.add(btnBulanIni);
        tabsPanel.add(btnBulanLalu);
        tabsPanel.add(btn3Bulan);
        
        // Panel Statistik
        JPanel statsPanel = new JPanel();
        statsPanel.setBackground(Color.WHITE);
        statsPanel.setLayout(new GridLayout(2, 2, 10, 10));
        statsPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));

        JLabel lblSelisih = new JLabel("Selisih");
        lblSelisih.setHorizontalAlignment(SwingConstants.CENTER);
        lblSelisih.setFont(new Font("Arial", Font.BOLD, 16));
        
        JLabel lblSelisihValue = new JLabel("Rp72.000");
        lblSelisihValue.setHorizontalAlignment(SwingConstants.CENTER);
        lblSelisihValue.setFont(new Font("Arial", Font.BOLD, 18));
        lblSelisihValue.setForeground(Color.BLACK);
        
        JLabel lblPemasukan = new JLabel("Pemasukan");
        lblPemasukan.setForeground(new Color(76, 175, 80)); // Warna Hijau
        JLabel lblPengeluaran = new JLabel("Pengeluaran");
        lblPengeluaran.setForeground(new Color(244, 67, 54)); // Warna Merah
        
        JLabel lblPemasukanValue = new JLabel("Rp600.000");
        lblPemasukanValue.setForeground(new Color(76, 175, 80)); // Hijau
        JLabel lblPengeluaranValue = new JLabel("-Rp528.000");
        lblPengeluaranValue.setForeground(new Color(244, 67, 54)); // Merah

        statsPanel.add(lblSelisih);
        statsPanel.add(lblSelisihValue);
        statsPanel.add(lblPemasukan);
        statsPanel.add(lblPemasukanValue);
        statsPanel.add(lblPengeluaran);
        statsPanel.add(lblPengeluaranValue);
        
        // Panel Daftar Transaksi
        JPanel transaksiPanel = new JPanel();
        transaksiPanel.setBackground(Color.WHITE);
        transaksiPanel.setLayout(new BorderLayout());
        
        JLabel lblUangMasuk = new JLabel("Uang Masuk");
        lblUangMasuk.setFont(new Font("Arial", Font.PLAIN, 14));
        lblUangMasuk.setHorizontalAlignment(SwingConstants.LEFT);
        
        JLabel lblUangMasukValue = new JLabel("Rp600.000");
        lblUangMasukValue.setHorizontalAlignment(SwingConstants.RIGHT);
        
        transaksiPanel.add(lblUangMasuk, BorderLayout.WEST);
        transaksiPanel.add(lblUangMasukValue, BorderLayout.EAST);
        
        // Tambahkan ke Frame Utama
        add(topPanel, BorderLayout.NORTH);
        add(tabsPanel, BorderLayout.CENTER);
        add(statsPanel, BorderLayout.SOUTH);
        add(transaksiPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CatatanKeuanganPribadi());
    }
}

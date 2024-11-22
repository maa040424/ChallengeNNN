
package Fungsi;

import Connection.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
   private String jenis;
    private String deskripsi;
    private double nominal;
    private String tanggal;

    public Transaction(String jenis, String deskripsi, double nominal, String tanggal) {
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.nominal = nominal;
        this.tanggal = tanggal;
    }

    public String getJenis() {
        return jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getNominal() {
        return nominal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public static void addTransactionToDB(String jenis, String deskripsi, double nominal) {
        String sql = "INSERT INTO transactions (jenis, deskripsi, nominal) VALUES (?, ?, ?)";
        try (Connection conn = KoneksiDB.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, jenis);
            pstmt.setString(2, deskripsi);
            pstmt.setDouble(3, nominal);
            pstmt.executeUpdate();
            System.out.println("Transaksi berhasil ditambahkan ke database.");
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan transaksi: " + e.getMessage());
        }
    }

    public static List<Transaction> getAllTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        String sql = "SELECT jenis, deskripsi, nominal, tanggal FROM transactions";
        try (Connection conn = KoneksiDB.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                transactions.add(new Transaction(
                    rs.getString("jenis"),
                    rs.getString("deskripsi"),
                    rs.getDouble("nominal"),
                    rs.getString("tanggal")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data transaksi: " + e.getMessage());
        }
        return transactions;
    }

    public static void deleteTransactionByDeskripsi(String deskripsi) {
        String sql = "DELETE FROM transactions WHERE deskripsi = ?";
        try (Connection conn = KoneksiDB.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, deskripsi);
            pstmt.executeUpdate();
            System.out.println("Transaksi berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println("Gagal menghapus transaksi: " + e.getMessage());
        }
    }

    public static double[] calculateSaldoFromDB() {
        String sql = "SELECT jenis, nominal FROM transactions";
        double pemasukan = 0, pengeluaran = 0;

        try (Connection conn = KoneksiDB.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String jenis = rs.getString("jenis");
                double nominal = rs.getDouble("nominal");
                if ("Pemasukan".equalsIgnoreCase(jenis)) {
                    pemasukan += nominal;
                } else if ("Pengeluaran".equalsIgnoreCase(jenis)) {
                    pengeluaran += nominal;
                }
            }
        } catch (SQLException e) {
            System.out.println("Gagal menghitung saldo: " + e.getMessage());
        }
        return new double[]{pemasukan, pengeluaran, pemasukan - pengeluaran};
    }

    public static void importTransaction(String jenis, String deskripsi, double nominal, String tanggal) {
    String sql = "INSERT INTO transactions (jenis, deskripsi, nominal, tanggal) VALUES (?, ?, ?, ?)";
    try (Connection conn = KoneksiDB.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, jenis);
        pstmt.setString(2, deskripsi);
        pstmt.setDouble(3, nominal);
        pstmt.setString(4, tanggal); // Pastikan format tanggal sesuai dengan tipe di database
        pstmt.executeUpdate();
        System.out.println("Transaksi berhasil diimpor: " + deskripsi);
    } catch (SQLException e) {
        System.out.println("Gagal mengimpor transaksi: " + e.getMessage());
    }
}
    public static void updateTransaction(String jenis, String deskripsi, double nominal, String tanggal) {
    // Implementasikan logika pembaruan data di database
    // Misalnya menggunakan SQL UPDATE:
    String sql = "UPDATE transactions SET jenis = ?, nominal = ?, tanggal = ? WHERE deskripsi = ?";
    try (Connection conn = KoneksiDB.connect(); 
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, jenis);
        pstmt.setDouble(2, nominal);
        pstmt.setString(3, tanggal);
        pstmt.setString(4, deskripsi);
        pstmt.executeUpdate();
        System.out.println("Transaksi berhasil diperbarui.");
    } catch (SQLException e) {
        System.err.println("Gagal memperbarui transaksi: " + e.getMessage());
    }
    }
}

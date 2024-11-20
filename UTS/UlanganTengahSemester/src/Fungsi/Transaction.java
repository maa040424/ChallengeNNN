
package Fungsi;

import Connection.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Transaction {
   private String jenis;
    private String deskripsi;
    private double nominal;

    public Transaction(String jenis, String deskripsi, double nominal) {
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.nominal = nominal;
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

    // Fungsi menambahkan transaksi ke database
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

    // Fungsi mengambil semua transaksi dari database
    public static void getAllTransactions(List<Transaction> transactions) {
        String sql = "SELECT jenis, deskripsi, nominal FROM transactions";
        try (Connection conn = KoneksiDB.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                transactions.add(new Transaction(
                    rs.getString("jenis"),
                    rs.getString("deskripsi"),
                    rs.getDouble("nominal")
                ));
            }
            System.out.println("Transaksi berhasil diambil dari database.");
        } catch (SQLException e) {
            System.out.println("Gagal mengambil transaksi: " + e.getMessage());
        }
    }
    
}

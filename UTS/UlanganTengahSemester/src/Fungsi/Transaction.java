
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
                rs.getDouble("nominal")
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
    } catch (SQLException e) {
        System.out.println("Gagal menghapus transaksi: " + e.getMessage());
    }
}

}

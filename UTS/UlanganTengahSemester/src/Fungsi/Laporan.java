
package Fungsi;



import Connection.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Laporan {
    public static void saveReport(String periode, double pemasukan, double pengeluaran, double saldo) {
        String sql = "INSERT INTO reports (periode, pemasukan, pengeluaran, saldo) VALUES (?, ?, ?, ?)";
        try (Connection conn = KoneksiDB.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, periode);
            pstmt.setDouble(2, pemasukan);
            pstmt.setDouble(3, pengeluaran);
            pstmt.setDouble(4, saldo);
            pstmt.executeUpdate();
            System.out.println("Laporan berhasil disimpan.");
        } catch (SQLException e) {
            System.out.println("Gagal menyimpan laporan: " + e.getMessage());
        }
    }
}

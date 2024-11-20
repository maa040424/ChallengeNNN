
package Fungsi;

import Connection.KoneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Riwayat {
    public static void addHistory(String aktivitas) {
        String sql = "INSERT INTO history (aktivitas) VALUES (?)";
        try (Connection conn = KoneksiDB.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, aktivitas);
            pstmt.executeUpdate();
            System.out.println("Riwayat berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal menambahkan riwayat: " + e.getMessage());
        }
    }
}

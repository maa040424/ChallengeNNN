
package Latihan03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class KoneksiDB {
   // URL SQLite database
    private static final String DB_URL = "jdbc:sqlite:kontak.db";
    
    // Fungsi untuk membuat koneksi ke database
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL);
        return conn;
    }
    
    // Fungsi untuk membuat tabel 'kontak' jika belum ada
    public static void createTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS kontak ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nama TEXT, "
                + "noTelp TEXT, "
                + "kategori TEXT"
                + ");";
        
        try (Connection conn = getConnection(); 
             Statement stmt = conn.createStatement()) {
            // Eksekusi perintah untuk membuat tabel
            stmt.execute(createTableSQL);
            System.out.println("Tabel 'kontak' berhasil dibuat atau sudah ada.");
        } catch (SQLException e) {
            System.err.println("Gagal membuat tabel: " + e.getMessage());
        }
    }
}

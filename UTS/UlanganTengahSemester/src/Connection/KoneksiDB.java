
package Connection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/aplikasi_keuangan_pribadi";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Koneksi ke database MySQL berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi ke database MySQL gagal: " + e.getMessage());
        }
        return conn;
    }

    public static void setupDatabase() {
        String createTransactionsTable = """
            CREATE TABLE IF NOT EXISTS transactions (
                id INT AUTO_INCREMENT PRIMARY KEY,
                jenis VARCHAR(50) NOT NULL,
                deskripsi VARCHAR(255) NOT NULL,
                nominal DOUBLE NOT NULL,
                tanggal TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;

        String createReportsTable = """
            CREATE TABLE IF NOT EXISTS reports (
                id INT AUTO_INCREMENT PRIMARY KEY,
                periode VARCHAR(50) NOT NULL,
                pemasukan DOUBLE NOT NULL,
                pengeluaran DOUBLE NOT NULL,
                saldo DOUBLE NOT NULL,
                dibuat_pada TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;

        String createHistoryTable = """
            CREATE TABLE IF NOT EXISTS history (
                id INT AUTO_INCREMENT PRIMARY KEY,
                aktivitas TEXT NOT NULL,
                timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(createTransactionsTable);
            stmt.execute(createReportsTable);
            stmt.execute(createHistoryTable);
            System.out.println("Tabel di database MySQL berhasil dibuat.");
        } catch (SQLException e) {
            System.out.println("Gagal membuat tabel di database MySQL: " + e.getMessage());
        }
    }
}

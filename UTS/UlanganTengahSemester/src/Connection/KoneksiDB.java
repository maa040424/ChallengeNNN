
package Connection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
     private static final String DB_URL = "jdbc:sqlite:keuangan_pribadi.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    public static void setupDatabase() {
        String createTransactionsTable = """
            CREATE TABLE IF NOT EXISTS transactions (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                jenis TEXT NOT NULL,
                deskripsi TEXT NOT NULL,
                nominal REAL NOT NULL,
                tanggal TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;
        
        String createReportsTable = """
            CREATE TABLE IF NOT EXISTS reports (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                periode TEXT NOT NULL,
                pemasukan REAL NOT NULL,
                pengeluaran REAL NOT NULL,
                saldo REAL NOT NULL,
                dibuat_pada TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;

        String createHistoryTable = """
            CREATE TABLE IF NOT EXISTS history (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                aktivitas TEXT NOT NULL,
                timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
            );
        """;

        try (Connection conn = connect(); 
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTransactionsTable);
            stmt.execute(createReportsTable);
            stmt.execute(createHistoryTable);
            System.out.println("Database dan tabel berhasil dibuat.");
        } catch (SQLException e) {
            System.out.println("Gagal membuat tabel: " + e.getMessage());
        }
    }
}

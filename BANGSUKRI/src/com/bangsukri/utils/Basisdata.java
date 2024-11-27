package com.bangsukri.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Basisdata {
    private static final String DB_URL = "jdbc:sqlite:bangsukri.db"; // File database SQLite

    public static Connection getConnection() throws SQLException {
        try {
            // Memastikan driver SQLite tersedia
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver SQLite tidak ditemukan! Tambahkan sqlite-jdbc.jar ke library proyek Anda.");
            e.printStackTrace();
        }

        // Membuka koneksi ke database
        Connection connection = DriverManager.getConnection(DB_URL);

        // Memastikan tabel dibuat
        initDatabase(connection);

        return connection;
    }

    private static void initDatabase(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            // Membuat tabel pemasok jika belum ada
            String createPemasokTable = """
                CREATE TABLE IF NOT EXISTS pemasok (
                    id_pemasok INTEGER PRIMARY KEY AUTOINCREMENT,
                    nama_pemasok TEXT NOT NULL,
                    nomor_hp TEXT NOT NULL,
                    alamat TEXT
                );
            """;
            statement.execute(createPemasokTable);

            // Membuat tabel barang jika belum ada
            String createBarangTable = """
                CREATE TABLE IF NOT EXISTS barang (
                    id_barang INTEGER PRIMARY KEY AUTOINCREMENT,
                    nama_barang TEXT NOT NULL,
                    kategori TEXT NOT NULL,
                    harga REAL NOT NULL,
                    stok INTEGER NOT NULL
                );
            """;
            statement.execute(createBarangTable);

            System.out.println("Database dan tabel berhasil diperiksa atau dibuat!");
        } catch (SQLException e) {
            System.err.println("Gagal membuat tabel: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

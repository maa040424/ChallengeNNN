package Fungsi;  

import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import Connection.KoneksiDB;  

public class Report {  

    private String periode;  
    private double pemasukan;  
    private double pengeluaran;  
    private double saldo;  

    public Report(String periode, double pemasukan, double pengeluaran, double saldo) {  
        this.periode = periode;  
        this.pemasukan = pemasukan;  
        this.pengeluaran = pengeluaran;  
        this.saldo = saldo;  
    }  

    // Getter methods for periode, pemasukan, pengeluaran, and saldo  
    public String getPeriode() { return periode; }  
    public double getPemasukan() { return pemasukan; }  
    public double getPengeluaran() { return pengeluaran; }  
    public double getSaldo() { return saldo; }  


    public static List<Report> getLatestReports() {  
        List<Report> reports = new ArrayList<>();  
        String sql = "SELECT periode, pemasukan, pengeluaran, saldo FROM reports ORDER BY dibuat_pada DESC LIMIT 1"; // Mengambil laporan terbaru  

        try (Connection conn = KoneksiDB.connect();  
             PreparedStatement pstmt = conn.prepareStatement(sql);  
             ResultSet rs = pstmt.executeQuery()) {  

            while (rs.next()) {  
                String periode = rs.getString("periode");  
                double pemasukan = rs.getDouble("pemasukan");  
                double pengeluaran = rs.getDouble("pengeluaran");  
                double saldo = rs.getDouble("saldo");  
                reports.add(new Report(periode, pemasukan, pengeluaran, saldo));  
            }  
        } catch (SQLException e) {  
            System.err.println("Error fetching reports: " + e.getMessage());  
        }  
        return reports;  
    }  
}
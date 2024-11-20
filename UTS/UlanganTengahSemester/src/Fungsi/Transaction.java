
package Fungsi;
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

    public static void addTransaction(String jenis, String deskripsi, double nominal, List<Transaction> transactions) {
        transactions.add(new Transaction(jenis, deskripsi, nominal));
    }

    public static double[] calculateSaldo(List<Transaction> transactions) {
        double pemasukan = 0, pengeluaran = 0;
        for (Transaction t : transactions) {
            if ("Pemasukan".equals(t.getJenis())) {
                pemasukan += t.getNominal();
            } else if ("Pengeluaran".equals(t.getJenis())) {
                pengeluaran += t.getNominal();
            }
        }
        return new double[]{pemasukan, pengeluaran, pemasukan - pengeluaran};
    }
    
}

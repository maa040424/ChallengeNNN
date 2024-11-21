
package UTSFrame;

import Fungsi.Report;
import Fungsi.Transaction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class LaporanForm extends javax.swing.JFrame {

    
    public LaporanForm() {
        initComponents();
        loadTransactionsToTable(); // Memuat data transaksi ke tabel
        addSearchFilter(); // Menambahkan filter pencarian
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 247, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 45, 79));
        jLabel1.setText("Laporan Keuangan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        jPanel2.setBackground(new java.awt.Color(18, 45, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 247, 228), 4));

        jTable1.setBackground(new java.awt.Color(249, 247, 228));
        jTable1.setForeground(new java.awt.Color(18, 45, 79));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 247, 228));
        jLabel2.setText("Cari Berdasarkan Jenis");

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton2.setText("Ekspor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton4.setText("Impor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonHapus.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButtonHapus)
                    .addComponent(jButton3))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 730, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil ID atau deskripsi transaksi untuk menghapus
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String deskripsi = model.getValueAt(selectedRow, 2).toString(); // Kolom deskripsi
        
        // Hapus dari database
        Transaction.deleteTransactionByDeskripsi(deskripsi);
        
        // Hapus dari tabel
        model.removeRow(selectedRow);
        
        javax.swing.JOptionPane.showMessageDialog(this, "Transaksi berhasil dihapus.");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Pilih transaksi yang akan dihapus.");
    }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Pilih File CSV untuk Diimpor");
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                importDataFromCSV(selectedFile);
                javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil diimpor.");
            } catch (IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal mengimpor data: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setDialogTitle("Simpan Laporan sebagai CSV");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        // Tambahkan ekstensi .csv jika belum ada
        if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
        }
        try {
            saveTableToCSV(fileToSave);
            javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke: " + fileToSave.getAbsolutePath());
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal mengekspor data: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed

//fungsi fungsi nya 
   public void loadTransactionsToTable() {
    List<Transaction> transactions = Transaction.getAllTransactions();
    DefaultTableModel model = new DefaultTableModel(new Object[]{"Jenis", "Deskripsi", "Nominal", "Tanggal"}, 0);

    for (Transaction t : transactions) {
        model.addRow(new Object[]{t.getJenis(), t.getDeskripsi(), t.getNominal(), t.getTanggal()});
    }

    jTable1.setModel(model);
}
    
    private void importDataFromCSV(File file) throws IOException {
     DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        int lineNumber = 0;

        while ((line = br.readLine()) != null) {
            lineNumber++;
            // Abaikan baris header jika ada
            if (lineNumber == 1 && line.toLowerCase().contains("jenis")) {
                continue; // Lewati baris pertama jika dianggap sebagai header
            }

            String[] values = line.split(","); // Gunakan koma sebagai delimiter
            if (values.length == 4) {
                try {
                    String jenis = values[0].trim();
                    String deskripsi = values[1].trim();
                    double nominal = Double.parseDouble(values[2].trim());
                    String tanggal = values[3].trim();

                    // Tambahkan ke tabel
                    model.addRow(new Object[]{jenis, deskripsi, nominal, tanggal});

                    // (Opsional) Tambahkan ke database
                    Transaction.importTransaction(jenis, deskripsi, nominal, tanggal);
                } catch (NumberFormatException e) {
                    System.err.println("Kesalahan pada baris " + lineNumber + ": Nominal tidak valid");
                } catch (Exception e) {
                    System.err.println("Kesalahan tidak terduga pada baris " + lineNumber + ": " + e.getMessage());
                }
            } else {
                System.err.println("Kesalahan pada baris " + lineNumber + ": Data tidak sesuai format");
            }
        }
    } catch (IOException e) {
        System.err.println("Gagal membaca file: " + e.getMessage());
        throw e; // Teruskan exception agar dapat ditangani pada level lebih tinggi
    }
}
    private void saveTableToCSV(File file) throws IOException {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                bw.write(model.getColumnName(col));
                if (col < model.getColumnCount() - 1) bw.write(",");
            }
            bw.newLine();
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    bw.write(model.getValueAt(row, col).toString());
                    if (col < model.getColumnCount() - 1) bw.write(",");
                }
                bw.newLine();
            }
        }
}
    
    private void jTextFieldCariKeyReleased(java.awt.event.KeyEvent evt) {
   String searchKeyword = jTextFieldCari.getText().toLowerCase(); // Ambil kata kunci pencarian
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Ambil model tabel
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model); // Gunakan sorter
    jTable1.setRowSorter(sorter);

    if (searchKeyword.trim().length() == 0) {
        sorter.setRowFilter(null); // Tidak ada filter jika input kosong
    } else {
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKeyword)); // Filter berdasarkan input
    }
}

    
    private void addSearchFilter() {
        jTextFieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                String searchKeyword = jTextFieldCari.getText().toLowerCase();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                jTable1.setRowSorter(sorter);

                if (searchKeyword.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKeyword));
                }
            }
        });
    }
    private void hapusTransaksi() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            String deskripsi = (String) jTable1.getValueAt(selectedRow, 1);
            Transaction.deleteTransactionByDeskripsi(deskripsi);
            loadTransactionsToTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Transaksi berhasil dihapus.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih transaksi yang ingin dihapus.");
        }
    }
    
    private void loadTableWithDate() {
     // Format tanggal dengan lokal Indonesia
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new java.util.Locale("id", "ID"));
    String tanggalHariIni = LocalDateTime.now().format(formatter);

    // Header tabel
    String[] columns = {"Tanggal", "Jenis", "Deskripsi", "Nominal"};
    DefaultTableModel model = new DefaultTableModel(columns, 0);

    // Contoh data (Anda bisa mengganti ini dengan data dari database)

    jTable1.setModel(model);
}
    
    public void updateLaporan() {  
   List<Report> laporan = Report.getLatestReports();  
    // Update tampilan jTable1 di sini berdasarkan data di 'laporan'  
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();  
    model.setRowCount(0); // Clear existing rows  

    for (Report report : laporan) {  
        model.addRow(new Object[]{report.getPeriode(), report.getPemasukan(), report.getPengeluaran(), report.getSaldo()});  
    }  
}
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCari;
    // End of variables declaration//GEN-END:variables
}

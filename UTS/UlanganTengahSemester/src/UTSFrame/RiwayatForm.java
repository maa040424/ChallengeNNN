/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UTSFrame;



import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane; 


import Connection.KoneksiDB; // import KoneksiDB.java dari folder Connection
import Fungsi.Transaction;
import java.util.List;
public class RiwayatForm extends javax.swing.JFrame {

    
    public RiwayatForm() {
        initComponents();
         loadRiwayatToTextArea(); // Menampilkan riwayat saat form dibuka
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRiwayat = new javax.swing.JTextArea();
        jButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Riwayat Transaksi");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 247, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(18, 45, 79), 3));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 45, 79));
        jLabel1.setText("RIWAYAT TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 70));

        jPanel2.setBackground(new java.awt.Color(18, 45, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 247, 228), 3));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextAreaRiwayat.setBackground(new java.awt.Color(18, 45, 79));
        jTextAreaRiwayat.setColumns(20);
        jTextAreaRiwayat.setForeground(new java.awt.Color(249, 247, 228));
        jTextAreaRiwayat.setRows(5);
        jScrollPane2.setViewportView(jTextAreaRiwayat);

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonRefresh))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        loadRiwayatToTextArea(); // Panggil fungsi untuk memuat ulang log
        JOptionPane.showMessageDialog(this, "Riwayat berhasil diperbarui.", "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonRefreshActionPerformed

    public void loadRiwayatToTextArea() {
        String sql = "SELECT aktivitas, timestamp FROM history ORDER BY timestamp DESC";
    try (Connection conn = KoneksiDB.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        jTextAreaRiwayat.setText(""); // Kosongkan area teks sebelum menambahkan data baru

        boolean hasData = false; // Penanda apakah ada data di tabel
        while (rs.next()) {
            hasData = true;
            String aktivitas = rs.getString("aktivitas") != null ? rs.getString("aktivitas") : "Tidak ada aktivitas";
            String timestamp = rs.getString("timestamp") != null ? rs.getString("timestamp") : "Tidak ada waktu";

            // Debugging data yang diambil
            System.out.println("Data ditemukan: " + aktivitas + " | " + timestamp);

            // Tambahkan log ke area teks
            jTextAreaRiwayat.append(
                "===============================\n" +
                "Waktu: " + timestamp + "\n" +
                aktivitas + "\n"
            );
        }

        // Jika tidak ada data
        if (!hasData) {
            jTextAreaRiwayat.setText("Tidak ada log perubahan.\n===============================");
        }
    } catch (SQLException e) {
        System.err.println("Gagal memuat riwayat log: " + e.getMessage());
        jTextAreaRiwayat.setText("Gagal memuat riwayat log.\n===============================");
    }
}
    public void updateRiwayat() {  
    // Ambil data transaksi terbaru  
    List<Transaction> transaksi = Transaction.getAllTransactions();  
    // Update tampilan pada JTable atau komponen yang relevan  
}

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RiwayatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaRiwayat;
    // End of variables declaration//GEN-END:variables
}

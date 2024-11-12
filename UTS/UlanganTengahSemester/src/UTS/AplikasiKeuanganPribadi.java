
package UTS;

import java.awt.Graphics2D;
import org.jdesktop.swingx.painter.ImagePainter;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AplikasiKeuanganPribadi extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiKeuanganPribadi
     */
    public AplikasiKeuanganPribadi() {
        initComponents();
         setPanelBackground();
         setPanelBannerBackground();
         
          // Tambahkan listener ke jXPanel2 untuk memastikan gambar diubah sesuai ukuran panel
        jXPanel2.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setPanelBannerBackground();  // Atur ulang gambar saat panel diubah ukurannya
            }
        });
         
    }

    private void setPanelBackground() {
       try {
            Image backgroundImage = ImageIO.read(new File("E:/ChallengeNNN/UTS/Asset/BG.jpg"));
            ImagePainter painter = new ImagePainter((BufferedImage) backgroundImage);
            painter.setScaleToFit(true);
            jXPanel1.setBackgroundPainter(painter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void setPanelBannerBackground() {
        try {
            BufferedImage originalImage = ImageIO.read(new File("E:/ChallengeNNN/UTS/Asset/Banner.jpg"));
            BufferedImage resizedImage = new BufferedImage(jXPanel2.getWidth(), jXPanel2.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = resizedImage.createGraphics();
            g2d.drawImage(originalImage, 0, 0, jXPanel2.getWidth(), jXPanel2.getHeight(), null);
            g2d.dispose();
            
            ImagePainter bannerPainter = new ImagePainter(resizedImage);
            jXPanel2.setBackgroundPainter(bannerPainter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jLabelUangBulanIni = new javax.swing.JLabel();
        jXButtonLaporan = new org.jdesktop.swingx.JXButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Keuangan Pribadi");

        jXPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jXPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3), "Uang Bulan Ini", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelUangBulanIni.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabelUangBulanIni.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUangBulanIni.setText("Rp.0");

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUangBulanIni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUangBulanIni)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jXButtonLaporan.setText("Laporan");

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jXButtonLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXButtonLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 453, Short.MAX_VALUE))
        );

        getContentPane().add(jXPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(AplikasiKeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKeuanganPribadi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelUangBulanIni;
    private org.jdesktop.swingx.JXButton jXButtonLaporan;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    // End of variables declaration//GEN-END:variables
}

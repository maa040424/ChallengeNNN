
package Tugas06;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

public class AplikasiCekCuaca extends javax.swing.JFrame {

    private final String API_KEY = "e57367f6bf9f06154278b83d65a4a557";
    
    public AplikasiCekCuaca() {
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(

    new Object [][] {},

    new String [] {

        "Kota", "Suhu (°C)", "Cuaca", "Deskripsi"

    }

));
        
         jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        "Pilih Kota Favorit", "Tabalong", "BanjarBaru", "BanjarMasin", "KotaBaru", "BatuMandi", "Barabai"
    }));
         jComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1ActionPerformed(evt);
        }
    });
    }
   private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedCity = (String) jComboBox1.getSelectedItem();
        if (!selectedCity.equals("Pilih Kota Favorit")) {
            jTextFieldKota.setText(selectedCity);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKota = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonCek = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelIconKota = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonFav = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Cek Cuaca");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Cek Cuaca ");
        jPanel3.add(jLabel1);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Cek Cuaca di Kota   :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setText("Cek di Kota Favorit :");

        jButtonCek.setText("Cek");
        jButtonCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCekActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabelIconKota.setFont(new java.awt.Font("Corbel Light", 1, 12)); // NOI18N
        jLabelIconKota.setText("Cuaca di Kota :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconKota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabelIconKota)
                .addGap(33, 33, 33))
        );

        jButtonSave.setText("Save to CSV");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonFav.setText("Tambah Ke Favorit");
        jButtonFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButtonCek, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFav, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 246, Short.MAX_VALUE)
                            .addComponent(jTextFieldKota))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCek)
                    .addComponent(Clear)
                    .addComponent(jButtonFav))
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCekActionPerformed
    String cityName = jTextFieldKota.getText().trim(); // Ambil dari JTextField

    if (cityName.isEmpty() && !jComboBox1.getSelectedItem().equals("Pilih Kota Favorit")) {
        // Jika JTextField kosong, gunakan pilihan dari JComboBox
        cityName = (String) jComboBox1.getSelectedItem();
    }

    if (!cityName.isEmpty()) {
        // Ambil data cuaca
        WeatherData weatherData = getWeatherData(cityName);

        if (weatherData != null) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{weatherData.city, weatherData.temperature, weatherData.weather, weatherData.description});
        }
    } else {
        JOptionPane.showMessageDialog(this, "Silakan masukkan kota atau pilih kota favorit");
    }
    }//GEN-LAST:event_jButtonCekActionPerformed

    
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
    jTextFieldKota.setText("");
    
    // Set jComboBox1 kembali ke pilihan default
    jComboBox1.setSelectedIndex(0);
    
    // Kosongkan hasil cuaca di jLabelIconKota
    jLabelIconKota.setText("Cuaca di Kota :");

    // Kosongkan ikon cuaca jika ada
    jLabelIconKota.setIcon(null); 
    }//GEN-LAST:event_ClearActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
      try {
        // Mendapatkan direktori kerja saat ini (folder proyek)
        String currentDirectory = System.getProperty("user.dir");
        
        // Menentukan path file CSV
        String filePath = currentDirectory + "/cuaca.csv";

        FileWriter csvWriter = new FileWriter(filePath);

        csvWriter.append("Kota,Suhu (°C),Cuaca,Deskripsi\n");

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                csvWriter.append(model.getValueAt(i, j).toString());
                if (j < model.getColumnCount() - 1) {
                    csvWriter.append(",");
                }
            }
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke " + filePath);

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Gagal menyimpan data ke CSV.");
    }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFavActionPerformed
// Ambil teks dari jTextFieldKota
    String kota = jTextFieldKota.getText().trim();

    // Periksa apakah kota tidak kosong
    if (!kota.isEmpty()) {
        // Periksa apakah kota sudah ada di dalam jComboBox1
        boolean kotaSudahAda = false;
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).equalsIgnoreCase(kota)) {
                kotaSudahAda = true;
                break;
            }
        }

        // Jika kota belum ada, tambahkan ke dalam jComboBox1
        if (!kotaSudahAda) {
            jComboBox1.addItem(kota);
            JOptionPane.showMessageDialog(this, "Kota " + kota + " berhasil ditambahkan ke favorit.");
        } else {
            JOptionPane.showMessageDialog(this, "Kota " + kota + " sudah ada di daftar favorit.");
        }
    } else {
        // Jika jTextFieldKota kosong
        JOptionPane.showMessageDialog(this, "Silakan masukkan nama kota terlebih dahulu.");
    }       
    }//GEN-LAST:event_jButtonFavActionPerformed

    private WeatherData getWeatherData(String kota) {
        try {
        // URL API cuaca dengan parameter bahasa Indonesia
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + API_KEY + "&units=metric&lang=id";

        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Baca respons API
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        // Parsing JSON
        JSONObject jsonResponse = new JSONObject(content.toString());
        double temperature = jsonResponse.getJSONObject("main").getDouble("temp");
        String description = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");
        String iconCode = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("icon");

        // Update label dengan cuaca dan suhu dalam bahasa Indonesia
        jLabelIconKota.setText("Kota: " + kota + ", Suhu: " + temperature + "°C, Cuaca: " + description);

        // Tampilkan ikon cuaca
        updateWeatherIcon(iconCode);

        // Return WeatherData
        return new WeatherData(kota, temperature, description);

    } catch (Exception e) {
        e.printStackTrace();
        jLabelIconKota.setText("Gagal mengambil data cuaca. Pastikan koneksi internet dan API Key benar.");
        return null; // Return null jika gagal
    }
    }
    
    private void updateWeatherIcon(String iconCode) {
         try {

        // Membentuk URL untuk gambar ikon cuaca

        String iconUrl = "http://openweathermap.org/img/wn/" + iconCode + "@2x.png";

        URL url = new URL(iconUrl);


        // Coba baca gambar dari URL

        ImageIcon originalIcon = new ImageIcon(ImageIO.read(url));


        // Tentukan ukuran maksimum untuk ikon

        int maxWidth = 30; // Ganti dengan lebar maksimum yang diinginkan

        int maxHeight = 30; // Ganti dengan tinggi maksimum yang diinginkan


        // Ubah ukuran ikon

        Image img = originalIcon.getImage();

        Image scaledImg = img.getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);

        jLabelIconKota.setIcon(new ImageIcon(scaledImg)); // Set ikon cuaca

    } catch (Exception e) {

        e.printStackTrace();

        jLabelIconKota.setText("Gagal memuat ikon cuaca.");

    }
    }
    class WeatherData {

    String city;

    double temperature;

    String weather;

    String description;


    WeatherData(String city, double temperature, String description) {

        this.city = city;

        this.temperature = temperature;

        this.weather = "Cuaca"; // Anda bisa menambahkan lebih banyak informasi jika perlu

        this.description = description;

    }

}
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiCekCuaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiCekCuaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton jButtonCek;
    private javax.swing.JButton jButtonFav;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIconKota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldKota;
    // End of variables declaration//GEN-END:variables
}

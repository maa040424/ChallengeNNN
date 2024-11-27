
package com.bangsukri.frames;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PemasokAddFrame extends javax.swing.JFrame {

    public PemasokAddFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Connection koneksi = Basisdata.getConnection();
            String insertSQL = "INSERT INTO pemasok SET "
                    + "nama_pemasok = '" + namaPemasokTextField.getText() + "'";
            Statement statement = koneksi.createStatement();
            statement.executeUpdate(insertSQL);
            koneksi.close();
            dispose();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Automatically generated GUI design code from NetBeans IDE
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        namaPemasokLabel = new javax.swing.JLabel();
        namaPemasokTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Tambah/Ubah Pemasok");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jLabel1, gridBagConstraints);

        namaPemasokLabel.setText("Nama Pemasok:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        add(namaPemasokLabel, gridBagConstraints);

        namaPemasokTextField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        add(namaPemasokTextField, gridBagConstraints);

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(simpanButton, gridBagConstraints);

        pack();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namaPemasokLabel;
    private javax.swing.JTextField namaPemasokTextField;
    private javax.swing.JButton simpanButton;
}


package com.bangsukri.frames;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PemasokViewFrame extends javax.swing.JFrame {

    public PemasokViewFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        try {
            Connection koneksi = Basisdata.getConnection();
            String selectSQL = "SELECT * FROM pemasok";
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            Object[] row = new Object[4];
            DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                row[0] = resultSet.getInt("id_pemasok");
                row[1] = resultSet.getString("nama_pemasok");
                row[2] = resultSet.getString("nomor_hp");
                row[3] = resultSet.getString("alamat");
                model.addRow(row);
            }
            koneksi.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        tambahButton = new javax.swing.JButton();
        ubahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(new java.awt.GridBagLayout());

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Nama", "Nomor HP", "Alamat"}
        ));
        jScrollPane1.setViewportView(viewTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jScrollPane1, gridBagConstraints);

        tambahButton.setText("Tambah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(tambahButton, gridBagConstraints);

        ubahButton.setText("Ubah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(ubahButton, gridBagConstraints);

        hapusButton.setText("Hapus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(hapusButton, gridBagConstraints);

        refreshButton.setText("Refresh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(refreshButton, gridBagConstraints);

        pack();
    }

    private javax.swing.JButton tambahButton;
    private javax.swing.JButton ubahButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewTable;
}

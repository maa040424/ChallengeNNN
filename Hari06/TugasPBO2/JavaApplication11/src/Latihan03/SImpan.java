
package Latihan03;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.util.*;
public class SImpan {
    // Ekspor data dari JTable ke CSV
    public void exportToCSV(JTable table, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            // Menulis nama kolom
            for (int i = 0; i < model.getColumnCount(); i++) {
                bw.write(model.getColumnName(i));
                if (i < model.getColumnCount() - 1) {
                    bw.write(",");
                }
            }
            bw.newLine();
            
            // Menulis data baris
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bw.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        bw.write(",");
                    }
                }
                bw.newLine();
            }
            JOptionPane.showMessageDialog(null, "Data berhasil diekspor!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengekspor data!");
            e.printStackTrace();
        }
    }

    // Impor data dari CSV ke JTable
    public void importFromCSV(JTable table, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String[]> data = new ArrayList<>();
            
            // Membaca CSV
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data.add(row);
            }
            
            // Menyiapkan model untuk JTable
            String[] columnNames = data.get(0);
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            
            // Menambahkan data ke tabel
            for (int i = 1; i < data.size(); i++) {
                model.addRow(data.get(i));
            }
            
            // Set model ke JTable
            table.setModel(model);
            JOptionPane.showMessageDialog(null, "Data berhasil diimpor!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Gagal mengimpor data!");
            e.printStackTrace();
        }
    }
}

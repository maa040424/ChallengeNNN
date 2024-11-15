
package Latihan03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContactManagerGUI {
   private JFrame frame;
    private JTextField nameField, phoneField;
    private JComboBox<String> categoryComboBox;
    private JList<String> contactList;
    private DefaultListModel<String> contactListModel;
    private JButton addButton, editButton, deleteButton, searchButton;
    
    public ContactManagerGUI() {
        frame = new JFrame("Pengelolaan Kontak");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        
        // Panel atas untuk input
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nama:"));
        nameField = new JTextField();
        panel.add(nameField);
        
        panel.add(new JLabel("Nomor Telepon:"));
        phoneField = new JTextField();
        panel.add(phoneField);
        
        panel.add(new JLabel("Kategori:"));
        categoryComboBox = new JComboBox<>(new String[]{"Keluarga", "Teman", "Kerja"});
        panel.add(categoryComboBox);
        
        frame.add(panel, BorderLayout.NORTH);
        
        // Panel bawah untuk tombol aksi
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Tambah");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Hapus");
        searchButton = new JButton("Cari");
        
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(searchButton);
        
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        // JList untuk menampilkan daftar kontak
        contactListModel = new DefaultListModel<>();
        contactList = new JList<>(contactListModel);  // Menggunakan model untuk menyimpan kontak
        JScrollPane scrollPane = new JScrollPane(contactList);  // Menambahkan JScrollPane untuk scroll
        frame.add(scrollPane, BorderLayout.CENTER);
        
        // Contoh data kontak untuk kategori
        contactListModel.addElement("John Doe - 08123456789 (Keluarga)");
        contactListModel.addElement("Jane Smith - 08987654321 (Teman)");
        
        // Event Listener untuk JComboBox
        categoryComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // Ambil kategori yang dipilih
                String selectedCategory = (String) categoryComboBox.getSelectedItem();
                updateContactList(selectedCategory);
            }
        });
    }

    // Method untuk memperbarui JList berdasarkan kategori yang dipilih
    public void updateContactList(String category) {
        contactListModel.clear();  // Hapus data lama di JList
        
        // Menampilkan data kontak berdasarkan kategori yang dipilih
        if (category.equals("Keluarga")) {
            contactListModel.addElement("John Doe - 08123456789 (Keluarga)");
        } else if (category.equals("Teman")) {
            contactListModel.addElement("Jane Smith - 08987654321 (Teman)");
        } else if (category.equals("Kerja")) {
            contactListModel.addElement("Mike Johnson - 08123456700 (Kerja)");
        }
    }

    public void display() {
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ContactManagerGUI app = new ContactManagerGUI();
            app.display();
        });
    } 
}

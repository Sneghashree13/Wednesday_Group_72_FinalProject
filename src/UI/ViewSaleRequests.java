/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.BookingRequest;
import Model.Marketrequeststudent;
import Model.Marketrequeststudenthistory;
import Model.Requeststudent;
import Model.Studenthistory;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author sneghashree
 */
public class ViewSaleRequests extends javax.swing.JPanel {

    /**
     * Creates new form ViewSaleRequests
     */
   private final Marketrequeststudenthistory history;
    public ViewSaleRequests() {
        initComponents();
        history = new Marketrequeststudenthistory(); // Fetch market request history
        PopulateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewstudent = new javax.swing.JTable();
        btnpdf = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setAutoscrolls(true);

        tblviewstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact Number", "Email", "null"
            }
        ));
        jScrollPane1.setViewportView(tblviewstudent);
        if (tblviewstudent.getColumnModel().getColumnCount() > 0) {
            tblviewstudent.getColumnModel().getColumn(4).setMinWidth(0);
            tblviewstudent.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblviewstudent.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        btnpdf.setText("Generate PDF");
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpdf)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnpdf)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        // TODO add your handling code here:
        String path = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getPath();
        }

        if (path.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a valid directory!");
            return;
        }

        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "/MarketRequests.pdf"));
            doc.open();

            PdfPTable table = new PdfPTable(4);
            table.addCell("ID");
            table.addCell("Name");
            table.addCell("Contact Number");
            table.addCell("EmailId");

            DefaultTableModel model = (DefaultTableModel) tblviewstudent.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                table.addCell(model.getValueAt(i, 0).toString());
                table.addCell(model.getValueAt(i, 1).toString());
                table.addCell(model.getValueAt(i, 2).toString());
                table.addCell(model.getValueAt(i, 3).toString());
            }

            doc.add(table);
            JOptionPane.showMessageDialog(this, "PDF Generated Successfully!");

        } catch (FileNotFoundException | DocumentException e) {
            Logger.getLogger(ViewSaleRequests.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error while generating PDF: " + e.getMessage());
        } finally {
            doc.close();
        }
    }//GEN-LAST:event_btnpdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpdf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblviewstudent;
    // End of variables declaration//GEN-END:variables
private void PopulateTable() {
    DefaultTableModel model = (DefaultTableModel) tblviewstudent.getModel();
    model.setRowCount(0);

    for (Marketrequeststudent request : history.getHistory()) {
        Object[] row = new Object[4]; // Match the table column count
        row[0] = request.getId();         // ID
        row[1] = request.getName();       // Name
        row[2] = request.getContactNumber(); // Contact Number
        row[3] = request.getEmailId();    // Email ID
        model.addRow(row);
    }
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Broker;
import Model.BrokerDirectory;
import Model.SQLconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


/**
 *
 * @author deepakzedler
 */
public class DisplayBrokers extends javax.swing.JPanel {

    /**
     * Creates new form DisplayBrokers
     */
    
    BrokerDirectory bd = new BrokerDirectory();
    DefaultTableModel model;
    
    public DisplayBrokers() {
        initComponents();
        this.setSize(1024, 768);
        bd.getBrokerDirectory();
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
        tblbroker = new javax.swing.JTable();
        txtmanagement = new javax.swing.JTextField();
        lblusername = new javax.swing.JLabel();
        lblmanagement = new javax.swing.JLabel();
        txtbrokername = new javax.swing.JTextField();
        txtlicenseno = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        lblbrokername = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        lbllicenseno = new javax.swing.JLabel();
        txtbrokerfee = new javax.swing.JTextField();
        lblcontactno = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        lblbrokerfee = new javax.swing.JLabel();
        btnviewbrokerdetails = new javax.swing.JButton();
        btnupdatebrokerdetails = new javax.swing.JButton();
        btndeletebrokerdetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblbroker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Broker Name", "License No", "Contact No ", "Email ID", "Broker Fee", "Username", "Password", "Management", "null"
            }
        ));
        jScrollPane1.setViewportView(tblbroker);
        if (tblbroker.getColumnModel().getColumnCount() > 0) {
            tblbroker.getColumnModel().getColumn(5).setMinWidth(0);
            tblbroker.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblbroker.getColumnModel().getColumn(5).setMaxWidth(0);
            tblbroker.getColumnModel().getColumn(6).setMinWidth(0);
            tblbroker.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblbroker.getColumnModel().getColumn(6).setMaxWidth(0);
            tblbroker.getColumnModel().getColumn(8).setMinWidth(0);
            tblbroker.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblbroker.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 735, 182));
        add(txtmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 145, -1));

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("Username:");
        lblusername.setFocusTraversalPolicyProvider(true);
        add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 79, -1));

        lblmanagement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmanagement.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmanagement.setText("Management:");
        add(lblmanagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        txtbrokername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrokernameActionPerformed(evt);
            }
        });
        add(txtbrokername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 145, -1));
        add(txtlicenseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 145, -1));
        add(txtcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 145, -1));

        lblbrokername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbrokername.setText("Broker Name:");
        add(lblbrokername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 82, -1));
        add(txtemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 145, -1));

        lbllicenseno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbllicenseno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllicenseno.setText("License No:");
        add(lbllicenseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 79, -1));
        add(txtbrokerfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 145, -1));

        lblcontactno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblcontactno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblcontactno.setText("Contact No:");
        add(lblcontactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 145, -1));

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemail.setText("Email ID:");
        add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 79, -1));

        lblbrokerfee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbrokerfee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblbrokerfee.setText("Broker Fee:");
        add(lblbrokerfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 79, -1));

        btnviewbrokerdetails.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnviewbrokerdetails.setText("View Broker Details");
        btnviewbrokerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewbrokerdetailsActionPerformed(evt);
            }
        });
        add(btnviewbrokerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 167, -1));

        btnupdatebrokerdetails.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnupdatebrokerdetails.setText("Update Broker Details");
        btnupdatebrokerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatebrokerdetailsActionPerformed(evt);
            }
        });
        add(btnupdatebrokerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        btndeletebrokerdetails.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btndeletebrokerdetails.setText("Delete Broker Details");
        btndeletebrokerdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletebrokerdetailsActionPerformed(evt);
            }
        });
        add(btndeletebrokerdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 167, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Images/gradient (1).jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void txtbrokernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrokernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrokernameActionPerformed

    private void btnupdatebrokerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatebrokerdetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblbroker.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update details.");
            return;
        }

        try {
            // Update the selected row in the database
            Connection con = SQLconnection.dbconnector();
            PreparedStatement stmt = con.prepareStatement("UPDATE Brokers SET Name=?, ContactNumber=?, EmailID=?, BrokerFee=?, Management=? WHERE LicenseNumber=?");

            stmt.setString(1, txtbrokername.getText());
            stmt.setString(2, txtcontactno.getText());
            stmt.setString(3, txtemailid.getText());
            stmt.setInt(4, Integer.parseInt(txtbrokerfee.getText()));
            stmt.setString(5, txtmanagement.getText());
            stmt.setInt(6, Integer.parseInt(txtlicenseno.getText()));

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Broker details updated successfully.");
            PopulateTable();

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating broker details: " + ex.getMessage());
        }
              
         
             
    }//GEN-LAST:event_btnupdatebrokerdetailsActionPerformed

    private void btndeletebrokerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletebrokerdetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblbroker.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        try {
            // Delete the selected row from the database
            Connection con = SQLconnection.dbconnector();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM Brokers WHERE LicenseNumber=?");

            int licenseNo = Integer.parseInt(tblbroker.getValueAt(selectedRowIndex, 1).toString());
            stmt.setInt(1, licenseNo);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Broker details deleted successfully.");
            PopulateTable();

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting broker details: " + ex.getMessage());
        }
         
        
        
    }//GEN-LAST:event_btndeletebrokerdetailsActionPerformed

    private void btnviewbrokerdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewbrokerdetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblbroker.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }

        // Populate text fields with the selected row's data
        DefaultTableModel model = (DefaultTableModel) tblbroker.getModel();
        txtbrokername.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtlicenseno.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtcontactno.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtemailid.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtbrokerfee.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtmanagement.setText(model.getValueAt(selectedRowIndex, 5).toString());
   
    }//GEN-LAST:event_btnviewbrokerdetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeletebrokerdetails;
    private javax.swing.JButton btnupdatebrokerdetails;
    private javax.swing.JButton btnviewbrokerdetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbrokerfee;
    private javax.swing.JLabel lblbrokername;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lbllicenseno;
    private javax.swing.JLabel lblmanagement;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTable tblbroker;
    private javax.swing.JTextField txtbrokerfee;
    private javax.swing.JTextField txtbrokername;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtlicenseno;
    private javax.swing.JTextField txtmanagement;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
private void PopulateTable()
    {
      
  
        model = (DefaultTableModel) tblbroker.getModel();
        model.setRowCount(0);

        try {
            // Fetch broker data from the database
            Connection con = SQLconnection.dbconnector();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Brokers");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getString("Name");
                row[1] = rs.getInt("LicenseNumber");
                row[2] = rs.getString("ContactNumber");
                row[3] = rs.getString("EmailID");
                row[4] = rs.getInt("BrokerFee");
                row[5] = rs.getString("Management");
                model.addRow(row);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching broker data: " + ex.getMessage());
        }
    }}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

//import Model.AppointmentReq;
//import Model.AppointmentRequesthistory;
import Model.Broker;
import Model.Requeststudent;
import Model.SQLconnection;
import Model.Studenthistory;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepakzedler
 */
 
public class ViewAppointmentbookings extends javax.swing.JPanel {

    /**
     * Creates new form ViewAppointmentbookings
     */
AppointmentRequesthistory his =  new AppointmentRequesthistory();
    public ViewAppointmentbookings() {
        initComponents();
          his.getAppointmentHistory();
    
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

        lblstudentid = new javax.swing.JLabel();
        lblstudentname = new javax.swing.JLabel();
        lblcontactno = new javax.swing.JLabel();
        lblemailid = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        txtstudentname = new javax.swing.JTextField();
        txtcontactno = new javax.swing.JTextField();
        txtemailid = new javax.swing.JTextField();
        btnacceptbooking = new javax.swing.JButton();
        lbltimeslot = new javax.swing.JLabel();
        txttimeslot = new javax.swing.JTextField();
        btncancelbooking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewstudent = new javax.swing.JTable();
        btnview = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        lblstudentid.setText("Student ID:");

        lblstudentname.setText("Student Name:");

        lblcontactno.setText("Contact Number:");

        lblemailid.setText("Email ID: ");

        txtstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentidActionPerformed(evt);
            }
        });

        btnacceptbooking.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnacceptbooking.setText("Accept Booking");
        btnacceptbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptbookingActionPerformed(evt);
            }
        });

        lbltimeslot.setText("Time Slot:");

        btncancelbooking.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btncancelbooking.setText("Cancel Booking");
        btncancelbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelbookingActionPerformed(evt);
            }
        });

        tblviewstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Contact Name", "Email ID", "Time Slot"
            }
        ));
        jScrollPane1.setViewportView(tblviewstudent);

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblstudentname)
                                    .addComponent(lblcontactno))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblstudentid)
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltimeslot)
                            .addComponent(lblemailid))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontactno)
                            .addComponent(txtemailid)
                            .addComponent(txttimeslot)
                            .addComponent(txtstudentname)
                            .addComponent(txtstudentid))
                        .addGap(317, 317, 317))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnacceptbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnview)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnview)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstudentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentid))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstudentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstudentname))
                        .addGap(18, 18, 18)
                        .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcontactno)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemailid))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltimeslot)
                    .addComponent(txttimeslot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnacceptbooking)
                    .addComponent(btncancelbooking))
                .addGap(255, 255, 255))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentidActionPerformed

    private void btnacceptbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptbookingActionPerformed
        // TODO add your handling code here:
        
         String ToEmail = txtemailid.getText();
        String FromEmail = "aedproject123@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "wiiwhakaddhmcypq";//You email Password from you want to send email
        String Subjects = "Appointment Accepted";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.required", "true");
properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
properties.put("mail.debug", "true");
        
       
           
        
       Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
     
        });
       try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
      
            message.setText("Thank you for contacting us! We will contact you shortly.Your appointment has been successfully booked. This is an auto generated email");
            Transport.send(message);
            
            int selectedRowIndex = tblviewstudent.getSelectedRow();
            DefaultTableModel model =(DefaultTableModel) tblviewstudent.getModel();
               AppointmentReq a = (AppointmentReq)model.getValueAt(selectedRowIndex,4);
               his.deleteAppointmentReq(a);
           // System.out.println("Inside try statement executed");
            // JOptionPane.showMessageDialog(this, "Record deleted Successfully");
              Connection con=SQLconnection.dbconnector();
              Statement stmt =  con.createStatement();
              
           String idea;
            idea= (String) model.getValueAt(selectedRowIndex,0);
           String query = "delete from BookRequest where name='"+idea+"' ";
            stmt.executeUpdate(query);
            stmt.close();
            
              }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_btnacceptbookingActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblviewstudent.getSelectedRow();
          if(selectedRow< 0){
            JOptionPane.showMessageDialog(this,"Select a row to View");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) tblviewstudent.getModel();
          txtstudentid.setText(model.getValueAt(selectedRow,0).toString());
        txtstudentname.setText(model.getValueAt(selectedRow, 1).toString());
        txtcontactno.setText(model.getValueAt(selectedRow, 2).toString());
        txtemailid.setText(model.getValueAt(selectedRow, 3).toString());
        txttimeslot.setText(model.getValueAt(selectedRow, 4).toString());
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void btncancelbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelbookingActionPerformed
        // TODO add your handling code here:
         String ToEmail = txtemailid.getText();
        String FromEmail = "aedproject123@gmail.com";//studyviral2@gmail.com
        String FromEmailPassword = "wiiwhakaddhmcypq";//You email Password from you want to send email
        String Subjects = "Appointment Denied";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.required", "true");
properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
properties.put("mail.debug", "true");
        
       
           
        
       Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
     
        });
       try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
      
            message.setText("Thank you for contacting us! Unfortunately your appoitment has been cancelled. Sorry for the inconveinience. This is an auto generated email");
            Transport.send(message);
            
             int selectedRowIndex = tblviewstudent.getSelectedRow();
            DefaultTableModel model =(DefaultTableModel) tblviewstudent.getModel();
               AppointmentReq a = (AppointmentReq)model.getValueAt(selectedRowIndex,4);
               his.deleteAppointmentReq(a);
           // System.out.println("Inside try statement executed");
            // JOptionPane.showMessageDialog(this, "Record deleted Successfully");
              Connection con=SQLconnection.dbconnector();
              Statement stmt =  con.createStatement();
              
           String idea;
            idea= (String) model.getValueAt(selectedRowIndex,0);
           String query = "delete from BookRequest where name='"+idea+"' ";
            stmt.executeUpdate(query);
            stmt.close();
            
              }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btncancelbookingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceptbooking;
    private javax.swing.JButton btncancelbooking;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblemailid;
    private javax.swing.JLabel lblstudentid;
    private javax.swing.JLabel lblstudentname;
    private javax.swing.JLabel lbltimeslot;
    private javax.swing.JTable tblviewstudent;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JTextField txtstudentname;
    private javax.swing.JTextField txttimeslot;
    // End of variables declaration//GEN-END:variables

private void PopulateTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblviewstudent.getModel();
        model.setRowCount(0);
        
        for (AppointmentReq a : his.getHistory()){
        
        Object[] row = new Object[6];
            row[0] = a.getId();
            row[1] = a.getName();
            row[2] = a.getContactNumber();
            row[3] = a.getEmailId();
            row[4]= a.getTimeslot();
            row[5] = a;
           
            model.addRow(row);
        }
        
        }}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import java.net.URL;
import Model.Apartmentlistings;
import Model.ApartmentlistingsDirectory;
import Model.Broker;
import Model.SQLconnection;
import Model.Student;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author deepakzedler
 */
public class ViewApartmentlistings extends javax.swing.JPanel {

    /**
     * Creates new form ViewApartmentlistings
     */
    ApartmentlistingsDirectory ad= new ApartmentlistingsDirectory();
   ArrayList<Apartmentlistings > alist;
 Apartmentlistings a;
 
    public ViewApartmentlistings() {
        initComponents();
        this.setSize(1024, 768);
         
        ad.getApartmentlistingsDirectory();
      this.a=a;
        System.out.println("Running");
        PopulateTable();
        //final JTextField url = new JTextField(20);
		
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        btnstudio = new javax.swing.JRadioButton();
        btnonebhk = new javax.swing.JRadioButton();
        btntwobhk = new javax.swing.JRadioButton();
        btnthreebhk = new javax.swing.JRadioButton();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblapartmentlistings = new javax.swing.JTable();
        lblapttype = new javax.swing.JLabel();
        txtapttype = new javax.swing.JTextField();
        lbllandname = new javax.swing.JLabel();
        txtlandname = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        lblutilities = new javax.swing.JLabel();
        txtutilities = new javax.swing.JTextField();
        lblgrocery = new javax.swing.JLabel();
        txtgrocery = new javax.swing.JTextField();
        lblhospitals = new javax.swing.JLabel();
        txthospitals = new javax.swing.JTextField();
        lblmbta = new javax.swing.JLabel();
        txtmbta = new javax.swing.JTextField();
        lblbrokername = new javax.swing.JLabel();
        txtbrokername = new javax.swing.JTextField();
        lblemailid = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        lblaptname = new javax.swing.JLabel();
        txtaptname = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnlocation = new javax.swing.JButton();
        btnbooktour = new javax.swing.JButton();
        cmbtime = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblphoto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup.add(btnstudio);
        btnstudio.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnstudio.setText("Studio");
        btnstudio.setContentAreaFilled(false);
        btnstudio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudioActionPerformed(evt);
            }
        });
        add(btnstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 73, -1));

        buttonGroup.add(btnonebhk);
        btnonebhk.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnonebhk.setText("1BHK");
        btnonebhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnonebhkActionPerformed(evt);
            }
        });
        add(btnonebhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        buttonGroup.add(btntwobhk);
        btntwobhk.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btntwobhk.setText("2BHK");
        btntwobhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntwobhkActionPerformed(evt);
            }
        });
        add(btntwobhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        buttonGroup.add(btnthreebhk);
        btnthreebhk.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnthreebhk.setText("3BHK");
        btnthreebhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreebhkActionPerformed(evt);
            }
        });
        add(btnthreebhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        btnsearch.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 110, -1));

        tblapartmentlistings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Apartment Type", "Landlord Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblapartmentlistings.setShowGrid(false);
        tblapartmentlistings.setShowHorizontalLines(true);
        tblapartmentlistings.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblapartmentlistings);
        if (tblapartmentlistings.getColumnModel().getColumnCount() > 0) {
            tblapartmentlistings.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 740, 198));

        lblapttype.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblapttype.setText("Apartment Type :");
        add(lblapttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 328, -1, -1));

        txtapttype.setEditable(false);
        add(txtapttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 317, 160, 30));

        lbllandname.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lbllandname.setText("Landlord Name :");
        add(lbllandname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 369, -1, -1));

        txtlandname.setEditable(false);
        add(txtlandname, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 358, 160, 30));

        lblprice.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblprice.setText("Price :");
        add(lblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 403, -1, 19));

        txtprice.setEditable(false);
        add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 392, 160, 30));

        lblutilities.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblutilities.setText("Utilities :");
        add(lblutilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 438, -1, -1));

        txtutilities.setEditable(false);
        add(txtutilities, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 427, 160, 30));

        lblgrocery.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblgrocery.setText("Grocery Stores :");
        add(lblgrocery, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 471, -1, 25));

        txtgrocery.setEditable(false);
        add(txtgrocery, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 465, 160, 30));

        lblhospitals.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblhospitals.setText("Hospitals :");
        add(lblhospitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 508, -1, 25));

        txthospitals.setEditable(false);
        add(txthospitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 502, 160, 30));

        lblmbta.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblmbta.setText("MBTA :");
        add(lblmbta, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 545, -1, 25));

        txtmbta.setEditable(false);
        add(txtmbta, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 539, 160, 30));

        lblbrokername.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblbrokername.setText("Broker name :");
        add(lblbrokername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, -1, 25));

        txtbrokername.setEditable(false);
        add(txtbrokername, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 575, 160, 30));

        lblemailid.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblemailid.setText("Email ID :");
        add(lblemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, -1, 25));

        txtemailid.setEditable(false);
        add(txtemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 613, 160, 30));

        lblaptname.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblaptname.setText("Apartment Name :");
        add(lblaptname, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 655, -1, 25));

        txtaptname.setEditable(false);
        add(txtaptname, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 649, 160, 30));

        lblid.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        lblid.setText("ID :");
        add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 692, -1, 25));

        txtid.setEditable(false);
        add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 686, 160, 30));

        btnview.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnview.setText("More Details");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 120, 40));

        btnrefresh.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        btnlocation.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnlocation.setText("Location");
        btnlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocationActionPerformed(evt);
            }
        });
        add(btnlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 120, 40));

        btnbooktour.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        btnbooktour.setText("Book Apartment Tour");
        btnbooktour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbooktourActionPerformed(evt);
            }
        });
        add(btnbooktour, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 210, 70));

        cmbtime.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "9 AM - 12 AM", "12 AM - 3 PM", "3 PM - 5 PM" }));
        add(cmbtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Images/gradient (1).jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 750));

        lblphoto.setText("jLabel2");
        add(lblphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
       
         String studio= btnstudio.getText();
            String one = btnonebhk.getText();
            String two = btntwobhk.getText();
            String three = btnthreebhk.getText();

        DefaultTableModel model = (DefaultTableModel) tblapartmentlistings.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        tblapartmentlistings.setRowSorter(trs);
        if(btnstudio.isSelected()){
    trs.setRowFilter(RowFilter.regexFilter(studio));
               
        }else if(btnonebhk.isSelected()){
              trs.setRowFilter(RowFilter.regexFilter(one));
        }else if(btntwobhk.isSelected()){
             trs.setRowFilter(RowFilter.regexFilter(two));
        }else if(btnthreebhk.isSelected()){
             trs.setRowFilter(RowFilter.regexFilter(three));
        }else {
            JOptionPane.showMessageDialog(this, "Please select an Option");
        }
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudioActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_btnstudioActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblapartmentlistings.getSelectedRow();

       if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Select a row to view details");
        return;
    }
       
       // Get the ID of the selected apartment
    DefaultTableModel model = (DefaultTableModel) tblapartmentlistings.getModel();
    int apartmentID = (int) model.getValueAt(selectedRowIndex, 0); // ID column
    
        
        //Broker SelectedBroker = (Broker) model.getValueAt(selectedRowIndex, 5);

        //txtlicenseno.setText(Integer.toString(SelectedBroker.getLicenseno()));
        //txtname.setText(String.valueOf(SelectedBroker.getName()));
        //txtcontactno.setText(String.valueOf(SelectedBroker.getContactno()));
        //txtbrokerfee.setText(Integer.toString(SelectedBroker.getBrokerfee()));
        //txtmanagement.setText(String.valueOf(SelectedBroker.getManagement()));
        // txtemail.setText(String.valueOf(SelectedBroker.getEmail()));
        /*txtaptname.setText(model.getValueAt(selectedRowIndex,9).toString());
        txtapttype.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtbrokername.setText(model.getValueAt(selectedRowIndex, 7).toString());
        txtemailid.setText(model.getValueAt(selectedRowIndex, 8).toString());
        txtgrocery.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txthospitals.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtid.setText(model.getValueAt(selectedRowIndex, 10).toString());
        txtlandname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtmbta.setText(model.getValueAt(selectedRowIndex, 6).toString());
        txtprice.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtutilities.setText(model.getValueAt(selectedRowIndex, 3).toString());*/
        
        try {
        Connection con = SQLconnection.dbconnector();
        
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM Apartments WHERE ID = ?");
        stmt.setInt(1, apartmentID); // Set the ID parameter
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Populate the fields below the table with detailed information
            txtapttype.setText(rs.getString("ApartmentType"));
            txtlandname.setText(rs.getString("LandlordName"));
            txtprice.setText(rs.getString("Price"));
            txtutilities.setText(rs.getString("Utilities"));
            txtgrocery.setText(rs.getString("GroceryStores"));
            txthospitals.setText(rs.getString("Hospitals"));
            txtmbta.setText(rs.getString("MBTA"));
            txtbrokername.setText(rs.getString("BrokerName"));
            txtemailid.setText(rs.getString("EmailID"));
            txtaptname.setText(rs.getString("ApartmentName"));
            txtid.setText(String.valueOf(rs.getInt("ID")));
            
            // Set image if available (requires a proper file path or BLOB conversion)
            String photoPath = rs.getString("Pictures");
            if (photoPath != null) {
                ImageIcon icon = new ImageIcon(photoPath);
                Image image = icon.getImage().getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
                lblphoto.setIcon(new ImageIcon(image));
            } else {
                lblphoto.setIcon(null); // Clear the image if no photo exists
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ViewApartmentlistings.class.getName()).log(Level.SEVERE, null, ex);
    }
        
   String apt= txtaptname.getText();
      
        if(apt.equals("JVUE")){
        
            ImageIcon icon = new ImageIcon("C:\\Users\\sneghashree\\Documents\\Wednesday_Group_72_FinalProject\\src\\Project Images\\jvue.png");

           Image image=icon.getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH);
        
        lblphoto.setIcon(icon);
      
//cc
              
        }else if(apt.equals("Longwood") ){
            
            ImageIcon icon = new ImageIcon("C:\\Users\\sneghashree\\Documents\\Wednesday_Group_72_FinalProject\\src\\Project Images\\longwood.png");

           Image image=icon.getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH);
        
        lblphoto.setIcon(icon);
        
        }else if(apt.equals("Mission Hill")){
            
            ImageIcon icon = new ImageIcon("C:\\Users\\sneghashree\\Documents\\Wednesday_Group_72_FinalProject\\src\\Project Images\\missionhill.png");

           Image image=icon.getImage().getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH);
        
        lblphoto.setIcon(icon);
        }else{
             JOptionPane.showMessageDialog(this,"Error");
        }   
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
         
          txtaptname.setText("");
        txtapttype.setText("");
        txtbrokername.setText("");
        txtemailid.setText("");
        txtgrocery.setText("");
        txthospitals.setText("");
        txtid.setText("");
        txtlandname.setText("");
        txtmbta.setText("");
        txtprice.setText("");
        txtutilities.setText("");
        lblphoto.setIcon(null);
        buttonGroup.clearSelection();
       if( btnrefresh.isSelected()){
       PopulateTable();
       }else{
           
       }
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocationActionPerformed
        // TODO add your handling code here:
             // DefaultTableModel model = (DefaultTableModel) tblapartmentlistings.getModel();
         int selectedRowIndex = tblapartmentlistings.getSelectedRow();
           
          String apt= txtaptname.getText();
        try{
           if(apt.equals("JVUE") ){
               
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/J+Vue+at+the+LMA+Apartments/@42.3342965,-71.1030556,17z/data=!3m1!4b1!4m5!3m4!1s0x89e379890fad9993:0xd7f2c4e05f88e13c!8m2!3d42.3342893!4d-71.1008465").toURI());
           }else if(apt.equals("Longwood")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/The+Longwood/@42.3334423,-71.1038875,17z/data=!3m1!4b1!4m5!3m4!1s0x89e37988dfd77cd7:0xdb25007468045253!8m2!3d42.3334497!4d-71.1016943?hl=en").toURI());
           }
           else if(apt.equals("Mission Hill")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Mission+Main+Apartments/@42.3339717,-71.100981,17z/data=!3m1!4b1!4m5!3m4!1s0x89e379899c9560a5:0x54a51bd35307f274!8m2!3d42.3339717!4d-71.0987923?hl=en").toURI());
           } 
             else if(apt.equals("Mission Park")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Mission+Park/@42.3336467,-71.1108708,17z/data=!3m1!4b1!4m5!3m4!1s0x89e379901ca1c0f1:0x501b2929438c510a!8m2!3d42.3336467!4d-71.1086821?hl=en").toURI());
           } 
           else if(apt.equals("West Square")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/West+Square+Apartments/@42.3409289,-71.0541777,17z/data=!3m1!4b1!4m5!3m4!1s0x89e37a881852a5ff:0x73bc95f1c486ef23!8m2!3d42.340929!4d-71.049693?hl=en").toURI());
           } 
           else if(apt.equals("Parkway")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Parkway+Apartments/@42.2676322,-71.1714442,17z/data=!3m1!4b1!4m5!3m4!1s0x89e37f2cf65b75fd:0x10a83257d368b63b!8m2!3d42.2676322!4d-71.1714442?hl=en").toURI());

        
           }  else if(apt.equals("Westland")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Westland+Avenue+Garage/@42.3438579,-71.0898203,17z/data=!3m1!4b1!4m5!3m4!1s0x89e37a1a233fe3e3:0x13f6ebf4b208255e!8m2!3d42.3437529!4d-71.0876232?hl=en").toURI());
          
           }  else if(apt.equals("Vero")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Vero+Apartments/@42.3991368,-71.0440581,17z/data=!3m1!4b1!4m5!3m4!1s0x89e3713d5c02c3ed:0x57546e6acadd9554!8m2!3d42.3991368!4d-71.0418694?hl=en").toURI());
          
           }   else if(apt.equals("Church Park")){
               
                 Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Church+Park+Luxury+Apartments/@42.3443957,-71.0887858,17z/data=!3m2!4b1!5s0x89e37055dbf39f5b:0xa6234533d0ea82ad!4m5!3m4!1s0x89e37a1a6d6f7fd5:0xbd63a63c0b659388!8m2!3d42.3443957!4d-71.0865971?hl=en").toURI());
          
           }       else if(apt.equals("Greenhouse")){
               
                 Desktop.getDesktop().browse(new URL( "https://www.google.com/maps/place/The+Greenhouse+Apartments/@42.3446152,-71.0843947,17z/data=!3m1!4b1!4m5!3m4!1s0x89e37a11b08c434f:0x800b80accd9e152b!8m2!3d42.3446152!4d-71.082206?hl=en").toURI());
            

          
           } else{
              
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
            
        }
    }//GEN-LAST:event_btnlocationActionPerformed

    private void btnbooktourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbooktourActionPerformed
        // TODO add your handling code here:
        // Handle booking an apartment tour
     // WORKING   
        /*try {
            Connection con =SQLconnection.dbconnector();
             Statement stmt=con.createStatement();
           String Query= "INSERT INTO ApartmentBooking (ApartmentName,ApartmentType,Price,LandlordName,ApartmentID) values ('"+txtaptname.getText()+"','"+txtapttype.getText()+"','"+txtprice.getText()+"','"+txtlandname.getText()+"','"+txtid.getText()+"')"; 
        //JOptionPane.showMessageDialog(this,"Request sent Successfully");
        stmt.executeUpdate(Query);
        stmt.close();
        con.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentDetailsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
          int selectedRowIndex = tblapartmentlistings.getSelectedRow();
           String query = cmbtime.getSelectedItem().toString();
        if(query == "Select" ){
            JOptionPane.showMessageDialog(this, "Please Select Time Slot");
        }else if(selectedRowIndex < 0){
             JOptionPane.showMessageDialog(this, "Please Select the Apartment");
     
        
            
        } else {
          StudentDetailsPage frame=new StudentDetailsPage();
                frame.setTitle("Student Details Page");
                frame.setVisible(true);

                frame.setDefaultCloseOperation(StudentDetailsPage.EXIT_ON_CLOSE);
                frame.setResizable(false);
          } */
        //-------------------
        
        //MY WORKING CODE
        /*try {
        
        Connection con = SQLconnection.dbconnector();
        PreparedStatement stmt = con.prepareStatement(
            "INSERT INTO ApartmentBooking (ApartmentName, ApartmentType, Price, LandlordName, ApartmentID) VALUES (?, ?, ?, ?, ?)"
        );
        stmt.setString(1, txtaptname.getText());
        stmt.setString(2, txtapttype.getText());
        stmt.setString(3, txtprice.getText());
        stmt.setString(4, txtlandname.getText());
        stmt.setInt(5, Integer.parseInt(txtid.getText()));
        stmt.executeUpdate();
        stmt.close();
        con.close();
        JOptionPane.showMessageDialog(this, "Booking Successful!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error during booking: " + ex.getMessage());
        ex.printStackTrace();
    }*/
        
        try {
    // Establish database connection
    Connection con = SQLconnection.dbconnector();

    // Prepare the SQL query for inserting data
    PreparedStatement stmt = con.prepareStatement(
        "INSERT INTO ApartmentBooking (ApartmentName, ApartmentType, Price, LandlordName, ApartmentID) VALUES (?, ?, ?, ?, ?)"
    );

    // Set the query parameters from text fields
    stmt.setString(1, txtaptname.getText());
    stmt.setString(2, txtapttype.getText());
    stmt.setString(3, txtprice.getText()); // No parsing to double, store as a string if validation is not required
    stmt.setString(4, txtlandname.getText());
    stmt.setString(5, txtid.getText()); // Store ApartmentID as a string if validation is not required

    // Execute the query
    stmt.executeUpdate();

    // Close the statement and connection
    stmt.close();
    con.close();

    // Show success message
    JOptionPane.showMessageDialog(this, "Booking Successful!");

    // Open the StudentDetailsPage frame
    StudentDetailsPage frame = new StudentDetailsPage();
    frame.setTitle("Student Details Page");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(StudentDetailsPage.EXIT_ON_CLOSE);
    frame.setResizable(false);

} catch (SQLException ex) {
    // Handle SQL errors
    JOptionPane.showMessageDialog(this, "Error during booking: " + ex.getMessage());
    ex.printStackTrace();
}


        
    }//GEN-LAST:event_btnbooktourActionPerformed

    private void btnonebhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnonebhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnonebhkActionPerformed

    private void btntwobhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntwobhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntwobhkActionPerformed

    private void btnthreebhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreebhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnthreebhkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbooktour;
    private javax.swing.JButton btnlocation;
    private javax.swing.JRadioButton btnonebhk;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsearch;
    private javax.swing.JRadioButton btnstudio;
    private javax.swing.JRadioButton btnthreebhk;
    private javax.swing.JRadioButton btntwobhk;
    private javax.swing.JButton btnview;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> cmbtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblaptname;
    private javax.swing.JLabel lblapttype;
    private javax.swing.JLabel lblbrokername;
    private javax.swing.JLabel lblemailid;
    private javax.swing.JLabel lblgrocery;
    private javax.swing.JLabel lblhospitals;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllandname;
    private javax.swing.JLabel lblmbta;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblutilities;
    private javax.swing.JTable tblapartmentlistings;
    private javax.swing.JTextField txtaptname;
    private javax.swing.JTextField txtapttype;
    private javax.swing.JTextField txtbrokername;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtgrocery;
    private javax.swing.JTextField txthospitals;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlandname;
    private javax.swing.JTextField txtmbta;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtutilities;
    // End of variables declaration//GEN-END:variables

    private void PopulateTable() {
    DefaultTableModel model = (DefaultTableModel) tblapartmentlistings.getModel();
    model.setRowCount(0); // Clear existing rows

    for (Apartmentlistings a : ad.getList()) {
        Object[] row = {
            a.getID(),
            a.getApartmenttype(),
            a.getLandlordname(),
            a.getPrice()
            
            
        };
        model.addRow(row);
    }
}




 public void search(String str,int i) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    System.out.println(str);
        DefaultTableModel model = (DefaultTableModel) tblapartmentlistings.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        tblapartmentlistings.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str,i));
        
    }
}

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Costomer_Info extends javax.swing.JInternalFrame {
    public Costomer_Info() {
        initComponents();
        check();
        dispalyTableData();
        autoid();
    }
    private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(CustomerID) from CustomerMaster");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    cid.setText(Integer.toString(id));
                 }
            
            }
        catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }
    }
    
    private void clear()
    {
        cname.setText(null);
        PhoneNo.setText(null);
        address.setText(null);
        Age.setText(null);
        male.setSelected(false);
        female.setSelected(false);
        blood.setSelectedIndex(0);
        autoid();
    }
    
    private void check()
    {
         try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT CustomerID FROM CustomerMaster");
            ResultSet rs = ps.executeQuery();
             }
           catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }   
    }
      
    private void dispalyTableData()
     {
            try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM CustomerMaster");
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            ResultSet rs = ps.executeQuery();
            empdata.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }   
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PhoneNo = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        blood = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empdata = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setTitle("Customer Master");
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Customer Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1915, 990));
        jPanel1.setLayout(null);

        jPanel4.setBackground(java.awt.Color.red);
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("New");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(660, 40, 130, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Close");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(1190, 40, 130, 30);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Edit");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(800, 40, 120, 30);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Delete");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(1060, 40, 120, 30);

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setText("Save");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(930, 40, 120, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 850, 1860, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Customer Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 20))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Customer_Name");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1060, 60, 160, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Customer ID");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 60, 130, 40);

        cname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnameKeyTyped(evt);
            }
        });
        jPanel2.add(cname);
        cname.setBounds(1250, 60, 330, 30);

        cid.setEditable(false);
        cid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(cid);
        cid.setBounds(290, 70, 220, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Age");
        jLabel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1060, 120, 50, 27);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Phone No");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(1060, 240, 110, 20);

        PhoneNo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        PhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNoKeyPressed(evt);
            }
        });
        jPanel2.add(PhoneNo);
        PhoneNo.setBounds(1250, 240, 330, 30);

        Age.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });
        jPanel2.add(Age);
        Age.setBounds(1250, 120, 210, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Gender");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1060, 180, 90, 27);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Address");
        jLabel7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(100, 180, 90, 27);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(290, 190, 390, 190);

        male.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        male.setForeground(java.awt.Color.red);
        male.setText("Male");
        male.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        male.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male);
        male.setBounds(1250, 180, 80, 25);

        female.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        female.setForeground(java.awt.Color.red);
        female.setText("Female");
        female.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female);
        female.setBounds(1340, 180, 79, 25);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Blood Group");
        jLabel8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(100, 130, 120, 27);

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "A+", "AB+", "B+", "O-", "A-", "AB-", "B-" }));
        jPanel2.add(blood);
        blood.setBounds(290, 130, 170, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 30, 1830, 360);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 60, 1850, 400);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Customer Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 20))); // NOI18N
        jPanel3.setLayout(null);

        empdata.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        empdata.setForeground(java.awt.Color.red);
        empdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Age", "Gender", "Phone Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(empdata);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 50, 1800, 280);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 30, 1830, 310);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 480, 1850, 350);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 30, 1880, 950);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1900, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyTyped
          char vChar = evt.getKeyChar();
        if (!(Character.isLetter(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_cnameKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into CustomerMaster(Customer_Name , Customer_Age , Gender , Blood_Group , Customer_PhoneNo , Address) values(?,?,?,?,?,?)");
            ps.setString(1,cname.getText());
            int AGE = Integer.parseInt(Age.getText());
            ps.setInt(2,AGE);
            ps.setString(3,gender);
            ps.setString(4,(String) blood.getSelectedItem());
            long no = Long.parseLong(PhoneNo.getText());
            ps.setLong(5,no);
            ps.setString(6,address.getText());
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data is Saved");
            clear();
            dispalyTableData();
            autoid();
            }
            }
           catch(ClassNotFoundException | SQLException e)
           {
                JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DeleteCustomer de = new DeleteCustomer();
        de.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EditCustomer ec = new EditCustomer();
        ec.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
          gender="Male";
        if(male.isSelected())
       {
           female.setSelected(false);
       }    
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
          gender="Female";
        if(female.isSelected())
       {
           male.setSelected(false);
       }    
    }//GEN-LAST:event_femaleActionPerformed

    private void AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyPressed
      String age=Age.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  Age.setEditable(true);
              }else{
                  Age.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 Age.setEditable(true);
              }else{
                  Age.setEditable(false);
              }
          }
    }//GEN-LAST:event_AgeKeyPressed

    private void PhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNoKeyPressed
       String age=PhoneNo.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<10) {
                  PhoneNo.setEditable(true);
              }else{
                  PhoneNo.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 PhoneNo.setEditable(true);
              }else{
                  PhoneNo.setEditable(false);
              }
          }
    }//GEN-LAST:event_PhoneNoKeyPressed

    private String gender;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JTextArea address;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTable empdata;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    // End of variables declaration//GEN-END:variables
}
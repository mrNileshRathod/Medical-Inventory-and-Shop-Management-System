import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditCustomer extends javax.swing.JFrame {

    public EditCustomer() {
        initComponents();
        check();
    }
     public void check()
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
            JOptionPane.showMessageDialog(null,e);
        }   
    }
     public void clear()
     {
        cid.setText(null);
        search.setText(null);
        cname.setText(null);
        PhoneNo.setText(null);
        address.setText(null);
        Age.setText(null);
        male.setSelected(false);   
        female.setSelected(false);
        blood.setSelectedIndex(0);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Update Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Customer_Name");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1260, 320, 160, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Customer ID");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 320, 130, 40);

        cname.setEditable(false);
        cname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnameKeyTyped(evt);
            }
        });
        jPanel1.add(cname);
        cname.setBounds(1450, 320, 320, 30);

        cid.setEditable(false);
        cid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cidKeyTyped(evt);
            }
        });
        jPanel1.add(cid);
        cid.setBounds(490, 330, 320, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Age");
        jLabel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1260, 380, 50, 27);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Phone No");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1260, 500, 110, 20);

        PhoneNo.setEditable(false);
        PhoneNo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        PhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNoKeyPressed(evt);
            }
        });
        jPanel1.add(PhoneNo);
        PhoneNo.setBounds(1450, 500, 320, 30);

        Age.setEditable(false);
        Age.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });
        jPanel1.add(Age);
        Age.setBounds(1450, 380, 200, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Gender");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1260, 440, 90, 27);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("Address");
        jLabel7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(300, 450, 90, 27);

        address.setEditable(false);
        address.setColumns(20);
        address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(490, 450, 390, 190);

        male.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        male.setForeground(java.awt.Color.red);
        male.setText("Male");
        male.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        male.setEnabled(false);
        male.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(1440, 440, 80, 25);

        female.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        female.setForeground(java.awt.Color.red);
        female.setText("Female");
        female.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        female.setEnabled(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(1530, 440, 79, 25);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("Blood Group");
        jLabel8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 390, 120, 27);

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "A+", "AB+", "B+", "O-", "A-", "AB-", "B-" }));
        blood.setEnabled(false);
        jPanel1.add(blood);
        blood.setBounds(490, 390, 170, 30);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Enter Customer ID");
        jLabel14.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(580, 120, 260, 30);

        search.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(search);
        search.setBounds(840, 120, 300, 30);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.red);
        jButton1.setText("OK");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1160, 120, 100, 30);

        jPanel2.setBackground(java.awt.Color.red);
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(1870, 120));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(980, 50, 100, 29);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(java.awt.Color.red);
        jButton3.setText("Close");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1090, 50, 100, 29);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton4.setForeground(java.awt.Color.red);
        jButton4.setText("Edit");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(870, 50, 100, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 820, 1870, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 30, 1880, 920);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1900, 970);

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

    private void cidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_cidKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1 = search.getText();
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            java.sql.PreparedStatement ps = con.prepareStatement("SELECT * FROM CustomerMaster WHERE  CustomerID =?");
            ps.setString(1, s1);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                cid.setText(rs.getString(1));
                cname.setText(rs.getString(2));
                Age.setText(rs.getString(3));
                if("Male".equals(rs.getString(4)))
                {
                    male.setSelected(true);
                }
                else 
                {
                    female.setSelected(true);
                }
                blood.setSelectedItem(rs.getString(5));
                PhoneNo.setText(rs.getString(6));
                address.setText(rs.getString(7));
            }

        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s  = search.getText();
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("update CustomerMaster SET Customer_Name=?,Customer_Age=?,Gender=?,Blood_Group=?,Customer_PhoneNo=?,Address=? where CustomerID=?");
            ps.setString(7,s);
            String name = cname.getText();
            ps.setString(1,name);
            int a=Integer.parseInt(Age.getText());
            ps.setInt(2,a);
            ps.setString(3,gender);
            ps.setString(4,(String) blood.getSelectedItem());
            long ph=Long.parseLong(PhoneNo.getText());
            ps.setLong(5,ph);
            ps.setString(6,address.getText());
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to save a Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Row is Update");
                  ps.executeUpdate();
                clear();
            }
        }

        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cname.setEditable(true);
        Age.setEditable(true);
        PhoneNo.setEditable(true);
        address.setEditable(true);
        blood.setEnabled(true);
        male.isSelected();
        female.isSelected();
        male.setEnabled(true);
        female.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }
    private String gender;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JTextArea address;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}

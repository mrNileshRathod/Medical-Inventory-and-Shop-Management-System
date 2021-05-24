
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MedicalStoreRegistration extends javax.swing.JFrame {

    public MedicalStoreRegistration() {
        initComponents();
    }
    public void clear()
    {
        store_no.setText(null);
        store_name.setText(null);
        telephone_no.setText(null);
        address1.setText(null);
        website.setText(null);
        email.setText(null);
        owner_name.setText(null);    
        address2.setText(null);      
        owner_no.setText(null);                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        owner_no = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        store_name = new javax.swing.JTextField();
        telephone_no = new javax.swing.JTextField();
        website = new javax.swing.JTextField();
        owner_name = new javax.swing.JTextField();
        store_no = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        address2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Medical Store Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1910, 1000));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Store No.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 210, 120, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Address of Shop");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(390, 460, 180, 20);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address of Owner");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1050, 460, 160, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Telephone No.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, 280, 160, 20);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Store Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1030, 220, 150, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Website");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 340, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Owner Phone No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 400, 190, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1040, 340, 150, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Owner Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1050, 270, 120, 50);

        owner_no.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        owner_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                owner_noKeyTyped(evt);
            }
        });
        jPanel1.add(owner_no);
        owner_no.setBounds(600, 400, 340, 30);

        email.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(1220, 340, 350, 30);

        store_name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        store_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                store_nameKeyTyped(evt);
            }
        });
        jPanel1.add(store_name);
        store_name.setBounds(1220, 220, 350, 30);

        telephone_no.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        telephone_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telephone_noKeyTyped(evt);
            }
        });
        jPanel1.add(telephone_no);
        telephone_no.setBounds(600, 280, 340, 30);

        website.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(website);
        website.setBounds(600, 340, 340, 30);

        owner_name.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        owner_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                owner_nameKeyTyped(evt);
            }
        });
        jPanel1.add(owner_name);
        owner_name.setBounds(1220, 280, 350, 30);

        store_no.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        store_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                store_noKeyTyped(evt);
            }
        });
        jPanel1.add(store_no);
        store_no.setBounds(600, 220, 340, 30);

        jPanel2.setBackground(java.awt.Color.red);
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jButton1.setForeground(java.awt.Color.red);
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(860, 40, 100, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("Close");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(980, 40, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 830, 1840, 110);

        address1.setColumns(20);
        address1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        address1.setRows(5);
        jScrollPane1.setViewportView(address1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(600, 460, 340, 90);

        address2.setColumns(20);
        address2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        address2.setRows(5);
        jScrollPane2.setViewportView(address2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(1220, 460, 350, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, -10, 1850, 880);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1880, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
             PreparedStatement ps = con.prepareStatement("Insert into ShopInfo(StoreNo, StoreName , StoreTelephoneNo , StoreAddress , Website , EmailAddress , OwnerName , OwnerNo , OwnerAddress ) values (?,?,?,?,?,?,?,?,?)");
            int sno = Integer.parseInt(store_no.getText());
            ps.setInt(1,sno);
            ps.setString(2, store_name.getText());
            int tel = Integer.parseInt(telephone_no.getText()); 
            ps.setInt(3,tel);
            ps.setString(4, address1.getText());
            ps.setString(5, website.getText());
            ps.setString(6, email.getText());
            ps.setString(7, owner_name.getText());
            int tel1 = Integer.parseInt(owner_no.getText()); 
            ps.setInt(8,tel1);
            ps.setString(9, address2.getText());
             int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            int rs = ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Entered");
            clear();
            }
            
             }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void store_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_store_noKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_store_noKeyTyped

    private void owner_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_owner_noKeyTyped
     char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_owner_noKeyTyped

    private void telephone_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephone_noKeyTyped
         char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_telephone_noKeyTyped

    private void store_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_store_nameKeyTyped
         char vChar = evt.getKeyChar();
        if (!(Character.isLetter(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE)|| (vChar == KeyEvent.VK_SPACE))) {
        evt.consume();
        }
    }//GEN-LAST:event_store_nameKeyTyped

    private void owner_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_owner_nameKeyTyped
           char vChar = evt.getKeyChar();
        if (!(Character.isLetter(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_SPACE))) {
        evt.consume();
        }
    }//GEN-LAST:event_owner_nameKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(MedicalStoreRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalStoreRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalStoreRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalStoreRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalStoreRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address1;
    private javax.swing.JTextArea address2;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField owner_name;
    private javax.swing.JTextField owner_no;
    private javax.swing.JTextField store_name;
    private javax.swing.JTextField store_no;
    private javax.swing.JTextField telephone_no;
    private javax.swing.JTextField website;
    // End of variables declaration//GEN-END:variables
}

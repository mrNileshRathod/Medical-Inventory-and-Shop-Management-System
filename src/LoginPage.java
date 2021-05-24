import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame {
    int attempt = 1;

    public LoginPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        getpass = new javax.swing.JPasswordField();
        getuser = new javax.swing.JTextField();
        showpass = new javax.swing.JCheckBox();
        outpass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO SHREE MEDICAL SHOP\n\n");
        jLabel2.setAlignmentX(1.0F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(4, 30, 1910, 50);

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 0, 51));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("USER ID");
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(user);
        user.setBounds(700, 480, 196, 49);

        pass.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 51, 51));
        pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass.setText("PASSWORD");
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(pass);
        pass.setBounds(700, 540, 196, 46);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("SIGN IN");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 740, 164, 41);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("CLEAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(960, 740, 141, 41);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("EXIT");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1110, 740, 144, 41);

        getpass.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        getpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(getpass);
        getpass.setBounds(940, 540, 447, 46);

        getuser.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        getuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(getuser);
        getuser.setBounds(940, 480, 447, 49);

        showpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        showpass.setText("show password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass);
        showpass.setBounds(1220, 590, 170, 25);

        outpass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(outpass);
        outpass.setBounds(940, 610, 450, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 2350, 1080);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 210, 41, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String pass = getpass.getText();
    String user = getuser.getText();
    
    if(attempt<5 && user.equals("admin") && pass.equals("123"))
   {
       JOptionPane.showMessageDialog(null,"accesed !"); 
       FristPage fp = new FristPage();
       setVisible(false);
       fp.setVisible(true);
   }
   else if(attempt!=5)
   {
       JOptionPane.showMessageDialog(null,"Denied !");
   }
   else
   {
      JOptionPane.showMessageDialog(null,"attempt exceed !");
      getpass.setEditable(false);
      getuser.setEnabled(false);
   }
   if(attempt==5)
   {
       this.dispose();
   }
   attempt++;
    
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getuser.setText(null);
        getpass.setText(null);
        outpass.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        String out = new String(getpass.getPassword());
        
        if(showpass.isSelected())
        {
        outpass.setText(out);
        
        }
        else
        {
            outpass.setText(null);   
        }
    }//GEN-LAST:event_showpassActionPerformed
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField getpass;
    private javax.swing.JTextField getuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel outpass;
    private javax.swing.JLabel pass;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Supplier_Master extends javax.swing.JInternalFrame {

    public Supplier_Master() {
        initComponents();
        autoid();
    }
    
      private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(SupplierID) from SupplierMaster");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    SId.setText(Integer.toString(id));
                 }
            }
        catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }
    }
      
      private void clear()
      {
          Sname.setText(null);
          LId.setText(null);
          BG.setSelectedIndex(0);
          Phone.setText(null);
          Age.setText(null);
          Addr.setText(null);
      } 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Sname = new javax.swing.JTextField();
        SId = new javax.swing.JTextField();
        LId = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Addr = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        bloodgroup = new javax.swing.JLabel();
        BG = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Supplier Master");
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Supplier Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1915, 990));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Supplier Name");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(710, 320, 140, 40);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Supplier ID");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 270, 110, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Licence ID");
        jLabel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(710, 370, 110, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Address");
        jLabel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 580, 90, 40);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Phone No");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(710, 470, 100, 40);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("Age");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(710, 520, 80, 40);

        Sname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SnameKeyTyped(evt);
            }
        });
        jPanel1.add(Sname);
        Sname.setBounds(920, 320, 320, 30);

        SId.setEditable(false);
        SId.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(SId);
        SId.setBounds(920, 270, 320, 30);

        LId.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(LId);
        LId.setBounds(920, 370, 320, 30);

        Phone.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneKeyPressed(evt);
            }
        });
        jPanel1.add(Phone);
        Phone.setBounds(920, 470, 320, 30);

        Age.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });
        jPanel1.add(Age);
        Age.setBounds(920, 520, 320, 30);

        Addr.setColumns(20);
        Addr.setRows(5);
        jScrollPane1.setViewportView(Addr);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(920, 570, 320, 100);

        jPanel2.setBackground(java.awt.Color.red);
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.red);
        jButton1.setText("Add");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jPanel2.add(jButton1);
        jButton1.setBounds(790, 30, 120, 23);

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jPanel2.add(jButton2);
        jButton2.setBounds(930, 30, 120, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 670, 1830, 0);

        jPanel3.setBackground(java.awt.Color.red);
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel3.setLayout(null);

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton5.setForeground(java.awt.Color.red);
        jButton5.setText("New");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(820, 40, 110, 29);

        save.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        save.setForeground(java.awt.Color.red);
        save.setText("Save");
        save.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save);
        save.setBounds(960, 40, 110, 29);

        close.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        close.setForeground(java.awt.Color.red);
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel3.add(close);
        close.setBounds(1100, 40, 110, 29);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 860, 1870, 110);

        bloodgroup.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        bloodgroup.setForeground(java.awt.Color.red);
        bloodgroup.setText("Blood Group");
        bloodgroup.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(bloodgroup);
        bloodgroup.setBounds(710, 410, 130, 50);

        BG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "A+", "AB+", "B+", "O-", "A-", "AB-", "B-" }));
        jPanel1.add(BG);
        BG.setBounds(920, 420, 310, 30);

        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 40, 1890, 960);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1915, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement(" insert into SupplierMaster(SupplierName , SupplierLicenceID, BloodGroup , SupplierAge , SupplierPhoneNo, SupplierAddress) values (?,?,?,?,?,?)");
            ps.setString(1,Sname.getText());
            ps.setString(2,LId.getText());
            ps.setString(3,(String) BG.getSelectedItem());
            int a = Integer.parseInt(Age.getText());
            ps.setInt(4,a);
            long PN = Long.parseLong(Phone.getText());
            ps.setLong(5,PN);  
            ps.setString(6,Addr.getText()); 
             int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data is Saved");
            clear();
            autoid();
            }
            }
        catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }   
    }//GEN-LAST:event_saveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    Sname.setText(null);
    SId.setText(null);
    BG.setSelectedIndex(0);
    LId.setText(null);
    Phone.setText(null);
    Age.setText(null);
    Addr.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
    setVisible(false); 
    }//GEN-LAST:event_closeActionPerformed

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

    private void SnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SnameKeyTyped
     char vChar = evt.getKeyChar();
        if (!(Character.isLetter(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_SnameKeyTyped

    private void PhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneKeyPressed
       String age=Phone.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<10) {
                  Phone.setEditable(true);
              }else{
                  Phone.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 Phone.setEditable(true);
              }else{
                  Phone.setEditable(false);
              }
          }
    }//GEN-LAST:event_PhoneKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Addr;
    private javax.swing.JTextField Age;
    private javax.swing.JComboBox<String> BG;
    private javax.swing.JTextField LId;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField SId;
    private javax.swing.JTextField Sname;
    private javax.swing.JLabel bloodgroup;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
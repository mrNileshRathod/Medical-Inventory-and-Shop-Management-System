import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditEmployee extends javax.swing.JFrame {

    public EditEmployee() 
    {
        initComponents();
        check();
    }
    @SuppressWarnings("unchecked")
      public void clear()
    {
        search.setText(null);
        eid.setText(null);
        ename.setText(null);
        bsal.setText(null);
        age.setText(null);
        bloodgroup.setSelectedIndex(0);
        address.setText(null);
        phoneno.setText(null);
        exp.setText(null);
        male.setSelected(false);
        female.setSelected(false);
    }
     private void check()
    {
         try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT EmployeeID FROM EmployeeData");
            ResultSet rs = ps.executeQuery();
            }
           catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        bsal = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Update Employee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Name");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1080, 230, 180, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Address");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 390, 180, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Employee Phone No");
        jLabel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 290, 190, 20);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Employee ID");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 230, 140, 20);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Basic Salary");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1090, 470, 130, 27);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Experience in Year");
        jLabel7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1080, 340, 210, 40);

        phoneno.setEditable(false);
        phoneno.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenoKeyPressed(evt);
            }
        });
        jPanel1.add(phoneno);
        phoneno.setBounds(480, 290, 340, 30);

        age.setEditable(false);
        age.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(1350, 290, 140, 30);

        ename.setEditable(false);
        ename.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jPanel1.add(ename);
        ename.setBounds(1350, 230, 320, 30);

        bsal.setEditable(false);
        bsal.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jPanel1.add(bsal);
        bsal.setBounds(1350, 470, 320, 30);

        exp.setEditable(false);
        exp.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jPanel1.add(exp);
        exp.setBounds(1350, 350, 340, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gender");
        jLabel8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 340, 100, 30);

        female.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
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
        female.setBounds(590, 340, 89, 27);

        male.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        male.setForeground(java.awt.Color.red);
        male.setText("Male");
        male.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        male.setEnabled(false);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(480, 340, 67, 27);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Employee Age");
        jLabel9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1080, 290, 170, 20);

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O+", "A+", "AB+", "B+", "O-", "A-", "AB-", "B-" }));
        bloodgroup.setEnabled(false);
        jPanel1.add(bloodgroup);
        bloodgroup.setBounds(1350, 410, 180, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Blood Group");
        jLabel10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1090, 410, 130, 30);

        eid.setEditable(false);
        eid.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jPanel1.add(eid);
        eid.setBounds(480, 230, 340, 30);

        address.setEditable(false);
        address.setColumns(20);
        address.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(480, 400, 340, 140);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Enter Employee ID");
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

        jPanel4.setBackground(java.awt.Color.red);
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(null);

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
        jButton2.setBounds(1060, 40, 130, 30);

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
        jPanel4.setBounds(20, 820, 1870, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 40, 1900, 920);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 1920, 970);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("select * from EmployeeData where EmployeeID=?");
            ps.setString(1, search.getText());
            ResultSet rs = ps.executeQuery();

             while (rs.next())
            {
                eid.setText(rs.getString(1));
                ename.setText(rs.getString(2));
                age.setText(rs.getString(3));
                if("Male".equals(rs.getString(4)))
                {
                    male.setSelected(true);
                    female.setSelected(false);
                }
                else 
                {
                    male.setSelected(false);
                    female.setSelected(true);
                }
                
                bloodgroup.setSelectedItem(rs.getString(5));
                exp.setText(rs.getString(6));
                bsal.setText(rs.getString(7));
                phoneno.setText(rs.getString(8));
                address.setText(rs.getString(9));
            }

        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ename.setEditable(true);
        bsal.setEditable(true);
        phoneno.setEditable(true);
        address.setEditable(true);
        age.setEditable(true);
        exp.setEditable(true);
        male.setEnabled(true);
        female.setEnabled(true);
        bloodgroup.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("update EmployeeData SET EmployeeName=?,EmployeeAge=?,Gender=?,BloodGroup=?,EmployeeExpYear=?,EmployeeSalary=?,EmployeePhoneNo=?,EmployeeAddress=? where EmployeeID=?");
            int r=Integer.parseInt(search.getText());
            ps.setInt(9,r);
            String name=ename.getText();
            ps.setString(1,name);
            int a=Integer.parseInt(age.getText());
            ps.setInt(2, a);
            ps.setString(3,gender);
            ps.setString(4,(String) bloodgroup.getSelectedItem());
            int e=Integer.parseInt(exp.getText());
            ps.setInt(5,e);
            Double sal =  Double.parseDouble(bsal.getText());
            ps.setDouble(6,sal);
            long xyz =Long.parseLong(phoneno.getText());
            ps.setLong(7,xyz);
            ps.setString(8,address.getText());
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to save a Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response == JOptionPane.YES_OPTION)
            {
                  ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Row is Update");
                clear();
                search.setText(null);
            }
        }

        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
      String a=age.getText();
          int l = a.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  age.setEditable(true);
              }else{
                  age.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 age.setEditable(true);
              }else{
                  age.setEditable(false);
              }
          }
    }//GEN-LAST:event_ageKeyPressed

    private void phonenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyPressed
       String age=phoneno.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<10) {
                  phoneno.setEditable(true);
              }else{
                  phoneno.setEditable(false);
              } }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 phoneno.setEditable(true);
              }else{
                  phoneno.setEditable(false);
              }}
    }//GEN-LAST:event_phonenoKeyPressed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployee().setVisible(true);
            }
        });
    }
    private String gender; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JTextField bsal;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField exp;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
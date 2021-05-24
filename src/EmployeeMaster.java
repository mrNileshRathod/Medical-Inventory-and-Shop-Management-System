import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class EmployeeMaster extends javax.swing.JInternalFrame {

    public EmployeeMaster() {
        initComponents();
        dispalyTableData();
        check();
        autoid();
    }
      private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(EmployeeID) from EmployeeData");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    eid.setText(Integer.toString(id));
                 }
            
            }
        catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }
    }
      
    private void clear()
    {
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
        autoid();
    }
    
    private void dispalyTableData()
     {
            try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM EmployeeData");
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            ResultSet rs = ps.executeQuery();
            data.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }   
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setTitle("Employee Master");
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Employee Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1915, 990));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Name");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(960, 80, 180, 20);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Address");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 250, 180, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Employee Phone No");
        jLabel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 140, 190, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Employee ID");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 80, 140, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Basic Salary");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(970, 320, 130, 27);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Experience in Year");
        jLabel7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(960, 200, 190, 30);

        phoneno.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenoKeyPressed(evt);
            }
        });
        jPanel1.add(phoneno);
        phoneno.setBounds(360, 140, 340, 30);

        age.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(1230, 140, 140, 30);

        ename.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        ename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enameKeyTyped(evt);
            }
        });
        jPanel1.add(ename);
        ename.setBounds(1230, 80, 320, 30);

        bsal.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        bsal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bsalKeyTyped(evt);
            }
        });
        jPanel1.add(bsal);
        bsal.setBounds(1230, 320, 320, 30);

        exp.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        exp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                expKeyTyped(evt);
            }
        });
        jPanel1.add(exp);
        exp.setBounds(1230, 200, 340, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gender");
        jLabel8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 190, 100, 30);

        female.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        female.setForeground(java.awt.Color.red);
        female.setText("Female");
        female.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(470, 190, 89, 27);

        male.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        male.setForeground(java.awt.Color.red);
        male.setText("Male");
        male.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(360, 190, 67, 27);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Employee Age");
        jLabel9.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(960, 140, 170, 27);

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "A+", "AB+", "B+", "O-", "A-", "AB-", "B-" }));
        jPanel1.add(bloodgroup);
        bloodgroup.setBounds(1230, 260, 180, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Blood Group");
        jLabel10.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(970, 260, 130, 30);

        eid.setEditable(false);
        eid.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        eid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eidKeyTyped(evt);
            }
        });
        jPanel1.add(eid);
        eid.setBounds(360, 80, 340, 30);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 250, 340, 140);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Employee Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel2.setLayout(null);

        data.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        data.setForeground(java.awt.Color.red);
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Age", "Employee Gender", "Employee Blood Gropu", "Exprience of Year", "Employee Salary", "Employee Phone No", "Employee Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(data);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 40, 1840, 280);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 30, 1850, 300);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 460, 1870, 340);

        jPanel3.setBackground(java.awt.Color.red);
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(1870, 120));
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(java.awt.Color.red);
        jButton1.setText("Edit");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(770, 40, 120, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(java.awt.Color.red);
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(900, 40, 120, 30);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton3.setForeground(java.awt.Color.red);
        jButton3.setText("Delete");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1030, 40, 120, 30);

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton4.setForeground(java.awt.Color.red);
        jButton4.setText("Close");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(1160, 40, 120, 30);

        jButton5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton5.setForeground(java.awt.Color.red);
        jButton5.setText("New");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.red));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(640, 40, 120, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 850, 1870, 120);

        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 40, 1890, 940);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1915, 990);

        getAccessibleContext().setAccessibleName("EmployeeMaster");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EditEmployee ee = new EditEmployee();
        ee.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("insert into EmployeeData(EmployeeName , EmployeeAge , Gender , BloodGroup , EmployeeExpYear , EmployeeSalary , EmployeePhoneNo, EmployeeAddress) values (?,?,?,?,?,?,?,?)");
            ps.setString(1,ename.getText());
            int AGE = Integer.parseInt(age.getText());
            ps.setInt(2,AGE);
            ps.setString(3,gender);
            ps.setString(4,(String) bloodgroup.getSelectedItem());
            int year = Integer.parseInt(exp.getText());
            ps.setInt(5,year);
            double salary = Double.parseDouble(bsal.getText());
            ps.setDouble(6, salary);
            long phno = Long.parseLong(phoneno.getText()); 
            ps.setLong(7,phno);
            ps.setString(8,address.getText());        
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DeleteEmployee de = new DeleteEmployee();
        de.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidKeyTyped
         char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_eidKeyTyped

    private void enameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isLetter(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_enameKeyTyped

    private void expKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expKeyTyped
           char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_expKeyTyped

    private void bsalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bsalKeyTyped
         char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_bsalKeyTyped

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
    private String gender; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JTextField bsal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable data;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField exp;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phoneno;
    // End of variables declaration//GEN-END:variables
}
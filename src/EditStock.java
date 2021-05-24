import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditStock extends javax.swing.JFrame {
     public EditStock() {
        initComponents();
        check();
    }
     
    private void check()
    {
         try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT ProductID FROM ProductStock");
            ResultSet rs = ps.executeQuery();
             }
           catch(ClassNotFoundException | SQLException e)
        {
             JOptionPane.showMessageDialog(null,e);     
        }   
    }
       
    private void clear()
    {
      pname.setText(null);
      prate.setText("0.00");
      srate.setText("0.00");
      mrp.setText("0.00");
      quantity.setText("0");
      mdate.setDate(null);
      edate.setDate(null);
      catname.setSelectedIndex(0);
      packname.setSelectedIndex(0);
      rno.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        catname = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        packname = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        prate = new javax.swing.JTextField();
        mrp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        srate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rno = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPDATE STOCK");
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Updating Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), java.awt.Color.blue)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1020));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product ID");
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 240, 120, 30);

        pname.setEditable(false);
        pname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pname.setFocusCycleRoot(true);
        jPanel1.add(pname);
        pname.setBounds(970, 240, 310, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Name");
        jLabel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(780, 240, 170, 30);

        pid.setEditable(false);
        pid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pid.setFocusCycleRoot(true);
        jPanel1.add(pid);
        pid.setBounds(360, 240, 320, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Catergory Name");
        jLabel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 290, 160, 30);

        catname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        catname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tablet", "Strip", "Capsule", "Bottel", "Other" }));
        catname.setFocusCycleRoot(true);
        catname.setLightWeightPopupEnabled(false);
        catname.setOpaque(false);
        jPanel1.add(catname);
        catname.setBounds(360, 290, 320, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Package Name");
        jLabel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(780, 290, 160, 30);

        packname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        packname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Box", "Bottel", "Other" }));
        packname.setFocusCycleRoot(true);
        jPanel1.add(packname);
        packname.setBounds(970, 290, 120, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Purchase Rate");
        jLabel5.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 340, 150, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MRP Rate");
        jLabel6.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(780, 340, 130, 30);

        prate.setEditable(false);
        prate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        prate.setText("0.00");
        prate.setFocusCycleRoot(true);
        prate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prateKeyTyped(evt);
            }
        });
        jPanel1.add(prate);
        prate.setBounds(360, 340, 220, 30);

        mrp.setEditable(false);
        mrp.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        mrp.setText("0.00");
        mrp.setFocusCycleRoot(true);
        mrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mrpKeyTyped(evt);
            }
        });
        jPanel1.add(mrp);
        mrp.setBounds(970, 340, 240, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sale Rate");
        jLabel7.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1360, 340, 100, 30);

        srate.setEditable(false);
        srate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        srate.setText("0.00");
        srate.setFocusCycleRoot(true);
        srate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srateKeyTyped(evt);
            }
        });
        jPanel1.add(srate);
        srate.setBounds(1480, 340, 220, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity");
        jLabel8.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 390, 110, 30);

        quantity.setEditable(false);
        quantity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        quantity.setText("0");
        quantity.setFocusCycleRoot(true);
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });
        jPanel1.add(quantity);
        quantity.setBounds(360, 390, 130, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Rack Entry\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rack No");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 60, 100, 30);

        rno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Rack 1", "Rack 2", "Rack 3", "Rack 4" }));
        jPanel2.add(rno);
        rno.setBounds(170, 60, 160, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1370, 460, 460, 150);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Manufacturing Date");
        jLabel11.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 470, 210, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Expire Date");
        jLabel12.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(775, 470, 140, 30);

        mdate.setDateFormatString("dd-MMM-yyyy");
        mdate.setFocusCycleRoot(true);
        mdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(mdate);
        mdate.setBounds(350, 470, 330, 30);

        edate.setDateFormatString("dd-MMM-yyyy");
        edate.setFocusCycleRoot(true);
        edate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(edate);
        edate.setBounds(970, 470, 310, 30);

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
        jPanel4.setBounds(20, 880, 1870, 120);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Enter Product ID");
        jLabel14.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 120, 230, 30);

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update med.jpg"))); // NOI18N
        jLabel13.setFocusCycleRoot(true);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 40, 1900, 970);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prateKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE || (vChar == KeyEvent.VK_DEAD_IOTA)))) {
        evt.consume();
        }
    }//GEN-LAST:event_prateKeyTyped

    private void mrpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mrpKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_DEAD_IOTA))) {
        evt.consume();
        }
    }//GEN-LAST:event_mrpKeyTyped

    private void srateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srateKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_DEAD_IOTA))) {
        evt.consume();
        }
    }//GEN-LAST:event_srateKeyTyped

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pname.setEditable(true);
        prate.setEditable(true);
        srate.setEditable(true);
        mrp.setEditable(true);
        quantity.setEditable(true);
        mdate.setEnabled(true);
        edate.setEnabled(true);
        catname.setEnabled(true);
        packname.setEnabled(true);
        rno.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String date1 = ((JTextField) mdate.getDateEditor().getUiComponent()).getText();
        String date2 = ((JTextField) edate.getDateEditor().getUiComponent()).getText();
        try 
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("update ProductStock SET Product_Name=?,Product_Category=?,Product_PackageType=?,Quantity=?,Rack_Name=?,Purchase_Rate=?,MRP_Rate=?,Sale_Rate=?,Manufacturing_Date=?,Expiry_Date=? where ProductID=?");
            int r=Integer.parseInt(search.getText());
            ps.setInt(11,r);
            String name=pname.getText();
            ps.setString(1,name);
            ps.setString(2,(String) catname.getSelectedItem());
            ps.setString(3,(String) packname.getSelectedItem());
            int q=Integer.parseInt(quantity.getText());
            ps.setInt(4,q);
            ps.setString(5,(String) rno.getSelectedItem());
            Double pr = Double.parseDouble(prate.getText());
            ps.setDouble(6,pr);
            Double mrp_rate =  Double.parseDouble(mrp.getText());
            ps.setDouble(7,mrp_rate);
            Double sale_rate =  Double.parseDouble(srate.getText());
            ps.setDouble(8,sale_rate);
            ps.setString(9,date1);
            ps.setString(10,date2);  
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
             JOptionPane.showMessageDialog(null,e);     
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1 = search.getText();
        try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM ProductStock WHERE  ProductID =?");
            ps.setString(1, s1);
            ResultSet rs = ps.executeQuery();
            
             while (rs.next())
            {       
                    pid.setText(rs.getString(1));
                    pname.setText(rs.getString(2));
                    catname.setSelectedItem(rs.getString(3));
                    packname.setSelectedItem(rs.getString(4));
                    quantity.setText(rs.getString(5));
                    rno.setSelectedItem(rs.getString(6));
                    prate.setText(rs.getString(7));
                    mrp.setText(rs.getString(8));
                    srate.setText(rs.getString(9));
                    mdate.setDate(rs.getDate(10));
                    edate.setDate(rs.getDate(11));
            }

             }
         catch(ClassNotFoundException | SQLException e)
        {
             JOptionPane.showMessageDialog(null,e);        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catname;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser mdate;
    private javax.swing.JTextField mrp;
    private javax.swing.JComboBox<String> packname;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField prate;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> rno;
    private javax.swing.JTextField search;
    private javax.swing.JTextField srate;
    // End of variables declaration//GEN-END:variables
}
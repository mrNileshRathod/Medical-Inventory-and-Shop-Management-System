import java.awt.event.KeyEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class Product extends javax.swing.JInternalFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Product() {
        initComponents();
        dispalyTableData();
        autoid();
    }
    @SuppressWarnings("unchecked")
    
    private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(ProductID) from ProductStock");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    pid.setText(Integer.toString(id));
                 }
            
            }
        catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            }
    }
    
    public void dispalyTableData()
     {
            try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM ProductStock");
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            ResultSet rs = ps.executeQuery();
            data.setModel(DbUtils.resultSetToTableModel(rs));
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
        pname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        catname = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        packname = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        prate = new javax.swing.JTextField();
        mrp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        srate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rno = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        mdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Product Master");
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Product Master", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1900, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1915, 990));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 50, 120, 30);

        pname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(pname);
        pname.setBounds(850, 50, 310, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(660, 50, 170, 30);

        pid.setEditable(false);
        pid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(pid);
        pid.setBounds(240, 50, 320, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Catergory Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 160, 30);

        catname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        catname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tablet", "Strip", "Capsule", "Bottel", "Other" }));
        catname.setLightWeightPopupEnabled(false);
        catname.setOpaque(false);
        jPanel1.add(catname);
        catname.setBounds(240, 100, 320, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Package Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 100, 150, 30);

        packname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        packname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Box", "Bottel", "Other" }));
        jPanel1.add(packname);
        packname.setBounds(850, 100, 250, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Purchase Rate");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 150, 150, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MRP Rate");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(650, 150, 140, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(630, 250, 0, 2);

        prate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        prate.setText("0.00");
        prate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prateKeyTyped(evt);
            }
        });
        jPanel1.add(prate);
        prate.setBounds(240, 150, 220, 30);

        mrp.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        mrp.setText("0.00");
        mrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mrpKeyTyped(evt);
            }
        });
        jPanel1.add(mrp);
        mrp.setBounds(850, 150, 240, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sale Rate");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1240, 150, 100, 30);

        srate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        srate.setText("0.00");
        srate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srateKeyTyped(evt);
            }
        });
        jPanel1.add(srate);
        srate.setBounds(1360, 150, 220, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 200, 110, 30);

        quantity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        quantity.setText("0");
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantityKeyPressed(evt);
            }
        });
        jPanel1.add(quantity);
        quantity.setBounds(240, 200, 130, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Rack Entry\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rack No");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 60, 80, 30);

        rno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Rack 1", "Rack 2", "Rack 3", "Rack 4" }));
        jPanel2.add(rno);
        rno.setBounds(160, 60, 220, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t.jpg"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 20, 440, 120);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1250, 270, 460, 150);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Manufacturing Date");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 280, 180, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Expiry Date");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(680, 280, 102, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18))); // NOI18N
        jPanel3.setLayout(null);

        data.setAutoCreateRowSorter(true);
        data.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        data.setForeground(java.awt.Color.red);
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Package Type", "Rack No", "Purcahse Price", "MRP Rate", "Sale Rate", "Manufacturing Date", "Expire Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.setToolTipText("");
        data.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        data.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        data.setFocusCycleRoot(true);
        data.setGridColor(new java.awt.Color(0, 0, 0));
        data.setName(""); // NOI18N
        data.setSelectionBackground(new java.awt.Color(153, 153, 255));
        data.setSelectionForeground(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(data);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 1850, 220);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t.jpg"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 30, 1850, 260);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 460, 1870, 300);

        mdate.setDateFormatString("dd-MMM-yyyy");
        mdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(mdate);
        mdate.setBounds(240, 280, 330, 30);

        edate.setDateFormatString("dd-MMM-yyyy");
        edate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(edate);
        edate.setBounds(850, 280, 310, 30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
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
        jButton1.setBounds(540, 40, 130, 30);

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
        jButton2.setBounds(1070, 40, 130, 30);

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
        jButton3.setBounds(680, 40, 120, 30);

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
        jButton4.setBounds(940, 40, 120, 30);

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
        jButton5.setBounds(810, 40, 120, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t.jpg"))); // NOI18N
        jLabel17.setToolTipText("");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(10, 10, 1850, 100);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 850, 1870, 120);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 30, 1890, 950);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1915, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
      autoid();
    }
  
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String date1 = ((JTextField) mdate.getDateEditor().getUiComponent()).getText();
        String date2 = ((JTextField) edate.getDateEditor().getUiComponent()).getText();
        try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into ProductStock(Product_Name, Product_Category , Product_PackageType, Quantity ,Rack_Name , Purchase_Rate , MRP_Rate , Sale_Rate , Manufacturing_Date , Expiry_Date ) values (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,pname.getText());
            ps.setString(2,(String) catname.getSelectedItem());
            ps.setString(3,(String) packname.getSelectedItem());
            int qua = Integer.parseInt(quantity.getText());
            ps.setInt(4, qua);
            ps.setString(5,(String) rno.getSelectedItem());
            Double pur =  Double.parseDouble(prate.getText());
            ps.setDouble(6,pur);
            Double mrp_rate =  Double.parseDouble(mrp.getText());
            ps.setDouble(7,mrp_rate);
            Double sale_rate =  Double.parseDouble(srate.getText());
            ps.setDouble(8,sale_rate); 
            ps.setString(9, date1);
            ps.setString(10, date2); 
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            int rs =ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data is Saved");
            dispalyTableData();
            clear();
            }  
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null,e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       EditStock es = new EditStock();
       es.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Delete_Stock de = new Delete_Stock();
        de.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyPressed
       String age=quantity.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  quantity.setEditable(true);
              }else{
                  quantity.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 quantity.setEditable(true);
              }else{
                  quantity.setEditable(false);
              } }
    }//GEN-LAST:event_quantityKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catname;
    private javax.swing.JTable data;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser mdate;
    private javax.swing.JTextField mrp;
    private javax.swing.JComboBox<String> packname;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField prate;
    private javax.swing.JTextField quantity;
    private javax.swing.JComboBox<String> rno;
    private javax.swing.JTextField srate;
    // End of variables declaration//GEN-END:variables
}
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Sale1 extends javax.swing.JInternalFrame {

    public Sale1() {
        initComponents();
        autoid();
        check();
    }
    
    private void clear()
    {
        pid.setText(null);
        pname.setText(null);
        cat.setSelectedIndex(0);
        stock.setText(null);
        rack.setSelectedIndex(0);
        mrate.setText(null);
        srate.setText(null);
        qua.setText(null);
        price.setText(null);
    }
    
    private void Clear()
    {
       phone.setText(null);
       saledate.setDate(null);
    }

     private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(Bill_No) from SaleMaster");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    saleid.setText(Integer.toString(id));
                 }
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
            PreparedStatement ps = con.prepareStatement("SELECT Bill_No FROM SaleMaster");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        saleid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        saledate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mrate = new javax.swing.JTextField();
        srate = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        qua = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        cat = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        rack = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        finalamount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setClosable(true);
        setTitle("Sale ");
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Sale Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1915, 990));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Main Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sale ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-20, 40, 150, 30);

        saleid.setEditable(false);
        saleid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(saleid);
        saleid.setBounds(90, 40, 280, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(380, 40, 140, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone No");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1250, 40, 130, 30);

        phone.setEditable(false);
        phone.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(phone);
        phone.setBounds(1360, 40, 190, 30);

        saledate.setDateFormatString("dd-MMM-yyyy");
        saledate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(saledate);
        saledate.setBounds(1650, 40, 180, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sale Date");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1530, 40, 130, 30);

        cname.setEditable(false);
        cname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnameMouseClicked(evt);
            }
        });
        jPanel2.add(cname);
        cname.setBounds(800, 40, 440, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(660, 40, 140, 30);

        cid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cidKeyPressed(evt);
            }
        });
        jPanel2.add(cid);
        cid.setBounds(510, 40, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 40, 1850, 130);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Add Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Product Name");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(170, 40, 130, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Catrgory Name");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(480, 40, 150, 30);

        pname.setEditable(false);
        pname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnameMouseClicked(evt);
            }
        });
        jPanel3.add(pname);
        pname.setBounds(180, 80, 300, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Current Stock");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(690, 40, 110, 30);

        stock.setEditable(false);
        stock.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel3.add(stock);
        stock.setBounds(690, 80, 130, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Rack");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(830, 40, 50, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MRP Rate");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(980, 40, 100, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quantity");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(1290, 40, 110, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Price");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(1430, 40, 39, 30);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Sale Rate");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(1170, 40, 80, 30);

        mrate.setEditable(false);
        mrate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel3.add(mrate);
        mrate.setBounds(990, 80, 170, 30);

        srate.setEditable(false);
        srate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel3.add(srate);
        srate.setBounds(1170, 80, 130, 30);

        price.setEditable(false);
        price.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceMouseClicked(evt);
            }
        });
        jPanel3.add(price);
        price.setBounds(1430, 80, 140, 30);

        qua.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        qua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quaKeyTyped(evt);
            }
        });
        jPanel3.add(qua);
        qua.setBounds(1310, 80, 110, 30);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Add");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(1580, 80, 90, 30);

        data.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        data.setForeground(java.awt.Color.red);
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category Name", "Current Stock", "Rack No", "MRP Rate", "Sale Rate", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(data);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 1800, 250);

        cat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Tablet", "Strip", "Capsule", "Bottel", "Other" }));
        jPanel3.add(cat);
        cat.setBounds(500, 80, 170, 30);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Product ID");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 40, 90, 30);

        pid.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        pid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pidKeyPressed(evt);
            }
        });
        jPanel3.add(pid);
        pid.setBounds(30, 80, 140, 30);

        rack.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rack.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Rack 1", "Rack 2", "Rack 3", "Rack 4" }));
        jPanel3.add(rack);
        rack.setBounds(830, 80, 140, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 190, 1850, 410);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Grand Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel4.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Payment By");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(620, 160, 120, 30);

        type.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH" }));
        jPanel4.add(type);
        type.setBounds(750, 160, 130, 30);

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Remark");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(920, 160, 80, 30);

        jTextField18.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel4.add(jTextField18);
        jTextField18.setBounds(1000, 160, 450, 32);

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Submit ");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 4, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(1520, 220, 150, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Cancel");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 4, true));
        jPanel4.add(jButton3);
        jButton3.setBounds(1680, 220, 150, 40);

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Final Amount");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(30, 150, 200, 60);

        finalamount.setEditable(false);
        finalamount.setBackground(new java.awt.Color(255, 255, 102));
        finalamount.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        finalamount.setText("0.00");
        finalamount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalamountMouseClicked(evt);
            }
        });
        jPanel4.add(finalamount);
        finalamount.setBounds(240, 150, 270, 60);

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Tax in %");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(1070, 40, 140, 30);

        tax.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tax.setForeground(java.awt.Color.red);
        tax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tax.setText("0");
        tax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taxKeyTyped(evt);
            }
        });
        jPanel4.add(tax);
        tax.setBounds(1200, 40, 160, 30);

        jLabel24.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Discount in %");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(1390, 40, 135, 30);

        dis.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        dis.setForeground(java.awt.Color.red);
        dis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dis.setText("0");
        jPanel4.add(dis);
        dis.setBounds(1540, 40, 170, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 660, 1850, 280);

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Total");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1380, 610, 110, 40);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 102));
        total.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        total.setText("0.00");
        jPanel1.add(total);
        total.setBounds(1500, 610, 270, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1915, 1010);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void quaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quaKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_quaKeyTyped

    private void taxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taxKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_taxKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try 
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into SaleMaster(Customer_Name , Customer_PhoneNo , Payment_Type , Sale_Date , Total) values (?,?,?,?,?)");
            ps.setString(1,cname.getText());
            int ph = Integer.parseInt(phone.getText());
            ps.setInt(2,ph);
            ps.setString(3,(String) type.getSelectedItem());
            String date = ((JTextField) saledate.getDateEditor().getUiComponent()).getText();
            ps.setString(4,date);
            Double amt2 =  Double.parseDouble(finalamount.getText());
            ps.setDouble(5,amt2);
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            ps.executeUpdate();
            Clear();
            JOptionPane.showMessageDialog(null,"Data is Saved");
            }
            }
          catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null,e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sale1.class.getName()).log(Level.SEVERE, null, ex);
        }
        autoid();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnameMouseClicked
    String s1 = pid.getText();
              try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM ProductStock WHERE  ProductID =?");
            ps.setString(1, s1);
            ResultSet rs = ps.executeQuery();
            
                while(rs.next())
                {
                    pname.setText(rs.getString(2));
                    cat.setSelectedItem(rs.getString(3));
                    stock.setText(rs.getString(5));
                    rack.setSelectedItem(rs.getString(7));
                    mrate.setText(rs.getString(8));
                    srate.setText(rs.getString(9));
                }  
             }
                catch(ClassNotFoundException | SQLException e)
             {
             JOptionPane.showMessageDialog(null,e);        
             }
    }//GEN-LAST:event_pnameMouseClicked

    private void priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseClicked
            Double q = Double.parseDouble(qua.getText());
            Double dis = Double.parseDouble(srate.getText());
            Double a1 = q*(dis);
            price.setText(Double.toString(a1)); 
    }//GEN-LAST:event_priceMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try 
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into SaleProduct(BillNo,MedicineID,Quantity,Amount) values(?,?,?,?)");
            int j=Integer.parseInt(saleid.getText());
            ps.setInt(1, j);
            int ID = Integer.parseInt(pid.getText());
            ps.setInt(2,ID);
            int q = Integer.parseInt(qua.getText());
            ps.setInt(3,q);
            Double AMT = Double.parseDouble(price.getText());
            ps.setDouble(4,AMT);
            int i=ps.executeUpdate();
            }
         catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
      
        String s = price.getText();
        Double a = Double.parseDouble(s);
        Double a2 = Double.parseDouble(total.getText()) + a;
        total.setText(Double.toString(a2));            
               
        DefaultTableModel model = (DefaultTableModel)data.getModel();
        model.addRow(new Object[] {pid.getText() , pname.getText() , cat.getSelectedItem() , stock.getText() , rack.getSelectedItem() , mrate.getText() ,srate.getText(), qua.getText() , price.getText()});   
        
         try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement pst = con.prepareStatement("UPDATE ProductStock SET Quantity=? where ProductID=?");
            int r=Integer.parseInt(pid.getText());
            pst.setInt(2,r);
            int i=Integer.parseInt(stock.getText());
            int j=Integer.parseInt(qua.getText());
            int k= i-j;
            pst.setInt(1,k);
            pst.executeUpdate();  
             }
            catch(ClassNotFoundException | SQLException e)
             {
             JOptionPane.showMessageDialog(null,e);        
             }  
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnameMouseClicked
        String s1 = cid.getText();
            try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM CustomerMaster WHERE  CustomerID =?");
            ps.setString(1, s1);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                cname.setText(rs.getString(2));
                phone.setText(rs.getString(6));
            }
            }
              catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cnameMouseClicked

    private void finalamountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalamountMouseClicked
           Double a =  Double.parseDouble(total.getText());
           Double t1 = Double.parseDouble(tax.getText()) - Double.parseDouble(dis.getText());
           Double t2 = (t1/100);
           Double t3 = t2+1;
           finalamount.setText(Double.toString(t3*a));    
    }//GEN-LAST:event_finalamountMouseClicked

    private void cidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cidKeyPressed
       String age=cid.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  cid.setEditable(true);
              }else{
                  cid.setEditable(false);
              }}
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 cid.setEditable(true);
              }else{
                  cid.setEditable(false);
              } }
    }//GEN-LAST:event_cidKeyPressed

    private void pidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyPressed
        String age=pid.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  pid.setEditable(true);
              }else{
                  pid.setEditable(false);
              }}
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 pid.setEditable(true);
              }else{
                  pid.setEditable(false);
              } }
    }//GEN-LAST:event_pidKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTable data;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField finalamount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField mrate;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qua;
    private javax.swing.JComboBox<String> rack;
    private com.toedter.calendar.JDateChooser saledate;
    private javax.swing.JTextField saleid;
    private javax.swing.JTextField srate;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField total;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
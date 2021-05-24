import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Purchase1 extends javax.swing.JInternalFrame {

    public Purchase1() {
        initComponents();
        check();
        autoid();
        getShop();
    }

    @SuppressWarnings("unchecked")
     private void autoid()
    {
        int id = 1;
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(PurchaseNo) from PurchaseMaster");
            ResultSet rs = ps.executeQuery();
           
                while(rs.next())
                 {
                    id=rs.getInt(1) + 1;
                    purid.setText(Integer.toString(id));
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
            PreparedStatement ps = con.prepareStatement("SELECT PurchaseNo FROM PurchaseProduct");
            ResultSet rs = ps.executeQuery();
             }
           catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
    }
     
      private void clearAll()
      {
          pno.setText(null);
          add.setText(null);
          sid.setText(null);
          total.setText(null);
          gtotal.setText(null);
      }
      
      private void clear()
      {
          pname.setText(null);
          cat.setSelectedIndex(0);
          price.setText(null);
          mrp.setText(null);
          stock.setText(null);
          prate.setText(null);
          pid.setText(null);
          qua.setText(null);
       }
     
      private void getShop()
      {
           try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * from ShopInfo");
            ResultSet rs = ps.executeQuery();
            
                        while (rs.next())
                     {      
                     MedNo.setText(rs.getString(1));
                     MedName.setText(rs.getString(2));
                     }
            }
           catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            } 
      }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        MedNo = new javax.swing.JTextField();
        purid = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        MedName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prate = new javax.swing.JTextField();
        mrp = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        cat = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        ptype = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        gtotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        setTitle("Purchase");
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Purchase Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1910, 815));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Main Informaton", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase No");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 60, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Medical No");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(450, 60, 110, 30);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Purchase Date");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(1300, 60, 120, 30);

        date.setDateFormatString("dd-MMM-yyyy");
        date.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel2.add(date);
        date.setBounds(1440, 60, 290, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Medical Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(860, 60, 140, 30);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Address");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(1270, 130, 140, 30);

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Phone No");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(880, 130, 80, 30);

        jLabel20.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Supplier ID");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 130, 130, 30);

        sid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(sid);
        sid.setBounds(160, 130, 280, 30);

        pno.setEditable(false);
        pno.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(pno);
        pno.setBounds(1000, 130, 280, 30);

        MedNo.setEditable(false);
        MedNo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(MedNo);
        MedNo.setBounds(580, 60, 280, 30);

        purid.setEditable(false);
        purid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(purid);
        purid.setBounds(160, 60, 280, 30);

        jTextField18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(jTextField18);
        jTextField18.setBounds(160, 60, 280, 30);

        MedName.setEditable(false);
        MedName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel2.add(MedName);
        MedName.setBounds(1000, 60, 280, 30);

        add.setEditable(false);
        add.setColumns(20);
        add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add.setRows(5);
        jScrollPane2.setViewportView(add);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(1440, 120, 390, 90);

        jLabel22.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Supplier Name");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(440, 130, 130, 30);

        sname.setEditable(false);
        sname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snameMouseClicked(evt);
            }
        });
        jPanel2.add(sname);
        sname.setBounds(580, 130, 280, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 40, 1860, 240);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Add Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(0, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Product ID");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 40, 130, 30);

        pname.setEditable(false);
        pname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnameMouseClicked(evt);
            }
        });
        jPanel3.add(pname);
        pname.setBounds(190, 80, 260, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Category Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(470, 40, 120, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Current Stock");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(630, 40, 130, 30);

        stock.setEditable(false);
        stock.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel3.add(stock);
        stock.setBounds(640, 80, 160, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Purchase Price");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(820, 40, 120, 30);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MRP Rate");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(1020, 40, 100, 30);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quantity");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(1190, 40, 110, 30);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Price");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(1350, 40, 39, 30);

        prate.setEditable(false);
        prate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        prate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prateKeyTyped(evt);
            }
        });
        jPanel3.add(prate);
        prate.setBounds(810, 80, 210, 30);

        mrp.setEditable(false);
        mrp.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        mrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mrpKeyTyped(evt);
            }
        });
        jPanel3.add(mrp);
        mrp.setBounds(1030, 80, 170, 30);

        pid.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        pid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pidKeyPressed(evt);
            }
        });
        jPanel3.add(pid);
        pid.setBounds(50, 80, 130, 30);

        price.setEditable(false);
        price.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceMouseClicked(evt);
            }
        });
        jPanel3.add(price);
        price.setBounds(1350, 80, 140, 30);

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
        jButton1.setBounds(1500, 80, 90, 30);

        data.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        data.setForeground(java.awt.Color.red);
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Category Name", "Currnrent Quantity", "Quantity", "Purchae Rate", "MRP Rate", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(data);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 1810, 200);

        cat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Tablet", "Strip", "Capsule", "Bottel", "Other" }));
        jPanel3.add(cat);
        cat.setBounds(460, 80, 170, 30);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Product Name");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(180, 40, 150, 30);

        qua.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        qua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quaKeyPressed(evt);
            }
        });
        jPanel3.add(qua);
        qua.setBounds(1210, 80, 130, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 280, 1860, 360);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1480, 660, 110, 40);

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 102));
        total.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        total.setText("0.00");
        jPanel1.add(total);
        total.setBounds(1590, 660, 270, 40);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Grand Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(51, 255, 255))); // NOI18N
        jPanel4.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Payment By");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(580, 90, 120, 30);

        ptype.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH" }));
        jPanel4.add(ptype);
        ptype.setBounds(710, 90, 130, 30);

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Grand Total");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(1390, 20, 170, 50);

        gtotal.setEditable(false);
        gtotal.setBackground(new java.awt.Color(255, 255, 102));
        gtotal.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        gtotal.setText("0.00");
        jPanel4.add(gtotal);
        gtotal.setBounds(1570, 20, 270, 50);

        jLabel21.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Remark");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(880, 90, 80, 30);

        jTextField17.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel4.add(jTextField17);
        jTextField17.setBounds(960, 90, 450, 32);

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
        jButton2.setBounds(1500, 140, 150, 40);

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Cancel");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 4, true));
        jPanel4.add(jButton3);
        jButton3.setBounds(1660, 140, 150, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 710, 1860, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1910, 940);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void prateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prateKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_DECIMAL))) {
        evt.consume();
        }
    }//GEN-LAST:event_prateKeyTyped

    private void mrpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mrpKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE) || (vChar == KeyEvent.VK_DECIMAL))) {
        evt.consume();
        }
    }//GEN-LAST:event_mrpKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try 
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into PurchaseProduct(PurchaseNo,ProductName,Category,Quantity,PurchaseRate,MRPRate,Amount) values (?,?,?,?,?,?,?)");
            int i=Integer.parseInt(purid.getText());
            ps.setInt(1,i);
            ps.setString(2,pname.getText());
            ps.setString(3,(String) cat.getSelectedItem());
            int j=Integer.parseInt(pid.getText());
            ps.setInt(4,j);
            Double p = Double.parseDouble(prate.getText());
            ps.setDouble(5,p);
            Double m = Double.parseDouble(mrp.getText());
            ps.setDouble(6,m);
            Double pr = Double.parseDouble(price.getText());
            ps.setDouble(7,pr);
            int a=ps.executeUpdate();
            }
            catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            } 
         
        String s = price.getText();
        Double a = Double.parseDouble(s);
        Double a2 = Double.parseDouble(total.getText()) + a;
        total.setText(Double.toString(a2));            
        gtotal.setText(Double.toString(a2)); 

        DefaultTableModel model = (DefaultTableModel)data.getModel();
        model.addRow(new Object[] {pname.getText() , cat.getSelectedItem() , stock.getText() , qua.getText(), prate.getText(),mrp.getText(), price.getText()});   
        
        try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement pst = con.prepareStatement("UPDATE ProductStock SET Quantity=? where ProductID=?");
            int r=Integer.parseInt(pid.getText());
            pst.setInt(2,r);
            int i=Integer.parseInt(stock.getText());
            int j=Integer.parseInt(qua.getText());
            int k= i+j;
            pst.setInt(1,k);
            pst.executeUpdate();  
             }
            catch(ClassNotFoundException | SQLException e)
             {
             JOptionPane.showMessageDialog(null,e);        
             }  
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String date1 = ((JTextField) date.getDateEditor().getUiComponent()).getText(); 
          try 
             {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("Insert into PurchaseMaster(PurchaseNo,SupplierName,PhoneNo,Address,PurchaseDate,PaymentType,Total_Amt) values(?,?,?,?,?,?,?)");
            ps.setString(1,purid.getText());
            ps.setString(2,sname.getText());
            int no = Integer.parseInt(pno.getText());
            ps.setInt(3, no);
            ps.setString(4,add.getText());
            ps.setString(5,date1);
            ps.setString(6,(String) ptype.getSelectedItem());
            Double amt1 = Double.parseDouble(gtotal.getText());
            ps.setDouble(7,amt1);
            int response =  JOptionPane.showConfirmDialog(this, "Are you sure to Save the Data ?","Confirm", JOptionPane.YES_NO_OPTION);
            if(response ==  JOptionPane.YES_OPTION)
            {  
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data is Saved");
            }
             
             }
         catch(ClassNotFoundException | SQLException e)
           {
                JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceMouseClicked
            Double q = Double.parseDouble(qua.getText());
            Double dis = Double.parseDouble(prate.getText());
            Double a1 = q*(dis);
            price.setText(Double.toString(a1));   
    }//GEN-LAST:event_priceMouseClicked

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
                    mrp.setText(rs.getString(9));
                    prate.setText(rs.getString(8));
                }  
             }
                catch(ClassNotFoundException | SQLException e)
             {
             JOptionPane.showMessageDialog(null,e);        
             }   
    }//GEN-LAST:event_pnameMouseClicked

    private void snameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snameMouseClicked
        try
            {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://MedicalStore.accdb");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM SupplierMaster WHERE  SupplierID =?");
            String s1 = sid.getText();
            ps.setString(1, s1);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                sname.setText(rs.getString(2));
                pno.setText(rs.getString(6));
                add.setText(rs.getString(7));
            }
            }
           catch(ClassNotFoundException | SQLException e)
            {
             JOptionPane.showMessageDialog(null,e);
            } 
    }//GEN-LAST:event_snameMouseClicked

    private void pidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyPressed
     String age=pid.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  pid.setEditable(true);
              }else{
                  pid.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 pid.setEditable(true);
              }else{
                  pid.setEditable(false);
              } }
    }//GEN-LAST:event_pidKeyPressed

    private void quaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quaKeyPressed
       String age=qua.getText();
          int l = age.length();
          char c =evt.getKeyChar();
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
              if(l<2) {
                  qua.setEditable(true);
              }else{
                  qua.setEditable(false);
              }
          }
          else{
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                 qua.setEditable(true);
              }else{
                  qua.setEditable(false);
              } }
    }//GEN-LAST:event_quaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MedName;
    private javax.swing.JTextField MedNo;
    private javax.swing.JTextArea add;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JTable data;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField gtotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField mrp;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField prate;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> ptype;
    private javax.swing.JTextField purid;
    private javax.swing.JTextField qua;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
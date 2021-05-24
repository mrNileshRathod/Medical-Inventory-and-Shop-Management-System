public class FristPage extends javax.swing.JFrame {

    public FristPage() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medical Shop Management \n\n");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(1900, 800));
        getContentPane().setLayout(null);

        d.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(d);
        d.setBounds(0, 0, 1920, 1020);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.red, 4, true));
        jMenuBar2.setForeground(java.awt.Color.red);
        jMenuBar2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(182, 30));

        jMenu3.setText("Masters");
        jMenu3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setIconTextGap(10);
        jMenu3.setMinimumSize(new java.awt.Dimension(40, 30));
        jMenu3.setPreferredSize(new java.awt.Dimension(80, 30));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem1.setText("Product Master");
        jMenuItem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem1.setIconTextGap(10);
        jMenuItem1.setPreferredSize(new java.awt.Dimension(300, 25));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem2.setText("Customer Master");
        jMenuItem2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem2.setIconTextGap(10);
        jMenuItem2.setPreferredSize(new java.awt.Dimension(250, 25));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem3.setText("Supplier Master");
        jMenuItem3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem3.setIconTextGap(10);
        jMenuItem3.setPreferredSize(new java.awt.Dimension(250, 25));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem6.setText("Employee Master");
        jMenuItem6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem6.setIconTextGap(10);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Transaction");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setIconTextGap(10);
        jMenu4.setMinimumSize(new java.awt.Dimension(40, 30));
        jMenu4.setPreferredSize(new java.awt.Dimension(101, 30));

        jMenuItem11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem11.setText("Purchase");
        jMenuItem11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem11.setIconTextGap(10);
        jMenuItem11.setPreferredSize(new java.awt.Dimension(250, 25));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem12.setText("Sale");
        jMenuItem12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuItem12.setIconTextGap(10);
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar2.add(jMenu4);

        jMenu6.setText("Exit");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu6.setIconTextGap(10);
        jMenu6.setPreferredSize(new java.awt.Dimension(60, 24));

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenuItem5.setText("Close");
        jMenuItem5.setIconTextGap(20);
        jMenuItem5.setPreferredSize(new java.awt.Dimension(200, 24));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.d.removeAll();
       this.d.repaint();
       Product p = new Product();
       this.d.add(p);
       p.setVisible(true);
       p.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.d.removeAll();
        this.d.repaint();
        Purchase1 p = new Purchase1();
        this.d.add(p);
        p.setVisible(true);
        p.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.d.removeAll();
         this.d.repaint();
         Costomer_Info ci =new Costomer_Info();
         this.d.add(ci);
         ci.setVisible(true);
         ci.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         this.d.removeAll();
         this.d.repaint();
         Supplier_Master sm = new Supplier_Master();
         this.d.add(sm);
         sm.setVisible(true);
         sm.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         this.d.removeAll();
         this.d.repaint();
         EmployeeMaster em =new EmployeeMaster();
         this.d.add(em);
         em.setVisible(true);
         em.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         this.d.removeAll();
         this.d.repaint();
         Sale1 s =new Sale1();
         this.d.add(s);
         s.setVisible(true);
         s.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FristPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane d;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}

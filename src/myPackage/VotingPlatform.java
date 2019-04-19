/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Joy
 */
public class VotingPlatform extends javax.swing.JFrame {

   Connection conn = null;
    Statement stm = null;
    ResultSet rst = null;
    PreparedStatement pst = null;
    
    public VotingPlatform() {
        initComponents();
     fillCombo();
    }
    public void fillCombo(){
       
          connectAdmin konny = new connectAdmin();
          conn = konny.Connectdb(); 
          
          String a = (String) PRESIDENT.getSelectedItem();
           String b = (String) V_PRESIDENT.getSelectedItem();
            String c = (String) TREASURE.getSelectedItem();
             String d = (String) PUB_SEC.getSelectedItem();
              String e = (String) ORG_SEC.getSelectedItem();
               String f = (String) SECRETARY.getSelectedItem();
          
       
          
          
          
          
//            String sql = "Select * from candidate ";
//             try{
//                 pst= conn.prepareStatement(sql);   
//                 rst = pst.executeQuery();
//                 while(rst.next()){ 
//                        String a = rst.getString("fname");
//                        String b = rst.getString("sname");
//                         jComboBox1.addItem(a +" "+ b);
//                         jComboBox2.addItem(a +" "+ b);
//                         jComboBox3.addItem(a +" "+ b);
//                         jComboBox4.addItem(a +" "+ b);
//                         jComboBox5.addItem(a +" "+ b);
//                         jComboBox6.addItem(a +" "+ b);
//                 }
//                }
//             catch(Exception ex){
//                  JOptionPane.showMessageDialog(this, ex.getMessage());
//                
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PRESIDENT = new javax.swing.JComboBox();
        V_PRESIDENT = new javax.swing.JComboBox();
        TREASURE = new javax.swing.JComboBox();
        PUB_SEC = new javax.swing.JComboBox();
        ORG_SEC = new javax.swing.JComboBox();
        SECRETARY = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "WELCOME TO K.O.V.S!!!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Bell MT", 1, 36), new java.awt.Color(0, 47, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("President");

        jLabel2.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Vice President");

        jLabel3.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Treasure");

        jLabel4.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Public Secretary");

        jLabel5.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Organizing Secretary");

        jLabel6.setFont(new java.awt.Font("Bodoni MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Secretary");

        PRESIDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PRESIDENTMouseEntered(evt);
            }
        });

        V_PRESIDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                V_PRESIDENTMouseEntered(evt);
            }
        });

        TREASURE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TREASUREMouseEntered(evt);
            }
        });

        PUB_SEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PUB_SECMouseEntered(evt);
            }
        });

        ORG_SEC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ORG_SECMouseEntered(evt);
            }
        });

        SECRETARY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SECRETARYMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PRESIDENT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(V_PRESIDENT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TREASURE, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(PUB_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ORG_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(SECRETARY, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ORG_SEC, PRESIDENT, PUB_SEC, SECRETARY, TREASURE, V_PRESIDENT});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRESIDENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V_PRESIDENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ORG_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TREASURE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PUB_SEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SECRETARY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ORG_SEC, PRESIDENT, PUB_SEC, SECRETARY, TREASURE, V_PRESIDENT});

        jTabbedPane1.addTab("tab1", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("tab2", jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PRESIDENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRESIDENTMouseEntered
        PRESIDENT.showPopup();
        connectAdmin konny = new connectAdmin();
          conn = konny.Connectdb();    
        String sql = "Select * from candidate where position ='President' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                        PRESIDENT.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_PRESIDENTMouseEntered

    private void V_PRESIDENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_PRESIDENTMouseEntered
            connectAdmin konny = new connectAdmin();
          conn = konny.Connectdb(); 
        String sql = "Select * from candidate where position ='Vice President' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                        V_PRESIDENT.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_V_PRESIDENTMouseEntered

    private void TREASUREMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TREASUREMouseEntered
            connectAdmin konny = new connectAdmin();
          conn = konny.Connectdb(); 
          String sql = "Select * from candidate where position ='Treasure' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                       TREASURE.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_TREASUREMouseEntered

    private void PUB_SECMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PUB_SECMouseEntered
            connectAdmin konny = new connectAdmin();
          conn = konny.Connectdb(); 
          String sql = "Select * from candidate where position ='Public Secretary' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                       PUB_SEC.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_PUB_SECMouseEntered

    private void ORG_SECMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORG_SECMouseEntered
         String sql = "Select * from candidate where position ='Organizing Secretary' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                        ORG_SEC.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_ORG_SECMouseEntered

    private void SECRETARYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SECRETARYMouseEntered
        
              String sql = "Select * from candidate where position ='Secretary' ";
              try{
                 pst= conn.prepareStatement(sql);   
                 rst = pst.executeQuery();
                 while(rst.next()){ 
                        String a = rst.getString("fname");
                        String b = rst.getString("sname");
                       SECRETARY.addItem(a +" "+ b);}}
             catch(Exception ex){
                  JOptionPane.showMessageDialog(this, ex.getMessage());}
    }//GEN-LAST:event_SECRETARYMouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VotingPlatform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotingPlatform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotingPlatform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotingPlatform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingPlatform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ORG_SEC;
    private javax.swing.JComboBox PRESIDENT;
    private javax.swing.JComboBox PUB_SEC;
    private javax.swing.JComboBox SECRETARY;
    private javax.swing.JComboBox TREASURE;
    private javax.swing.JComboBox V_PRESIDENT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

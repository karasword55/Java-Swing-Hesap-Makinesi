
package com.samsun.odev10;

import javax.swing.JOptionPane;


public class frmMain extends javax.swing.JFrame {

   
    double birincisayi,ikincisayi,sonuc;
    public frmMain() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtbirincisayi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtikincisayi = new javax.swing.JTextField();
        btncikar = new javax.swing.JButton();
        btntopla = new javax.swing.JButton();
        btncarp = new javax.swing.JButton();
        btnbol = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtsonuc = new javax.swing.JTextField();
        btntemizle = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("1.SAYIYI GİRİNİZ:");

        jLabel2.setText("2.SAYIYI GİRİNİZ:");

        btncikar.setText("ÇIKAR");
        btncikar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncikarMouseClicked(evt);
            }
        });

        btntopla.setText("TOPLA");
        btntopla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntoplaMouseClicked(evt);
            }
        });

        btncarp.setText("ÇARP");
        btncarp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncarpMouseClicked(evt);
            }
        });

        btnbol.setText("BÖL");
        btnbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbolMouseClicked(evt);
            }
        });

        jLabel3.setText("SONUÇ:");

        txtsonuc.setEditable(false);

        btntemizle.setText("TEMİZLE");
        btntemizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntemizleMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("HESAP MAKİNESİ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtbirincisayi, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtikincisayi)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntopla, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btncikar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btncarp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnbol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(btntemizle))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbirincisayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtikincisayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncikar)
                    .addComponent(btncarp)
                    .addComponent(btntopla)
                    .addComponent(btnbol))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntemizle))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntoplaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntoplaMouseClicked
        
        if(txtbirincisayi==null || txtikincisayi==null){
            JOptionPane.showMessageDialog(this, "1.sayı veya 2.sayı boş geçilemez!");
        }else{
            birincisayi=Double.parseDouble(txtbirincisayi.getText().toString());
            ikincisayi=Double.parseDouble(txtikincisayi.getText().toString());
            sonuc=birincisayi+ikincisayi;
            txtsonuc.setText(sonuc+"");
        }
        
        
    }//GEN-LAST:event_btntoplaMouseClicked

    private void btncikarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncikarMouseClicked
        if(txtbirincisayi==null || txtikincisayi==null){
            JOptionPane.showMessageDialog(this, "1.sayı veya 2.sayı boş geçilemez!");
        }else{
            birincisayi=Double.parseDouble(txtbirincisayi.getText().toString());
            ikincisayi=Double.parseDouble(txtikincisayi.getText().toString());
            sonuc=birincisayi-ikincisayi;
            txtsonuc.setText(sonuc+"");
        }
    }//GEN-LAST:event_btncikarMouseClicked

    private void btncarpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncarpMouseClicked
       if(txtbirincisayi==null || txtikincisayi==null){
            JOptionPane.showMessageDialog(this, "1.sayı veya 2.sayı boş geçilemez!");
        }else{
            birincisayi=Double.parseDouble(txtbirincisayi.getText().toString());
            ikincisayi=Double.parseDouble(txtikincisayi.getText().toString());
            sonuc=birincisayi*ikincisayi;
            txtsonuc.setText(sonuc+"");
        }
    }//GEN-LAST:event_btncarpMouseClicked

    private void btnbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbolMouseClicked
       if(txtbirincisayi==null || txtikincisayi==null){
            JOptionPane.showMessageDialog(this, "1.sayı veya 2.sayı boş geçilemez!");
        }else{
            birincisayi=Double.parseDouble(txtbirincisayi.getText().toString());
            ikincisayi=Double.parseDouble(txtikincisayi.getText().toString());
            if(ikincisayi==0){
                JOptionPane.showMessageDialog(this, "ikinci sayı 0 olamaz.DİKKAT!");
            }else{
                sonuc=birincisayi+ikincisayi;
            txtsonuc.setText(sonuc+"");
            }
            
        }
    }//GEN-LAST:event_btnbolMouseClicked

    private void btntemizleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntemizleMouseClicked
        txtbirincisayi.setText("");
        txtikincisayi.setText("");
        txtsonuc.setText("");
    }//GEN-LAST:event_btntemizleMouseClicked

    
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbol;
    private javax.swing.JButton btncarp;
    private javax.swing.JButton btncikar;
    private javax.swing.JButton btntemizle;
    private javax.swing.JButton btntopla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtbirincisayi;
    private javax.swing.JTextField txtikincisayi;
    private javax.swing.JTextField txtsonuc;
    // End of variables declaration//GEN-END:variables
}

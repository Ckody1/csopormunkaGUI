/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csoportmunka_0330;

import java.util.Random;

/**
 *
 * @author Ckody
 */
public class csoportmunka extends javax.swing.JFrame {

    /**
     * Creates new form csoportmunka
     */
    public csoportmunka() {
        initComponents();
    }
    Random rnd = new Random();
    int feladatSorszam = 0;
    int kerdesekSzama = 1;
    int probakSzama = 1;
    int szam1 = 0;
    int szam2 = 0;
    int eredmeny = 0;
    boolean megoldasE = false;
    String feladatKiiras = "Feladat: ";
    String feladatMegoldasa = "Feladat megoldása: ";
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnMegoldas = new javax.swing.JButton();
        lbKerdesekszama = new javax.swing.JLabel();
        btnUjFeladat = new javax.swing.JButton();
        lbFeladatMegoldasa = new javax.swing.JLabel();
        lbProbakSzama = new javax.swing.JLabel();
        lbJoVNem = new javax.swing.JLabel();
        lbFeladat = new javax.swing.JLabel();
        btnUjra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEredmeny.setMinimumSize(new java.awt.Dimension(54, 20));
        txtEredmeny.setName(""); // NOI18N

        jLabel1.setText("Válaszod:");

        btnMegoldas.setText("Megoldás");
        btnMegoldas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        lbKerdesekszama.setText("Kérdések száma: ");

        btnUjFeladat.setText("Új Feladat");
        btnUjFeladat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUjFeladat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjFeladatActionPerformed(evt);
            }
        });

        lbFeladatMegoldasa.setText("Feladat megoldása:");

        lbProbakSzama.setText("Próbálkozások száma:");

        lbJoVNem.setText("jó v nem");

        lbFeladat.setText("Feladat: ");

        btnUjra.setText("Újra");
        btnUjra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUjra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjraActionPerformed(evt);
            }
        });

        jLabel6.setText("alapműveletek:");

        jLabel7.setText("Százalékos eredmény:");

        jMenu1.setText("Feladatok");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Összeadás");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Kivonás");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Szorzás");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Osztás");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbKerdesekszama)
                            .addComponent(lbProbakSzama))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMegoldas)
                                .addGap(18, 18, 18)
                                .addComponent(lbFeladatMegoldasa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbJoVNem)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUjra)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnUjFeladat)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbFeladat)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbKerdesekszama)
                        .addGap(18, 18, 18)
                        .addComponent(lbProbakSzama)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegoldas)
                    .addComponent(lbFeladatMegoldasa))
                .addGap(15, 15, 15)
                .addComponent(lbJoVNem)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUjra)
                    .addComponent(btnUjFeladat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        osztas();
        kerdesekSzama = 1;
        lbKerdesekszama.setText("Kérdések száma: " + kerdesekSzama);
        lbProbakSzama.setText("Próbálkozások száma: " + probakSzama);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUjFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjFeladatActionPerformed
        if(feladatSorszam == 1){
            osszeadas();
        }
        if(feladatSorszam == 2){
            kivonas();
        }
        if(feladatSorszam == 3){
            szorzas();
        }
        if(feladatSorszam == 4){
            osztas();
        }
        if(feladatSorszam != 0){
            kerdesekSzama ++;
            lbKerdesekszama.setText("Kérdések száma: " + kerdesekSzama);
            probakSzama = 1;
            lbProbakSzama.setText("Próbálkozások száma: " + probakSzama);
            lbFeladatMegoldasa.setText("Feladat megoldása: ");
            btnMegoldas.setEnabled(true);
        }
        vegEredmeny();
    }//GEN-LAST:event_btnUjFeladatActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed
        megoldasE = true;
        vegEredmeny();
    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void btnUjraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjraActionPerformed
        probakSzama ++;
        lbProbakSzama.setText("Próbálkozások száma: " + probakSzama);
        btnMegoldas.setEnabled(true);
        txtEredmeny.setText("");
        vegEredmeny();
    }//GEN-LAST:event_btnUjraActionPerformed

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
            java.util.logging.Logger.getLogger(csoportmunka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(csoportmunka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(csoportmunka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(csoportmunka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new csoportmunka().setVisible(true);
            }
        });
    }
    private void osszeadas(){
        
    }
    private void osztas(){
        eredmeny = 0;
        feladatSorszam = 4;
        feladatKiiras = "Feladat: ";
        szam2 = rnd.nextInt(98)+2;
        boolean oszthato = false;
        while(!oszthato){
            szam1 = rnd.nextInt(99)+1;
            for (int i = 2; i < 100; i++) {
               if(szam1 % i == 0){
                   oszthato = true;
               }
            } 
        }
        while(!(szam1 % szam2 == 0)){
            szam2 = rnd.nextInt(98)+2;
        }
        feladatKiiras += szam1 + " % " + szam2;
        eredmeny = Math.round(szam1 / szam2);
        lbFeladat.setText(feladatKiiras);
        vegEredmeny();
    }
    private void szorzas(){
    
        
    } 
    private void kivonas(){
    
        
    }
    private void vegEredmeny(){
        int valasz = Integer.parseInt(txtEredmeny.getText());
        if(feladatSorszam != 0){
            if(!megoldasE){
                lbFeladatMegoldasa.setText("Feladat megoldása: ");
            }
            else if(valasz == eredmeny){
                lbFeladatMegoldasa.setText("Feladat megoldása: " + eredmeny);
                lbJoVNem.setText("A megoldásod jó lett! :)");
                btnMegoldas.setEnabled(false);
            }
            else{
                lbFeladatMegoldasa.setText("Feladat megoldása: ");
                lbJoVNem.setText("A megoldásod nem jó!");
                btnMegoldas.setEnabled(false);
            } 
        }
        megoldasE = false;
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUjFeladat;
    private javax.swing.JButton btnUjra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lbFeladat;
    private javax.swing.JLabel lbFeladatMegoldasa;
    private javax.swing.JLabel lbJoVNem;
    private javax.swing.JLabel lbKerdesekszama;
    private javax.swing.JLabel lbProbakSzama;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables
}

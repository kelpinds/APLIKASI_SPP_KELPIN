/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORM;

import javax.swing.JOptionPane;
import koneksi.Petugas;

/**
 *
 * @author LAB 1-17
 */
public class Aplikasi_spp_petugas extends javax.swing.JFrame {

    /**
     * Creates new form Aplikasi_spp
     */
    public Aplikasi_spp_petugas() {
        initComponents();
       user.setText(Petugas.getUsername().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        user = new javax.swing.JMenu();
        Spp = new javax.swing.JMenu();
        petugas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI SPP Petugas");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(90, 100, 270, 50);

        menuBar.add(user);

        Spp.setText("Lihat history pembayaran");
        Spp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SppMouseClicked(evt);
            }
        });
        menuBar.add(Spp);

        petugas.setText("Entri transaksi pembayaran");
        petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petugasMouseClicked(evt);
            }
        });
        menuBar.add(petugas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void petugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petugasMouseClicked
        // TODO add your handling code here:
        petugas pg = new petugas();
        
        desktopPane.add(pg);
        
        pg.setVisible(true);
    }//GEN-LAST:event_petugasMouseClicked

    private void SppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SppMouseClicked
        // TODO add your handling code here:
        spp pp = new spp();
        
        desktopPane.add(pp);
        
        pp.setVisible(true);
    }//GEN-LAST:event_SppMouseClicked

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
            java.util.logging.Logger.getLogger(Aplikasi_spp_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_spp_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_spp_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_spp_petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi_spp_petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Spp;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu petugas;
    private javax.swing.JMenu user;
    // End of variables declaration//GEN-END:variables

}

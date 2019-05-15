/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalgebra;

/**
 *
 * @author Administrador
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInversa = new javax.swing.JButton();
        jButtonGauss = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonAdjunta = new javax.swing.JButton();
        jButtonDeterminante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInversa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonInversa.setText("Matriz Inversa");
        jButtonInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInversaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 50));

        jButtonGauss.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonGauss.setText("Gauss Jordan");
        jButtonGauss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaussActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGauss, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 220, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Seleccione el método que desea usar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 530, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel3.setText("¡Bienvenido!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 460, 60));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jButtonAdjunta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonAdjunta.setText("Adjunta");
        jButtonAdjunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdjuntaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdjunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 220, 50));

        jButtonDeterminante.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonDeterminante.setText("Determinante");
        jButtonDeterminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeterminanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeterminante, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fonfomate.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 430));

        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGaussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGaussActionPerformed
        // TODO add your handling code here:
        Gauss a= new Gauss();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonGaussActionPerformed

    private void jButtonInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInversaActionPerformed
        // TODO add your handling code here:
        Inversa a= new Inversa();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonInversaActionPerformed

    private void jButtonDeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeterminanteActionPerformed
        // TODO add your handling code here:
        VistaDeterminante a= new VistaDeterminante();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDeterminanteActionPerformed

    private void jButtonAdjuntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdjuntaActionPerformed
        // TODO add your handling code here:
        VistaAdjunta a= new VistaAdjunta();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAdjuntaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdjunta;
    private javax.swing.JButton jButtonDeterminante;
    private javax.swing.JButton jButtonGauss;
    private javax.swing.JButton jButtonInversa;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
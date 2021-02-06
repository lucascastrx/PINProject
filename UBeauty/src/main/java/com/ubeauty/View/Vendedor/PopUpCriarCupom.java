package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Controller.Vendedor.CupomVendedorController;
import javax.swing.JTextField;

public class PopUpCriarCupom extends javax.swing.JFrame {

    private CupomVendedorController controller;

    public PopUpCriarCupom() {
        initComponents();
        UtilController.configurarTela(this);
    }

    public PopUpCriarCupom(CupomVendedorController controller) {
        initComponents();
        this.controller = controller;
        UtilController.configurarTela(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCriar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDesconto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 0));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCriar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCriar.setForeground(new java.awt.Color(255, 255, 255));
        btnCriar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCriar.setText("Criar");
        btnCriar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCriarMousePressed(evt);
            }
        });
        getContentPane().add(btnCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, 50));

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 153, 153));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 50));

        tfNome.setBackground(new java.awt.Color(0,0,0,1));
        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNome.setToolTipText("");
        tfNome.setBorder(null);
        tfNome.setOpaque(false);
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        tfDesconto.setBackground(new java.awt.Color(0,0,0,1));
        tfDesconto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDesconto.setText("0"); // NOI18N
        tfDesconto.setToolTipText("");
        tfDesconto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfDesconto.setOpaque(false);
        getContentPane().add(tfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 40, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Criar cupom");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setText("%");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Cupom");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Desconto");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMousePressed
        controller.criarCupom();
    }//GEN-LAST:event_btnCriarMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

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
            java.util.logging.Logger.getLogger(PopUpCriarCupom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarCupom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarCupom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarCupom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpCriarCupom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnCriar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfDesconto;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfDesconto() {
        return tfDesconto;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    

}

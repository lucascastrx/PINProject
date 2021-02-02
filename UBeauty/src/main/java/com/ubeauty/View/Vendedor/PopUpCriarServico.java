package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Controller.Vendedor.ServicoVendedorController;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class PopUpCriarServico extends javax.swing.JFrame {
    
    private ServicoVendedorController controller;

    public PopUpCriarServico(ServicoVendedorController controller) {
        initComponents();
        UtilController.configurarTela(this);
        
        this.controller = controller;
        controller.setPopUp(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalvarMousePressed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 110, 50));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 50));

        tfNome.setBackground(new java.awt.Color(0,0,0,1));
        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNome.setToolTipText("");
        tfNome.setBorder(null);
        tfNome.setOpaque(false);
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        tfPreco.setBackground(new java.awt.Color(0,0,0,1));
        tfPreco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPreco.setText("00.00"); // NOI18N
        tfPreco.setToolTipText("");
        tfPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfPreco.setOpaque(false);
        tfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Criar Serviço");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setText("R$");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Nome");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Preço");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        tfDescricao.setBackground(new java.awt.Color(0,0,0,1));
        tfDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDescricao.setToolTipText("");
        tfDescricao.setBorder(null);
        tfDescricao.setOpaque(false);
        getContentPane().add(tfDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("Descrição");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 40));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setText("Categoria");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        tfCategoria.setBackground(new java.awt.Color(0,0,0,1));
        tfCategoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCategoria.setToolTipText("");
        tfCategoria.setBorder(null);
        tfCategoria.setOpaque(false);
        getContentPane().add(tfCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMousePressed
        controller.salvarNovoServico();
    }//GEN-LAST:event_btnSalvarMousePressed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void tfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpCriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpCriarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PopUpCriarServico().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfCategoria() {
        return tfCategoria;
    }

    public JTextField getTfDescricao() {
        return tfDescricao;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfPreco() {
        return tfPreco;
    }

    

}

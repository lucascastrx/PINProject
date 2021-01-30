package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.UtilController;
import javax.swing.ImageIcon;

public class PopUpAgendamentoVendedor extends javax.swing.JFrame {

    public PopUpAgendamentoVendedor() {
        initComponents();
        UtilController.configurarTela(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtServico = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtv = new javax.swing.JLabel();
        txtPagamento = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        tfMes = new javax.swing.JTextField();
        txtPagamento2 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        tfMinuto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPagamento3 = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 540));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlterar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterar.setText("Alterar");
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlterarMousePressed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 110, 50));

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(153, 153, 153));
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVoltarMousePressed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 130, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Agendamento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("Cliente");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, 30));

        txtCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(58, 22, 46));
        txtCliente.setText("*nome*");
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(58, 22, 46));
        jLabel24.setText("Serviço:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 30));

        txtServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtServico.setForeground(new java.awt.Color(58, 22, 46));
        txtServico.setText("*serviço*");
        getContentPane().add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setText("Hora:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(58, 22, 46));
        jLabel20.setText("Preço:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 30));

        txtPreco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(58, 22, 46));
        txtPreco.setText("R$00,00");
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 280, 30));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(58, 22, 46));
        jLabel25.setText("Forma de Pagamento:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, 30));

        txtv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtv.setForeground(new java.awt.Color(58, 22, 46));
        txtv.setText("/");
        getContentPane().add(txtv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 10, 40));

        txtPagamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPagamento.setForeground(new java.awt.Color(58, 22, 46));
        txtPagamento.setText("Aplicativo (pago)");
        getContentPane().add(txtPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 280, 30));

        tfDia.setBackground(new java.awt.Color(0,0,0,1));
        tfDia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDia.setText("00"); // NOI18N
        tfDia.setToolTipText("");
        tfDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfDia.setOpaque(false);
        tfDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaActionPerformed(evt);
            }
        });
        getContentPane().add(tfDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 30, 40));

        tfMes.setBackground(new java.awt.Color(0,0,0,1));
        tfMes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMes.setText("00"); // NOI18N
        tfMes.setToolTipText("");
        tfMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfMes.setOpaque(false);
        tfMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMesActionPerformed(evt);
            }
        });
        getContentPane().add(tfMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 30, 40));

        txtPagamento2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPagamento2.setForeground(new java.awt.Color(58, 22, 46));
        txtPagamento2.setText(":");
        getContentPane().add(txtPagamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 10, 40));

        tfAno.setBackground(new java.awt.Color(0,0,0,1));
        tfAno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAno.setText("2021"); // NOI18N
        tfAno.setToolTipText("");
        tfAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfAno.setOpaque(false);
        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });
        getContentPane().add(tfAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 40, 40));

        tfMinuto.setBackground(new java.awt.Color(0,0,0,1));
        tfMinuto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfMinuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMinuto.setText("00"); // NOI18N
        tfMinuto.setToolTipText("");
        tfMinuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfMinuto.setOpaque(false);
        tfMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMinutoActionPerformed(evt);
            }
        });
        getContentPane().add(tfMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 40, 40));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(58, 22, 46));
        jLabel22.setText("Data:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, 30));

        txtPagamento3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPagamento3.setForeground(new java.awt.Color(58, 22, 46));
        txtPagamento3.setText("/");
        getContentPane().add(txtPagamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 10, 40));

        tfHora.setBackground(new java.awt.Color(0,0,0,1));
        tfHora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHora.setText("00"); // NOI18N
        tfHora.setToolTipText("");
        tfHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfHora.setOpaque(false);
        tfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraActionPerformed(evt);
            }
        });
        getContentPane().add(tfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 40, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMousePressed
        System.out.println("ok");
    }//GEN-LAST:event_btnAlterarMousePressed

    private void btnVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarMousePressed

    private void tfDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaActionPerformed

    private void tfMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMesActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void tfMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMinutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMinutoActionPerformed

    private void tfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpAgendamentoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendamentoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendamentoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendamentoVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpAgendamentoVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlterar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfMinuto;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtPagamento;
    private javax.swing.JLabel txtPagamento2;
    private javax.swing.JLabel txtPagamento3;
    private javax.swing.JLabel txtPreco;
    private javax.swing.JLabel txtServico;
    private javax.swing.JLabel txtv;
    // End of variables declaration//GEN-END:variables
}

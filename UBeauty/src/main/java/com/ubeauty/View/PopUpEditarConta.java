package com.ubeauty.View;

import com.ubeauty.Controller.ContaController;
import com.ubeauty.Controller.UtilController;
import javax.swing.JTextField;

public class PopUpEditarConta extends javax.swing.JFrame {

    ContaController controller;

    public PopUpEditarConta(ContaController controller) {
        initComponents();
        UtilController.configurarTela(this);

        this.controller = controller;
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        imgRua = new javax.swing.JLabel();
        imgCnpj2 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        imgCnpj3 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        imgCnpj4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        imgNomeProf1 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfDDD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 0));
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
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 50));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 50));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-tel.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 20, 20));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(58, 22, 46));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-endereco.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 20, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Número");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 40));

        tfNumero.setBackground(new java.awt.Color(0,0,0,1));
        tfNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNumero.setText("Digite o número"); // NOI18N
        tfNumero.setToolTipText("");
        tfNumero.setBorder(null);
        tfNumero.setOpaque(false);
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 180, 40));

        tfRua.setBackground(new java.awt.Color(0,0,0,1));
        tfRua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfRua.setText("Rua"); // NOI18N
        tfRua.setToolTipText("");
        tfRua.setBorder(null);
        tfRua.setOpaque(false);
        getContentPane().add(tfRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, 40));

        imgRua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 40));

        imgCnpj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 40));

        tfCidade.setBackground(new java.awt.Color(0,0,0,1));
        tfCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCidade.setText("Cidade"); // NOI18N
        tfCidade.setToolTipText("");
        tfCidade.setBorder(null);
        tfCidade.setOpaque(false);
        getContentPane().add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 40));

        imgCnpj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 40));

        tfEstado.setBackground(new java.awt.Color(0,0,0,1));
        tfEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEstado.setText("Estado"); // NOI18N
        tfEstado.setToolTipText("");
        tfEstado.setBorder(null);
        tfEstado.setOpaque(false);
        getContentPane().add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 40));

        imgCnpj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Editar informações");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setText("Telefone");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Endereço");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        tfSenha.setText("dwadw");
        tfSenha.setToolTipText("");
        tfSenha.setBorder(null);
        getContentPane().add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 20));

        imgNomeProf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgNomeProf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 40));

        tfTelefone.setBackground(new java.awt.Color(0,0,0,1));
        tfTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelefone.setText("Telefone"); // NOI18N
        tfTelefone.setToolTipText("");
        tfTelefone.setBorder(null);
        tfTelefone.setOpaque(false);
        getContentPane().add(tfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 40));

        tfDDD.setBackground(new java.awt.Color(0,0,0,1));
        tfDDD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDDD.setText("DDD"); // NOI18N
        tfDDD.setToolTipText("");
        tfDDD.setBorder(null);
        tfDDD.setOpaque(false);
        getContentPane().add(tfDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("|");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMousePressed
        controller.salvarDados();
    }//GEN-LAST:event_btnSalvarMousePressed

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
            java.util.logging.Logger.getLogger(PopUpEditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpEditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpEditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpEditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PopUpEditarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JLabel imgCnpj2;
    private javax.swing.JLabel imgCnpj3;
    private javax.swing.JLabel imgCnpj4;
    private javax.swing.JLabel imgNomeProf1;
    private javax.swing.JLabel imgRua;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfDDD;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public JTextField getTfEstado() {
        return tfEstado;
    }

    public JTextField getTfSenha() {
        return tfSenha;
    }

    public JTextField getTfNumero() {
        return tfNumero;
    }

    public JTextField getTfRua() {
        return tfRua;
    }

    public JTextField getTfDDD() {
        return tfDDD;
    }

    public JTextField getTfTelefone() {
        return tfTelefone;
    }

}

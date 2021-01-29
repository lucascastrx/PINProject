package com.ubeauty.View;

import com.ubeauty.Controller.PanelContaConvidadoController;

public class PanelContaConvidado extends javax.swing.JPanel {
    
    PanelContaConvidadoController controller;
    TelaPrincipal tp;

    public PanelContaConvidado(TelaPrincipal tp) {
        initComponents();      
        controller = new PanelContaConvidadoController(this, tp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCriarConta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 10));

        btnCriarConta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCriarConta.setText("Criar conta");
        btnCriarConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCriarContaMousePressed(evt);
            }
        });
        add(btnCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 110, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 22, 46));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Crie uma conta agora!");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 180, 30));

        btnLogin.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(58, 22, 46));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("ou faça login >>");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 22, 46));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("____________");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 180, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarContaMousePressed
        controller.criarConta();
    }//GEN-LAST:event_btnCriarContaMousePressed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        controller.login();
    }//GEN-LAST:event_btnLoginMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCriarConta;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

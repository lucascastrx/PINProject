/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

import com.ubeauty.Controller.ContaController;
import com.ubeauty.Controller.PrincipalController;
import javax.swing.JLabel;

/**
 *
 * @author Eduardo Buzzi
 */
public class PanelConta extends javax.swing.JPanel {

    ContaController controller;
    public PanelConta(PrincipalController c) {
        initComponents();
        controller = new ContaController(c, this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogo = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        btnAlterarDados = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExcluirConta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minha conta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 60));

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/area-titulo.png"))); // NOI18N
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 22, 46));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sobre o aplicativo");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 200, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 10));

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(58, 22, 46));
        txtTelefone.setText("*telefone*");
        add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 210, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 22, 46));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dados cadastrais");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 22, 46));
        jLabel11.setText("Política de Privacidade");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 150, 30));

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(58, 22, 46));
        txtEndereco.setText("*endereço*");
        add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 200, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(58, 22, 46));
        txtEmail.setText("*email*");
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 230, 30));

        btnAlterarDados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAlterarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterarDados.setText("Alterar dados");
        btnAlterarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlterarDadosMousePressed(evt);
            }
        });
        add(btnAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, 50));

        btnExcluirConta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirConta.setForeground(new java.awt.Color(153, 153, 153));
        btnExcluirConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluirConta.setText("Excluir conta");
        btnExcluirConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExcluirContaMousePressed(evt);
            }
        });
        add(btnExcluirConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 50));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(58, 22, 46));
        txtNome.setText("*nome*");
        add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-horizontal.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 120, 60));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 22, 46));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Todos os direitos reservados.");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 140, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Termos de uso");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 100, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 22, 46));
        jLabel18.setText("Nome:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Telefone:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("E-mail:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setText("Endereço:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 30));

        btnLogout.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setText("LOGOUT");
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarDadosMousePressed
        controller.alterarDados();
    }//GEN-LAST:event_btnAlterarDadosMousePressed

    private void btnExcluirContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirContaMousePressed
        controller.delete();
    }//GEN-LAST:event_btnExcluirContaMousePressed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
       controller.voltarTela();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        controller.logout();
    }//GEN-LAST:event_btnLogoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlterarDados;
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnExcluirConta;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables

    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public JLabel getTxtEndereco() {
        return txtEndereco;
    }

    public JLabel getTxtNome() {
        return txtNome;
    }

    public JLabel getTxtTelefone() {
        return txtTelefone;
    }

    
    
}

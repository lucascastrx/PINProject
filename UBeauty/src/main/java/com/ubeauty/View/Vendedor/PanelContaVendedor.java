package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.Vendedor.ContaVendedorController;
import com.ubeauty.View.TelaPrincipal;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelContaVendedor extends javax.swing.JPanel {
    
    ContaVendedorController controller;

    public PanelContaVendedor(TelaPrincipalVendedor view) {
        initComponents();
        controller = new ContaVendedorController(this,view);
        controller.carregarTela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogo = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        btnEditarInfos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnExcluirConta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        labelDescricaoSalva = new javax.swing.JLabel();
        btnSalvarDescricao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnReclamacoes = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

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

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(58, 22, 46));
        txtTelefone.setText("*telefone*");
        add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 210, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 22, 46));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Minhas informações");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 22, 46));
        jLabel11.setText("Política de Privacidade");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 40));

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(58, 22, 46));
        txtEndereco.setText("*endereço*");
        add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, 30));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(58, 22, 46));
        txtEmail.setText("*email*");
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 230, 30));

        btnEditarInfos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEditarInfos.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarInfos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditarInfos.setText("Editar infos");
        btnEditarInfos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarInfos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarInfosMousePressed(evt);
            }
        });
        add(btnEditarInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 50));

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
        add(btnExcluirConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, 50));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(58, 22, 46));
        txtNome.setText("*nome*");
        add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 120, 60));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 22, 46));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Todos os direitos reservados.");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 140, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Termos de uso");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 100, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Telefone:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("E-mail:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 50, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setText("Endereço:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 30));

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
        add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        taDescricao.setBackground(new java.awt.Color(255, 255, 255));
        taDescricao.setColumns(20);
        taDescricao.setForeground(new java.awt.Color(58, 22, 46));
        taDescricao.setLineWrap(true);
        taDescricao.setRows(5);
        taDescricao.setWrapStyleWord(true);
        taDescricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jScrollPane1.setViewportView(taDescricao);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 100));

        labelDescricaoSalva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDescricaoSalva.setForeground(new java.awt.Color(58, 22, 46));
        labelDescricaoSalva.setText("Descrição salva!");
        add(labelDescricaoSalva, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, 30));

        btnSalvarDescricao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvarDescricao.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalvarDescricao.setText("Salvar desc.");
        btnSalvarDescricao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalvarDescricaoMousePressed(evt);
            }
        });
        add(btnSalvarDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 50));

        btnReclamacoes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReclamacoes.setForeground(new java.awt.Color(255, 102, 153));
        btnReclamacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReclamacoes.setText("Reclamações");
        btnReclamacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReclamacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReclamacoesMousePressed(evt);
            }
        });
        add(btnReclamacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa-outline.png"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 130, 50));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setText("Nome:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarInfosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarInfosMousePressed
        controller.abrirPopUpEditarConta();
    }//GEN-LAST:event_btnEditarInfosMousePressed

    private void btnExcluirContaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirContaMousePressed
        controller.excluirConta();
    }//GEN-LAST:event_btnExcluirContaMousePressed

    private void btnSalvarDescricaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarDescricaoMousePressed
        controller.salvarDescricao();
    }//GEN-LAST:event_btnSalvarDescricaoMousePressed

    private void btnReclamacoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacoesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReclamacoesMousePressed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        controller.logout();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        controller.voltar();
    }//GEN-LAST:event_btnVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEditarInfos;
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnExcluirConta;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnReclamacoes;
    private javax.swing.JLabel btnSalvarDescricao;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescricaoSalva;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables

    public JLabel getTxtNome() {
        return txtNome;
    }

    public JTextArea getTaDescricao() {
        return taDescricao;
    }

    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public JLabel getTxtEndereco() {
        return txtEndereco;
    }

    public JLabel getTxtTelefone() {
        return txtTelefone;
    }

    public JLabel getLabelDescricaoSalva() {
        return labelDescricaoSalva;
    }
    
    
    
}

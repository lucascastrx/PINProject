package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.Vendedor.NotificacaoVendedorController;

public class PanelNotificacoesVendedor extends javax.swing.JPanel {

    NotificacaoVendedorController controller;
    
    public PanelNotificacoesVendedor(TelaPrincipalVendedor view) {
        initComponents();
        controller = new NotificacaoVendedorController(this, view);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogo = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        btnLimparNotif = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotificacoes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titulo-notificacoes.png"))); // NOI18N
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        btnLimparNotif.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimparNotif.setForeground(new java.awt.Color(255, 102, 153));
        btnLimparNotif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimparNotif.setText("CRIAR NOVA");
        btnLimparNotif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimparNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparNotifMousePressed(evt);
            }
        });
        add(btnLimparNotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 120, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 130, 50));

        tableNotificacoes.setBackground(new java.awt.Color(204, 204, 204));
        tableNotificacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableNotificacoes.setForeground(new java.awt.Color(58, 22, 46));
        tableNotificacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dwadwdwadwadwadwadwadwadwadwadawdwadwadwadadwadwa", "5555"}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(tableNotificacoes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 330));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Enviadas recentemente");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparNotifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparNotifMousePressed
        controller.abrirTelaCriarNotificacao();
    }//GEN-LAST:event_btnLimparNotifMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnLimparNotif;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNotificacoes;
    // End of variables declaration//GEN-END:variables
}

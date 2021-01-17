/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

/**
 *
 * @author Eduardo Buzzi
 */
public class PanelSaloes extends javax.swing.JPanel {

    /**
     * Creates new form teste2
     */
    public PanelSaloes() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSaloes = new javax.swing.JTable();
        btnPesquisarSaloes = new javax.swing.JLabel();
        btnLimparFiltro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titulo-saloes.png"))); // NOI18N
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        tableSaloes.setBackground(new java.awt.Color(204, 204, 204));
        tableSaloes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableSaloes.setForeground(new java.awt.Color(58, 22, 46));
        tableSaloes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dwadwdwadwadwadwadwadwadwadwadawdwadwadwadadwadwa", "5555"}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(tableSaloes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 390));

        btnPesquisarSaloes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar-saloes.png"))); // NOI18N
        add(btnPesquisarSaloes, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 540, 180, 60));

        btnLimparFiltro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimparFiltro.setForeground(new java.awt.Color(153, 153, 153));
        btnLimparFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimparFiltro.setText("Limpar filtro");
        btnLimparFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimparFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparFiltroMousePressed(evt);
            }
        });
        add(btnLimparFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 120, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 130, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparFiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparFiltroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparFiltroMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnLimparFiltro;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnPesquisarSaloes;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSaloes;
    // End of variables declaration//GEN-END:variables
}

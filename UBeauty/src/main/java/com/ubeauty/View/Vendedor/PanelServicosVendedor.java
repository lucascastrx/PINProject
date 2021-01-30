package com.ubeauty.View.Vendedor;

import com.ubeauty.View.*;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.Vendedor.PrincipalControllerVendedor;

public class PanelServicosVendedor extends javax.swing.JPanel {

    private final PrincipalControllerVendedor controller;
    private TelaPrincipalVendedor view;

    public PanelServicosVendedor(TelaPrincipalVendedor view, PrincipalControllerVendedor pc) {
        initComponents();
        this.view = view;
        this.controller = pc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnExcluirServico = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCriarServico = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableServicos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableServicos1 = new javax.swing.JTable();
        btnExcluirCupom = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCriarCupom = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 22, 46));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Serviços");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 10));

        btnExcluirServico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirServico.setForeground(new java.awt.Color(153, 153, 153));
        btnExcluirServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluirServico.setText("Excluir");
        btnExcluirServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(btnExcluirServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 50));

        btnCriarServico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCriarServico.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCriarServico.setText("Criar novo");
        btnCriarServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCriarServicoMousePressed(evt);
            }
        });
        add(btnCriarServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 110, 50));

        jScrollPane1.setBorder(null);

        tableServicos.setBackground(new java.awt.Color(204, 204, 204));
        tableServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableServicos.setForeground(new java.awt.Color(58, 22, 46));
        tableServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cupom", "Desconto"
            }
        ));
        jScrollPane1.setViewportView(tableServicos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 280, 110));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 22, 46));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cupons");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 10));

        jScrollPane2.setBorder(null);

        tableServicos1.setBackground(new java.awt.Color(204, 204, 204));
        tableServicos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableServicos1.setForeground(new java.awt.Color(58, 22, 46));
        tableServicos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serviço", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tableServicos1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 200));

        btnExcluirCupom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirCupom.setForeground(new java.awt.Color(153, 153, 153));
        btnExcluirCupom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluirCupom.setText("Excluir");
        btnExcluirCupom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirCupom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExcluirCupomMousePressed(evt);
            }
        });
        add(btnExcluirCupom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 100, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 130, 50));

        btnCriarCupom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCriarCupom.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarCupom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCriarCupom.setText("Criar cupom");
        btnCriarCupom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCriarCupom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCriarCupomMousePressed(evt);
            }
        });
        add(btnCriarCupom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 90, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 110, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarServicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarServicoMousePressed
        System.out.println("ok");
    }//GEN-LAST:event_btnCriarServicoMousePressed

    private void tableServicosssed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarMousePressed

    private void btnExcluirCupomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirCupomMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCupomMousePressed

    private void btnCriarCupomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarCupomMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCriarCupomMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCriarCupom;
    private javax.swing.JLabel btnCriarServico;
    private javax.swing.JLabel btnExcluirCupom;
    private javax.swing.JLabel btnExcluirServico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableServicos;
    private javax.swing.JTable tableServicos1;
    // End of variables declaration//GEN-END:variables
}
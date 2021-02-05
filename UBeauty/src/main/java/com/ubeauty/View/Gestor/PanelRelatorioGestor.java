package com.ubeauty.View.Gestor;

import com.ubeauty.Controller.Gestor.PrincipalControllerGestor;
import com.ubeauty.Controller.Gestor.RelatorioController;
import com.ubeauty.View.Vendedor.*;
import com.ubeauty.View.*;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.Vendedor.PrincipalControllerVendedor;
import javax.swing.JTextArea;

public class PanelRelatorioGestor extends javax.swing.JPanel {

    private final PrincipalControllerGestor controller;
    private TelaPrincipalGestor view;
    private RelatorioController rController;
    
    public PanelRelatorioGestor(TelaPrincipalGestor view, PrincipalControllerGestor pc) {
        initComponents();
        this.view = view;
        this.controller = pc;
        rController = new RelatorioController(this);
        
    }

    public JTextArea getTaRelatorio() {
        return taRelatorio;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRelatorio = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 22, 46));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Relatório");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        taRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        taRelatorio.setColumns(20);
        taRelatorio.setForeground(new java.awt.Color(58, 22, 46));
        taRelatorio.setLineWrap(true);
        taRelatorio.setRows(5);
        taRelatorio.setWrapStyleWord(true);
        taRelatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        taRelatorio.setFocusable(false);
        jScrollPane1.setViewportView(taRelatorio);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 440));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taRelatorio;
    // End of variables declaration//GEN-END:variables
}

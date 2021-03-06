/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

import com.ubeauty.Controller.ReclamacaoController;
import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.Vendedor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Eduardo Buzzi
 */
public class PopUpReclamacoes extends javax.swing.JFrame {
    private ReclamacaoController controller;
    
    public PopUpReclamacoes(Vendedor v) {
        initComponents();
        UtilController.configurarTela(this);
        
        controller = new ReclamacaoController(v,this);
        controller.carregarReclamacoes();
        
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        btnComentar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMeuComentario = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 540));
        setPreferredSize(new java.awt.Dimension(300, 540));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 22, 46));
        jLabel11.setText("Reclamações");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, 30));

        btnComentar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnComentar.setForeground(new java.awt.Color(255, 255, 255));
        btnComentar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnComentar.setText("Comentar");
        btnComentar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComentarMouseClicked(evt);
            }
        });
        getContentPane().add(btnComentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, 50));

        btnVoltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(153, 153, 153));
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 130, 50));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtMeuComentario.setBackground(new java.awt.Color(204, 204, 204));
        txtMeuComentario.setColumns(20);
        txtMeuComentario.setForeground(new java.awt.Color(58, 22, 46));
        txtMeuComentario.setLineWrap(true);
        txtMeuComentario.setRows(5);
        txtMeuComentario.setText("Meu comentário");
        txtMeuComentario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane2.setViewportView(txtMeuComentario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 90));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtComentarios.setEditable(false);
        txtComentarios.setColumns(20);
        txtComentarios.setForeground(new java.awt.Color(58, 22, 46));
        txtComentarios.setLineWrap(true);
        txtComentarios.setRows(5);
        txtComentarios.setText("*descrição*");
        txtComentarios.setWrapStyleWord(true);
        txtComentarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtComentarios.setFocusable(false);
        jScrollPane1.setViewportView(txtComentarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-branco.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 300, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnComentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComentarMouseClicked
        controller.salvarReclamacao();
    }//GEN-LAST:event_btnComentarMouseClicked

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
            java.util.logging.Logger.getLogger(PopUpReclamacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpReclamacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpReclamacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpReclamacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PopUpReclamacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnComentar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtComentarios;
    private javax.swing.JTextArea txtMeuComentario;
    // End of variables declaration//GEN-END:variables

    public JTextArea getTxtComentarios() {
        return txtComentarios;
    }

    public JTextArea getTxtMeuComentario() {
        return txtMeuComentario;
    }


}

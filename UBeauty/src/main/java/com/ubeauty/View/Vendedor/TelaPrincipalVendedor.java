package com.ubeauty.View.Vendedor;

import com.ubeauty.Controller.UtilController;
import com.ubeauty.Controller.Vendedor.PrincipalControllerVendedor;
import com.ubeauty.Entities.LoginAuthentication;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipalVendedor extends javax.swing.JFrame {

    private final PrincipalControllerVendedor controller;

    public TelaPrincipalVendedor() {
        initComponents();
        controller = new PrincipalControllerVendedor(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNotificacoes = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JLabel();
        btnServicos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelConteudo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNotificacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotificacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-notif.png"))); // NOI18N
        btnNotificacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotificacoesMouseClicked(evt);
            }
        });
        getContentPane().add(btnNotificacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 30, 30));

        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-home.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 30, 30));

        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-usuario.png"))); // NOI18N
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 30, 30));

        btnServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-servicos.png"))); // NOI18N
        btnServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnServicosMouseClicked(evt);
            }
        });
        getContentPane().add(btnServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barra-branca.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 320, 100));

        painelConteudo.setBackground(new java.awt.Color(255, 255, 255));
        painelConteudo.setLayout(new java.awt.CardLayout());
        getContentPane().add(painelConteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        controller.mostrarTela("principal");
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnNotificacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotificacoesMouseClicked
        controller.mostrarTela("notificacoes");
    }//GEN-LAST:event_btnNotificacoesMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        controller.mostrarTelaConta();
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServicosMouseClicked
        controller.mostrarTela("servicos");
    }//GEN-LAST:event_btnServicosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalVendedor().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnNotificacoes;
    private javax.swing.JLabel btnServicos;
    private javax.swing.JLabel btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelConteudo;
    // End of variables declaration//GEN-END:variables

    public void setPainelConteudoLayout(CardLayout cl) {
        painelConteudo.setLayout(cl);
    }

    public void addPainel(JPanel jp, String identificador) {
        painelConteudo.add(jp, identificador);               
    }

    public JPanel getPainelConteudo() {
        return painelConteudo;
    }
    
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public PrincipalControllerVendedor getController() {
        return controller;
    }
    
    
}

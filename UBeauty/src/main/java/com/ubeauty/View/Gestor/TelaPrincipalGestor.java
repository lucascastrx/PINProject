package com.ubeauty.View.Gestor;

import com.ubeauty.Controller.Gestor.PrincipalControllerGestor;
import com.ubeauty.View.Vendedor.*;
import com.ubeauty.Controller.Vendedor.PrincipalControllerVendedor;
import com.ubeauty.Entities.LoginAuthentication;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaPrincipalGestor extends javax.swing.JFrame {

    private final PrincipalControllerGestor controller;

    public TelaPrincipalGestor() {
        initComponents();
        controller = new PrincipalControllerGestor(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRelatorio = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnTermos = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelConteudo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-relatorio.png"))); // NOI18N
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelatorioMouseClicked(evt);
            }
        });
        getContentPane().add(btnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 30, 30));

        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-home.png"))); // NOI18N
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 30, 30));

        btnTermos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTermos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-termos.png"))); // NOI18N
        btnTermos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTermosMouseClicked(evt);
            }
        });
        getContentPane().add(btnTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 30, 30));

        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-usuarios.png"))); // NOI18N
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 30, 30));

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

    private void btnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMouseClicked
        controller.mostrarTela("relatorio");
    }//GEN-LAST:event_btnRelatorioMouseClicked

    private void btnTermosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTermosMouseClicked
        controller.mostrarTela("termos");
    }//GEN-LAST:event_btnTermosMouseClicked

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        controller.mostrarTela("usuarios");
    }//GEN-LAST:event_btnUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipalGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalGestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalGestor().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnRelatorio;
    private javax.swing.JLabel btnTermos;
    private javax.swing.JLabel btnUsuarios;
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

    public PrincipalControllerGestor getController() {
        return controller;
    }
    
    
}

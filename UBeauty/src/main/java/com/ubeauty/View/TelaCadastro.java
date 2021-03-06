/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

import com.ubeauty.Controller.CadastroController;
import com.ubeauty.Controller.UtilController;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Buzzi
 */
public class TelaCadastro extends javax.swing.JFrame {
    private boolean validar = true;
    private final CadastroController controller;

    public TelaCadastro() {
        initComponents();
        UtilController.configurarTela(this);

        controller = new CadastroController(this);
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public boolean getValidar(){
        return validar;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        header = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSobrenome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfDDD = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        header.setForeground(new java.awt.Color(58, 22, 46));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Crie sua conta!");
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 30));

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 90, 30));

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, 30));

        tfNome.setBackground(new java.awt.Color(0,0,0,1));
        tfNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNome.setText("Nome"); // NOI18N
        tfNome.setToolTipText("");
        tfNome.setBorder(null);
        tfNome.setName(""); // NOI18N
        tfNome.setOpaque(false);
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeFocusGained(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, 40));
        tfNome.getAccessibleContext().setAccessibleName("");

        tfSenha.setText("jPasswordfield1");
        tfSenha.setBorder(null);
        tfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSenhaFocusGained(evt);
            }
        });
        getContentPane().add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 240, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-horizontal.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 120, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        tfSobrenome.setBackground(new java.awt.Color(0,0,0,1));
        tfSobrenome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfSobrenome.setText("Sobrenome"); // NOI18N
        tfSobrenome.setToolTipText("");
        tfSobrenome.setBorder(null);
        tfSobrenome.setOpaque(false);
        tfSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSobrenomeFocusGained(evt);
            }
        });
        getContentPane().add(tfSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        tfEmail.setBackground(new java.awt.Color(0,0,0,1));
        tfEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEmail.setText("E-mail"); // NOI18N
        tfEmail.setToolTipText("");
        tfEmail.setBorder(null);
        tfEmail.setOpaque(false);
        tfEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailFocusGained(evt);
            }
        });
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("|");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 40));

        tfDDD.setBackground(new java.awt.Color(0,0,0,1));
        tfDDD.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDDD.setText("DDD"); // NOI18N
        tfDDD.setToolTipText("");
        tfDDD.setBorder(null);
        tfDDD.setOpaque(false);
        tfDDD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDDDFocusGained(evt);
            }
        });
        getContentPane().add(tfDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, 40));

        tfTelefone.setBackground(new java.awt.Color(0,0,0,1));
        tfTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelefone.setText("Telefone"); // NOI18N
        tfTelefone.setToolTipText("");
        tfTelefone.setBorder(null);
        tfTelefone.setOpaque(false);
        tfTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTelefoneFocusGained(evt);
            }
        });
        getContentPane().add(tfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 190, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background-login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        controller.cancelar();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
         controller.cadastrar();
        
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void tfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusGained
      
            controller.setAcao();
        
    }//GEN-LAST:event_tfNomeFocusGained

    private void tfSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSobrenomeFocusGained
        controller.setSelected(tfSobrenome);
    }//GEN-LAST:event_tfSobrenomeFocusGained

    private void tfEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailFocusGained
        controller.setSelected(tfEmail);
    }//GEN-LAST:event_tfEmailFocusGained

    private void tfDDDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDDDFocusGained
        controller.setSelected(tfDDD);
    }//GEN-LAST:event_tfDDDFocusGained

    private void tfTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTelefoneFocusGained
        controller.setSelected(tfTelefone);
    }//GEN-LAST:event_tfTelefoneFocusGained

    private void tfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSenhaFocusGained
        controller.setSelected(tfSenha);
    }//GEN-LAST:event_tfSenhaFocusGained

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastrar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel header;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfDDD;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfSobrenome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
    
    
    
    public void setValidar(boolean validar){
        this.validar = validar;
    }
    
    public JTextField getTfEmail() {
        return tfEmail;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public JPasswordField getTfSenha() {
        return tfSenha;
    }

    public JTextField getTfSobrenome() {
        return tfSobrenome;
    }

    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    public JTextField getTfDDD() {
        return tfDDD;
    }

    public JLabel getBtnCadastrar() {
        return btnCadastrar;
    }

    public JLabel getHeader() {
        return header;
    }

    public JLabel getBtnCancelar() {
        return btnCancelar;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }
    
    
    
    

}

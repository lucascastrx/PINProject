package com.ubeauty.View.Vendedor;

import com.ubeauty.View.*;
import com.ubeauty.Controller.AgendamentoController;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.Servico;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Buzzi
 */
public class PopUpDisponibilizarHorario extends javax.swing.JFrame {
    AgendamentoController controller;
    
    public PopUpDisponibilizarHorario(Servico s,PrincipalController pc) {
        initComponents();
        //controller = new AgendamentoController(s,this,pc);
        UtilController.configurarTela(this);
        
        
    }
    
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPagamento = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAgendar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        tfDia = new javax.swing.JTextField();
        tfMinuto = new javax.swing.JTextField();
        tfMes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 540));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgendar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgendar.setText("Criar horário");
        btnAgendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgendarMousePressed(evt);
            }
        });
        getContentPane().add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, 50));

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 153, 153));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 130, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Disponibilizar Horário");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 30));

        cbDia.setBackground(new java.awt.Color(255, 255, 255));
        cbDia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbDia.setForeground(new java.awt.Color(58, 22, 46));
        getContentPane().add(cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText(":");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 10, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 22, 46));
        jLabel16.setText("Servico");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(58, 22, 46));
        jLabel18.setText("Hora");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        tfHora.setBackground(new java.awt.Color(255, 255, 255));
        tfHora.setForeground(new java.awt.Color(58, 22, 46));
        tfHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 40, 30));

        tfDia.setBackground(new java.awt.Color(255, 255, 255));
        tfDia.setForeground(new java.awt.Color(58, 22, 46));
        tfDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 30));

        tfMinuto.setBackground(new java.awt.Color(255, 255, 255));
        tfMinuto.setForeground(new java.awt.Color(58, 22, 46));
        tfMinuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 40, 30));

        tfMes.setBackground(new java.awt.Color(255, 255, 255));
        tfMes.setForeground(new java.awt.Color(58, 22, 46));
        tfMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Dia");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("/");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 10, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-branco.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMousePressed
        controller.agendar();
    }//GEN-LAST:event_btnAgendarMousePressed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(PopUpDisponibilizarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpDisponibilizarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpDisponibilizarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpDisponibilizarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PopUpAgendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPagamento;
    private javax.swing.JLabel btnAgendar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfMinuto;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getBgPagamento() {
        return bgPagamento;
    }

    public JLabel getBtnComentar() {
        return btnAgendar;
    }

    public JLabel getBtnVoltar() {
        return btnCancelar;
    }
    

}

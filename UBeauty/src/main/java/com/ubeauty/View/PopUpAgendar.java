package com.ubeauty.View;

import com.ubeauty.Controller.AgendamentoController;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Controller.UtilController;
import com.ubeauty.Entities.Agendamento;
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
public class PopUpAgendar extends javax.swing.JFrame {
    AgendamentoController controller;
    
    public PopUpAgendar(Servico s,PrincipalController pc) {
        initComponents();
        controller = new AgendamentoController(s,this,pc);
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
        txtPreco = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbHorarios = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rbAplicativo = new javax.swing.JRadioButton();
        rbEstabelecimento = new javax.swing.JRadioButton();
        tfNumeroCartao = new javax.swing.JTextField();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        tfCupom2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfValidadeMes = new javax.swing.JTextField();
        tfValidadeAno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 300, 540));
        setMinimumSize(new java.awt.Dimension(300, 540));
        setSize(new java.awt.Dimension(300, 0));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPreco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(58, 22, 46));
        txtPreco.setText("*R$00,00*");
        getContentPane().add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));

        btnAgendar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgendar.setText("Agendar");
        btnAgendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgendarMousePressed(evt);
            }
        });
        getContentPane().add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 50));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 100, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 130, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setText("Agendar Serviço");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 30));

        cbHorarios.setBackground(new java.awt.Color(255, 255, 255));
        cbHorarios.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbHorarios.setForeground(new java.awt.Color(58, 22, 46));
        cbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(cbHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(58, 22, 46));
        jLabel15.setText("Horário");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(58, 22, 46));
        jLabel16.setText("Preço");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(58, 22, 46));
        jLabel17.setText("Pagamento");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(58, 22, 46));
        jLabel19.setText("Número do cartão");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        rbAplicativo.setBackground(new java.awt.Color(255, 255, 255));
        bgPagamento.add(rbAplicativo);
        rbAplicativo.setForeground(new java.awt.Color(58, 22, 46));
        rbAplicativo.setText("aplicativo");
        rbAplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAplicativoActionPerformed(evt);
            }
        });
        getContentPane().add(rbAplicativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        rbEstabelecimento.setBackground(new java.awt.Color(255, 255, 255));
        bgPagamento.add(rbEstabelecimento);
        rbEstabelecimento.setForeground(new java.awt.Color(58, 22, 46));
        rbEstabelecimento.setText("no estabelecimento");
        rbEstabelecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstabelecimentoActionPerformed(evt);
            }
        });
        getContentPane().add(rbEstabelecimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        tfNumeroCartao.setBackground(new java.awt.Color(255, 255, 255));
        tfNumeroCartao.setForeground(new java.awt.Color(58, 22, 46));
        tfNumeroCartao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfNumeroCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 30));

        cbFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbFormaPagamento.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbFormaPagamento.setForeground(new java.awt.Color(58, 22, 46));
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "MasterCard", "Paypal" }));
        getContentPane().add(cbFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, 30));

        tfCupom2.setBackground(new java.awt.Color(255, 255, 255));
        tfCupom2.setForeground(new java.awt.Color(58, 22, 46));
        tfCupom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfCupom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(58, 22, 46));
        jLabel20.setText("Possui cupom?");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        tfCodigo.setBackground(new java.awt.Color(255, 255, 255));
        tfCodigo.setForeground(new java.awt.Color(58, 22, 46));
        tfCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigo.setText("000");
        tfCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 50, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setText("Data de validade e código de segurança");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        tfValidadeMes.setBackground(new java.awt.Color(255, 255, 255));
        tfValidadeMes.setForeground(new java.awt.Color(58, 22, 46));
        tfValidadeMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValidadeMes.setText("00");
        tfValidadeMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfValidadeMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 40, 30));

        tfValidadeAno.setBackground(new java.awt.Color(255, 255, 255));
        tfValidadeAno.setForeground(new java.awt.Color(58, 22, 46));
        tfValidadeAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValidadeAno.setText("0000");
        tfValidadeAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(tfValidadeAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg-branco.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMousePressed
        controller.agendar();
    }//GEN-LAST:event_btnAgendarMousePressed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void rbEstabelecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEstabelecimentoActionPerformed
        controller.estabelecimento();
    }//GEN-LAST:event_rbEstabelecimentoActionPerformed

    private void rbAplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAplicativoActionPerformed
        controller.aplicativo();
    }//GEN-LAST:event_rbAplicativoActionPerformed

    private void cbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHorariosActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpAgendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpAgendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<Agendamento> cbHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbAplicativo;
    private javax.swing.JRadioButton rbEstabelecimento;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCupom2;
    private javax.swing.JTextField tfNumeroCartao;
    private javax.swing.JTextField tfValidadeAno;
    private javax.swing.JTextField tfValidadeMes;
    private javax.swing.JLabel txtPreco;
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

    public JComboBox<Agendamento> getCbHorario() {
        return cbHorarios;
    }

    public JComboBox<String> getCbFormaPagamento() {
        return cbFormaPagamento;
    }

    

    

    public JRadioButton getRbAplicativo() {
        return rbAplicativo;
    }

    public JRadioButton getRbEstabelecimento() {
        return rbEstabelecimento;
    }

    public JTextField getTfCodigo() {
        return tfCodigo;
    }

    public JTextField getTfCupom2() {
        return tfCupom2;
    }

    public JTextField getTfNumeroCartao() {
        return tfNumeroCartao;
    }

    public JTextField getTfValidadeAno() {
        return tfValidadeAno;
    }

    public JTextField getTfValidadeMes() {
        return tfValidadeMes;
    }

    public JLabel getTxtPreco() {
        return txtPreco;
    }
    

}

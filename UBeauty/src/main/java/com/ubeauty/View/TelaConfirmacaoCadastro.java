/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

import com.ubeauty.Controller.CadastroController;
import com.ubeauty.Controller.UtilController;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Buzzi
 */
public class TelaConfirmacaoCadastro extends javax.swing.JFrame {
    
    CadastroController controller;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaConfirmacaoCadastro(CadastroController controller) {
        initComponents();
        UtilController.configurarTela(this);
        this.controller = controller;
        this.configurar();
    }
    
    private void configurar() {
        /*eu tive que colocar aqui, não dei jeito de fazer funcionar dentro do controle
        serve pra limpar os campos que nao servem pra cliente
        */
        rbAutonomo.setVisible(false);
        rbSalao.setVisible(false);
        tfNomeProfissao.setVisible(false);
        tfCnpj.setVisible(false);
        imgCnpj.setVisible(false);
        imgNomeProf.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        bgSegmento = new javax.swing.ButtonGroup();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JTextField();
        imgCnpj = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfRua = new javax.swing.JTextField();
        imgRua = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        imgCnpj2 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        imgCnpj3 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        imgCnpj4 = new javax.swing.JLabel();
        rbSalao = new javax.swing.JRadioButton();
        rbAutonomo = new javax.swing.JRadioButton();
        tfNomeProfissao = new javax.swing.JTextField();
        imgNomeProf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Só mais um passo");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(58, 22, 46));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Endereço");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(58, 22, 46));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("O que você é?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, 30));

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setText("Voltar");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 90, 30));

        btnFinalizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFinalizarMousePressed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 110, 50));

        tfCnpj.setBackground(new java.awt.Color(0,0,0,1));
        tfCnpj.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCnpj.setText("CNPJ"); // NOI18N
        tfCnpj.setToolTipText("");
        tfCnpj.setBorder(null);
        tfCnpj.setOpaque(false);
        getContentPane().add(tfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 40));

        imgCnpj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(58, 22, 46));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Só mais um passo!");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, 30));

        cbTipo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbTipo.setForeground(new java.awt.Color(58, 22, 46));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vendedor" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, -1));

        tfRua.setBackground(new java.awt.Color(0,0,0,1));
        tfRua.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfRua.setText("Rua"); // NOI18N
        tfRua.setToolTipText("");
        tfRua.setBorder(null);
        tfRua.setOpaque(false);
        getContentPane().add(tfRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 40));

        imgRua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 40));

        tfNumero.setBackground(new java.awt.Color(0,0,0,1));
        tfNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNumero.setText("Número"); // NOI18N
        tfNumero.setToolTipText("");
        tfNumero.setBorder(null);
        tfNumero.setOpaque(false);
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 40));

        imgCnpj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 40));

        tfCidade.setBackground(new java.awt.Color(0,0,0,1));
        tfCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCidade.setText("Cidade"); // NOI18N
        tfCidade.setToolTipText("");
        tfCidade.setBorder(null);
        tfCidade.setOpaque(false);
        getContentPane().add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 40));

        imgCnpj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 40));

        tfEstado.setBackground(new java.awt.Color(0,0,0,1));
        tfEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEstado.setText("Estado"); // NOI18N
        tfEstado.setToolTipText("");
        tfEstado.setBorder(null);
        tfEstado.setOpaque(false);
        getContentPane().add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 40));

        imgCnpj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgCnpj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        bgSegmento.add(rbSalao);
        rbSalao.setForeground(new java.awt.Color(58, 22, 46));
        rbSalao.setText("Tenho um salão");
        rbSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSalaoActionPerformed(evt);
            }
        });
        getContentPane().add(rbSalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        bgSegmento.add(rbAutonomo);
        rbAutonomo.setForeground(new java.awt.Color(58, 22, 46));
        rbAutonomo.setText("Sou Autônomo");
        rbAutonomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutonomoActionPerformed(evt);
            }
        });
        getContentPane().add(rbAutonomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        tfNomeProfissao.setBackground(new java.awt.Color(0,0,0,1));
        tfNomeProfissao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomeProfissao.setText("Nome do Salão"); // NOI18N
        tfNomeProfissao.setToolTipText("");
        tfNomeProfissao.setBorder(null);
        tfNomeProfissao.setOpaque(false);
        getContentPane().add(tfNomeProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 240, 40));

        imgNomeProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/input-outline.png"))); // NOI18N
        getContentPane().add(imgNomeProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMousePressed
        controller.finalizarCadastro();
    }//GEN-LAST:event_btnFinalizarMousePressed

    private void rbSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSalaoActionPerformed
        controller.segmentoSalao();
    }//GEN-LAST:event_rbSalaoActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        controller.escolherTipo();
    }//GEN-LAST:event_cbTipoActionPerformed

    private void rbAutonomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutonomoActionPerformed
        controller.segmentoAutonomo();
    }//GEN-LAST:event_rbAutonomoActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSegmento;
    private javax.swing.JLabel btnFinalizar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel imgCnpj;
    private javax.swing.JLabel imgCnpj2;
    private javax.swing.JLabel imgCnpj3;
    private javax.swing.JLabel imgCnpj4;
    private javax.swing.JLabel imgNomeProf;
    private javax.swing.JLabel imgRua;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAutonomo;
    private javax.swing.JRadioButton rbSalao;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNomeProfissao;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    // End of variables declaration//GEN-END:variables

    public JRadioButton getRbAutonomo() {
        return rbAutonomo;
    }

    public JRadioButton getRbSalao() {
        return rbSalao;
    }

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public JTextField getTfCnpj() {
        return tfCnpj;
    }

    public JTextField getTfEstado() {
        return tfEstado;
    }

    public JTextField getTfNumero() {
        return tfNumero;
    }

    public JTextField getTfRua() {
        return tfRua;
    }

    public JComboBox<String> getCbTipo() {
        return cbTipo;
    }

    public JTextField getTfNomeProfissao() {
        return tfNomeProfissao;
    }

    public JLabel getImgCnpj() {
        return imgCnpj;
    }

    public JLabel getImgNomeProf() {
        return imgNomeProf;
    }

    

}

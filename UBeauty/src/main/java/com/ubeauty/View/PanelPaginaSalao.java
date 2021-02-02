/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubeauty.View;

import com.ubeauty.Controller.PaginaSalaoController;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.Entities.Vendedor;
import com.ubeauty.TableModel.TableModelServicos;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author Eduardo Buzzi
 */
public class PanelPaginaSalao extends javax.swing.JPanel {
    private PaginaSalaoController controller;
    
    public PanelPaginaSalao(PrincipalController pc) {
        initComponents();
        controller = new PaginaSalaoController(this, pc);
    }

    public void setVendedor (Vendedor v){
        controller.setDados(v);
 
    }
    
    public void setTableModel(TableModelServicos model) {
        this.tabela.setModel(model);
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeSalao = new javax.swing.JLabel();
        btnLogo = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnReclamacoes = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtHorario2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtHorario1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeSalao.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNomeSalao.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeSalao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNomeSalao.setText("*Nome Salao*");
        add(txtNomeSalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, 60));

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/area-titulo.png"))); // NOI18N
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 22, 46));
        jLabel10.setText("Serviços");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

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
        add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 50));

        btnReclamacoes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnReclamacoes.setForeground(new java.awt.Color(255, 102, 153));
        btnReclamacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReclamacoes.setText("Reclamações");
        btnReclamacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReclamacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReclamacoesMousePressed(evt);
            }
        });
        add(btnReclamacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 120, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-rosa-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 130, 50));

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(58, 22, 46));
        txtEmail.setText("*email estabelecimento*");
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 230, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(58, 22, 46));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-email.png"))); // NOI18N
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 20, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtDescricao.setEditable(false);
        txtDescricao.setBackground(new java.awt.Color(255, 255, 255));
        txtDescricao.setColumns(20);
        txtDescricao.setForeground(new java.awt.Color(58, 22, 46));
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setText("*descrição*");
        txtDescricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtDescricao.setFocusable(false);
        jScrollPane1.setViewportView(txtDescricao);
        txtDescricao.getAccessibleContext().setAccessibleDescription("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 120));

        jScrollPane2.setBorder(null);

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(58, 22, 46));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serviço", "Preço"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 90));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(58, 22, 46));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-tel.png"))); // NOI18N
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 20, 30));

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(58, 22, 46));
        txtTelefone.setText("*telefone estabelecimento*");
        add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 230, 30));

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(58, 22, 46));
        txtEndereco.setText("*endereço estabelecimento*");
        add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 230, 30));
        txtEndereco.getAccessibleContext().setAccessibleDescription("");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(58, 22, 46));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-endereco.png"))); // NOI18N
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 20, 30));

        txtHorario2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHorario2.setForeground(new java.awt.Color(58, 22, 46));
        txtHorario2.setText("xx:xx às xx:xx e das xx:xx às xx:xx");
        add(txtHorario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 230, 30));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(58, 22, 46));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-horario.png"))); // NOI18N
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 20, 30));

        txtHorario1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtHorario1.setForeground(new java.awt.Color(58, 22, 46));
        txtHorario1.setText("*Segunda à sabado*");
        add(txtHorario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendarMousePressed
        System.out.println("ok");
    }//GEN-LAST:event_btnAgendarMousePressed

    private void btnReclamacoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReclamacoesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReclamacoesMousePressed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        controller.voltar();
    }//GEN-LAST:event_btnVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgendar;
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnReclamacoes;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtHorario1;
    private javax.swing.JLabel txtHorario2;
    private javax.swing.JLabel txtNomeSalao;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables

    public JTextArea getTxtDescricao() {
        return txtDescricao;
    }

    public JLabel getTxtEmail() {
        return txtEmail;
    }

    public JLabel getTxtEndereco() {
        return txtEndereco;
    }

    public JLabel getTxtHorario1() {
        return txtHorario1;
    }

    public JLabel getTxtHorario2() {
        return txtHorario2;
    }

    public JLabel getTxtNomeSalao() {
        return txtNomeSalao;
    }

    public JLabel getTxtTelefone() {
        return txtTelefone;
    }

    public JTable getTabela() {
        return tabela;
    }
    
    
    

}

package com.ubeauty.View;

import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.TableModel.TableModelClienteAgendados;
import javax.swing.JTable;

public class PanelPrincipal extends javax.swing.JPanel {

    private final PrincipalController controller;
    private TelaPrincipal view;

    public PanelPrincipal(TelaPrincipal view, PrincipalController pc) {
        initComponents();
        this.view = view;
        this.controller = pc;
    }
    
    public void setTableModel(TableModelClienteAgendados model) {
        this.tabela.setModel(model);
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
        btnPesquisarSaloes = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnAutonomos = new javax.swing.JLabel();
        btnSaloes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        btnPesquisarSaloes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar-saloes.png"))); // NOI18N
        add(btnPesquisarSaloes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 50));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estabelecimentos.png"))); // NOI18N
        btnEstabelecimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstabelecimentosMouseClicked(evt);
            }
        });
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, -1));

        btnAutonomos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAutonomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encontrar-autonomos.png"))); // NOI18N
        btnAutonomos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutonomosMouseClicked(evt);
            }
        });
        add(btnAutonomos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 283, 190, 70));

        btnSaloes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encontrar-saloes.png"))); // NOI18N
        btnSaloes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaloesMouseClicked(evt);
            }
        });
        add(btnSaloes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, -1, 70));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 22, 46));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agendados");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 10));

        jScrollPane1.setBorder(null);

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(58, 22, 46));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serviço", "Horário"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaloesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaloesMouseClicked
        controller.mostrarTela("saloes");
    }//GEN-LAST:event_btnSaloesMouseClicked

    private void btnAutonomosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutonomosMouseClicked
        controller.mostrarTela("autonomos");
    }//GEN-LAST:event_btnAutonomosMouseClicked

    private void btnEstabelecimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstabelecimentosMouseClicked
        controller.mostrarTela("saloes");
    }//GEN-LAST:event_btnEstabelecimentosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAutonomos;
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnPesquisarSaloes;
    private javax.swing.JLabel btnSaloes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
 
    public JTable getTabela() {
        return tabela;
    }

}

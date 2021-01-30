package com.ubeauty.View;

import com.ubeauty.Controller.PanelSaloesController;
import com.ubeauty.Controller.PrincipalController;
import com.ubeauty.TableModel.TableModelSaloes;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Buzzi
 */
public class PanelSaloes extends javax.swing.JPanel {
    private PrincipalController controller;
    private TelaPrincipal view;
    private PanelSaloesController pController;


    public PanelSaloes(PrincipalController pc) {
        initComponents();
        controller = pc;
        view = controller.getView();
        
        pController = new PanelSaloesController(this);
        
    }
    
      public void setTableModel(TableModelSaloes model){
        this.tabela.setModel(model);
    }
    
    
    public PrincipalController getPrincipalController(){
        return controller;
    }
    
    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogo = new javax.swing.JLabel();
        btnEstabelecimentos = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnPesquisarSaloes = new javax.swing.JLabel();
        btnLimparFiltro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(btnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 30));

        btnEstabelecimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titulo-saloes.png"))); // NOI18N
        add(btnEstabelecimentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 320, -1));

        btnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn-voltar-escuro.png"))); // NOI18N
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(58, 22, 46));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"dwadwdwadwadwadwadwadwadwadwadawdwadwadwadadwadwa", "5555"}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane1.setViewportView(tabela);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 280, 390));

        btnPesquisarSaloes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pesquisar-saloes.png"))); // NOI18N
        add(btnPesquisarSaloes, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 540, 180, 60));

        btnLimparFiltro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimparFiltro.setForeground(new java.awt.Color(153, 153, 153));
        btnLimparFiltro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimparFiltro.setText("Limpar filtro");
        btnLimparFiltro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimparFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparFiltroMousePressed(evt);
            }
        });
        add(btnLimparFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 120, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-cinza-outline.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 130, 50));
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLimparFiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparFiltroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparFiltroMousePressed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
      controller.mostrarTela("principal");
    }//GEN-LAST:event_btnVoltarMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEstabelecimentos;
    private javax.swing.JLabel btnLimparFiltro;
    private javax.swing.JLabel btnLogo;
    private javax.swing.JLabel btnPesquisarSaloes;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}

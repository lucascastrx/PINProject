package com.ubeauty.View.Gestor;

import com.ubeauty.Controller.Gestor.*;
import com.ubeauty.TableModel.TableModelUsuarios;
import javax.swing.JTable;

public class PanelUsuariosGestor extends javax.swing.JPanel {

    private final PrincipalControllerGestor controller;
    private TelaPrincipalGestor view;
    private UsuariosGestorController uController;

    public PanelUsuariosGestor(TelaPrincipalGestor view, PrincipalControllerGestor pc) {
        initComponents();
        this.view = view;
        this.controller = pc;
        this.uController = new UsuariosGestorController(this);
    }

    public PrincipalControllerGestor getController(){
        return this.controller;
    }
    
    public void setTableModel(TableModelUsuarios model){
        tabela.setModel(model);
    }

    public JTable getTabela() {
        return tabela;
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(58, 22, 46));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuários do App");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linha-rosa.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 10));

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(58, 22, 46));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if(evt.getClickCount() ==2 ){
            uController.abrirConta();
        }
    }//GEN-LAST:event_tabelaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}

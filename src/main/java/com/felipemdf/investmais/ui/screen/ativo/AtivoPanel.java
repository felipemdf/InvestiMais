/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.felipemdf.investmais.ui.screen.ativo;

import com.felipemdf.investmais.ui.screen.lancamento.*;

/**
 *
 * @author fmari_v4rpu9g
 */
public class AtivoPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransacaoPanel
     */
    public AtivoPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        rendaVariavelPanel = new javax.swing.JPanel();
        rendaVariavelLabel = new javax.swing.JLabel();
        tableAtivosRendaVariavelComponent1 = new com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosRendaVariavelComponent();
        rendaFixaPanel = new javax.swing.JPanel();
        rendaFixaLabel = new javax.swing.JLabel();
        tableAtivosRendaFixaComponent1 = new com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosRendaFixaComponent();
        tesouroDiretoPanel = new javax.swing.JPanel();
        tesouroDiretoLabel = new javax.swing.JLabel();
        tableAtivosTesouroDiretoComponent1 = new com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosTesouroDiretoComponent();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setRequestFocusEnabled(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        rendaVariavelPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 1, true));

        rendaVariavelLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rendaVariavelLabel.setText("RENDA VARIÁVEL");

        javax.swing.GroupLayout rendaVariavelPanelLayout = new javax.swing.GroupLayout(rendaVariavelPanel);
        rendaVariavelPanel.setLayout(rendaVariavelPanelLayout);
        rendaVariavelPanelLayout.setHorizontalGroup(
            rendaVariavelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendaVariavelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendaVariavelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tableAtivosRendaVariavelComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rendaVariavelPanelLayout.setVerticalGroup(
            rendaVariavelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rendaVariavelPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(rendaVariavelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(tableAtivosRendaVariavelComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rendaFixaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 1, true));

        rendaFixaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rendaFixaLabel.setText("CDB / LCI / LCA / LC / RDB");

        javax.swing.GroupLayout rendaFixaPanelLayout = new javax.swing.GroupLayout(rendaFixaPanel);
        rendaFixaPanel.setLayout(rendaFixaPanelLayout);
        rendaFixaPanelLayout.setHorizontalGroup(
            rendaFixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rendaFixaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendaFixaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tableAtivosRendaFixaComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rendaFixaPanelLayout.setVerticalGroup(
            rendaFixaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rendaFixaPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(rendaFixaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(tableAtivosRendaFixaComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        tesouroDiretoPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 1, true));

        tesouroDiretoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tesouroDiretoLabel.setText("TESOURO DIRETO");

        javax.swing.GroupLayout tesouroDiretoPanelLayout = new javax.swing.GroupLayout(tesouroDiretoPanel);
        tesouroDiretoPanel.setLayout(tesouroDiretoPanelLayout);
        tesouroDiretoPanelLayout.setHorizontalGroup(
            tesouroDiretoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tesouroDiretoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tesouroDiretoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tableAtivosTesouroDiretoComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tesouroDiretoPanelLayout.setVerticalGroup(
            tesouroDiretoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tesouroDiretoPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(tesouroDiretoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(tableAtivosTesouroDiretoComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rendaFixaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rendaVariavelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tesouroDiretoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rendaVariavelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(rendaFixaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tesouroDiretoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rendaFixaLabel;
    private javax.swing.JPanel rendaFixaPanel;
    private javax.swing.JLabel rendaVariavelLabel;
    private javax.swing.JPanel rendaVariavelPanel;
    private com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosRendaFixaComponent tableAtivosRendaFixaComponent1;
    private com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosRendaVariavelComponent tableAtivosRendaVariavelComponent1;
    private com.felipemdf.investmais.ui.screen.ativo.components.TableAtivosTesouroDiretoComponent tableAtivosTesouroDiretoComponent1;
    private javax.swing.JLabel tesouroDiretoLabel;
    private javax.swing.JPanel tesouroDiretoPanel;
    // End of variables declaration//GEN-END:variables
}

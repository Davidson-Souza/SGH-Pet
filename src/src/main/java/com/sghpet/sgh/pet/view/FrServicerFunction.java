package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.AccomodationController;
import javax.swing.JFrame;

public class FrServicerFunction extends javax.swing.JFrame {

    private final JFrame loginScreen;
    private final AccomodationController controller;

    public FrServicerFunction(JFrame menu) {
        initComponents();

        loginScreen = menu;
        this.controller = AccomodationController.getAccomodationController();

        controller.updateTable(JTableAccommodation);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnClearAccommodation = new javax.swing.JButton();
        btnSetEnable = new javax.swing.JButton();
        lblListAccommodation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAccommodation = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Faxineira");
        lblMenu.setToolTipText("");

        btnClearAccommodation.setText("null");
        btnClearAccommodation.setEnabled(false);
        btnClearAccommodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAccommodationActionPerformed(evt);
            }
        });

        btnSetEnable.setText("null");
        btnSetEnable.setEnabled(false);
        btnSetEnable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetEnableActionPerformed(evt);
            }
        });

        lblListAccommodation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblListAccommodation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListAccommodation.setText("Lista de Acomodação");
        lblListAccommodation.setToolTipText("");

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        JTableAccommodation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tamanho", "Capacidade", "Vagas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAccommodation.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(JTableAccommodation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListAccommodation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClearAccommodation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSetEnable)
                        .addGap(0, 355, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetEnable, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblListAccommodation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearAccommodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAccommodationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearAccommodationActionPerformed

    private void btnSetEnableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetEnableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetEnableActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        this.loginScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAccommodation;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAccommodation;
    private javax.swing.JButton btnSetEnable;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblListAccommodation;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}

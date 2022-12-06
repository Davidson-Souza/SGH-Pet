/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.ReservationController;

/**
 *
 * @author 14038910601
 */
public class FrReservationRegister extends javax.swing.JFrame {

    private final ReservationController reservationController;

    public FrReservationRegister(ReservationController reservationController) {
        this.reservationController = reservationController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        bxType = new javax.swing.JComboBox<>();
        lblStartDate = new javax.swing.JLabel();
        edtStartDate = new javax.swing.JTextField();
        lblEndDate = new javax.swing.JLabel();
        edtEndDate = new javax.swing.JTextField();
        lblServices = new javax.swing.JLabel();
        chckService1 = new javax.swing.JCheckBox();
        chckService2 = new javax.swing.JCheckBox();
        chckService3 = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableRegister = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Criar Reserva");
        lblMenu.setToolTipText("");

        lblType.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblType.setText("Tipo da reserva:");

        bxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Econômico", "Luxo", "Super luxo" }));
        bxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxTypeActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStartDate.setText("Data inicial:");

        edtStartDate.setForeground(new java.awt.Color(207, 209, 208));
        edtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtStartDateActionPerformed(evt);
            }
        });

        lblEndDate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEndDate.setText("Data Final:");

        edtEndDate.setForeground(new java.awt.Color(207, 209, 208));
        edtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEndDateActionPerformed(evt);
            }
        });

        lblServices.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblServices.setText("Serviços:");

        chckService1.setText("Tosa");

        chckService2.setText("Banho");

        chckService3.setText("Spa");
        chckService3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckService3ActionPerformed(evt);
            }
        });

        btnBack.setText("Voltar");

        btnSend.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        JTableRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tipo Reserva", "Data Inicial", "Data Final", "Tosa?", "Banho?", "Spa?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableRegister);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblServices, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chckService1)
                                .addGap(40, 40, 40)
                                .addComponent(chckService2)
                                .addGap(40, 40, 40)
                                .addComponent(chckService3)
                                .addGap(0, 236, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblEndDate)
                                .addGap(18, 18, 18)
                                .addComponent(edtEndDate))
                            .addComponent(jScrollPane1)
                            .addComponent(btnSend, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(bxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(edtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDate)
                    .addComponent(edtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServices)
                    .addComponent(chckService1)
                    .addComponent(chckService2)
                    .addComponent(chckService3))
                .addGap(18, 18, 18)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bxTypeActionPerformed

    private void edtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtStartDateActionPerformed

    private void edtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEndDateActionPerformed

    private void chckService3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckService3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chckService3ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        var typeOfStay = bxType.getSelectedIndex();
        var startDate = edtStartDate.getText();
        var endDate = edtEndDate.getText();
        this.reservationController.createReservation(typeOfStay, startDate, endDate);
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableRegister;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> bxType;
    private javax.swing.JCheckBox chckService1;
    private javax.swing.JCheckBox chckService2;
    private javax.swing.JCheckBox chckService3;
    private javax.swing.JTextField edtEndDate;
    private javax.swing.JTextField edtStartDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblServices;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}

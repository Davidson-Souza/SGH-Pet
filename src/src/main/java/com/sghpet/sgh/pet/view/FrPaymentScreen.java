
package com.sghpet.sgh.pet.view;

public class FrPaymentScreen extends javax.swing.JFrame {

    public FrPaymentScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableReservation = new javax.swing.JTable();
        btnVerifyPayment = new javax.swing.JButton();
        lblListReservation = new javax.swing.JLabel();
        btnPartialPayment = new javax.swing.JButton();
        btnTotalPayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Sair");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblMenu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Realizar Pagamento");
        lblMenu.setToolTipText("");

        JTableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Padrão", "29/12/2022", "03/01/2023",  new Float(150.5)}
            },
            new String [] {
                "ID", "Tipo Reserva", "Data Inicial", "Data Final", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableReservation.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(JTableReservation);
        JTableReservation.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnVerifyPayment.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVerifyPayment.setText("Verificar Parcelas");
        btnVerifyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyPaymentActionPerformed(evt);
            }
        });

        lblListReservation.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblListReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListReservation.setText("Lista de Reserva");
        lblListReservation.setToolTipText("");

        btnPartialPayment.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPartialPayment.setText("Pagamento Parcial");
        btnPartialPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartialPaymentActionPerformed(evt);
            }
        });

        btnTotalPayment.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnTotalPayment.setText("Pagamento Total");
        btnTotalPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblListReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerifyPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPartialPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTotalPayment)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerifyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPartialPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(lblListReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnVerifyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyPaymentActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_btnVerifyPaymentActionPerformed

    private void btnPartialPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartialPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPartialPaymentActionPerformed

    private void btnTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalPaymentActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableReservation;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPartialPayment;
    private javax.swing.JButton btnTotalPayment;
    private javax.swing.JButton btnVerifyPayment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListReservation;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}

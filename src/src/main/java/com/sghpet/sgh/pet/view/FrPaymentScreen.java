package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.PaymentController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.model.PaymentMethods;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrPaymentScreen extends javax.swing.JFrame {

    private final JFrame ClerkScreen;

    public FrPaymentScreen(JFrame menu) {
        ClerkScreen = menu;
        initComponents();
        cmbMethod.addItem(PaymentMethods.PIX);
        cmbMethod.addItem(PaymentMethods.CASH);
        cmbMethod.addItem(PaymentMethods.BOLETO);
        cmbMethod.addItem(PaymentMethods.CARTAO_CREDITO);
        cmbMethod.addItem(PaymentMethods.CARTAO_DEBITO);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableReservation = new javax.swing.JTable();
        lblListReservation = new javax.swing.JLabel();
        btnSubTotal = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        edtReservationId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMethod = new javax.swing.JComboBox<>();
        cmbTimes1 = new javax.swing.JComboBox<>();

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

        lblListReservation.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblListReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListReservation.setText("Lista de Reserva");
        lblListReservation.setToolTipText("");

        btnSubTotal.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSubTotal.setText("Ver subtotal");
        btnSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubTotalActionPerformed(evt);
            }
        });

        btnPay.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPay.setText("Realizar Pagamento");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel1.setText("Reserva");

        jLabel2.setText("Total");

        lblValue.setText("R$00,00");

        jLabel3.setText("Vezes");

        jLabel4.setText("Método");

        cmbTimes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1x", "2x", "3x", "4x", "5x", "6x" }));
        cmbTimes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTimes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtReservationId, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(cmbTimes1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblValue))
                    .addComponent(btnPay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblListReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTimes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblListReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        this.ClerkScreen.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubTotalActionPerformed
        int id;
        try {
            id = Integer.parseInt(edtReservationId.getText());
        } catch (RuntimeException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Id inválido");
            return;
        }
        var reservation = ReservationController.getReservationController().getReservation(id);
        if (reservation == null) {
            JOptionPane.showMessageDialog(this, "Reserva não encontrada");
            return;
        }
        lblValue.setText("R$" + reservation.getPrice());
    }//GEN-LAST:event_btnSubTotalActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        int id;
        try {
            id = Integer.parseInt(edtReservationId.getText());
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Id inválido");
            return;
        }
        var reservation = ReservationController.getReservationController().getReservation(id);
        if (reservation == null) {
            JOptionPane.showMessageDialog(this, "Reserva não encontrada");
            return;
        }
        var paymentMethod = (PaymentMethods) cmbMethod.getSelectedItem();
        var times = cmbTimes1.getSelectedIndex() + 1;
        PaymentController.getPaymentController().createPayment(reservation, paymentMethod, times);
    }//GEN-LAST:event_btnPayActionPerformed

    private void cmbTimes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTimes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTimes1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableReservation;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSubTotal;
    private javax.swing.JComboBox<PaymentMethods> cmbMethod;
    private javax.swing.JComboBox<String> cmbTimes1;
    private javax.swing.JTextField edtReservationId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListReservation;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}

package com.sghpet.sgh.pet.view;


public class FrMainMenu extends javax.swing.JFrame {

    public FrMainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnClientRegister = new javax.swing.JButton();
        btnAnimalRegister = new javax.swing.JButton();
        btnReservationRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Menu de Cadastro");
        lblMenu.setToolTipText("");

        btnClientRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnClientRegister.setText("Gerenciar Clientes");
        btnClientRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientRegisterActionPerformed(evt);
            }
        });

        btnAnimalRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAnimalRegister.setText("Gerenciar Animais");
        btnAnimalRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalRegisterActionPerformed(evt);
            }
        });

        btnReservationRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnReservationRegister.setText("Gerenciar Reservas");
        btnReservationRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnimalRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(btnReservationRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAnimalRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnReservationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientRegisterActionPerformed

        FrCustomerRegister customerRegister = new FrCustomerRegister(this);
        customerRegister.show();
        this.setEnabled(false);

        //this.setEnabled(false);
       //FrCustomerRegister customerRegister = new FrCustomerRegister(this);
       FrCustomerRegister customerRegister = new FrCustomerRegister();
       customerRegister.show();
       //this.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientRegisterActionPerformed

    private void btnAnimalRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnimalRegisterActionPerformed

    private void btnReservationRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservationRegisterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalRegister;
    private javax.swing.JButton btnClientRegister;
    private javax.swing.JButton btnReservationRegister;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}

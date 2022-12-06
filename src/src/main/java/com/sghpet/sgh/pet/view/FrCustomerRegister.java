package com.sghpet.sgh.pet.view;

import com.sghpet.sgh.pet.controller.CustomerController;

public class FrCustomerRegister extends javax.swing.JFrame {

    private final CustomerController controller;

    public FrCustomerRegister(CustomerController controller) {
        this.controller = controller;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        edtCpf = new javax.swing.JTextField();
        lblAddres = new javax.swing.JLabel();
        edtAddres = new javax.swing.JTextField();
        edtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("Cadastro do Cliente");
        lblMenu.setToolTipText("");

        lblName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblName.setText("Nome:");

        edtName.setForeground(new java.awt.Color(207, 209, 208));
        edtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNameActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        edtCpf.setForeground(new java.awt.Color(207, 209, 208));
        edtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfActionPerformed(evt);
            }
        });

        lblAddres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblAddres.setText("Endereço:");

        edtAddres.setForeground(new java.awt.Color(207, 209, 208));
        edtAddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtAddresActionPerformed(evt);
            }
        });

        edtPhone.setForeground(new java.awt.Color(207, 209, 208));
        edtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPhoneActionPerformed(evt);
            }
        });

        lblPhone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPhone.setText("Celular:");

        btnSend.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setText("Voltar");

        JTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Celular", "CPF", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtName)
                            .addComponent(edtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAddres)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone)
                    .addComponent(edtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddres)
                    .addComponent(edtAddres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNameActionPerformed

    private void edtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfActionPerformed

    private void edtAddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtAddresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtAddresActionPerformed

    private void edtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPhoneActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        var name = edtName.getText();
        var cpf = edtCpf.getText();
        var address = edtAddres.getText();
        var phone = edtPhone.getText();
        this.controller.createUser(name, cpf, address, phone);
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField edtAddres;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtName;
    private javax.swing.JTextField edtPhone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddres;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    // End of variables declaration//GEN-END:variables
}
